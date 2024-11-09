/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;



public class DOCTOR extends PERSONA {
    private String especialidad;

    // Constructor
    public DOCTOR(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    // Métodos getter y setter para especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Implementación de mostrarInformacion (polimorfismo)
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Especialidad: " + especialidad);
    }
}


