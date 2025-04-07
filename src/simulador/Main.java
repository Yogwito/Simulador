package simulador;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** SIMULADOR DE COMPORTAMIENTO DE AUTOMÓVIL ***");
        
        // Usar la ruta predeterminada en vez de solicitarla
        String rutaArchivo = "src/config.txt";
        
        try {
            Vehiculo vehiculo = ManejadorArchivos.leerVehiculoDesdeArchivo(rutaArchivo);
            Simulador simulador = new Simulador(vehiculo);
            simulador.ejecutarSimulacion();
        } catch (IOException e) {
            System.out.println("Error leyendo archivo de configuración: " + e.getMessage());
            System.out.println("Verifique que el archivo exista y tenga el formato correcto:");
            System.out.println("llantas   TIPO (BUENAS, BONITAS o BARATAS)");
            System.out.println("motor     CILINDRAJE (1000, 2000 o 3000)");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}