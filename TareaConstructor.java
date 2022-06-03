
package tareaconstructor;


public class TareaConstructor {

    
    public static void main(String[] args) {
        //Valoor del dato por el constructor default
       System.out.println("........Dato del lado del cuadrado por default.......");
       Cuadrado c=new Cuadrado();
       System.out.println("Valor del lado es:"+c.getDato());
       c.PerimetroArea();
       System.out.println(" ");
        //Cambio de datos 
       System.out.println("..........Cuadrado 1-Cambio de lado.........");
       Cuadrado c1=new Cuadrado (10);
       System.out.println("El cambio del lado es:"+c1.getDato());
       c1.PerimetroArea();
       System.out.println(" "); 
       //Cambio de datos 
       System.out.println("..........Cuadrado 2-Cambio de lado.........");
       Cuadrado c2=new Cuadrado (20);
       System.out.println("El cambio del lado es:"+c2.getDato());
       c2.PerimetroArea();
       System.out.println(" ");
        System.out.println("..........Cuadrado 2-lado(100).........");
       c1.setDato(100);
       System.out.println("El cambio del lado es:"+c1.getDato());
       c1.PerimetroArea();
    }
    
}
