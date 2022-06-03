
package excepciondeber;

import java.util.Scanner;


public class ExcepcionDeber {

    
    public static void main(String[] args) {
        int v[]={22,54,23,78,80,90,122,78,12};
         int n;
         int aux;
         Scanner ing=new Scanner(System.in);
        try {
            System.out.println(".......Observacion del arreglo......");
            for (int i = 0; i <v.length; i++) {
                System.out.println(v[i]); 
                }
            System.out.print("1.- Ingrese el indice del arreglo mostrado: ");
            aux=v[n=ing.nextInt()];
            if (v.length<=aux){
              System.out.println("El indice esta dentro de los limites");
            }      
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(" ");
            System.out.println(" Uso de la excepcion ArrayIndexOutOfBoundsException ");
            System.out.println(" El indice esta  fuera de los límites!");
        }finally {
            System.out.println(" ");
            System.out.println("Gracias por usar el programa :)");
        }
    }
    
}
