/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author juanp
 */
import data.datarepository.FileDataRepository;
import services.SimuladorController;
import services.sounds.PorscheSoundService;
import modelos.Vehiculo;
public class TestSonido {
    public static void main(String[] args) {
        PorscheSoundService audioPorsche = new PorscheSoundService();
        FileDataRepository fileRepository = new FileDataRepository();
        SimuladorController controlador = new SimuladorController(fileRepository);
    }
}
