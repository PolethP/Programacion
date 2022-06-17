/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglomatriz;

/**
 *
 * @author Poleth_Puetate
 */
public class ArregloMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fila;
        int col;
        int b[][]=new int[4][3];
        int a[][]={{1,2,3},{4,5,6}};
        int b1[][]={{1,2},{3},{4,5,6}};
        int a1[][]={{1,2,3},{4,5,6}};

        System.out.println("DATOS INICIALES DE ARREGLO BIDIMENSIONAL");
        for(fila=0; fila<b.length;fila++){
            for(col=0; col<b[fila].length;col++){
            System.out.print(b[fila][col]+"\t");
            }
                System.out.println();
        }
        System.out.println("DATOS DEl ARREGLO BIDIMENSIONAL A");
        for(fila=0; fila<a.length;fila++){
            for(col=0; col<a[fila].length;col++){
            System.out.print(a[fila][col]+"\t");
            }
                System.out.println();
        }
        System.out.println("DATOS DEl ARREGLO BIDIMENSIONAL B1");
        for(fila=0; fila<b1.length;fila++){
            for(col=0; col<b1[fila].length;col++){
            System.out.print(b1[fila][col]+"\t");
            }
                System.out.println();
        }
        System.out.println("..........Arreglo con metodo..........");
        arreglo1(a1);
        System.out.println("....ARREGLO MODIFICADO........");
        ModificarArreglo(a1);
        arreglo1(a1);
        System.out.println("Valor antes de modificrse: "+a[1][1]);
        int c=CambioElemento(a[1][1]);
        a[1][1]=c;
        System.out.println("Valor despues de modificrse: "+a[1][1]);

    }
     public static void arreglo1 (int x[][]){
         for(int fila=0; fila<x.length;fila++){
            for(int col=0; col<x[fila].length;col++){
            System.out.print(x[fila][col]+"\t");
            }
                System.out.println();
         }   
     }
      public static void ModificarArreglo(int arreglo[][]){
          for ( int fila = 0; fila < arreglo.length; fila++ ){
             for ( int columna = 0; columna < arreglo[ fila ].length; columna++ ){    
                    arreglo[fila][columna]*=2;
                }
            }                
      
      }        
    public static int CambioElemento(int elemento){
    return elemento+=10;
 }

}
