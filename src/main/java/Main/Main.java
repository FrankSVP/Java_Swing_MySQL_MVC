/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.ControladorLogin;
import Vista.FrameLogin;


/**
 *
 * @author blood
 */
public class Main {
    
    public static void main(String[] args) {

        //Aquí utilizamos el modelo, vista y controlador para iniciar el Software
        Modelo.ModeloLogin modeloLogin= new Modelo.ModeloLogin(); 
        Vista.FrameLogin vistaLogin = new Vista.FrameLogin();
        
        Controlador.ControladorLogin objetoControladorLogin  = new Controlador.ControladorLogin(vistaLogin, modeloLogin);
        objetoControladorLogin.MostrarLogin();
    }
}
