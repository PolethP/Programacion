/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class Regiones {
    public static void region (){
        int y;
        Scanner ingreso=new Scanner(System.in);
        do {            
        System.out.print("Ingrese un numero segun la region (1-4): ");
        y=ingreso.nextInt();
        
        switch (y) {
            case 1:
                System.out.println("SIERRA");
                break;
             case 2:
                System.out.println("COSTA");
                break; 
                case 3:
                System.out.println("ORIENTE");
                break;
                case 4:
                System.out.println("INSULAR");
                break;   
            default:
               System.out.println("No existe la regiòn ");
            }
       } while (y<5);
    }
}
