/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.Enum;

/**
 *
 * @author juans
 */

public enum TipoLlantas {
    BUENAS(110),
    BONITAS(70),
    BARATAS(50);

    private final int limiteVelocidad;

    TipoLlantas(int limiteVelocidad) {
        this.limiteVelocidad = limiteVelocidad;
    }

    public int getLimiteVelocidad() {
        return limiteVelocidad;
    }
}
