import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Metodos {

    public Queue<ObjetoCola> registrar(Queue<ObjetoCola> colaregistrados, Scanner sc, validar v) {

        ObjetoCola o = new ObjetoCola(null, null, 0, 0, 0, 0);
        System.out.println("Ingrese su nombre");
        o.setNombre(v.ValidarTexto(sc));
        System.out.println("Ingrese la ubicacion de la solicitud");
        o.setUbicacion(v.ValidarTexto(sc));
        System.out.println("¿Que tipo de problema presenta?");
        System.out.println("1) Equipo no enciende");
        System.out.println("2) Equipo necesita mantenimiento");
        System.out.println("3) Equipo necesita remplazo de piezas");
        o.setProblema(v.ValidarEntero(sc));
        System.out.println("Tecnico solicitado");
        System.out.println("1) Martin rivera");
        System.out.println("2) Darell Senkopo");
        System.out.println("3) Leviair Juan");
        System.out.println("4) Alexander Medina");
        System.out.println("5) Pablo");
        o.setTecnico(v.ValidarEntero(sc));
        System.out.println("¿Desea marcar su solicitud de alta prioridad?");
        System.out.println("1) Si  / 2) No  ");
        int opt = v.ValidarEntero(sc);
        if (opt == 1) {
            o.setPrioridad(1);
        } else {
            o.setPrioridad(0);
        }
        o.setEstado(1);

        colaregistrados.add(o);

        return colaregistrados;
    } // fin registrar

    public void mostrarregistrados(Queue<ObjetoCola> colaregistrados) {
        if (colaregistrados.isEmpty()) {
            System.out.println("No hay registro");
            return;
        }
        System.out.println("----------------");
        System.out.println("Registrados:");
        System.out.println("----------------");
        for (ObjetoCola o : colaregistrados) {
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Ubicacion: " + o.getUbicacion());
            switch (o.getProblema()) {
                case 1:
                    System.out.println("Problema: Equipo no enciende");
                    break;
                case 2:
                    System.out.println("Problema: Equipo necesita mantenimiento general");
                    break;
                case 3:
                    System.out.println("Problema: Equipo necesita remplazo de repuestos");
                    break;
                default:
                    System.out.println("Error en problema registrado");
                    break;
            }
            switch (o.getTecnico()) {
                case 1:
                    System.out.println("Tecnico: Martin rivera");
                    break;
                case 2:
                    System.out.println("Tecnico: Darell Senkopo");
                    break;
                case 3:
                    System.out.println("Tecnico: Leviair Juan");
                    break;
                case 4:
                    System.out.println("Tecnico: Alexander Medina");
                    break;
                case 5:
                    System.out.println("Tecnico: Pablo");
                    break;
                default:
                    System.out.println("Error en problema en tecnico");
                    break;
            }
            switch (o.getPrioridad()) {
                case 0:
                    System.out.println("Prioridad: Normal");
                    break;
                case 1:
                    System.out.println("Prioridad: Alta");
                    break;
                default:
                    System.out.println("Error en prioridad");
                    break;
            }
            switch (o.getEstado()) {
                case 0:
                    System.out.println("Estado: Inactivo");
                    break;
                case 1:
                    System.out.println("Estado: Activo");
                    break;
                default:
                    System.out.println("Error en estado");
                    break;
            }
            System.out.println("-----------------------------------");
        } // fin foreach
    } // fin mostrar

    public Queue<ObjetoCola> mandarafila(Queue<ObjetoCola> colaregistrados, Scanner sc, validar v,
            Queue<ObjetoCola> colaenfilas) {
                Queue<ObjetoCola> auxiliar = new LinkedList<>();
        if (colaregistrados.isEmpty()) {
            System.out.println("Nada ingresado a registros");
            return colaregistrados;
        }

        System.out.println("Clientes pasados a fila de atencion exitosamente!!!!!");
        System.out.println("-------------------------------------------------------");
        while (!colaregistrados.isEmpty()) {
            colaenfilas.add(colaregistrados.poll());
            auxiliar.add(colaregistrados.poll());
        }

        while (!auxiliar.isEmpty()) {
            colaenfilas.add(auxiliar.poll());
        }
        return colaenfilas;
    } // fin mandar a fila

    public void mostrarenfila(Queue<ObjetoCola> colaenfila) {
        if (colaenfila.isEmpty()) {
            System.out.println("No hay registro");
            return;
        }
        System.out.println("----------------");
        System.out.println("Registrados:");
        System.out.println("----------------");
        for (ObjetoCola o : colaenfila) {
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Ubicacion: " + o.getUbicacion());
            switch (o.getProblema()) {
                case 1:
                    System.out.println("Problema: Equipo no enciende");
                    break;
                case 2:
                    System.out.println("Problema: Equipo necesita mantenimiento general");
                    break;
                case 3:
                    System.out.println("Problema: Equipo necesita remplazo de repuestos");
                    break;
                default:
                    System.out.println("Error en problema registrado");
                    break;
            }
            switch (o.getTecnico()) {
                case 1:
                    System.out.println("Tecnico: Martin rivera");
                    break;
                case 2:
                    System.out.println("Tecnico: Darell Senkopo");
                    break;
                case 3:
                    System.out.println("Tecnico: Leviair Juan");
                    break;
                case 4:
                    System.out.println("Tecnico: Alexander Medina");
                    break;
                case 5:
                    System.out.println("Tecnico: Pablo");
                    break;
                default:
                    System.out.println("Error en problema en tecnico");
                    break;
            }
            switch (o.getPrioridad()) {
                case 0:
                    System.out.println("Prioridad: Normal");
                    break;
                case 1:
                    System.out.println("Prioridad: Alta");
                    break;
                default:
                    System.out.println("Error en prioridad");
                    break;
            }
            switch (o.getEstado()) {
                case 0:
                    System.out.println("Estado: Inactivo");
                    break;
                case 1:
                    System.out.println("Estado: Activo");
                    break;
                default:
                    System.out.println("Error en estado");
                    break;
            }
            System.out.println("------------------------------------");
        } // fin foreach
    } // fin mostrar

    public Queue<ObjetoCola> OrdenarPrioridad(Queue<ObjetoCola> colaenfila) {

        Queue<ObjetoCola> auxiliar = new LinkedList<>();
        Queue<ObjetoCola> auxiliar2 = new LinkedList<>();
        while (!colaenfila.isEmpty()) {
            if (colaenfila.peek().getPrioridad() == 1) {
                auxiliar.add(colaenfila.poll());
            } else {
                auxiliar2.add(colaenfila.poll());
            }
        }

        while (!auxiliar.isEmpty()) {
            colaenfila.add(auxiliar.poll());
        }
        while (!auxiliar2.isEmpty()) {
            colaenfila.add(auxiliar2.poll());
        }

        System.out.println("FILA ORGANIZADA SEGUN ORDEN PRIORITARIO AUTOMATICO");
        return colaenfila;
    } // fin ordenar

    public Queue<ObjetoCola> AtenderCliente(Queue<ObjetoCola> colaenfila, Scanner sc,
            Queue<ObjetoCola> colaatendidos) {
        if (colaenfila.isEmpty()) {
            System.out.println("No hay clientes Ingresados en la fila, cree una fila prmero ");
        } else {
            System.out.println("=================HA SIDO ATENDIDO EXITOSAMENTE==============");
            colaatendidos.add(colaenfila.poll());
        }
        return colaatendidos;
    } // fin adender

    public Queue<ObjetoCola> MarcarPrioritario(Queue<ObjetoCola> colaenfila, validar v, Scanner sc) {

        Queue<ObjetoCola> Auxiliar = new LinkedList<>();
        System.out.println("Ingrese el Nombre de la persona que desea cambiar a prioritario");
        String nombre = v.ValidarTexto(sc);
        while (!colaenfila.isEmpty()) {
            if (colaenfila.peek().getNombre().equalsIgnoreCase(nombre)) {
                colaenfila.peek().setPrioridad(1);
                Auxiliar.add(colaenfila.poll());
            } else {
                Auxiliar.add(colaenfila.poll());
            }
        }

        while (!Auxiliar.isEmpty()) {
            colaenfila.add(Auxiliar.poll());
        }

        System.out.println("Marcado como prioridad exitosamente");
        System.out.println("Desea Organizar la fila segun prioridad ahora mismo? 1) si / 2) no");
        int opt = v.ValidarEntero(sc);

        if (opt == 1) {
            colaenfila = OrdenarPrioridad(colaenfila);
        }

        return colaenfila;
    } // fin cambiar servicio

        public Queue<ObjetoCola> Eliminarcita(Queue<ObjetoCola> colaenfila, validar v, Scanner sc) {

        Queue<ObjetoCola> Auxiliar = new LinkedList<>();
        System.out.println("Ingrese el Nombre de la persona que desea cambiar eliminar");
        String nombre = v.ValidarTexto(sc);
        while (!colaenfila.isEmpty()) {
            if (colaenfila.peek().getNombre().equalsIgnoreCase(nombre)) {
                colaenfila.poll();
            } else {
                Auxiliar.add(colaenfila.poll());
            }
        }
        while (!Auxiliar.isEmpty()) {
            colaenfila.add(Auxiliar.poll());
        }

        return colaenfila;
        } // fin eliminar



        public void Mostraratendidos(Queue<ObjetoCola> colaatendidos) {
        if (colaatendidos.isEmpty()) {
            System.out.println("No hay registro");
            return;
        }
        System.out.println("----------------");
        System.out.println("Atendidos:");
        System.out.println("----------------");
        for (ObjetoCola o : colaatendidos) {
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Ubicacion: " + o.getUbicacion());
            switch (o.getProblema()) {
                case 1:
                    System.out.println("Problema: Equipo no enciende");
                    break;
                case 2:
                    System.out.println("Problema: Equipo necesita mantenimiento general");
                    break;
                case 3:
                    System.out.println("Problema: Equipo necesita remplazo de repuestos");
                    break;
                default:
                    System.out.println("Error en problema registrado");
                    break;
            }
            switch (o.getTecnico()) {
                case 1:
                    System.out.println("Tecnico: Martin rivera");
                    break;
                case 2:
                    System.out.println("Tecnico: Darell Senkopo");
                    break;
                case 3:
                    System.out.println("Tecnico: Leviair Juan");
                    break;
                case 4:
                    System.out.println("Tecnico: Alexander Medina");
                    break;
                case 5:
                    System.out.println("Tecnico: Pablo");
                    break;
                default:
                    System.out.println("Error en problema en tecnico");
                    break;
            }
            switch (o.getPrioridad()) {
                case 0:
                    System.out.println("Prioridad: Normal");
                    break;
                case 1:
                    System.out.println("Prioridad: Alta");
                    break;
                default:
                    System.out.println("Error en prioridad");
                    break;
            }
            switch (o.getEstado()) {
                case 0:
                    System.out.println("Estado: Inactivo");
                    break;
                case 1:
                    System.out.println("Estado: Activo");
                    break;
                default:
                    System.out.println("Error en estado");
                    break;
            }
            System.out.println("------------------------------------");
        } // fin foreach
    } // fin mostrar
    }