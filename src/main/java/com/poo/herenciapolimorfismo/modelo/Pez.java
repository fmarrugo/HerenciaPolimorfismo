/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pez extends Animal {
    
    private int profundidad;

    public Pez(String nombre, int profundidad) {
        super(nombre);
        this.profundidad = 0;
    }

    public Pez() {
        super("Dory");
    }
    
    
    @Override
    public void hacerSonido() {
        System.out.println(super.getNombre()+ " hace glu glu!");
      }
    
    @Override
    public void nadar() {    
        profundidad += 10;
        System.out.println(super.getNombre()+ " esta a una profundidad de " + profundidad);
    }
    
    @Override
    public void comer(String algas){
        System.out.println(super.getNombre()+ " esta comiendo "+ algas);
    }
    
}
