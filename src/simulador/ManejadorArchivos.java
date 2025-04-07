/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador;

/**
 *
 * @author juans
 */

import modelos.Vehiculo;
import modelos.enum.TipoLlantas;
import modelos.enum.TipoMotor;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.List;

public class ManejadorArchivos {

    public static Vehiculo leerVehiculoDesdeArchivo(String ruta) throws IOException {
        Charset charset = Charset.forName("UTF-8");
        Path inFile = Paths.get(ruta);
        List<String> lines = Files.readAllLines(inFile, charset);

        TipoMotor tipoMotor = TipoMotor.valueOf(lines.get(0).trim());
        TipoLlantas tipoLlantas = TipoLlantas.valueOf(lines.get(1).trim());

        return new Vehiculo(tipoMotor, tipoLlantas);
    }

    public static void guardarResultadoSimulacion(String ruta, String contenido) throws IOException {
        Charset charset = Charset.forName("UTF-8");
        Path outFile = Paths.get(ruta);
        Files.write(outFile, List.of(contenido), charset);
    }
}