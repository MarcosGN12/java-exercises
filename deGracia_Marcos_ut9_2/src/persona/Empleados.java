package persona;

public class Empleados extends Persona {

    private int contraseña;

    public Empleados(int id ,String nombre, String apellidos, int contraseña, int numeroUsuariosEmpleados){
        super(id,nombre,apellidos,numeroUsuariosEmpleados);
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.numeroUsuariosEmpleados = numeroUsuariosEmpleados;
    }
    @Override
    public String getInfo(){
        return id + " " + nombre + " " + apellidos;
    }
}
