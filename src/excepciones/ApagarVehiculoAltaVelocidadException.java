/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author juans
 */
public class ApagarVehiculoAltaVelocidadException extends VehiculoAccidentadoException {
    public ApagarVehiculoAltaVelocidadException() {
        super("Se apagó el vehículo a alta velocidad (>60 Km/h).");
    }
}