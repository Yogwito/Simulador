/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import modelos.Enum.TipoMotor;

/**
 *
 * @author juans
 */

public class Motor {
    private TipoMotor tipo;

    public Motor(TipoMotor tipo) {
        this.tipo = tipo;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public int getVelocidadMaxima() {
        return tipo.getVelocidadMaxima();
    }
}
