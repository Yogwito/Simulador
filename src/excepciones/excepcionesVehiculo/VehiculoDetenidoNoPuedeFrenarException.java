/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones.excepcionesVehiculo;

/**
 *
 * @author juans
 */
public class VehiculoDetenidoNoPuedeFrenarException extends EstadoVehiculoException {
    public VehiculoDetenidoNoPuedeFrenarException() {
        super("El vehiculo detenido no puede frenar.");
    }
}