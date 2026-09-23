package temaColecciones.ejercicio14;

import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void introducirVehiculo(GestionReparaciones gestion, Scanner sc) {
        System.out.println("Introduce el modelo del vehículo:");
        String modelo = sc.nextLine();

        System.out.println("Introduce la matrícula del vehículo:");
        String matricula = sc.nextLine();

        Date instanteEntrada = new Date();

        FichaVehiculo fv = new FichaVehiculo(modelo, matricula, instanteEntrada);

        gestion.anadeVehiculo(fv);

        System.out.println("Vehículo añadido a la lista de espera correctamente");
    }

    public static void menu() {
        System.out.println("\n--- MENÚ TALLER MECÁNICO ---");
        System.out.println("1.- Añadir vehículo");
        System.out.println("2.- Pasar vehículo a reparación");
        System.out.println("3.- Ver vehículos en espera");
        System.out.println("4.- Ver vehículos en reparación");
        System.out.println("5.- Listar vehículos ordenados por matrícula");
        System.out.println("6.- Listar vehículos ordenados por fecha de entrada");
        System.out.println("7.- Salir");
        System.out.println("Seleccione una opción:");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionReparaciones gestion = new GestionReparaciones();
        int opcion;

        do {
            menu();
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1 -> introducirVehiculo(gestion, sc);
                case 2 -> gestion.reparar();
                case 3 -> gestion.verEnEspera();
                case 4 -> gestion.verEnReparacion();
                case 5 -> gestion.listarOrdenadasMatricula();
                case 6 -> gestion.listarOrdenadasFechaEntrada();
                case 7 -> System.out.println("Programa finalizado");
                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 7);

        sc.close();
    }
}
