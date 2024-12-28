import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // ej1
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("rojo");
        lista.add("verde");
        lista.add("naranja");
        lista.add("azul");
        lista.add("blanco");

        // ej2
        lista.add(0,"negro");

        for (String e: lista){
            System.out.println(e);
        }

        System.out.println(" ");

        // ej3

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals(lista.get(3))){
                System.out.println(lista.get(3));
            }
        }

        //ej4
        lista.set(3,"amarillo");

        //ej5
        lista.remove(1);

        //ej6
        boolean blanco = lista.contains("blanco");
        System.out.println(" ");
        System.out.println(blanco);
        System.out.println(" ");

        //ej7
        lista.sort(Comparator.naturalOrder());
        for (String e: lista){
            System.out.println(e);
        }

        //ej8
        System.out.println(" ");
        ArrayList<String> lista2 = (ArrayList<String>) lista.clone();
        for (String e : lista2) {
            System.out.println(e);
        }

        System.out.println(" ");

        //ej9
        Collections.shuffle(lista2);
        for (String e : lista2) {
            System.out.println(e);
        }

        System.out.println(" ");

        //ej10
        Collections.reverse(lista2);
        for (String e : lista2) {
            System.out.println(e);
        }

        System.out.println(" ");

        //ej11

        System.out.println("-----------");
        lista2.set(0 , "amarillo");
        lista2.set(2 , "azul");
        for (String e : lista2){
            System.out.println(e);
        }

        System.out.println(" ");

        //ej12

        ArrayList<String> arrayUnido = new ArrayList<String>();
        arrayUnido.addAll(lista);
        arrayUnido.addAll(lista2);
        for (String e : arrayUnido){
            System.out.println(e);
        }

        System.out.println(" ");
        //ej13

        arrayUnido.add("lila");
        arrayUnido.add("rosa");
        arrayUnido.add("gris");


        for (String e : arrayUnido){
            System.out.println(e);
        }

        System.out.println(" ");

        //ej14
        ArrayList<String> stringNormalCorriente = (ArrayList<String>) arrayUnido.clone();
        for (String e : stringNormalCorriente){
            System.out.println(e);
        }

        System.out.println(" ");
        System.out.println("ej15 ");
        System.out.println(" ");

            Iterator<String> iterator = stringNormalCorriente.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

        System.out.println(" ");
        System.out.println("ej16");
        System.out.println(" ");

        iterator = stringNormalCorriente.iterator();
        while (iterator.hasNext()) {
            String colores = iterator.next();
            if (colores.charAt(0) == 'a' || colores.charAt(0) == 'A') {
                iterator.remove();
            }
        }
        for (String color : stringNormalCorriente) {
            System.out.println(color);
        }
    }
}