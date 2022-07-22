/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salonsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDriver {
    public static Connection connectionProvider() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection thisConnection=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/salondb", "imsalon2022", "50df0cfc");
            System.out.println("Connected to database");
            return thisConnection;
        } catch(SQLException Error) {
            System.out.println(Error);
        }
        return null;
    }
}
