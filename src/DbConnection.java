package Framework_Gui;

import java.sql.*;

public class DbConnection {
    public static Connection getConnection (String suburl, String username,  String password) throws  SQLException {
        String url = "jdbc:postgresql://" + suburl;
        Connection conn = DriverManager.getConnection(url, username, password);    
        return conn;
    }
}
