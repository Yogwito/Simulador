/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.datarepository;

import excepciones.excepcionesArchivo.ConfiguracionExistenteException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import modelos.Carrera;
import modelos.Enum.Pistas;
import modelos.Enum.TipoLlantas;
import modelos.Enum.TipoMotor;
import modelos.Llantas;
import modelos.Motor;
import modelos.Vehiculo;

/**
 *
 * @author juanp
 */
public class FileDataRepository implements DataRepository{
    private static final String FILE_NAME = "config.txt";
    private static String HEADER = "llantas,motor,pista";
    private TipoLlantas obtenerLlanta(String nombreLlanta){
        for(TipoLlantas llanta : TipoLlantas.values()){
            if(llanta.getNombre().equals(nombreLlanta)){
                return llanta;
            }
        }
        return null;
    }
    private TipoMotor obtenerMotor(String nombreMotor){
        for(TipoMotor motor : TipoMotor.values()){
            if(motor.getNombre().equals(nombreMotor)){
                return motor;
            }
        }
        return null;
    }
    private Pistas obtenerPista(String nombrePista){
        for(Pistas pista: Pistas.values()){
            if(pista.getNombrePista().equals(nombrePista)){
                return pista;
            }
        }
        return null;
    }
    private void crearArchivo(File archivo){
        try{
            PrintWriter out = new PrintWriter(new FileWriter(archivo,true));
            out.println(HEADER);
            out.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    @Override
    public void saveConfig(TipoLlantas llanta, TipoMotor motor, Pistas pista) 
            throws ConfiguracionExistenteException{
        File archivoConfiguracion = new File(FILE_NAME);
        if(!archivoConfiguracion.exists()){
            crearArchivo(archivoConfiguracion);
        }
        if(archivoConfiguracion.exists()){
            throw new ConfiguracionExistenteException();
        }
        try{
           StringBuilder sb = new StringBuilder();
           PrintWriter out = new PrintWriter(new FileWriter(archivoConfiguracion,true));
           sb.append(llanta).append(",");
           sb.append(motor).append(",");
           sb.append(pista).append(",");
           out.println(sb.toString());
           out.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void modifyConfig() {
        
    }

    @Override
    public Carrera readConfig() {
        File archivoConfiguracion = new File(FILE_NAME);
        if(!archivoConfiguracion.exists()){
            
        }
        try{
            BufferedReader in = new BufferedReader(new FileReader(archivoConfiguracion));
            // Saltar el encabezado del txt
            in.readLine();
            String[] configuracion = in.readLine().split(",");
            for(String str : configuracion){
                System.out.println(str);
            }
            TipoLlantas llanta = obtenerLlanta(configuracion[0]);
            TipoMotor motor = obtenerMotor(configuracion[1]);
            Pistas pista = obtenerPista(configuracion[2]);
            System.out.println(llanta);
            System.out.println(motor);
            System.out.println(pista);
            return new Carrera(new Vehiculo(
                    new Motor(motor),new Llantas(llanta)), pista);
        }catch(IOException ex){
            
        }
        return null;
    }
    
}
