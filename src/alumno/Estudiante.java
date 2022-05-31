
package alumno;


public class Estudiante {
    int codigo;
    String nombre;
    String apellido;
    String materia;
    float promedio;
    boolean matriculado;
    //Metodos Constructores

    public Estudiante() {
        this.promedio=5;
        this.matriculado=false;
    }

    
    public Estudiante(int codigo, String nombre, String apellido, String materia, float promedio, boolean matriculado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.promedio = promedio;
        this.matriculado = matriculado;
    }
//Metodos constructores 
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMateria() {
        return materia;
    }

    public float getPromedio() {
        return promedio;
    }

    public boolean isMatriculado() {
        return matriculado;
    }
//Metodos modificadores
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
    
    public void mostrardatos (){
        System.out.println("codigo= "+codigo+"\t"+"nombre: "+nombre+"\t"+"apellido= "+apellido+"\t");
        System.out.println("materia= "+materia+"\t"+"promedio= "+promedio+"\t"+"matriculado= "+matriculado);
        
    }
    //Indica que se esta sobre escribiendo otra clase......
    @Override
    public String toString(){
        return "codigo= "+this.codigo+"\t"+"nombre: "+this.nombre;
    }
}

