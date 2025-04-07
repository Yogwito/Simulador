/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author juans
 */
public class Llantas {
    private TipoLlantas tipo;
    private int limiteVelocidad;

    public Llantas(TipoLlantas tipo) {
        this.tipo = tipo;
        switch (tipo) {
            case DEPORTIVAS -> limiteVelocidad = 180;
            case TODO_TERRENO -> limiteVelocidad = 100;
            case NORMALES -> limiteVelocidad = 140;
        }
    }

    public int getLimiteVelocidad() {
        return limiteVelocidad;
    }
}
