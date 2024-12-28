package main;

import deportes.DeporteEquipo;
import deportes.DeporteIndividual;
import deportes.Fitness;
import persona.Empleados;
import persona.Usuarios;
import java.util.ArrayList;
import java.util.Scanner;

public class main_gimnasio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList deportes = new ArrayList();
        deportes.add(new Fitness("Correr","12/02/1950","alta",10));
        deportes.add(new Fitness("Cardio","12/02/1870","media",10));
        deportes.add(new DeporteEquipo("Futbol","12/05/1890",24,5));
        deportes.add(new DeporteEquipo("Baloncesto","12/05/1930",10,3));
        deportes.add(new DeporteIndividual("Natacion","12/05/1740","gafas de agua","indoor"));
        deportes.add(new DeporteIndividual("Golf","12/05/189","palos de golf","outdoor"));

        Empleados empleado = new Empleados(2,"Marcos","Gracia",1234,1);
        Usuarios usuario = new Usuarios(3,"Alvaro","Fernandez","02/12/2005",1, deportes);

        System.out.println(" ");
        System.out.println("Opcion 1: altaDeportes");
        System.out.println("Opcion 2: mostrarDeportes");
        System.out.println("Opcion 3: bajaDeportes");
        System.out.println("Opcion 4: deportes guardados");
        System.out.println("Opcion 5 : guardar deportes ObjectOutPutStream");
        System.out.println("Opcion 6 : ver deportes guardados con ObjectOutPutStream");
        System.out.println("Opcion 7: salir");

        int opciones = scanner.nextInt();

        while(opciones != 7){

            if (opciones == 1){
                System.out.println(" ");
                System.out.println("Deportes para apuntarse");
                usuario.altaDeportes();
                System.out.println(" ");
                System.out.println("Opcion 1: altaDeportes");
                System.out.println("Opcion 2: mostrarDeportes");
                System.out.println("Opcion 3: bajaDeportes");
                System.out.println("Opcion 4: deportes guardados");
                System.out.println("Opcion 5 : guardar deportes ObjectOutPutStream");
                System.out.println("Opcion 6 : ver deportes guardados con ObjectOutPutStream");
                System.out.println("Opcion 7: salir");
                opciones = scanner.nextInt();
            }

            else if (opciones == 2){
                System.out.println(" ");
                System.out.println("Deportes disponibles");
                usuario.mostrarDeportes();
                System.out.println(" ");
                System.out.println("Opcion 1: altaDeportes");
                System.out.println("Opcion 2: mostrarDeportes");
                System.out.println("Opcion 3: bajaDeportes");
                System.out.println("Opcion 4: deportes guardados");
                System.out.println("Opcion 5 : guardar deportes ObjectOutPutStream");
                System.out.println("Opcion 6 : ver deportes guardados con ObjectOutPutStream");
                System.out.println("Opcion 7: salir");
                opciones = scanner.nextInt();
            }

            else if (opciones == 3){
                System.out.println(" ");
                System.out.println("Deportes para darse de baja");
                usuario.bajaDeportes();
                System.out.println(" ");
                System.out.println("Opcion 1: altaDeportes");
                System.out.println("Opcion 2: mostrarDeportes");
                System.out.println("Opcion 3: bajaDeportes");
                System.out.println("Opcion 4: deportes guardados");
                System.out.println("Opcion 5 : guardar deportes ObjectOutPutStream");
                System.out.println("Opcion 6 : ver deportes guardados con ObjectOutPutStream");
                System.out.println("Opcion 7: salir");
                opciones = scanner.nextInt();
            }

            else if (opciones == 4){
                System.out.println(" ");
                System.out.println("Deportes a los que estas apuntado");
                usuario.deportesGuardados();
                System.out.println(" ");
                System.out.println("Opcion 1: altaDeportes");
                System.out.println("Opcion 2: mostrarDeportes");
                System.out.println("Opcion 3: bajaDeportes");
                System.out.println("Opcion 4: deportes guardados");
                System.out.println("Opcion 5 : guardar deportes ObjectOutPutStream");
                System.out.println("Opcion 6 : ver deportes guardados con ObjectOutPutStream");
                System.out.println("Opcion 7: salir");
                opciones = scanner.nextInt();
            }
            else if(opciones == 5){
                System.out.println(" ");
                System.out.println("Deportes a los que estas apuntado");
                usuario.GuardarMisDeportes();
                System.out.println(" ");
                System.out.println("Opcion 1: altaDeportes");
                System.out.println("Opcion 2: mostrarDeportes");
                System.out.println("Opcion 3: bajaDeportes");
                System.out.println("Opcion 4: deportes guardados");
                System.out.println("Opcion 5 : guardar deportes ObjectOutPutStream");
                System.out.println("Opcion 6 : ver deportes guardados con ObjectOutPutStream");
                System.out.println("Opcion 7: salir");
                opciones = scanner.nextInt();
            }

            else if(opciones == 6){
                System.out.println(" ");
                System.out.println("Deportes a los que estas apuntado");
                usuario.VerMisDeportes();
                System.out.println(" ");
                System.out.println("Opcion 1: altaDeportes");
                System.out.println("Opcion 2: mostrarDeportes");
                System.out.println("Opcion 3: bajaDeportes");
                System.out.println("Opcion 4: deportes guardados");
                System.out.println("Opcion 5 : guardar deportes ObjectOutPutStream");
                System.out.println("Opcion 6 : ver deportes guardados con ObjectOutPutStream");
                System.out.println("Opcion 7: salir");
                opciones = scanner.nextInt();
            }
        }
    }
}
