package main;

import maleta.Maleta;

import java.util.Scanner;

public class main_maleta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String array[]=new String[100];
        Maleta <String> maleta = new Maleta(array);

        maleta.añadirElemento("Tijeras");
        maleta.añadirElemento("Peine");

        System.out.println("Que quieres añadir a la puta maleta");
        int pregunta = 0;
        while (pregunta != 4) {

            System.out.println(" ");
            System.out.println("Menu");
            System.out.println("1. Ver mi maleta");
            System.out.println("2. Añadir un nuevo elemento a la maleta.");
            System.out.println("3. Borrar un elemento de la maleta.");
            System.out.println("4. Salir.");
            pregunta = scanner.nextInt();

            if(pregunta == 1){
                maleta.verElemento();
            }

            if(pregunta == 2){
                System.out.println("Elementos actuales");
                maleta.verElemento();
                System.out.println("Nuevo elemento a agregar:");
                String agregar = scanner.next();
                maleta.añadirElemento(agregar);
            }

            if(pregunta == 3){
                System.out.println("Elementos actuales");
                maleta.verElemento();
                System.out.println("Elemento a borrar:");
                int agregar = scanner.nextInt();
                maleta.quitarElemento(agregar);
            }
        }
    }
}
