
package vn.edu.hcmuaf.fit.demo.controller;
public class AuthService {
    AuthDao authDao = new AuthDao();
    public User checkLogin(String username, String password) {
        User user = authDao.getUserByUserName(username);
        if (user == null) return null;

        // chặn tài khoản đã bị xóa mềm
        if (user.isDeleted()) return null;

        //tài khoản bị khóa thì không cho login
        if (!user.isActive()) return null;

        //kiem tra voi password da hash
        if (PasswordUtil.verify(password, user.getPassword())){
            user.setPassword("");
            return user;
        }
        return null;
    }

    public boolean isBlocked(String username, String password) {
        User user = authDao.getUserByUserName(username);
        if (user == null) return false;

        if (PasswordUtil.verify(password, user.getPassword())){
            return !user.isActive();
        }
        return false;
    }
}
