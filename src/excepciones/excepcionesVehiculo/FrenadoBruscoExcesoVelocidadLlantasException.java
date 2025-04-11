/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones.excepcionesVehiculo;

/**
 *
 * @author juans
 */
public class FrenadoBruscoExcesoVelocidadLlantasException extends VehiculoPatinoException {
    public FrenadoBruscoExcesoVelocidadLlantasException() {
        super("Frenado brusco con velocidad superior al limite de las llantas.");
    }
}