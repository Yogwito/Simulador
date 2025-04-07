/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador;

/**
 *
 * @author juans
 */

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

import modelos.Enum.TipoLlantas;
import modelos.Enum.TipoMotor;
import modelos.Llantas;
import modelos.Motor;

public class ConfiguradorVehiculo {

    public Vehiculo leerDesdeArchivo(String nombreArchivo) {
        try {
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo), Charset.forName("UTF-8"));
            TipoMotor tipoMotor = TipoMotor.valueOf(lineas.get(0).toUpperCase());
            TipoLlantas tipoLlantas = TipoLlantas.valueOf(lineas.get(1).toUpperCase());

            Motor motor = new Motor(tipoMotor);
            Llantas llantas = new Llantas(tipoLlantas);

            return new Vehiculo(motor, llantas);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return null;
        }
    }
}
