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
    HONDA_K20("Honda K20 2.0L ", 160, 2000),
    TOYOTA_2JZ("Toyota 2JZ-GTE 3.0L ", 220, 3000),
    NISSAN_VR38("Nissan VR38DETT 3.0L ", 220, 3000),
    BMW_S55("BMW S55 3.0L Twin-Turbo I6", 220, 3000),
    FORD_COYOTE("Ford Coyote 1.0L V8", 100, 1000),
    CHEVY_LT4("Chevrolet LT4 1.0L Supercharged V8", 100, 1000),
    MERCEDES_M178("Mercedes-AMG M178 2.0L V8 Biturbo", 160, 2000),
    FERRARI_F136("Ferrari F136 3.0L V8", 220, 3000),
    PORSCHE_M96("Porsche M96 2.0L Flat-6", 160, 2000),
    LAMBORGHINI_L539("Lamborghini L539 1.0L V12", 100, 1000);

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
