/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class PerroGrande extends Perro {
    private int pesoKg;

    public PerroGrande(String nombre,  String raza, int edad, int pesoKg) {
        super(nombre, raza, edad);
        this.pesoKg = pesoKg;
    }

    @Override
    public void hacerSonido() {
        System.out.println(super.getNombre() + " hace ¡¡GUAAAAUUUUUUU!!");
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    

    
    
}
