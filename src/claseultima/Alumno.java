/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseultima;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Alumno {
private int dni;
private String nombre;
private String apellido;
private int edad;

    public Alumno(int dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

  boolean equals (Alumno a){
  return (this.nombre.equals(a.nombre) && this.dni ==a.dni) ? true : false;
  }
 
 
}
