/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones.excepcionesVehiculo;

/**
 *
 * @author juans
 */
public class FrenadoMayorAVelocidadActualException extends VehiculoPatinoException {
    public FrenadoMayorAVelocidadActualException() {
        super("Frenado con intensidad mayor a la velocidad actual.");
    }
}