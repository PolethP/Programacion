
package debervectores;

import java.util.Scanner;

/**
 *
 * @author Poleth_Puetate
 */
public class DeberVectores {

    
    public static void main(String[] args) {
       int v [] =new int[3];
       int dat;
        Scanner ingreso=new Scanner(System.in);
        //manejo de excepciones
        try {
         System.out.println("........Ingresar Datos del Vector.............. ");
        for (int i = 0; i < v.length; i++) {
           System.out.print("El dato "+(i+1)+" es: " );
            v [i]=ingreso.nextInt();  
        }
        System.out.println(" ");
        System.out.println("...... Datos_Ingresados.......");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Dato "+(i+1)+" es: "+v[i] );
        }
        System.out.println(" ");
        System.out.println("...... Datos-Ordenadas-Ascendentemente........");
        ordenar(v);
        for (int i = 0; i < v.length; i++) {
            System.out.println("La nota es: "+(i+1)+" es "+v[i] );
        }
        System.out.println(" ");
        System.out.println("...... Dato-Ordenadas-Descendentemente........");
        ordenardes(v);
        for (int i = 0; i < v.length; i++) {
            System.out.println("El dato es: "+(i+1)+" es "+v[i] );
        }
        System.out.println(" ");
        System.out.println("........Busqueda-Lineal-Descendente...........");
        buscar(v);
        System.out.println(" ");
        System.out.println("...... Dato-Mayor-Promedio..................");
        promedio(v);
        System.out.println(" ");
        System.out.println("........Manejo de Excepciones...........");
        System.out.println("Ingrese el indice (negativo) del vector: ");
        dat=ingreso.nextInt();
        float j[]=new float[dat];
        } 
        catch(NegativeArraySizeException e){
            System.out.println("Vector con indice negativo");
            System.out.println(e);
        }
        finally{
            System.out.println(" ");
            System.out.println("Gracias por usar el programa :)");
            
            }  
        }
        public static void ordenar (int v[]){
            for (int i = 0; i < (v.length)-1; i++) {
                for (int j = i+1; j <v.length; j++) {
                    if (v[i]>=v [j]){
                        int c=v[i];
                        v[i]=v [j];
                        v[j]=c;
                    }
                }
            }
    }
        public static void ordenardes (int v []){
            for (int i = 0; i < (v.length)-1; i++) {
                for (int j = i+1; j <v.length; j++) {
                    if (v[i]<=v [j]){
                        int c=v[i];
                        v[i]=v [j];
                        v[j]=c;
                    }
                }
            }   
    }
      public static void buscar (int v []){
            Scanner ingreso=new Scanner(System.in);
            System.out.print("Ingrese el dato que desea buscar: ");
            int dato;
            int ban=0;
            int pos=0;
            dato=ingreso.nextInt();
            for (int i = 0; i <v.length; i++) {
                if (v[i]==dato){
                    ban=1;
                    pos=1;
                    
                }      
            }
            if (ban==1){
            System.out.println("El dato  se encuentra en la posicion "+pos);
            }else{
                System.out.println("El dato no existe dentro del vector");
            }
        }    
      public static void promedio(int v[]){  
          int cont=0;
          int cont1=0;
          int  suma=0;
          //int aux;
            for (int i = 0; i <v.length; i++) {
                suma+=v[i]; 
                cont++;    
            }
            for (int j = 0; j <v.length; j++) {
               if (v[j]>(suma/cont)){
                    cont1++;   
                }
          }
            System.out.println("El promedio es "+suma/cont);
            System.out.println("Los datos mayores al promedio son "+cont1);
        }
}
