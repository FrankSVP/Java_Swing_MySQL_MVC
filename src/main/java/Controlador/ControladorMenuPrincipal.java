/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FrameMenuPrincipal;
import Modelo.ModeloMenuPrincipal;

/**
 *
 * @author blood
 */
public class ControladorMenuPrincipal {
   
    private FrameMenuPrincipal view;
    private ModeloMenuPrincipal model;
    
       public ControladorMenuPrincipal(FrameMenuPrincipal view, ModeloMenuPrincipal model){
    
        this.view= view;
        this.model=model;
        
    }
       
    public void mostrarMenuPrincipal(){
        view.setTitle("Menu Principal");
        view.setVisible(true);
    }
}
