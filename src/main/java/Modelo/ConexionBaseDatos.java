/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author blood
 */
public class ConexionBaseDatos {
    
    //Aquí conecta con la Base de Datos, crear una función que devuelve la conexión, para usarla en los diferentes modelos
      Connection conectar=null;
   
           String usuario="root";
           String contrasenia= "root";
           String bd = "pruebaPOS";
           String ip = "localhost";
           String puerto="3307";
   
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
   
     public  Connection estableceConexion()
    {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar= DriverManager.getConnection(cadena,usuario,contrasenia);
            //JOptionPane.showMessageDialog(null,"Conexión Correcta a la Base de Datos");  
          
                    
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null," Problemas de Conexión a la Base de Datos, Error: "+ e.toString());
        }
        return conectar;
    }
}
