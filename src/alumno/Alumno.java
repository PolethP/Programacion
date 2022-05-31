/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumno;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class Alumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Utilizacion de metodos como el  constructor ,getters y setters
      Estudiante e1=new Estudiante ();
      e1.mostrardatos();
       
      //Uso de otro constructor 
      Estudiante e2=new Estudiante (10,"Poleth","Puetate","POO",9,true);
        System.out.println("  ");
        System.out.println(".......Dando valores a los constructores.......");
      e2.mostrardatos();
      e2.setPromedio(10);
      e2.setMatriculado(true);
      System.out.println("  ");
       System.out.println("..........Cambio de datos.........");
       System.out.println("nombre= "+e2.getNombre());
       System.out.println("promedio= "+e2.getPromedio());
       System.out.println("nombre= "+e2.isMatriculado());
        System.out.println(".......uso del toString.....");
        String x=e2.toString();
        System.out.println(x);
       //Ingresa datos por teclado
       System.out.println("  ");  
        System.out.println(".......Datos por teclado........");
        Scanner ing=new Scanner(System.in);
        System.out.print(" Ingrese Codigo: ");
        int cod=ing.nextInt();
        System.out.print(" Ingrese Nombre: ");
        String nom=ing.next();
        System.out.print(" Ingrese Apellido: ");
        String ape=ing.next();
        System.out.print(" Ingrese  Materia: ");
        String mat=ing.next();
        System.out.print(" Ingrese promedio: ");
        float prom=ing.nextFloat();
        System.out.print(" Ingrese si esta matriculado: ");
        boolean matri=ing.nextBoolean();
        //Mostrar datos
        Estudiante e3=new Estudiante(cod,nom,ape,mat,prom,matri);
        System.out.println("ALUMNO NUEVO");
        e3.mostrardatos();
        
    }
    
}
