/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.datarepository;

/**
 *
 * @author juans
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import modelos.Enum.TipoLlantas;
import modelos.Enum.TipoMotor;

public class EscritorArchivo {
    private static final String RUTA_ARCHIVO = "config.txt";
    private Scanner scanner;
    
    public EscritorArchivo() {
        this.scanner = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\n--- CONFIGURACION DEL VEHICULO ---");
            System.out.println("1. Crear nuevo archivo de configuracion");
            System.out.println("2. Modificar archivo existente");
            System.out.println("3. Ver configuracion actual");
            System.out.println("4. Continuar con la simulacion");
            System.out.print("Seleccione una opcion: ");
            
            int opcion = leerOpcion();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1:
                    crearArchivoConfiguracion();
                    break;
                case 2:
                    modificarArchivoConfiguracion();
                    break;
                case 3:
                    mostrarConfiguracionActual();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
    
    private void crearArchivoConfiguracion() {
        try {
            TipoLlantas llantas = seleccionarTipoLlantas();
            TipoMotor motor = seleccionarTipoMotor();
            
            guardarConfiguracion(llantas, motor);
            System.out.println("Archivo de configuracion creado con exito.");
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
    
    private void modificarArchivoConfiguracion() {
        if (!archivoExiste()) {
            System.out.println("El archivo de configuracion no existe. Se crearz uno nuevo.");
            crearArchivoConfiguracion();
            return;
        }
        
        try {
            mostrarConfiguracionActual();
            
            TipoLlantas llantas = seleccionarTipoLlantas();
            TipoMotor motor = seleccionarTipoMotor();
            
            guardarConfiguracion(llantas, motor);
            System.out.println("Archivo de configuracion modificado con exito.");
        } catch (Exception e) {
            System.out.println("Error al modificar el archivo: " + e.getMessage());
        }
    }
    
    private TipoLlantas seleccionarTipoLlantas() {
        System.out.println("\nSeleccione el tipo de llantas:");
        System.out.println("1. BUENAS (Limite: 110 Km/h)");
        System.out.println("2. BONITAS (Limite: 70 Km/h)");
        System.out.println("3. BARATAS (Limite: 50 Km/h)");
        System.out.print("Opcion: ");
        
        while (true) {
            int opcion = leerOpcion();
            switch (opcion) {
                case 1: return TipoLlantas.BUENAS;
                case 2: return TipoLlantas.BONITAS;
                case 3: return TipoLlantas.BARATAS;
                default: 
                    System.out.print("Opcion invalida. Seleccione de nuevo: ");
            }
        }
    }
    
    private TipoMotor seleccionarTipoMotor() {
        System.out.println("\nSeleccione el cilindraje del motor:");
        System.out.println("1. 1000 cc (Velocidad maxima: 100 Km/h)");
        System.out.println("2. 2000 cc (Velocidad maxima: 160 Km/h)");
        System.out.println("3. 3000 cc (Velocidad maxima: 220 Km/h)");
        System.out.print("Opcion: ");
        
        while (true) {
            int opcion = leerOpcion();
            switch (opcion) {
                case 1: return TipoMotor.MOTOR_1000;
                case 2: return TipoMotor.MOTOR_2000;
                case 3: return TipoMotor.MOTOR_3000;
                default: 
                    System.out.print("Opcion invalida. Seleccione de nuevo: ");
            }
        }
    }
    
    private void guardarConfiguracion(TipoLlantas llantas, TipoMotor motor) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            String tipollanta = llantas.name();
            if (tipollanta.equals("BUENAS")) {
                writer.write("llantas   Buenas");
            } else if (tipollanta.equals("BONITAS")) {
                writer.write("llantas   Bonitas");
            } else {
                writer.write("llantas   Baratas");
            }
            writer.newLine();
            
            String tipomotor = motor.name();
            if (tipomotor.equals("MOTOR_1000")) {
                writer.write("motor     1000");
            } else if (tipomotor.equals("MOTOR_2000")) {
                writer.write("motor     2000");
            } else {
                writer.write("motor     3000");
            }
        }
    }
    
    private void mostrarConfiguracionActual() {
        if (!archivoExiste()) {
            System.out.println("El archivo de configuracion no existe.");
            return;
        }
        
        try {
            System.out.println("\n--- CONFIGURACION ACTUAL ---");
            Files.lines(Paths.get(RUTA_ARCHIVO)).forEach(System.out::println);
            System.out.println("---------------------------");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de configuracion: " + e.getMessage());
        }
    }
    
    private boolean archivoExiste() {
        return Files.exists(Paths.get(RUTA_ARCHIVO));
    }
    
    private int leerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un numero valido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
    
    public String getRutaArchivo() {
        return RUTA_ARCHIVO;
    }
}