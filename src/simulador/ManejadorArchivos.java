package simulador;

import modelos.*;
import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.List;
import modelos.Enum.TipoLlantas;
import modelos.Enum.TipoMotor;

public class ManejadorArchivos {
    public static Vehiculo leerVehiculoDesdeArchivo(String ruta) throws IOException {
        Charset charset = Charset.forName("UTF-8");
        List<String> lineas = Files.readAllLines(Paths.get(ruta), charset);
        
        TipoLlantas tipoLlantas = null;
        TipoMotor tipoMotor = null;
        
        for (String linea : lineas) {
            String[] partes = linea.trim().split("\\s+");
            if (partes.length < 2) {
                continue; // Ignorar líneas mal formateadas
            }
            
            if (partes[0].equalsIgnoreCase("llantas")) {
                try {
                    tipoLlantas = TipoLlantas.valueOf(partes[1].toUpperCase());
                } catch (IllegalArgumentException e) {
                    throw new IOException("Tipo de llantas no válido: " + partes[1]);
                }
            } else if (partes[0].equalsIgnoreCase("motor")) {
                switch (partes[1]) {
                    case "1000": tipoMotor = TipoMotor.MOTOR_1000; break;
                    case "2000": tipoMotor = TipoMotor.MOTOR_2000; break;
                    case "3000": tipoMotor = TipoMotor.MOTOR_3000; break;
                    default: throw new IOException("Cilindraje de motor no válido: " + partes[1]);
                }
            }
        }
        
        if (tipoLlantas == null || tipoMotor == null) {
            throw new IOException("Archivo de configuración incompleto o inválido. Debe especificar llantas y motor.");
        }
        
        Motor motor = new Motor(tipoMotor);
        Llantas llantas = new Llantas(tipoLlantas);
        
        System.out.println("Vehículo configurado con éxito:");
        System.out.println("- Motor: " + tipoMotor + " (Velocidad máxima: " + motor.getVelocidadMaxima() + " km/h)");
        System.out.println("- Llantas: " + tipoLlantas + " (Límite velocidad: " + llantas.getLimiteVelocidad() + " km/h)");
        
        return new Vehiculo(motor, llantas);
    }
}