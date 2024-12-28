package paquete;

public class Paquete {
    protected int kg;
    protected int prioridad;
    protected int numReferencia;
    protected double resultado;

    public int getKg() {
        return kg;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public double enviarSucursalPrimaria(Paquete paquete) {
        if (paquete.getPrioridad() == 0){
            resultado = paquete.getKg();
        }

        else if(paquete.getPrioridad() == 1){
            resultado = paquete.getKg() + 10;
        }

        else if(paquete.getPrioridad() == 2){
            resultado = paquete.getKg() + 20;
        }

        return resultado;
    }

    public double enviarSucursalSecundaria(Paquete paquete) {
        if (paquete.getPrioridad() == 0){
            resultado = (paquete.getKg()) * 0.90;
        }

        else if(paquete.getPrioridad() == 1){
            resultado = (paquete.getKg() + 10) * 0.90;
        }

        else if(paquete.getPrioridad() == 2){
            resultado = (paquete.getKg() + 20) / 0.90;
        }

        return resultado;
    }
}
