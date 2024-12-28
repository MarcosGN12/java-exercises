package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;


public class main {
    static Scanner scanner = new Scanner(System.in);

    //Descargar JDBC MySQL
    //Extraer archivo .jar
    //Click derecho en el proyecto > propiedades
    //>java build path > add external JARs> elijo
    //mi .jar > apply and close
    //Descargar el SGBD: MySQL
    //custom > mysql server, mysql Workbench
    //poner contraseña > todo siguiente
    public static void main(String[] args) {
        try {
            //Establezco la conexión
            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/agenda", "root", "1234"
            );

            //Crear statement: permite ejecutar sentencias SQL
            Statement objStat = conexion.createStatement();

            //Ejecutar SQL
            ResultSet objResult = objStat.executeQuery("SELECT * FROM personas");

            //Recorrer el resultSet
            while (objResult.next()) {
                //Guarda dentro del ArrayList todos los clientes
                //que hay en la bd
                Cliente.getClientes().add(new Cliente(objResult.getString("nombre"), objResult.getInt(2), objResult.getInt(3)));
            }

            ArrayList<Cliente> clientes = Cliente.getClientes();

            int n = 0;
            do {
                System.out.println("1. Añadir a una persona a la agenda\n2. Borrar una persona de la agenda.\n3. Ver agenda.\n4. Salir");
                n = scanner.nextInt();
                scanner.nextLine();
                switch (n) {
                    case 1:
                        insertar(objStat);
                        break;
                    case 2:
                        borrar(objStat);
                        break;
                    case 3:
                        verAgenda();
                }

            } while (n != 4);
            System.out.println("Éxito");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void insertar(Statement stat) {

        System.out.println("Dime el nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Dime el teléfono: ");
        int tlf = scanner.nextInt();

        System.out.println("Dime el teléfono: ");
        int direccion = scanner.nextInt();

        try {
            stat.execute("INSERT INTO personas "
                    + "(nombre,telefono,direccion) VALUES "
                    + "('" + nombre + "', " + tlf + ", " + direccion + ");");
        } catch (SQLException e) {
            System.out.println("error");
        }

        Cliente.getClientes().add(new Cliente(nombre, tlf, direccion));
    }

    public static void borrar(Statement stat) {
        System.out.println("Dime el nombre que quieres borrar: ");
        String nombre = scanner.nextLine();


        try {
            stat.execute("DELETE FROM personas WHERE nombre = " + "'" + nombre + "';");
        } catch (SQLException e) {
            System.out.println("error");
        }
        // creo un cliente y le pongo a null para guardar aqui dentro
        // los nombres que vaya a borrar
        Cliente clienteABorrar = null;

        // recorro con un for each el arraylist de cliente y compruebo que el nombre
        // que quiero borrar aparezca y si aparece le añado al objeto clienteABorrar
        // para que el tamaño del cliente normal no de error al modificarlo
        for (Cliente cliente : Cliente.getClientes()) {
            if (Objects.equals(cliente.getNombre(), nombre)) {
                clienteABorrar = cliente;
                break;
            }
        }
        if (clienteABorrar != null) {
            Cliente.getClientes().remove(clienteABorrar);
        } else {
            System.out.println("Ese cliente no existe");
        }

    }

    public static void verAgenda() {
        for (int i = 0; i < Cliente.getClientes().size(); i++) {
            System.out.println(Cliente.getClientes().get(i));
        }
    }

}
