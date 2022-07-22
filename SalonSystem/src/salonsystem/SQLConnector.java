/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salonsystem;

import java.sql.*;
import java.sql.DatabaseMetaData
public class SQLConnector {
    public Connection dbConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/salondb","root","admin");
            System.out.println("Connected to database");
            DatabaseMetaData dbmd = conn.getMetaData();
            System.out.printf("JDBC: %d.%d%n", dbmd.getJDBCMajorVersion(), dbmd.getJDBCMinorVersion());
            return conn;
        }catch(Exception e){
            e.getStackTrace();
        }
        return dbConn();
    }
}
