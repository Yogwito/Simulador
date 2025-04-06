/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author User
 */
public class Vehiculo {
    private Motor motor;
    private Llantas llantas;
    private boolean encendido;
    private int velocidadActual;
    private boolean patinando;
    private boolean accidentado;
   
    public Vehiculo(Motor motor, Llantas llantas) {
        this.motor = motor;
        this.llantas = llantas;
        this.encendido = false;
        this.velocidadActual = 0;
        this.patinando = false;
        this.accidentado = false;
    }
   
    public void encender() throws VehiculoException {
        if (accidentado) {
            throw new VehiculoAccidentadoException("No se puede encender un vehículo accidentado.");
        }
       
        if (encendido) {
            throw new VehiculoYaEncendidoException();
        }
       
        encendido = true;
        System.out.println("El vehículo ha sido encendido.");
    }
   
    public void apagar() throws VehiculoException {
        if (!encendido) {
            throw new VehiculoYaApagadoException();
        }
       
        if (velocidadActual > 60) {
            accidentado = true;
            encendido = false;
            velocidadActual = 0;
            throw new ApagarVehiculoAltaVelocidadException();
        }
       
        encendido = false;
        System.out.println("El vehículo ha sido apagado.");
    }
   
    public void acelerar(int magnitud) throws VehiculoException {
        if (accidentado) {
            throw new VehiculoAccidentadoException("No se puede acelerar un vehículo accidentado.");
        }
       
        if (!encendido) {
            throw new VehiculoApagadoNoPuedeAcelerarNiFrenarException();
        }
       
        // Comprobar si la aceleración es brusca
        boolean aceleracionBrusca = magnitud > 30;
        if (aceleracionBrusca) {
            System.out.println("¡Cuidado! Aceleración brusca de " + magnitud + " Km/h.");
        }
       
        // Comprobar si la velocidad resultante excedería la capacidad del motor
        if (velocidadActual + magnitud > motor.getVelocidadMaxima()) {
            accidentado = true;
            encendido = false;
            velocidadActual = 0;
            throw new AceleracionExcesivaMotorException();
        }
       
        velocidadActual += magnitud;
        System.out.println("El vehículo ha acelerado a " + velocidadActual + " Km/h.");
       
        // Si estaba patinando y se detiene, recupera el control
        if (patinando && velocidadActual == 0) {
            patinando = false;
            System.out.println("El vehículo ha recuperado el control.");
        }
    }
   
    public void frenar(int magnitud) throws VehiculoException {
        if (accidentado) {
            throw new VehiculoAccidentadoException("No se puede frenar un vehículo accidentado.");
        }
       
        if (!encendido) {
            throw new VehiculoApagadoNoPuedeAcelerarNiFrenarException();
        }
       
        if (velocidadActual == 0) {
            throw new VehiculoDetenidoNoPuedeFrenarException();
        }
       
        // Comprobar si el frenado es más intenso que la velocidad actual
        if (magnitud > velocidadActual) {
            patinando = true;
            velocidadActual = 0;
            throw new FrenadoMayorAVelocidadActualException();
        }
       
        velocidadActual -= magnitud;
        System.out.println("El vehículo ha frenado a " + velocidadActual + " Km/h.");
       
        // Si estaba patinando y se detiene, recupera el control
        if (patinando && velocidadActual == 0) {
            patinando = false;
            System.out.println("El vehículo ha recuperado el control.");
        }
    }
   
    public void frenarBruscamente(int magnitud) throws VehiculoException {
        if (accidentado) {
            throw new VehiculoAccidentadoException("No se puede frenar bruscamente un vehículo accidentado.");
        }
       
        if (!encendido) {
            throw new VehiculoApagadoNoPuedeAcelerarNiFrenarException();
        }
       
        if (velocidadActual == 0) {
            throw new VehiculoDetenidoNoPuedeFrenarException();
        }
       
        // Comprobar si la velocidad actual supera el límite de las llantas
        if (velocidadActual > llantas.getLimiteVelocidad()) {
            patinando = true;
            velocidadActual -= magnitud;
            if (velocidadActual < 0) {
                velocidadActual = 0;
            }
            throw new FrenadoBruscoExcesoVelocidadLlantasException();
        }
       
        // Comprobar si el frenado es más intenso que la velocidad actual
        if (magnitud > velocidadActual) {
            patinando = true;
            velocidadActual = 0;
            throw new FrenadoMayorAVelocidadActualException();
        }
       
        velocidadActual -= magnitud;
        System.out.println("El vehículo ha frenado bruscamente a " + velocidadActual + " Km/h.");
       
        // Si estaba patinando y se detiene, recupera el control
        if (patinando && velocidadActual == 0) {
            patinando = false;
            System.out.println("El vehículo ha recuperado el control.");
        }
    }
   
    public boolean estaEncendido() {
        return encendido;
    }
   
    public int getVelocidad() {
        return velocidadActual;
    }
   
    public boolean isPatinando() {
        return patinando;
    }
   
    public boolean isAccidentado() {
        return accidentado;
    }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estado del Vehículo:\n");
        sb.append("- Tipo de llantas: ").append(llantas.getTipo()).append(" (Límite: ").append(llantas.getLimiteVelocidad()).append(" Km/h)\n");
        sb.append("- Tipo de motor: ").append(motor.getTipo()).append(" (Velocidad máxima: ").append(motor.getVelocidadMaxima()).append(" Km/h)\n");
        sb.append("- Estado: ").append(encendido ? "Encendido" : "Apagado").append("\n");
        sb.append("- Velocidad actual: ").append(velocidadActual).append(" Km/h\n");
       
        if (patinando) {
            sb.append("- ADVERTENCIA: El vehículo está patinando!\n");
        }
       
        if (accidentado) {
            sb.append("- ADVERTENCIA: El vehículo está accidentado!\n");
        }
       
        return sb.toString();
    }
}
