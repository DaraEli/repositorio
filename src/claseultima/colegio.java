/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseultima;
import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Spliterators.iterator;
/**
 *
 * @author Usuario
 */
public class colegio {
 ArrayList<Curso> cursos;

public colegio () {}

  int ObtenerCantidadAlumnos(String nombreCurso){
  int aux=0;    
      //for (Iterator<Curso>  iterador=cursos.iterator();iterador.hasNext();){
     //return  iterador.next().getNombreCurso().equals(nombreCurso) ?
      //}
      for (Curso i: cursos){
      aux=i.getNombreCurso().equals(nombreCurso) ? i.getInscripciones().size():0;
      }
      return aux;
  }
  
  int estudiantesAprobados (String nombreCurso){
      int contador=0;
      for (Curso i: cursos){
         if(i.getNombreCurso().equals(nombreCurso)){
            for(Inscripcion j: i.getInscripciones()){
                contador=(j.getNota()>=i.getNotaAprobacion())? contador+1: contador+0;
            }
         }
         
      }
      return contador;
  }
}
