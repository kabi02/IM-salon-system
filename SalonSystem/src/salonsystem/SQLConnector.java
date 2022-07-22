/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salonsystem;

import java.sql.*;

public class SQLConnector {
    public Connection dbConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/salondb","root","admin");
            System.out.println("Connected to database");
            return conn;
        }catch(Exception e){
            e.getStackTrace();
        }
        return dbConn();
    }
}
