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
public class PorscheSoundService implements SoundService{
    private static final String ENCENDIDO_ROUTE = "src/assets/sounds/porscheSounds/encendido.wav";
    
    @Override
    public void encender() {
        File sonido = new File(ENCENDIDO_ROUTE);
        System.out.println(sonido.exists());
        try{
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(sonido);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            while(!clip.isRunning()){
                Thread.sleep(10);
                System.out.println(clip.isRunning());
            }
            while(clip.isRunning()){
                Thread.sleep(10);
            }
            clip.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public void apagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void acelerar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void frenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void frenarBruscamente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
