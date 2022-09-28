package Dao_project.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection provideConnection() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/miniproject";

        try {
            cn = DriverManager.getConnection(url,"root","Dd@8105848723");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cn;
    }
}
