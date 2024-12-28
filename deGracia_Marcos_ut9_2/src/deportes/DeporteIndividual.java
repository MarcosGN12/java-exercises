package deportes;

public class DeporteIndividual extends Deportes {

    private String material;
    private String tipo;
    public DeporteIndividual(String nombre, String fecha, String material, String tipo){
        super(nombre,fecha);
        this.material = material;
        this.tipo = tipo;
    }

    @Override
    public String getInfo(){
        return "Nombre del deporte: " + nombre + ", Fecha de creacion: " + fecha;
    }

}