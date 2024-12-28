import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void pedirValores() throws InputMismatchException {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dime tu nombre");
            String nombre = scanner.next();
            System.out.println("Dime tu edad");
            int edad = scanner.nextInt();

            if (edad <= 0) {
                throw new InputMismatchException("La edad no puede ser 0 o menor");
            }

        }

        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void pedirvalores2(){

        try {
            int intentos = 1;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Dime tu nombre");
            String nombre = scanner.next();
            System.out.println("Dime tu edad");
            int edad = scanner.nextInt();

            while (edad <= 0) {
                intentos++;
                System.out.println("La edad no puede ser 0 o menor intento: " + (intentos - 1));
                System.out.println("Dime tu nombre");
                nombre = scanner.next();
                System.out.println("Dime tu edad");
                edad = scanner.nextInt();
                if (intentos == 3) {
                    throw new InputMismatchException("se han pasado los 3 intentos");
                }
            }
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void rellenar(){

        Scanner scanner = new Scanner(System.in);
        int rellenar;
        int array [] = new int[5];

        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println("Dime la posicion para agregar");
                int posicion = scanner.nextInt();
                if(posicion >= 4 || posicion < 0){
                    throw new ArrayIndexOutOfBoundsException("Has puesto una posicion que esta fuera de rango");
                }
                else {
                    array[posicion] = array[i];
                }
                System.out.println("Dime el valor para agregar");
                rellenar = scanner.nextInt();
                array[i] = rellenar;
                System.out.println("posicion: " + posicion + " valor: " + array[i]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }


            System.out.println("Quieres continuar?");
            System.out.println("1.Si");
            System.out.println("2.No");
            int decision = scanner.nextInt();

            if (decision == 1){
                continue;
            }
            else {
                break;
            }
        }
    }

    public static void calculadora(){

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Dime el primer operador");
            int numero1 = scanner.nextInt();
            if(numero1 < 0){
                throw new InputMismatchException("No puede ser un numero negativo");
            }

            System.out.println("Dme el segundo operador");
            int numero2 = scanner.nextInt();
            if(numero2 < 0){
                throw new InputMismatchException("No puede ser un numero negativo");
            }

            System.out.println("Elige una operacion");
            System.out.println("1.suma");
            System.out.println("2.resta");
            System.out.println("3.multiplicar");
            System.out.println("4.division");

            int operacion = scanner.nextInt();

            if (operacion == 1) {
                System.out.println(numero1 + numero2);
            } else if (operacion == 2) {
                System.out.println(numero1 - numero2);
            } else if (operacion == 3) {
                System.out.println(numero1 * numero2);
            } else if (operacion == 4) {
                try {
                    if (numero1 == 0 || numero2 == 0) {
                        throw new ArithmeticException("No se puede dividir entre 0");
                    } else {
                        System.out.println(numero1 / numero2);
                    }
                }
                catch (ArithmeticException e){
                    System.out.println(e.getMessage());
                }
            }
            else{
                throw new InputMismatchException("Tienes que meter caracteres que esten entre 1 y 4");
            }
        }
        catch (java.util.InputMismatchException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void pedirNumero(){

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Dime un numero:");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("es positivo");
            }
            else {
                throw new InputMismatchException("los numeros no pueden ser negativos");
            }
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

    }
    public static class miExcepcion extends Exception{
        public miExcepcion(){
            super();
        }
        public miExcepcion(String mensaje){
            super(mensaje);
        }
    }
    public static void comprarProducto() {


            Scanner scanner = new Scanner(System.in);

            String productos[] = new String[4];
            productos[0] = "raqueta";
            productos[1] = "mancuerna";
            productos[2] = "bicicleta";
            productos[3] = "balon";

            int precio[] = new int[4];
            precio[0] = 50;
            precio[1] = 20;
            precio[2] = 700;
            precio[3] = 15;

            System.out.println("Menu");
            System.out.println(" ");

            for (int i = 0; i < productos.length; i++) {
                System.out.println(productos[i]);
            }

            System.out.println("Elige un producto");
            String producto = scanner.next();
        try{
            while(!producto.equals(productos[0]) && !producto.equals(productos[1]) && !producto.equals(productos[2]) && !producto.equals(productos[3])) {
                System.out.println("Elige un producto valido");
                for (int i = 0; i < productos.length; i++) {
                    System.out.println(productos[i]);
                }
                producto = scanner.next();
            }

            System.out.println("Cuantas unidades quieres");
            int unidades = scanner.nextInt();

            if (unidades <= 0) {
                throw new miExcepcion("Minimo tiene que ser 1 unidad");
            }

            int subidaProducto = 0;
            for (int i = 0; i < productos.length; i++) {
                if (productos[i].equals(producto)) {
                    subidaProducto = i;
                    break;
                }
            }
            int precioTotal = precio[subidaProducto] * unidades;
            System.out.println("Total: " + precioTotal);

        }
        catch (miExcepcion e){
            System.out.println(e.getMessage());
        }
    }

    public static void main (String[]args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Menu");
            System.out.println("Opcion1");
            System.out.println("Opcion2");
            System.out.println("Opcion3");
            System.out.println("Opcion4");
            System.out.println("Opcion5");
            System.out.println("Opcion6");

            int pregunta = scanner.nextInt();

            if (pregunta == 1) {
                pedirValores();
            }
            else if(pregunta == 2){
                pedirvalores2();
            }
            else if(pregunta == 3){
                rellenar();
            }
            else if(pregunta == 4){
                calculadora();
            }
            else if(pregunta == 5){
                pedirNumero();
            }else if(pregunta == 6){
                comprarProducto();
            }
    }
}
