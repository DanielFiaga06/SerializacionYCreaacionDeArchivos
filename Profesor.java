/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deberes;
/**
 *
 * @author xxbla
 */
public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, int edad, String direccion, String materia) {
        super(nombre, edad, direccion);
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", direccion='" + getDireccion() + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }
}