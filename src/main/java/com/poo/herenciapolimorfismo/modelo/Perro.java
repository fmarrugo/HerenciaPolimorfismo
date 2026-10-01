/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author taidy
 */
public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    public Perro() {
        super("Pongo");
    } 
    
    @Override
    public void hacerSonido() {
      System.out.println(super.getNombre()+ " hace Guau guau!");
    }
}

