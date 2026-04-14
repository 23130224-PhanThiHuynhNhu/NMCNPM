package vn.edu.hcmuaf.fit.demo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.hcmuaf.fit.demo.dao.AuthDao;
import vn.edu.hcmuaf.fit.demo.model.User;
import java.io.IOException;

    @WebServlet("/login")
    public class LoginServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("/Assets/component/login_logout/login.jsp").forward(request,response);
        }
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            AuthDao authDao = new AuthDao();
            User rawUser = authDao.getUserByUserName(username);

            if (rawUser != null){
                if (rawUser.isDeleted()) {
                    request.setAttribute("error", "Tài khoản của bạn đã bị xóa khỏi hệ thống. Vui lòng liên hệ quản trị viên!");
                    request.getRequestDispatcher("/Assets/component/login_logout/login.jsp").forward(request, response);
                    return;
                }

                if (!rawUser.isActive()) {
                    request.setAttribute("error", "Tài khoản của bạn đã bị khóa.");
                    request.getRequestDispatcher("/Assets/component/login_logout/login.jsp").forward(request, response);
                    return;
                }
            }

            AuthService as = new AuthService();
            User user = as.checkLogin(username,password);
            if(user != null){
                HttpSession session = request.getSession();
                session.setAttribute("auth", user);
                response.sendRedirect(request.getContextPath() + "/home");
                return;
            }else {
                request.setAttribute("error", "Bạn nhập sai tên hoặc mật khẩu");
                request.getRequestDispatcher("/Assets/component/login_logout/login.jsp").forward(request, response);
                return;
            }
        }
    }

