/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.sounds;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Trujirendjj
 */
public class PorscheSoundService implements SoundService {

    private static final String ENCENDIDO_ROUTE = "src/assets/sounds/porscheSounds/encendido.wav";
    private static final String ACELERAR_ROUTE = "src/assets/sounds/porscheSounds/acelerar.wav";
    private static final String FRENADO_BRUSCO_ROUTE = "src/assets/sounds/porscheSounds/frenadoBrusco.wav";
    private static final String FRENADO_ROUTE = "src/assets/sounds/porscheSounds/frenado.wav";

    @Override
    public void encender() {
        File sonido = new File(ENCENDIDO_ROUTE);
        System.out.println(sonido.exists());
        Thread hiloSonido = new Thread(() -> {
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(sonido);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
                while (!clip.isRunning()) {
                    Thread.sleep(10);
                    System.out.println(clip.isRunning());
                }
                while (clip.isRunning()) {
                    Thread.sleep(10);
                }
                clip.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        });
        hiloSonido.start();
        try {
            hiloSonido.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void apagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void acelerar() {
        File sonido = new File(ACELERAR_ROUTE);
        Thread hiloSonido = new Thread(() -> {
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(sonido);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
                while (!clip.isRunning()) {
                    Thread.sleep(10);
                }
                while (clip.isRunning()) {
                    Thread.sleep(10);
                }
                clip.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        });
        hiloSonido.start();
        try {
            hiloSonido.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void frenar() {
        File sonido = new File(FRENADO_ROUTE);
        Thread hiloSonido = new Thread(() -> {
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(sonido);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
                while (!clip.isRunning()) {
                    Thread.sleep(10);
                }
                while (clip.isRunning()) {
                    Thread.sleep(10);
                }
                clip.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        });
        hiloSonido.start();
        try {
            hiloSonido.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void frenarBruscamente() {
        File sonido = new File(FRENADO_BRUSCO_ROUTE);
        Thread hiloSonido = new Thread(() -> {
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(sonido);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
                while (!clip.isRunning()) {
                    Thread.sleep(10);
                }
                while (clip.isRunning()) {
                    Thread.sleep(10);
                }
                clip.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        });
        hiloSonido.start();
        try {
            hiloSonido.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
