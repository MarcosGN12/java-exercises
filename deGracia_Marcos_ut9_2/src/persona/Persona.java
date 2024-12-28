package persona;
// es abstracta cuando dice que no hay instancias
public abstract class Persona {

    protected int id, numeroUsuariosEmpleados;
    protected String nombre, apellidos;
    public Persona(int id, String nombre, String apellidos, int numeroUsuariosEmpleados){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroUsuariosEmpleados = numeroUsuariosEmpleados;
    }

    public String getInfo(){
        return id + " " + nombre + " " + apellidos;
    }
}