/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseultima;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Curso {
private String nombreCurso;   
private int cupo;
private double notaAprobacion;
private ArrayList<Inscripcion>inscripciones;

    public Curso(int cupo, float notaAprobacion) {
        this.cupo = cupo;
        this.notaAprobacion = notaAprobacion;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCupo() {
        return cupo;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public double getNotaAprobacion() {
        return notaAprobacion;
    }

    public void setNotaAprobacion(double notaAprobacion) {
        this.notaAprobacion = notaAprobacion;
    }
  

    
    
    
    
    
    
}
