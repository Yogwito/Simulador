/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author juans
 */
public class AceleracionExcesivaMotorException extends VehiculoAccidentadoException {
    public AceleracionExcesivaMotorException() {
        super("Aceleración más allá de la capacidad del motor.");
    }
}