/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturapdf;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author renzo
 */
public class conexion {
    
    public static Connection getConexion(){
        Connection conexion =null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root","");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
   return conexion;
    }    
}
