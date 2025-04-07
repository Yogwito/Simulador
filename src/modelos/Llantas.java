/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import modelos.Enum.TipoLlantas;

/**
 *
 * @author juans
 */

public class Llantas {
    private TipoLlantas tipo;

    public Llantas(TipoLlantas tipo) {
        this.tipo = tipo;
    }

    public TipoLlantas getTipo() {
        return tipo;
    }

    public int getLimiteVelocidad() {
        return tipo.getLimiteVelocidad();
    }
}
