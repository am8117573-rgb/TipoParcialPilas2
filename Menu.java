import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<CambioTexto> pila = new Stack<>();
        Metodos m = new Metodos();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido al sistema de deshacer del editor de texto");
            System.out.println("Que desea realizar");
            System.out.println("1) Registrar cambio");
            System.out.println("2) Deshacer el último cambio");
            System.out.println("3) Consultar el último cambio (peek)");
            System.out.println("4) Mostrar historial de cambios");
            System.out.println("5) Salir");

            int opt = m.validarEntero(sc);
            sc.nextLine(); // limpiar el salto de línea que deja nextInt()

            switch (opt) {
                case 1:
                    pila = m.registrarCambio(pila, sc);
                    break;
                case 2:
                    pila = m.deshacerUltimoCambio(pila);
                    break;
                case 3:
                    m.consultarUltimoCambio(pila);
                    break;
                case 4:
                    m.mostrarHistorial(pila);
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;
                default:
                    System.out.println("Esta opción no existe");
                    break;
            }
        }
        sc.close();
    }
}