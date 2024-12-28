package sucursal;

public class SucursalSecundaria extends Sucursal {
    private String nombreSecundaria;

    public SucursalSecundaria(String nombreSecundaria, int numSucursal, String direccion, String ciudad) {
        this.nombreSecundaria = nombreSecundaria;
        this.numSucursal = numSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getNombreSecundaria() {
        return nombreSecundaria;
    }

    public String getInfo(){
        return nombreSecundaria + " " + numSucursal + " " + direccion + " " + ciudad;
    }

    @Override
    public int getNumSucursal() {
        return super.getNumSucursal();
    }

    @Override
    public String getCiudad() {
        return super.getCiudad();
    }

    @Override
    public String getDireccion() {
        return super.getDireccion();
    }

    @Override
    public void setCiudad(String ciudad) {
        super.setCiudad(ciudad);
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    @Override
    public void setNumSucursal(int numSucursal) {
        super.setNumSucursal(numSucursal);
    }

    public void setNombreSecundaria(String nombreSecundaria) {
        this.nombreSecundaria = nombreSecundaria;
    }

}
