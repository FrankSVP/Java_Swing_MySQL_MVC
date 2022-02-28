/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloRol;
import Vista.DialogRoles;

/**
 *
 * @author blood
 */
public class ControladorRol {
   
    private DialogRoles view;
    private ModeloRol model;
    
    public ControladorRol(DialogRoles view, ModeloRol model){
    
        this.view= view;
        this.model=model;
    
    }
    
    public void TotalRoles(){
        
        model.MostrarSocios(view.tablaRoles);
     
    }
    
    public void mostrarVentanaTotalRoles(){
       view.setTitle("Total de Roles");
       view.setVisible(true); 
         
    }
    
  
    
    
    
}
