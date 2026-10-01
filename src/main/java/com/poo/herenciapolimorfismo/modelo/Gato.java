/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author taidy
 */
public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }
    public Gato() {
        super("Garfield");
    }
       
    @Override
    public void hacerSonido() {

      System.out.println(super.getNombre()+ " hace Miau miau!");
    }
}
