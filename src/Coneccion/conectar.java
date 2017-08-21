/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coneccion;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
//import com.mysql.jdbc.Connection;



/**
 *
 * @author Anthonys
 */
public class conectar {
    java.sql.Connection conectar=null;
    public java.sql.Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/cedula","root","");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
    
}
