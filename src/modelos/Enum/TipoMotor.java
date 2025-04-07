/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.Enum;

/**
 *
 * @author juans
 */

public enum TipoMotor {
    MOTOR_1000(100),
    MOTOR_2000(160),
    MOTOR_3000(220);

    private final int velocidadMaxima;

    TipoMotor(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
