/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner entrada=new Scanner(System.in);
        do {
        System.out.println(".......MENU.......");
        System.out.println("1.Programa  Regiòn 1");
        System.out.println("2. Programa Tablas 2");
        System.out.print("Escoga una opcion del menu: ");
        x=entrada.nextInt();
                  
        switch (x) {
            case 1:
                Regiones rs=new Regiones();
                rs.region();
                break;
            case 2:
                Tablas ts=new Tablas();
                ts.tabla();
                break;
            default:
                System.out.println("Gracias por usar el programa ");
        }
         } while (x<3);
    
  } 
}
