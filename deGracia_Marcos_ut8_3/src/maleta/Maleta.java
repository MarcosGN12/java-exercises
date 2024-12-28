package maleta;

public class Maleta <T> {
    T [] maleta;
    int elementos=0;

    public Maleta(T[] maleta) {
        this.maleta = maleta;
    }

    public void verElemento(){
        for (int i = 0; i < maleta.length; i++) {
            if (maleta[i] != null){
                System.out.println("elemento " + i + " " + maleta[i]);
            }
        }
    }

    public void añadirElemento(T agregar){
        maleta[elementos]=agregar;
        elementos++;
    }

    public void quitarElemento(int agregar){
        for (int i = agregar; i < elementos; i++) {
            maleta[i]=maleta[i+1];
        }
        elementos--;
    }
}
