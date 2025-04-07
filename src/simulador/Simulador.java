package simulador;

import excepciones.*;
import java.util.Scanner;

public class Simulador {
    private Vehiculo vehiculo;
    private Scanner scanner;
    
    public Simulador(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.scanner = new Scanner(System.in);
    }
    
    public void ejecutarSimulacion() {
        System.out.println("\n*** SIMULADOR DE CONDUCCION DE VEHICULO ***");
        System.out.println(vehiculo.getEstado());
        
        boolean salir = false;
        while (!salir) {
            try {
                mostrarMenu();
                int opcion = leerOpcion();
                
                switch (opcion) {
                    case 1: // Encender
                        vehiculo.encender();
                        break;
                    case 2: // Apagar
                        vehiculo.apagar();
                        break;
                    case 3: // Acelerar
                        System.out.print("Ingrese la intensidad de aceleracion (km/h): ");
                        int aceleracion = scanner.nextInt();
                        vehiculo.acelerar(aceleracion);
                        break;
                    case 4: // Frenar
                        System.out.print("Ingrese la intensidad de frenado (km/h): ");
                        int frenado = scanner.nextInt();
                        vehiculo.frenar(frenado);
                        break;
                    case 5: // Frenar bruscamente
                        vehiculo.frenarBruscamente();
                        break;
                    case 6: // Ver estado
                        System.out.println(vehiculo.getEstado());
                        break;
                    case 7: // Salir
                        salir = true;
                        System.out.println("Fin de la simulacion");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
                
            } catch (VehiculoException e) {
                System.out.println("ATENCION! " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                scanner.nextLine(); // Limpiar el búfer
            }
            
            System.out.println("\nPresione Enter para continuar...");
            scanner.nextLine();
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
        }
    }
    
    private void mostrarMenu() {
        System.out.println("\n--- MENU DE ACCIONES ---");
        System.out.println("1. Encender vehiculo");
        System.out.println("2. Apagar vehiculo");
        System.out.println("3. Acelerar");
        System.out.println("4. Frenar");
        System.out.println("5. Frenar bruscamente");
        System.out.println("6. Ver estado del vehiculo");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opcion: ");
    }
    
    private int leerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un numero valido.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}