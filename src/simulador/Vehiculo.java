package simulador;

import excepciones.*;
import modelos.*;

public class Vehiculo {
    private Motor motor;
    private Llantas llantas;
    private boolean encendido;
    private boolean accidentado;
    private boolean patinando;
    private int velocidad;

    public Vehiculo(Motor motor, Llantas llantas) {
        this.motor = motor;
        this.llantas = llantas;
        this.encendido = false;
        this.accidentado = false;
        this.patinando = false;
        this.velocidad = 0;
    }

    public void encender() throws VehiculoYaEncendidoException, VehiculoAccidentadoException {
        if (accidentado) throw new VehiculoAccidentadoException("El vehiculo esta accidentado y no puede encenderse.");
        if (encendido) throw new VehiculoYaEncendidoException();
        encendido = true;
        System.out.println("Vehiculo encendido correctamente.");
    }

    public void apagar() throws VehiculoYaApagadoException, ApagarVehiculoAltaVelocidadException {
        if (!encendido) throw new VehiculoYaApagadoException();
        if (velocidad > 60) {
            accidentado = true;
            encendido = false;
            velocidad = 0;
            throw new ApagarVehiculoAltaVelocidadException();
        }
        encendido = false;
        System.out.println("Vehiculo apagado correctamente.");
    }

    public void acelerar(int incremento) throws VehiculoApagadoNoPuedeAcelerarNiFrenarException, AceleracionExcesivaMotorException {
        if (accidentado) {
            System.out.println("El vehiculo esta accidentado y no puede acelerar.");
            return;
        }
        if (!encendido) throw new VehiculoApagadoNoPuedeAcelerarNiFrenarException();
        
        int nuevaVelocidad = velocidad + incremento;
        if (nuevaVelocidad > motor.getVelocidadMaxima()) {
            accidentado = true;
            encendido = false;
            velocidad = 0;
            throw new AceleracionExcesivaMotorException();
        }
        
        velocidad = nuevaVelocidad;
        System.out.println("Acelerando: " + incremento + " km/h. Velocidad actual: " + velocidad + " km/h");
        
        if (incremento > 30) {
            System.out.println("¡Aceleracion brusca detectada!");
        }
    }

    public void frenar(int decremento) throws VehiculoApagadoNoPuedeAcelerarNiFrenarException, 
                                             VehiculoDetenidoNoPuedeFrenarException, 
                                             FrenadoMayorAVelocidadActualException,
                                             FrenadoBruscoExcesoVelocidadLlantasException {
        if (accidentado) {
            System.out.println("El vehiculo esta accidentado y no puede frenar.");
            return;
        }
        
        if (!encendido) throw new VehiculoApagadoNoPuedeAcelerarNiFrenarException();
        if (velocidad == 0) throw new VehiculoDetenidoNoPuedeFrenarException();
        
        boolean frenaBruscamente = decremento > 30;
        boolean excedeLimiteLlantas = velocidad > llantas.getLimiteVelocidad();
        
        if (decremento > velocidad) {
            patinando = true;
            throw new FrenadoMayorAVelocidadActualException();
        }
        
        if (frenaBruscamente && excedeLimiteLlantas) {
            patinando = true;
            throw new FrenadoBruscoExcesoVelocidadLlantasException();
        }
        
        velocidad -= decremento;
        System.out.println("Frenando: " + decremento + " km/h. Velocidad actual: " + velocidad + " km/h");
        
        if (frenaBruscamente) {
            System.out.println("Frenado brusco detectado!");
        }
        
        if (velocidad == 0) {
            patinando = false;
            System.out.println("Vehiculo detenido completamente.");
        }
    }

    public void frenarBruscamente() throws VehiculoApagadoNoPuedeAcelerarNiFrenarException, 
                                         VehiculoDetenidoNoPuedeFrenarException, 
                                         FrenadoMayorAVelocidadActualException,
                                         FrenadoBruscoExcesoVelocidadLlantasException {
        System.out.println("Intentando frenar bruscamente...");
        frenar(31); // cualquier valor mayor a 30 para considerar frenado brusco
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean estaEncendido() {
        return encendido;
    }

    public boolean estaAccidentado() {
        return accidentado;
    }

    public boolean estaPatinando() {
        return patinando;
    }

    public Motor getMotor() {
        return motor;
    }

    public Llantas getLlantas() {
        return llantas;
    }
    
    public String getEstado() {
        StringBuilder estado = new StringBuilder();
        estado.append("Estado del vehiculo:\n");
        estado.append("- Motor: ").append(motor.getTipo()).append(" (Velocidad maxima: ").append(motor.getVelocidadMaxima()).append(" km/h)\n");
        estado.append("- Llantas: ").append(llantas.getTipo()).append(" (Limite velocidad: ").append(llantas.getLimiteVelocidad()).append(" km/h)\n");
        estado.append("- Encendido: ").append(encendido ? "Sí" : "No").append("\n");
        estado.append("- Velocidad actual: ").append(velocidad).append(" km/h\n");
        estado.append("- Accidentado: ").append(accidentado ? "Sí" : "No").append("\n");
        estado.append("- Patinando: ").append(patinando ? "Sí" : "No").append("\n");
        return estado.toString();
    }
}