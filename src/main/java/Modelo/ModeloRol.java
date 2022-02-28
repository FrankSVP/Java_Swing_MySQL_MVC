/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author blood
 */
public class ModeloRol {
    
    int id;
    String nombre;
    String descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
     
    
    //Para este método puedes usar un Array también
    public  void MostrarSocios(JTable TablaTotalRoles)
    {
      
        Modelo.ConexionBaseDatos ObjetoConexion = new Modelo.ConexionBaseDatos();
        
        
     DefaultTableModel modelo = new DefaultTableModel();
     
       TableRowSorter<TableModel>OrdenaTabla = new TableRowSorter<TableModel>(modelo);
       TablaTotalRoles.setRowSorter(OrdenaTabla);
               
        String sql="";
        
       
       
     modelo.addColumn("Id");
     modelo.addColumn("Nombre");
     modelo.addColumn("Descripción");
  
     
     TablaTotalRoles.setModel(modelo);
     
    
     //Aquí utilizar las vistas o Stored Procecdure, según el caso
     
    /*CREATE VIEW 
    viewTotalRoles AS 
    SELECT *from rol;*/
    
     sql = "select * from viewTotalRoles;";
    
    
    String [] datos= new String [3];
    Statement st;
    
    
       try {
           
            st = ObjetoConexion.estableceConexion().createStatement(); 
            
            ResultSet rs =  st.executeQuery(sql);
           
           while (rs.next())
           {
              
               datos[0]= rs.getString(1);
               datos[1]= rs.getString(2);
               datos[2]= rs.getString(3);
           
                
               modelo.addRow(datos);
               
               
           }
           
           TablaTotalRoles.setModel(modelo);
           
          
           
       } 
       catch (SQLException ex) 
       {
           JOptionPane.showConfirmDialog(null, "Error: "+ ex.toString());
       }
       
       
    }
}
