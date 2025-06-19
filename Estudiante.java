/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deberes;
/**
 *
 * @author xxbla
 */
public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String direccion, String carrera) {
        super(nombre, edad, direccion);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", direccion='" + getDireccion() + '\'' +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
