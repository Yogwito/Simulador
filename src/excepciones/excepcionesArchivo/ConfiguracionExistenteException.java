/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones.excepcionesArchivo;

/**
 *
 * @author juanp
 */
public class ConfiguracionExistenteException extends Exception{
    public ConfiguracionExistenteException(){
        super("ARCHIVO DE CONFIGURACION YA EXISTE");
    }
    public ConfiguracionExistenteException(String msg){
        super(msg);
    }
}
