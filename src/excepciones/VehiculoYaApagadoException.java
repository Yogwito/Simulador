/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author juans
 */
public class VehiculoYaApagadoException extends EstadoVehiculoException {
    public VehiculoYaApagadoException() {
        super("El vehiculo ya esta apagado.");
    }
}
