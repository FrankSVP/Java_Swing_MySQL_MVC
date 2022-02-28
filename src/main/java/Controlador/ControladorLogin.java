/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloLogin;
import Vista.FrameLogin;

/**
 *
 * @author blood
 */
public class ControladorLogin {
    
    private FrameLogin view;
    private ModeloLogin model;
    
    public ControladorLogin(FrameLogin view, ModeloLogin model){
    
        this.view= view;
        this.model=model;
        
    }
    
    public void MostrarLogin(){
    
        view.setTitle("Inicio de Sesión");
        view.setVisible(true);
    }
    
}
