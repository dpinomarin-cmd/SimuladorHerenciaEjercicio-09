/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author usuario
 */
public class Ranger extends Personaje{
    
    public Ranger(String nombre, int constitucion) {
        super(nombre, constitucion);
    }
    @Override
    public String realizarAtaque(){
      return "dispara con una flecha letar desde las sombras";
    }
}
