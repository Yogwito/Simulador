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
    HONDA_K20("Honda K20 2.0L I4", 225, 1998),
    TOYOTA_2JZ("Toyota 2JZ-GTE 3.0L I6", 250, 2997),
    NISSAN_VR38("Nissan VR38DETT 3.8L V6", 315, 3799),
    BMW_S55("BMW S55 3.0L Twin-Turbo I6", 280, 2979),
    FORD_COYOTE("Ford Coyote 5.0L V8", 250, 4951),
    CHEVY_LT4("Chevrolet LT4 6.2L Supercharged V8", 318, 6162),
    MERCEDES_M178("Mercedes-AMG M178 4.0L V8 Biturbo", 315, 3982),
    FERRARI_F136("Ferrari F136 4.3L V8", 315, 4308),
    PORSCHE_M96("Porsche M96 3.6L Flat-6", 296, 3600),
    LAMBORGHINI_L539("Lamborghini L539 6.5L V12", 354, 6498);

    private final String nombre;
    private final int velocidadMaxima;
    private final int cilindrada; // en centímetros cúbicos (cc)

    TipoMotor(String nombre, int velocidadMaxima, int cilindrada) {
        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindrada = cilindrada;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
