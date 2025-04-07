package simulador;

import excepciones.*;
import modelos.enum.TipoLlantas;
import modelos.enum.TipoMotor;
import modelos.Llantas;
import modelos.Motor;

public class Vehiculo {
    private boolean encendido;
    private boolean accidentado;
    private int velocidad;
    private Motor motor;
    private Llantas llantas;

    public Vehiculo(TipoMotor tipoMotor, TipoLlantas tipoLlantas) {
        this.encendido = false;
        this.accidentado = false;
        this.velocidad = 0;
        this.motor = new Motor(tipoMotor);
        this.llantas = new Llantas(tipoLlantas);
    }

    public void encender() throws VehiculoYaEncendidoException, VehiculoAccidentadoException {
        if (accidentado) throw new VehiculoAccidentadoException();
        if (encendido) throw new VehiculoYaEncendidoException();
        encendido = true;
    }

    public void apagar() throws ApagarVehiculoAltaVelocidadException, VehiculoYaApagadoException, VehiculoAccidentadoException {
        if (accidentado) throw new VehiculoAccidentadoException();
        if (!encendido) throw new VehiculoYaApagadoException();
        if (velocidad > 0) throw new ApagarVehiculoAltaVelocidadException();
        encendido = false;
    }

    public void acelerar(int incremento) throws VehiculoApagadoNoPuedeAcelerarNiFrenarException, VehiculoAccidentadoException, AceleracionExcesivaMotorException {
        if (accidentado) throw new VehiculoAccidentadoException();
        if (!encendido) throw new VehiculoApagadoNoPuedeAcelerarNiFrenarException();
        if (incremento > motor.getMaximoIncrementoVelocidad()) throw new AceleracionExcesivaMotorException();
        velocidad += incremento;
    }

    public void frenar(int decremento) throws VehiculoApagadoNoPuedeAcelerarNiFrenarException, VehiculoDetenidoNoPuedeFrenarException, FrenadoMayorAVelocidadActualException, FrenadoBruscoExcesoVelocidadLlantasException, VehiculoAccidentadoException {
        if (accidentado) throw new VehiculoAccidentadoException();
        if (!encendido) throw new VehiculoApagadoNoPuedeAcelerarNiFrenarException();
        if (velocidad == 0) throw new VehiculoDetenidoNoPuedeFrenarException();
        if (decremento > velocidad) throw new FrenadoMayorAVelocidadActualException();
        if (decremento > llantas.getMaximoFrenadoSeguro()) throw new FrenadoBruscoExcesoVelocidadLlantasException();
        velocidad -= decremento;
    }

    public void patinar() throws VehiculoPatinoException {
        accidentado = true;
        throw new VehiculoPatinoException();
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

    public Motor getMotor() {
        return motor;
    }

    public Llantas getLlantas() {
        return llantas;
    }
} 
