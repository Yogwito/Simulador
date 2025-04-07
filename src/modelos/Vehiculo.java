/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author juans
 */
import excepciones.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.List;

public class Vehiculo {
    private boolean encendido;
    private boolean accidentado;
    private int velocidad;

    public Vehiculo() {
        this.encendido = false;
        this.accidentado = false;
        this.velocidad = 0;
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
        if (incremento > 40) throw new AceleracionExcesivaMotorException();
        velocidad += incremento;
    }

    public void frenar(int decremento) throws VehiculoApagadoNoPuedeAcelerarNiFrenarException, VehiculoDetenidoNoPuedeFrenarException, FrenadoMayorAVelocidadActualException, FrenadoBruscoExcesoVelocidadLlantasException, VehiculoAccidentadoException {
        if (accidentado) throw new VehiculoAccidentadoException();
        if (!encendido) throw new VehiculoApagadoNoPuedeAcelerarNiFrenarException();
        if (velocidad == 0) throw new VehiculoDetenidoNoPuedeFrenarException();
        if (decremento > velocidad) throw new FrenadoMayorAVelocidadActualException();
        if (decremento > 30) throw new FrenadoBruscoExcesoVelocidadLlantasException();
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
}

