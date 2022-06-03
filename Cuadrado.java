
package tareaconstructor;

public class Cuadrado {
    int dato;

    public Cuadrado() {
        this.dato=5;
    }

    public Cuadrado(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    public void PerimetroArea(){
        int peri;
        float ar;
         peri=dato+dato+dato+dato;
         ar=dato*dato;
        System.out.println("El valor del perimetro es: "+peri);
        System.out.println("El valor del area es:"+ar);
    }
   
        
    }

