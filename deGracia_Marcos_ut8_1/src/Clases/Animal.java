package Clases;

public class Animal {
    private String nombre;
    private boolean vivo;

    public Animal(String nombre, boolean vivo) {
        this.nombre = nombre;
        this.vivo = true;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isVivo() {
        return vivo;
    }
}
