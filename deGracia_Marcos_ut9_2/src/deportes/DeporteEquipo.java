package deportes;

public class DeporteEquipo extends Deportes {

    private int jugadores,horasSemana;
    public DeporteEquipo(String nombre, String fecha, int jugadores, int horasSemana){
        super(nombre,fecha);
        this.jugadores = jugadores;
        this.horasSemana = horasSemana;
    }

    @Override
    public String getInfo(){
        return "Nombre del deporte: " + nombre + ", Fecha de creacion: " + fecha;
    }

}