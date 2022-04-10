package com.database;

import java.sql.*;
import javax.swing.*;
public class ConnectionUtil {
    static Connection conn = null;
    public static Connection connectdb()
    {
        try {
            //Class.forName("com.postgres.jdbc.Driver");
            //Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
            return conn;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
