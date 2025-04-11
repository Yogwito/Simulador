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
    
}
