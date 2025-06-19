/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.deberes;

/**
 *
 * @author xxbla
 */
public class Deberes {
    public static void main(String[] args) {
        Persona p = new Persona("Laura Gómez", 28, "Calle 1");
        Estudiante e = new Estudiante("Carlos Ruiz", 20, "Carrera 9", "Ingeniería");
        Profesor pr = new Profesor("Ana Torres", 40, "Avenida 45", "Matemáticas");

        p.guardarEnArchivoTxt("personas.txt");
        e.guardarEnArchivoTxt("personas.txt");
        pr.guardarEnArchivoTxt("personas.txt");

        System.out.println("Informacion guardada correctamente en personas.txt");
    }
}
