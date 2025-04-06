/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author User
 */
public class Motor {
    private TipoMotor tipo;
    private int velocidadMaxima;
   
    public Motor(TipoMotor tipo) {
        this.tipo = tipo;
        this.velocidadMaxima = tipo.getVelocidadMaxima();
    }
   
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
   
    public TipoMotor getTipo() {
        return tipo;
    }
}

