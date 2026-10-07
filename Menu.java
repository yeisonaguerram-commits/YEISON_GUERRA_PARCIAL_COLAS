import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        Queue<ObjetoCola> colaregistrados = new LinkedList<>();
        Queue<ObjetoCola> colaenfila = new LinkedList<>();
        Queue<ObjetoCola> colaatendidos = new LinkedList<>();
        validar v = new validar();
        Metodos m = new Metodos();

        while (continuar) {
            System.out.println("-----------------------------------------");
            System.out.println("===REPARACIONES TECNICAS JAIME PC PRO GAMING A OTRO NIVEL==="); // PUNTO 7
            System.out.println("-----------------------------------------");
            System.out.println("1. Registrar un cliente para cita tecnica");
            System.out.println("2. Mandar clientes registrados a fila de atencion");
            System.out.println("3. Ordenar fila segun prioridad de atencion");
            System.out.println("4. Atender siguiente cliente");
            System.out.println("5. Cambiar prioridad de un cliente en fila");
            System.out.println("6. Canelar cita");
            System.out.println("7. Mostrar cola de citas");
            System.out.println("8. Mostrar cola de fila actual");
            System.out.println("9. Mostrar cola de atendidos");
            System.out.println("0. salir");

            int opcion = v.ValidarEntero(sc);
            switch (opcion) {
                case 1:
                    colaregistrados = m.registrar(colaregistrados, sc, v);
                    break;
                case 2:
                    colaenfila = m.mandarafila(colaregistrados, sc, v, colaenfila);
                    break;
                case 3:
                    colaenfila = m.OrdenarPrioridad(colaenfila);
                    break;
                case 4:
                    colaatendidos = m.AtenderCliente(colaenfila, sc, colaatendidos);
                    break;
                case 5:
                    colaenfila = m.MarcarPrioritario(colaenfila, v, sc);
                    break;
                case 6:
                    colaenfila = m.Eliminarcita(colaenfila, v, sc);
                case 7:
                    m.mostrarregistrados(colaregistrados);
                    break;
                case 8:
                    m.mostrarenfila(colaenfila);
                    break;
                case 9:
                    m.Mostraratendidos(colaatendidos);
                case 0:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
        sc.close();
    }
}