import java.util.Scanner;
import java.util.Stack;

public class Metodos {

    // 1. Registrar cada cambio realizado (push)
    public Stack<CambioTexto> registrarCambio(Stack<CambioTexto> pila, Scanner sc) {
        CambioTexto cambio = new CambioTexto();

        System.out.println("Ingrese el texto anterior: ");
        cambio.setTextoAnterior(sc.nextLine());
        System.out.println("");
        System.out.println("Ingrese el texto nuevo: ");
        cambio.setTextoNuevo(sc.nextLine());
        System.out.println("");
        System.out.println("Ingrese la fecha del cambio (ej: 15-09-2026): ");
        cambio.setFecha(sc.nextLine());
        System.out.println("");
        System.out.println("Ingrese el usuario que realizó el cambio: ");
        cambio.setUsuario(sc.nextLine());

        pila.push(cambio);
        System.out.println("Cambio registrado correctamente");
        return pila;
    }

    // 2. Deshacer el último cambio mediante pop()
    public Stack<CambioTexto> deshacerUltimoCambio(Stack<CambioTexto> pila) {
        if (pila.isEmpty()) {
            System.out.println("No hay cambios para deshacer");
        } else {
            CambioTexto deshecho = pila.pop();
            System.out.println("Se deshizo el cambio: " + deshecho);
        }
        return pila;
    }

    // 3. Consultar el último cambio mediante peek()
    public void consultarUltimoCambio(Stack<CambioTexto> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila esta vacia, no hay cambios registrados");
        } else {
            CambioTexto ultimo = pila.peek();
            System.out.println("El último cambio registrado es:\n " + ultimo);
        }
    }

    // 4. Mostrar el historial de cambios
    public void mostrarHistorial(Stack<CambioTexto> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila esta vacia, no hay historial para mostrar");
        } else {
            System.out.println("Historial de cambios (del primero al último registrado):");
            for (CambioTexto cambio : pila) {
                System.out.println(cambio);
            }
        }
    }

    // Validación de enteros para evitar que el programa se caiga con datos no numéricos
    public int validarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un valor numerico valido");
            sc.next();
        }
        return sc.nextInt();
    }
}