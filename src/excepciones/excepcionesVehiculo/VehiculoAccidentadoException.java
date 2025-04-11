/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones.excepcionesVehiculo;

/**
 *
 * @author juans
 */
public class VehiculoAccidentadoException extends SeguridadVehiculoException {
    public VehiculoAccidentadoException(String message) {
        super("¡El vehiculo se ha accidentado! " + message);
    }
}