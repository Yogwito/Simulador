/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author juans
 */
public class VehiculoApagadoNoPuedeAcelerarNiFrenarException extends EstadoVehiculoException {
    public VehiculoApagadoNoPuedeAcelerarNiFrenarException() {
        super("El vehiculo apagado no puede acelerar ni frenar.");
    }
}
