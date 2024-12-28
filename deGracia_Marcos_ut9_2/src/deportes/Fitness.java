package deportes;

public class Fitness extends Deportes {

    private String intensidad;
    private int alumnos;
    public Fitness(String nombre, String fecha, String intensidad, int alumnos){
        super(nombre,fecha);
        this.intensidad = intensidad;
        this.alumnos = alumnos;
    }

    @Override
    public String getInfo(){
        return "Nombre del deporte: " + nombre + ", Fecha de creacion: " + fecha;
    }

}
