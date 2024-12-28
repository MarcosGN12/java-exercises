import java.io.*;

public class Main {
    public static void main(String[] args) {
        metodo5();
    }

    public static void metodo1(){
        String frase = "Felicidades el deportivo de la Coruña ascendido a segunda division!";
        try{
            FileWriter archivo = new FileWriter("C:\\Users\\jadgg\\Desktop\\practica_2_programacion\\fichero.txt");
            for (int i = 0; i < frase.length(); i++) {
                archivo.write(frase.charAt(i));
            }
            archivo.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void metodo2(){
        String frase = "Felicidades el deportivo de la Coruña ascendido a segunda division!";
        try{
            FileReader entrada = new FileReader("C:\\Users\\jadgg\\Desktop\\practica_2_programacion\\fichero.txt");
            for (int i = 0; i < frase.length(); i++) {
                System.out.print(frase.charAt(i));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void metodo3(){
        String frase = "Hecho con bufferedWriter\nlinea 2 hola\nlinea 3 adios";
        try{
            FileWriter archivo = new FileWriter("C:\\Users\\jadgg\\Desktop\\practica_2_programacion\\buffer.txt");
            BufferedWriter bufferedEscritor = new BufferedWriter(archivo);
            bufferedEscritor.write(frase);
            for (int i = 0; i < frase.length(); i++) {
                archivo.write(frase.charAt(i));
            }
            archivo.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }
        catch (IOException e){
            System.out.println("Otro error");
        }
    }
    public static void metodo4(){
        try{
            FileReader entrada = new FileReader("C:\\Users\\jadgg\\Desktop\\practica_2_programacion\\buffer.txt");
            BufferedReader buffer = new BufferedReader(entrada);
            String cadena =  buffer.readLine();
            while (cadena != null){
                System.out.println(cadena);
                cadena = buffer.readLine();
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void metodo5(){
        try{
            int palabras = 0;

            FileReader entrada = new FileReader("C:\\Users\\jadgg\\Desktop\\practica_2_programacion\\buffer.txt");
            BufferedReader buffer = new BufferedReader(entrada);
            String cadena =  buffer.readLine();

            if (cadena != null){
                System.out.println(cadena);

                for (int i = 0; i < cadena.length(); i++) {
                    //se utiliza ' ' en vez de " " ya que estamos trabajando
                    //con caracteres y " " es solo string por lo tanto se utiliza ' '
                    if(cadena.charAt(i) == ' '){
                        palabras++;
                    }
                }
            }
            //se cuenta + 1 porque al final no hay espacios
            //y no se contara la ultima palabra
            System.out.println("Numero de palabras: " + (palabras + 1));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void metodo6(){
        try{
            int lineas = 0;

            FileReader entrada = new FileReader("C:\\Users\\jadgg\\Desktop\\practica_2_programacion\\buffer.txt");
            BufferedReader buffer = new BufferedReader(entrada);
            String cadena = buffer.readLine();

            while (cadena != null){
                System.out.println(cadena);
                lineas++;
                cadena = buffer.readLine();
            }
            System.out.println("numero de lineas: " + lineas);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}