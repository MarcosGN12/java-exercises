package persona;

import deportes.Deportes;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios extends Persona {
    private String fechaNacimiento;
    private static ArrayList <Deportes> deportes;
    private ArrayList <Deportes> misDesportes;
    private static int contador = 0;

    public Usuarios(int id, String nombre, String apellidos, String fechaNacimiento, int numeroUsuariosEmpleados, ArrayList deportes){
        super(id,nombre,apellidos,numeroUsuariosEmpleados);
        this.fechaNacimiento = fechaNacimiento;
        this.deportes = deportes;
        this.misDesportes = new ArrayList<>();
    }

    @Override
    public String getInfo(){
        return id + " " + nombre + " " + apellidos;
    }

    public void altaDeportes() {
        Scanner scanner = new Scanner(System.in);


        if (contador < 3) {
            System.out.println("Deportes que hay");
            mostrarDeportes();

            int x = scanner.nextInt();

            if (x >= 1 && x <= deportes.size()) {
                Deportes deporteSeleccionado = deportes.get(x - 1);
                System.out.println("Deportes apuntados: " + deporteSeleccionado.getNombre());
                contador++;

                while (misDesportes.size() < contador) {
                    misDesportes.add(null);
                }

                misDesportes.set(contador - 1, deporteSeleccionado);

            }
            else {
                System.out.println("No es un deporte valido");
            }

            System.out.println(" ");
        }

        else {
            System.out.println("Ya te has apuntado a 3 deportes");
        }

    }

    public void mostrarDeportes(){
        for (int i = 0; i < 6; i++) {
            System.out.println((1 + i) + " " + deportes.get(i).getNombre());
        }
    }

    public void bajaDeportes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");

        if (contador != 0) {

            for (int i = 0; i < misDesportes.size(); i++) {
                if (misDesportes.get(i) != null) {
                    System.out.println("Deporte " + (i + 1) + ": " + misDesportes.get(i).getNombre());
                }
            }

            int x = scanner.nextInt();

            if (x >= 1) {
                System.out.println("Deporte que ha sido dado de baja " + x + ": " + misDesportes.get(x - 1).getNombre());
                misDesportes.set(x - 1, null);
                contador--;
            }

        }

        else{
            System.out.println("No te has apuntado a ningun deporte");
        }
    }


    public void deportesGuardados(){
        for (int i = 0; i < misDesportes.size(); i++) {
            if (misDesportes.get(i) != null) {
                System.out.println("Deporte " + (i + 1) + ": " + misDesportes.get(i).getNombre());
            }
        }
    }

    public void GuardarMisDeportes(){
        try{
            ObjectOutputStream streamSerial = new ObjectOutputStream(new FileOutputStream("C:\\Users\\jadgg\\Desktop\\practica_2_programacion\\misdeportes.txt"));
            streamSerial.writeObject(misDesportes);

            streamSerial.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void VerMisDeportes(){
        try{
            ObjectInputStream streamRecup = new ObjectInputStream(new FileInputStream("C:\\Users\\jadgg\\Desktop\\practica_2_programacion\\misdeportes.txt"));
            // ARREGLAR
            ArrayList <Deportes> deportesGuardados = (ArrayList<Deportes>) streamRecup.readObject();
            for (int i = 0; i < misDesportes.size(); i++) {
                System.out.println(deportesGuardados.get(i).getNombre());   
            }
            streamRecup.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
