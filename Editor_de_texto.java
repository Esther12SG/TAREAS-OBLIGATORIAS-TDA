import java.util.Scanner;
import java.util.Stack;

public class Editor_de_texto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> texto = new Stack<>(); // Esta es la Pila donde se guardara el texto
        Stack<String> pilaDeshacer = new Stack<>(); // Esta es la Pila que almacenara lo que se deshace

        while (true) {
            System.out.println("Por favor Ingrese su texto o el comando que desee (DESHACER, REHACER, MOSTRAR, SALIR):");
            String entrada = scanner.nextLine();

            if (entrada.equals("DESHACER")) {
                if (!texto.isEmpty()) {
                    pilaDeshacer.push(texto.pop()); //Acaa se Guardara lo que se elimina
                } else {
                    System.out.println("No hay nada para poder deshacer.");
                }
            } 
            else if (entrada.equals("REHACER")) {
                if (!pilaDeshacer.isEmpty()) {
                    texto.push(pilaDeshacer.pop()); // Aca se Recuperara lo último deshecho
                } else {
                    System.out.println("No hay nada para poder rehacer.");
                }
            } 
            else if (entrada.equals("MOSTRAR")) {
                System.out.println("Este es el Texto actual:");
                for (String linea : texto) {
                    System.out.println(linea);
                }
            } 
            else if (entrada.equals("SALIR")) {
                System.out.println("Saliendo del programa correctamente.");
                break;
            } 
            else {
                texto.push(entrada); // Esto Agregara la línea al texto
                pilaDeshacer.clear(); // Esto Borrara lo que estaba en rehacer
            }
        }
        scanner.close();
    }
}