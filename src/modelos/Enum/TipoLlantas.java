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
    // Gama alta
    MICHELIN_PILOT_SPORT_4S("Michelin Pilot Sport 4S BUENAS", 110),
    BRIDGESTONE_POTENZA_S007A("Bridgestone Potenza S007A BUENAS", 110),
    PIRELLI_PZERO("Pirelli P Zero BUENAS", 110),
    CONTINENTAL_SPORTCONTACT_6("Continental SportContact 6 BUENAS ", 110),
    GOODYEAR_EAGLE_F1_SUPERCAR_3("Goodyear Eagle F1 Supercar 3 BUENAS ", 110),

    // Gama intermedia
    HANKOOK_VENTUS_V12("Hankook Ventus V12 Evo2 BONITAS", 70),
    FALKEN_ZIEX_ZE950("Falken Ziex ZE950 BONITAS", 70),
    GENERAL_GMAX_AS05("General G-MAX AS-05 BONITAS", 70),
    KUMHO_ECSTA_PS31("Kumho Ecsta PS31 BONITAS", 70),

    // Gama baja (uso urbano o económico)
    WESTLAKE_RADIAL_RP18("Westlake Radial RP18 BARATAS", 50),
    LINGLONG_GREENMAX("Linglong Green-Max BARATAS", 50),
    NANKANG_ECONEX_NA1("Nankang Econex NA-1 BARATAS", 50);

    private final String nombre;
    private final int limiteVelocidad;

    TipoLlantas(String nombre, int limiteVelocidad) {
        this.nombre = nombre;
        this.limiteVelocidad = limiteVelocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLimiteVelocidad() {
        return limiteVelocidad;
    }
    @Override
    public String toString(){
        return nombre;
    }
}

