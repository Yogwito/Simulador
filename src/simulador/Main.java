/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador;

/**
 *
 * @author juans
 */
import modelos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        try {
            Vehiculo vehiculo = ManejadorArchivos.leerVehiculoDesdeArchivo("ARCHIVO_DE_ENTRADA.txt");
            Simulador simulador = new Simulador(vehiculo);
            simulador.ejecutar();

            String resultado = "Simulacion completada. Velocidad final: " + vehiculo.getVelocidad();
            ManejadorArchivos.guardarResultadoSimulacion("ARCHIVO_DE_SALIDA.txt", resultado);
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
