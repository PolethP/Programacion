
package debermatriz;

import java.util.Scanner;

/**
 *
 * @author Poleth_Puetate
 */
public class DeberMatriz {
    
   public static void main(String[] args) {
       int a[][]=new int[3][3];
       int b[][]=new int[3][3];
       
           
       System.out.println(".......Ingrese datos de la primera matriz......");
       ingreso(a);
       System.out.println("........Ingrese datos de la segunda matriz.........");
       ingreso(b);
       System.out.println(" ");
       System.out.println("..........Mostrar datos..........");
       System.out.println("PRIMERA MATRIZ:");
       mostrar(a);
       System.out.println("SEGUNDA MATRIZ");
       mostrar(b);
       System.out.println("...........SUMA...........");
       suma(a, b);
       System.out.println(" ");
       System.out.println(".........Buscar_Elemento_Matriz 1...........");
       buscarElmento(a);
       
    }
   public static void ingreso(int x[][]){
      Scanner ingreso=new Scanner(System.in);
            for ( int fila = 0; fila < x.length; fila++ )
                    for ( int columna = 0; columna < x[ fila ].length; columna++ ){
                            System.out.print("mat["+(fila+1)+"]"+"["+(columna+1)+"]: ");
                                x[fila][columna]=ingreso.nextInt();
                                } 
   }
   public static void mostrar  (int x[][]){
         for(int fila=0; fila<x.length;fila++){
            for(int col=0; col<x[fila].length;col++){
            System.out.print(x[fila][col]+"\t");
            }
                System.out.println();
         }   
     }
  public static void  buscarElmento(int x[][]){
      Scanner ingreso=new Scanner(System.in);
      int elemento;
      int cont1=0;
      int cont2=0;
      int ban=1;
      System.out.print("Ingrese elemento que desea buscar:");
        elemento=ingreso.nextInt();
      for (int f =0; f<x.length;f++) {
            for (int c=0; c <x[f].length; c++) {
             if(elemento==x[f][c]){
                 cont1=f;
                 cont2=c;
                 ban=0;
                 
                }
             }
         }
      if (ban==0){
           System.out.println("El elemento se encuentra en: "+"["+(cont1+1)+" "+(cont2+1)+"]");
       }else{
           System.out.println("El elemento no existe.");
       }
      } 
  public static void suma (int x[][],int y[][]){ 
      int z [][]=new int [3][3];
      for (int i = 0; i <x.length ; i++) {
          for (int j = 0; j <x[i].length; j++) {
              z[i][j]=x[i][j]+y[i][j];
          }
      }
      mostrar(z);
  }
}
