/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simuladorjuegorol;
import Modelos.*;
import Vista.VistaCombate;
import Controlador.ControladorCombate;
/**
 *
 * @author usuario
 */
public class SimuladorJuegoRol {

    public static void main(String[] args) {
        System.out.println("Simulador de DND");
        //inicializar
        Personaje explorador = new Ranger("david",14);
        Personaje guerrero = new Paladin("valerie",17);
        Personaje profesor = new Personaje("edwin",10);
        
        Personaje[] miGrupo ={explorador,guerrero,profesor};
        VistaCombate miVista =new VistaCombate();
        
        //inicializamos el controlador (inyectar el modelo y la vista)
        ControladorCombate controlador = new ControladorCombate(miGrupo,miVista);
        
        //la logica de la coordinacion
        controlador.ejecutarRonda();
   }
 }
