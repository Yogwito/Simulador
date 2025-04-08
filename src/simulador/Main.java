package simulador;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** SIMULADOR DE COMPORTAMIENTO DE AUTOMOVIL ***");
        
        EscritorArchivo configurador = new EscritorArchivo();
        configurador.mostrarMenu();
        
        String rutaArchivo = configurador.getRutaArchivo();
        
        try {
            System.out.println("\nCargando vehiculo desde el archivo de configuracion...");
            Vehiculo vehiculo = LectorArchivo.leerVehiculoDesdeArchivo(rutaArchivo);
            Simulador simulador = new Simulador(vehiculo);
            simulador.ejecutarSimulacion();
        } catch (IOException e) {
            System.out.println("Error leyendo archivo de configuracion: " + e.getMessage());
            System.out.println("Verifique que el archivo exista y tenga el formato correcto:");
            System.out.println("llantas   TIPO (BUENAS, BONITAS o BARATAS)");
            System.out.println("motor     CILINDRAJE (1000, 2000 o 3000)");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}