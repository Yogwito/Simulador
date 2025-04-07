/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author juans
 */

public class Motor {
    private TipoMotor tipo;
    private int velocidadMaxima;

    public Motor(TipoMotor tipo) {
        this.tipo = tipo;
        switch (tipo) {
            case DIESEL -> velocidadMaxima = 120;
            case GASOLINA -> velocidadMaxima = 150;
            case ELECTRICO -> velocidadMaxima = 100;
        }
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
