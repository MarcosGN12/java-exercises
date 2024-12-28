package deportes;

import java.io.Serializable;

public abstract class Deportes implements Serializable {
    protected String nombre, fecha;
    public Deportes(String nombre, String fecha){
        this.nombre = nombre;
        this.fecha = fecha;
    }

    // setter
    public final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public final void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // getter

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getInfo(){
        return "Nombre del deporte: " + nombre + ", Fecha de creacion:" + fecha;
    }

}