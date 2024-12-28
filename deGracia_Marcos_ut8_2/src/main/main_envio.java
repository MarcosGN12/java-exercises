package main;

import paquete.Paquete;
import sucursal.Sucursal;
import sucursal.SucursalSecundaria;
import java.util.Scanner;

public class main_envio {
    public static void main(String[] args) {

        Sucursal [] sucursal = new Sucursal[3];
        sucursal [0] = new Sucursal();
        sucursal [1] = new SucursalSecundaria("Sucursal Noves",1,"Calle Madrid Andalucia","Illescos");
        sucursal [2] = new SucursalSecundaria("Sucursal Bargas",2,"Calle Madrid Madrid","Mandriles");

        Sucursal polimorfico;
        polimorfico = sucursal[1];
        polimorfico = sucursal[2];

        Paquete paquete = new Paquete();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kg del paquete:");
        int kg = scanner.nextInt();
        paquete.setKg(kg);

        System.out.println("Prioridad del paquete");
        int prioridad = scanner.nextInt();

        while (prioridad != 0 && prioridad != 1 && prioridad != 2){
            System.out.println("Las prioridades son 0,1 y 2");
            prioridad = scanner.nextInt();
        }
        paquete.setPrioridad(prioridad);

        System.out.println("Numero de referencia");
        int numReferencia = scanner.nextInt();
        paquete.setNumReferencia(numReferencia);

        System.out.println("Elige sucursal para enviar:");
        System.out.println("P");
        System.out.println("S");
        String preguntaSucursal = scanner.next();

        while (!preguntaSucursal.equals("P") && !preguntaSucursal.equals("S")){
            System.out.println("Escribe P o S");
            preguntaSucursal = scanner.next();
        }

        if(preguntaSucursal.equals("P")){
            System.out.println("Sucursal primaria");
            System.out.println("Peso en kg: " + paquete.getKg());
            System.out.println("Prioridad del paquete: " + paquete.getPrioridad());
            System.out.println("Numero de referencia: " + paquete.getNumReferencia());
            System.out.println("Precio final: " + (int)paquete.enviarSucursalPrimaria(paquete) + "€");
        }

        if(preguntaSucursal.equals("S")){
            System.out.println(((SucursalSecundaria) sucursal[1]).getInfo());
            System.out.println(((SucursalSecundaria) sucursal[2]).getInfo());

            System.out.println("Elige sucursal 1 o 2");
            System.out.println();
            int sucursalSecundaria = scanner.nextInt();

            while (sucursalSecundaria != 1 && sucursalSecundaria != 2){
                System.out.println("Elige sucursal 1 o 2");
                sucursalSecundaria = scanner.nextInt();
            }
            System.out.println(((SucursalSecundaria) sucursal[sucursalSecundaria]).getNombreSecundaria());
            System.out.println("Peso en kg: " + paquete.getKg());
            System.out.println("Prioridad del paquete: " + paquete.getPrioridad());
            System.out.println("Numero de referencia: " + paquete.getNumReferencia());
            System.out.println("Precio final: " + (int)paquete.enviarSucursalSecundaria(paquete) + "€");
        }

    }
}
