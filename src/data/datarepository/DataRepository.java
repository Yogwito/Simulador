/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data.datarepository;

import excepciones.excepcionesArchivo.ConfiguracionExistenteException;
import modelos.Carrera;
import modelos.Enum.Pistas;
import modelos.Enum.TipoLlantas;
import modelos.Enum.TipoMotor;

/**
 *
 * @author juanp
 */
public interface DataRepository {
    public void saveConfig(TipoLlantas llanta, TipoMotor motor, Pistas pista) 
            throws ConfiguracionExistenteException;
    public void modifyConfig();
    public Carrera readConfig();
}
