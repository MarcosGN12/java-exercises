package conexion;

import java.util.ArrayList;

public class Cliente {
    private int cod;
    private int tlf;
    private String nombre;
    private int direccion;
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public Cliente(String nombre, int tlf,int direccion) {
        this.nombre=nombre;
        this.tlf=tlf;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTlf(int tlf) {
        this.tlf = tlf;
    }
    public void setDir(int dir) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }
    public int getTlf() {
        return tlf;
    }

    public int getDir() {
        return direccion;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public static void setClientes(ArrayList<Cliente> clientes) {
        Cliente.clientes = clientes;
    }
    public String toString() {
        return nombre;
    }

}