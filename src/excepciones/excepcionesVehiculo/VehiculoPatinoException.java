/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones.excepcionesVehiculo;

/**
 *
 * @author juans
 */
public class VehiculoPatinoException extends SeguridadVehiculoException {
    public VehiculoPatinoException(String message) {
        super("¡El vehiculo ha patinado! " + message);
    }
}