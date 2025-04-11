/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import data.datarepository.DataRepository;
import excepciones.excepcionesArchivo.ConfiguracionExistenteException;
import excepciones.excepcionesVehiculo.AceleracionExcesivaMotorException;
import excepciones.excepcionesVehiculo.FrenadoBruscoExcesoVelocidadLlantasException;
import excepciones.excepcionesVehiculo.FrenadoMayorAVelocidadActualException;
import excepciones.excepcionesVehiculo.VehiculoAccidentadoException;
import excepciones.excepcionesVehiculo.VehiculoApagadoNoPuedeAcelerarNiFrenarException;
import excepciones.excepcionesVehiculo.VehiculoDetenidoNoPuedeFrenarException;
import excepciones.excepcionesVehiculo.VehiculoYaEncendidoException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import services.sounds.SoundService;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import modelos.Carrera;
import modelos.Enum.Pistas;
import modelos.Enum.TipoLlantas;
import modelos.Enum.TipoMotor;
import services.sounds.PorscheSoundService;
import ui.DashBoardForm;
import ui.InfoConfiguracion;
import ui.PersonalizacionVehiculoForm;
import ui.SimuladorUI;

/**
 *
 * @author Trujirendjj
 */
public class SimuladorController {

    private Carrera carreraSimulacion;
    private SoundService paqueteSonidos;
    private SimuladorUI simulador;
    private DashBoardForm dashBoardMenu;
    private PersonalizacionVehiculoForm config;
    private DataRepository repositorio;
    private InfoConfiguracion infoConfig;

    public SimuladorController(DataRepository repository) {
        this.repositorio = repository;
        this.createDashBoardMenu();
    }

    private void createDashBoardMenu() {
        this.dashBoardMenu = new DashBoardForm();
        this.dashBoardMenu.addCrearConfigButtonListener(new PanelListener());
        this.dashBoardMenu.addSeleccionarConfigButtonListener(new PanelListener());
        this.dashBoardMenu.addModificarConfigButtonListener(new PanelListener());
        this.dashBoardMenu.createForm();
    }

    private void createConfigMenu() {
        this.config = new PersonalizacionVehiculoForm(
                TipoLlantas.values(), TipoMotor.values(), Pistas.values());
        this.config.addListadoLlantasListener(new ComboListener());
        this.config.addListadoMotoresListener(new ComboListener());
        this.config.addListadoPistasListener(new ComboListener());
        this.config.addCrearConfigButtonListener(new PanelListener());
        this.config.createForm();
    }

    private void createInfoConfigMenu() {
        this.carreraSimulacion = this.repositorio.readConfig();
        this.infoConfig = new InfoConfiguracion(this.carreraSimulacion);
        this.infoConfig.addSimularButtonListener(new PanelListener());
        this.infoConfig.addAceleracionSliderListener(new SliderListener());
        this.infoConfig.addFrenadoSliderListener(new SliderListener());
        this.infoConfig.addFrenadoBruscoSliderListener(new SliderListener());
        this.infoConfig.createForm();
    }

    private void handleError(String msg) {
        JPanel errorPanel = this.simulador.getErrorPanel();
        JLabel errorText = this.simulador.getErrorText();
        errorText.setText(msg);
        errorPanel.setVisible(true);
        Timer timer = new Timer(400, new ActionListener() {
            int contador = 0;

            @Override
            public void actionPerformed(ActionEvent evt) {
                errorPanel.setVisible(!errorPanel.isVisible()); // Parpadea

                contador++;
                if (contador >= 5) { // Después de 5 parpadeos (1 segundo total)
                    ((Timer) evt.getSource()).stop();
                    errorPanel.setVisible(false); // Lo ocultamos al final
                }
            }
        });

        timer.start();
    }

    private void handleEncendido() {
        try {
            this.carreraSimulacion.getVehiculo().encender();
            System.out.println("XD");
            this.paqueteSonidos.encender();
        } catch (VehiculoYaEncendidoException e) {
            this.handleError(e.getMessage());
        } catch (VehiculoAccidentadoException e1) {
            System.out.println(e1.getMessage());
        } catch (Exception e) {

        }
    }

    private void handleCambioLlanta(TipoLlantas llanta) {
        this.config.getNombreLlantaLabel().setText(llanta.getNombre());
        this.config.getVelocidadLlantaLabel().setText(llanta.getLimiteVelocidad() + "KM/H");
    }

    private void handleCambioMotor(TipoMotor motor) {
        this.config.getCilindradaLabel().setText(motor.getCilindrada() + "CC");
        this.config.getNombreMotorLabel().setText(motor.getNombre());
        this.config.getTopSpeedLabel().setText(motor.getVelocidadMaxima() + "KM/H");
    }

    private void handleCambioPista(Pistas pista) {
        this.config.getTrackIcon().setIcon(new javax.swing.ImageIcon(
                getClass().getResource(pista.getTrackImgIconPath())));
        this.config.getCircuitName().setText(pista.getNombrePista());
        this.config.getCircuitLength().setText(pista.getLongitudPista() + "KM");
    }

    private void handleSaveConfig() {
        TipoLlantas llanta = (TipoLlantas) this.config.getListadoLlantas().getSelectedItem();
        TipoMotor motor = (TipoMotor) this.config.getListadoMotores().getSelectedItem();
        Pistas pista = (Pistas) this.config.getListadoPistas().getSelectedItem();
        try {
            this.repositorio.saveConfig(llanta, motor, pista);
            System.out.println("CONFIGURACION CREADA EXITOSAMENTE");
        } catch (ConfiguracionExistenteException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.config.dispose();
        }
    }

    private void handleCambioSlider(JSlider slider, JLabel label) {
        int value = slider.getValue();
        label.setText(value + "M/S^2");

    }

    private void handleAceleracion() {
        try{
            this.carreraSimulacion.getVehiculo().acelerar(
                    this.carreraSimulacion.getSensibilidadAceleracion());
            this.simulador.getLabelVelocidad().setText(
                    this.carreraSimulacion.getVehiculo().getVelocidad() + "KM/H");
        }catch(VehiculoApagadoNoPuedeAcelerarNiFrenarException e){
            this.handleError(e.getMessage());
        }catch(AceleracionExcesivaMotorException e1){
            this.handleError(e1.getMessage());
        }
    }
    private void handleFrenado(){
        try{
            this.carreraSimulacion.getVehiculo().frenar(
                    this.carreraSimulacion.getSensibilidadFrenado());
            this.simulador.getLabelVelocidad().setText(
                    this.carreraSimulacion
                            .getVehiculo().getVelocidad() + "KM/H");
        }catch(FrenadoMayorAVelocidadActualException e){
            this.handleError(e.getMessage());
        }catch(VehiculoApagadoNoPuedeAcelerarNiFrenarException e1){
            this.handleError(e1.getMessage());
        }catch(VehiculoDetenidoNoPuedeFrenarException e2){
            this.handleError(e2.getMessage());
        }catch(FrenadoBruscoExcesoVelocidadLlantasException e3){
            this.handleError(e3.getMessage());
        }
    }
    private void iniciarSimulacion() {
        this.carreraSimulacion.setSensibilidadAceleracion(
                this.infoConfig.getAceleracionSlider().getValue());
        this.carreraSimulacion.setSensibilidadFrenado(
                this.infoConfig.getFrenadoSlider().getValue());
        this.carreraSimulacion.setSensibilidadFrenadoBrusco(
                this.infoConfig.getFrenadoBruscoSlider().getValue());
        this.paqueteSonidos = new PorscheSoundService();
        this.simulador = new SimuladorUI();
        this.simulador.addEncenderButtonListener(new ButtonListener());
        this.simulador.addAcelerarButtonListener(new ButtonListener());
        this.simulador.addFrenarButtonListener(new ButtonListener());
        this.simulador.getPistaImagen().setIcon(new javax.swing.ImageIcon(
                getClass().getResource(this.carreraSimulacion.getPista()
                        .getTrackImgPath())));
        this.simulador.createForm();
    }

    private class ButtonListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JLabel src = (JLabel) e.getSource();
            if (src == simulador.getEncenderButton()) {
                System.out.println("XD");
                handleEncendido();
            }
            if(src == simulador.getAcelerarButton()){
                handleAceleracion();
            }
            if(src == simulador.getFrenarButton()){
                handleFrenado();
            }
            
            if(src == simulador.getFrenarBruscamenteButton()){
                //handleFrenadoBrusco();
            }
        }
    }

    private class PanelListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            JPanel src = (JPanel) e.getSource();
            if (src == dashBoardMenu.getCrearConfigButton()) {
                createConfigMenu();
            }
            if (src == dashBoardMenu.getSeleccionarConfigButton()) {
                createInfoConfigMenu();
            }
            if (config != null) {
                if (src == config.getCrearConfigButton()) {
                    handleSaveConfig();
                }
            }
            if (infoConfig != null) {
                if (src == infoConfig.getSimularButton()) {
                    infoConfig.dispose();
                    iniciarSimulacion();
                }
            }

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JPanel src = (JPanel) e.getSource();
            src.setBackground(Color.decode("#879DD9"));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JPanel src = (JPanel) e.getSource();
            src.setBackground(Color.BLACK);
        }
    }

    private class SliderListener implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider src = (JSlider) e.getSource();
            if (src == infoConfig.getAceleracionSlider()) {
                handleCambioSlider(infoConfig.getAceleracionSlider(),
                        infoConfig.getSensibilidadAceleracionLabel());
            }
            if (src == infoConfig.getFrenadoSlider()) {
                handleCambioSlider(infoConfig.getFrenadoSlider(),
                        infoConfig.getSensibilidadFrenadoLabel());
            }
            if (src == infoConfig.getFrenadoBruscoSlider()) {
                handleCambioSlider(infoConfig.getFrenadoBruscoSlider(),
                        infoConfig.getSensibilidadFrenadoBruscoLabel());
            }

        }

    }

    private class ComboListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox<?> src = (JComboBox<?>) e.getSource();
            if (src == config.getListadoLlantas()) {
                TipoLlantas llanta = (TipoLlantas) src.getSelectedItem();
                handleCambioLlanta(llanta);
            }
            if (src == config.getListadoMotores()) {
                TipoMotor motor = (TipoMotor) src.getSelectedItem();
                handleCambioMotor(motor);
            }
            if (src == config.getListadoPistas()) {
                Pistas pista = (Pistas) src.getSelectedItem();
                handleCambioPista(pista);
            }
        }
    }
}
