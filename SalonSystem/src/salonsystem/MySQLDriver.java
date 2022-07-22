package src.salonsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDriver {
    public static Connection connectionProvider(String[] args) throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection thisConnection=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/salondb", "imsalon2022", "50df0cfc");
            System.out.println("Connected to database");
            return thisConnection;
        } catch(SQLException Error) {
            System.out.println(Error);
        }
        return null;
    }
}
