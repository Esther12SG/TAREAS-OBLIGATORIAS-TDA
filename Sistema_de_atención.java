import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sistema_de_atención {
    public static void main(String[] args) {
        // Creamos la cola para almacenar los clientes
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println(" Por favor Ingrese el comando que necesite (LLEGAR, ATENDER, MOSTRAR, SALIR):");
            String comando = scanner.nextLine().trim(); //  Acá se leera la entrada del usuario
            
            // Si el usuario elige el comando "LLEGAR",y se agrega el cliente a la cola
            if (comando.startsWith("LLEGAR")) {
                if (comando.length() > 7) {  // Verifica que hay un nombre después de "LLEGAR "
                    String nombre = comando.substring(7).trim();
                    filaClientes.add(nombre);
                    System.out.println(nombre + " ha llegado y está Correctamente en la fila.");
                } else {
                    System.out.println("Error: Debe escribir un nombre después de 'LLEGAR'.");
                }
            
            } 
            // Si el usuario elige el comando "ATENDER", se atendera al primer cliente
            else if (comando.equals("ATENDER")) {
                if (!filaClientes.isEmpty()) {
                    String atendido = filaClientes.poll(); // aca se Sacara al primer cliente de la cola luego de atenderlo
                    System.out.println("Atendiendo a: " + atendido);
                } else {
                    System.out.println("No hay clientes en la fila.");
                }
            } 
            // Si el usuario elige el comando "MOSTRAR", se mostrara la fila actual
            else if (comando.equals("MOSTRAR")) {
                System.out.println("La Fila actual es: " + filaClientes);
            } 
            // Si el usuario elige el comando "SALIR", se terminara correctamente el programa
            else if (comando.equals("SALIR")) {
                System.out.println("El Programa a finalizado.");
                break; // Se terminara el bucle
            } 
            // Y Si el comando no fuera válido, se le indicara al usuario
            else {
                System.out.println("El Comando ingresadi no es valido. Intentelo de nuevo.");
            }
        }
        
        scanner.close(); // Se cerrara el scanner y terminara el programa
    }
}