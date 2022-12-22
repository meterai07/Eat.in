/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**s
 *
 * @author BISMILLAH
 */
public class ConnectionDatabase {
    static String connectionUrl = "jdbc:sqlserver://LAPTOP-72DGJ6K6:1433;databaseName=Eat.in;user=sa;password=12345678;encrypt=false;trustServerCertificate=true;";
    static Connection con;
    
    public static Connection getConnection () {
        try {
            con = DriverManager.getConnection(connectionUrl); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

