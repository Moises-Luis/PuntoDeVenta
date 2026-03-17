package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/sistemaventa?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "3133";

    private Connection con;

    public Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("Conexión establecida");
            }
        } catch (SQLException e) {
            System.out.println("Error conexión: " + e.getMessage());
        }
        return con;
    }
}
