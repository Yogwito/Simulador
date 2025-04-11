/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import modelos.Carrera;

/**
 *
 * @author Trujirendjj
 */
public class InfoConfiguracion extends javax.swing.JFrame {

    /**
     * Creates new form infoConfiguracion
     */
    public InfoConfiguracion() {
        initComponents();
    }

    public InfoConfiguracion(Carrera carrera) {
        initComponents();
        this.circuitIcon.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource(carrera.getPista().getTrackImgIconPath())));
        this.nombreCircuitoLabel.setText(carrera.getPista().getNombrePista());
        this.longitudCircuitoLabel.setText(
                carrera.getPista().getLongitudPista() + "KM");
        this.velocidadNominaLabel.setText(
                carrera.getVehiculo().getMotor().getVelocidadMaxima() + "KM/H");
        this.velSoportadaLabel.setText(
                carrera.getVehiculo().getLlantas().getLimiteVelocidad() + "KM/H");
    }

    public JPanel getSimularButton() {
        return simularButton;
    }
    public void addSimularButtonListener(java.awt.event.MouseListener l){
        this.simularButton.addMouseListener(l);
    }

    public JLabel getSensibilidadAceleracionLabel() {
        return sensibilidadAceleracionLabel;
    }

    public JLabel getSensibilidadFrenadoBruscoLabel() {
        return sensibilidadFrenadoBruscoLabel;
    }

    public JLabel getSensibilidadFrenadoLabel() {
        return sensibilidadFrenadoLabel;
    }

    public JSlider getAceleracionSlider() {
        return aceleracionSlider;
    }
    public void addAceleracionSliderListener(
            javax.swing.event.ChangeListener l){
        this.aceleracionSlider.addChangeListener(l);
    }
    public JSlider getFrenadoBruscoSlider() {
        return frenadoBruscoSlider;
    }
    public void addFrenadoBruscoSliderListener(
            javax.swing.event.ChangeListener l){
        this.frenadoBruscoSlider.addChangeListener(l);
    }
    public JSlider getFrenadoSlider() {
        return frenadoSlider;
    }
    public void addFrenadoSliderListener(javax.swing.event.ChangeListener l){
        this.frenadoSlider.addChangeListener(l);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        simularButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        circuitIcon = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        velocidadNominaLabel = new javax.swing.JLabel();
        velSoportadaLabel = new javax.swing.JLabel();
        nombreCircuitoLabel = new javax.swing.JLabel();
        longitudCircuitoLabel = new javax.swing.JLabel();
        aceleracionSlider = new javax.swing.JSlider();
        jLabel22 = new javax.swing.JLabel();
        frenadoSlider = new javax.swing.JSlider();
        jLabel23 = new javax.swing.JLabel();
        frenadoBruscoSlider = new javax.swing.JSlider();
        jLabel26 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        sensibilidadAceleracionLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        sensibilidadAceleracionLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        sensibilidadFrenadoLabel = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        sensibilidadFrenadoBruscoLabel = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,200));

        jLabel2.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("V.1.0.0");

        simularButton.setBackground(new java.awt.Color(0, 0, 0));
        simularButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COMENZAR SIMULACION");
        simularButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0,185));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/info_config/carIcon.png"))); // NOI18N
        jLabel5.setFocusable(false);
        jLabel5.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 170, 160));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circuitIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circuitIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 170, 160));

        jLabel24.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 0, 0));
        jLabel24.setText("velocidad nominal");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel25.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 0, 0));
        jLabel25.setText("circuito");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, -1, -1));

        velocidadNominaLabel.setFont(new java.awt.Font("ROG Fonts", 1, 12)); // NOI18N
        velocidadNominaLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(velocidadNominaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        velSoportadaLabel.setFont(new java.awt.Font("ROG Fonts", 1, 12)); // NOI18N
        velSoportadaLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(velSoportadaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        nombreCircuitoLabel.setFont(new java.awt.Font("ROG Fonts", 1, 12)); // NOI18N
        nombreCircuitoLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(nombreCircuitoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        longitudCircuitoLabel.setFont(new java.awt.Font("ROG Fonts", 1, 12)); // NOI18N
        longitudCircuitoLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(longitudCircuitoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, -1, -1));

        aceleracionSlider.setMaximum(20);
        aceleracionSlider.setMinimum(1);
        aceleracionSlider.setValue(5);
        jPanel4.add(aceleracionSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 280, -1));

        jLabel22.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 0, 0));
        jLabel22.setText("SENSIBILIDAD DE FRENADO");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        frenadoSlider.setMaximum(20);
        frenadoSlider.setMinorTickSpacing(1);
        frenadoSlider.setValue(5);
        jPanel4.add(frenadoSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 280, -1));

        jLabel23.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 0, 0));
        jLabel23.setText("SENSIBILIDAD FRENADO BRUSCO");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, -1));

        frenadoBruscoSlider.setMaximum(50);
        frenadoBruscoSlider.setMinimum(30);
        frenadoBruscoSlider.setValue(35);
        jPanel4.add(frenadoBruscoSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 280, -1));

        jLabel26.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 0, 0));
        jLabel26.setText("sENSIBILIDAD DE ACELERACION");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        sensibilidadAceleracionLabel.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        sensibilidadAceleracionLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sensibilidadAceleracionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sensibilidadAceleracionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 280, 30));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        sensibilidadAceleracionLabel2.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        sensibilidadAceleracionLabel2.setForeground(new java.awt.Color(255, 255, 255));
        sensibilidadAceleracionLabel2.setText("0 ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sensibilidadAceleracionLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sensibilidadAceleracionLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 280, 30));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        sensibilidadFrenadoLabel.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        sensibilidadFrenadoLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sensibilidadFrenadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sensibilidadFrenadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));

        sensibilidadFrenadoBruscoLabel.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        sensibilidadFrenadoBruscoLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sensibilidadFrenadoBruscoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sensibilidadFrenadoBruscoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, -1, -1));

        jLabel28.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 0, 0));
        jLabel28.setText("VELOCIDAD MAXIMA soportada");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jLabel21.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 0, 0));
        jLabel21.setText("longitud");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(simularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(simularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 660));

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/main_menu/Bergstrecke-segula-desktop.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void createForm() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider aceleracionSlider;
    private javax.swing.JLabel circuitIcon;
    private javax.swing.JSlider frenadoBruscoSlider;
    private javax.swing.JSlider frenadoSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel longitudCircuitoLabel;
    private javax.swing.JLabel nombreCircuitoLabel;
    private javax.swing.JLabel sensibilidadAceleracionLabel;
    private javax.swing.JLabel sensibilidadAceleracionLabel2;
    private javax.swing.JLabel sensibilidadFrenadoBruscoLabel;
    private javax.swing.JLabel sensibilidadFrenadoLabel;
    private javax.swing.JPanel simularButton;
    private javax.swing.JLabel velSoportadaLabel;
    private javax.swing.JLabel velocidadNominaLabel;
    // End of variables declaration//GEN-END:variables
}
