package sucursal;

import paquete.Paquete;

public class Sucursal {
    protected int numSucursal;
    protected String direccion;
    protected String ciudad;

    public void setNumSucursal(int numSucursal) {
        this.numSucursal = numSucursal;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
}
