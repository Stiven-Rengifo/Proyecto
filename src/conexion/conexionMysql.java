/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.*;



public class conexionMysql {
    Connection cn;
    
    public Connection conectar(){
        try {
        
        Class.forName("com.mysql.jdbc.Driver");
        cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/parking_control","root","");
        System.out.println("Conectado");
        
        }catch (Exception e) {
            System.out.println("Error de conexion"+e);
        }
        return cn;
    
    }
    
}
