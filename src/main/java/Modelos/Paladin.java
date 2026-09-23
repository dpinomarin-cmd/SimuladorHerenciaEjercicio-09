/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author usuario
 */
public class Paladin extends Personaje {
    public Paladin(String nombre, int constitucion) {
        super(nombre, constitucion);
    }
    @Override
    public String realizarAtaque(){
        return "Golpea con su maso sagrado y hace un daño radiante..";
    }
    
}
