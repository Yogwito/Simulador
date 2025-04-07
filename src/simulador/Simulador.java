/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador;

/**
 *
 * @author juans
 */
import excepciones.*;
import java.io.IOException;

public class Simulador {
    private Vehiculo vehiculo;

    public Simulador(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void ejecutar() {
        try {
            vehiculo.encender();
            vehiculo.acelerar(30);
            vehiculo.frenar(20);
            vehiculo.apagar();
        } catch (VehiculoException e) {
            System.out.println("Error en simulacion: " + e.getMessage());
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
