/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author juans
 */
public class VehiculoAccidentadoException extends SeguridadVehiculoException {
    public VehiculoAccidentadoException(String message) {
        super("¡El vehículo se ha accidentado! " + message);
    }
}