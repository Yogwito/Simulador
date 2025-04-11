/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import modelos.Enum.Pistas;

/**
 *
 * @author Trujirendjj
 */
public class Carrera {
    private Vehiculo vehiculo;
    private Pistas pista;
    private int sensibilidadAceleracion;
    private int sensibilidadFrenado;
    private int sensibilidadFrenadoBrusco;
    public Carrera(Vehiculo v, Pistas p){
        this.vehiculo = v;
        this.pista = p;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Pistas getPista() {
        return pista;
    }

    public int getSensibilidadAceleracion() {
        return sensibilidadAceleracion;
    }

    public void setSensibilidadAceleracion(int sensibilidadAceleracion) {
        this.sensibilidadAceleracion = sensibilidadAceleracion;
    }

    public int getSensibilidadFrenado() {
        return sensibilidadFrenado;
    }

    public void setSensibilidadFrenado(int sensibilidadFrenado) {
        this.sensibilidadFrenado = sensibilidadFrenado;
    }

    public int getSensibilidadFrenadoBrusco() {
        return sensibilidadFrenadoBrusco;
    }

    public void setSensibilidadFrenadoBrusco(int sensibilidadFrenadoBrusco) {
        this.sensibilidadFrenadoBrusco = sensibilidadFrenadoBrusco;
    }
    
    
}
