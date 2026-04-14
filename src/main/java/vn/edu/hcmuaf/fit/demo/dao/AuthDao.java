package vn.edu.hcmuaf.fit.demo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import vn.edu.hcmuaf.fit.demo.model.User;
import vn.edu.hcmuaf.fit.demo.utils.DBConnection;
public class AuthDao extends BaseDao {

    public User getUserByUserName(String userName) {

        String sql = "SELECT * FROM users WHERE username = ? ";

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, userName);


            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setEmail(rs.getString("email"));
                    user.setFullname(rs.getString("fullname"));
                    user.setPhoneNum(rs.getString("phoneNum"));
                    user.setLocation(rs.getString("location"));
                    user.setActive(rs.getBoolean("active"));
                    user.setRole(rs.getString("role"));
                    user.setDeleted(rs.getBoolean("deleted"));
                    return user;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}