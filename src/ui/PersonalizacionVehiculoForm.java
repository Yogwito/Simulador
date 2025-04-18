/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelos.Enum.Pistas;
import modelos.Enum.TipoLlantas;
import modelos.Enum.TipoMotor;

/**
 *
 * @author Trujirendjj
 */
public class PersonalizacionVehiculoForm extends javax.swing.JFrame {

    /**
     * Creates new form PersonalizacionVehiculoForm
     */
    public PersonalizacionVehiculoForm() {
        initComponents();
    }
    public PersonalizacionVehiculoForm(TipoLlantas[] listaLlantas,
            TipoMotor listaMotores[], Pistas listaPistas[]) {
        initComponents();
        this.listadoLlantas.setModel(new DefaultComboBoxModel<>(listaLlantas));
        this.listadoMotores.setModel(new DefaultComboBoxModel<>(listaMotores));
        this.listadoPistas.setModel(new DefaultComboBoxModel<>(listaPistas));
        this.cilindradaLabel.setText(listaMotores[0].getCilindrada() + "CC");
        this.nombreMotorLabel.setText(listaMotores[0].getNombre());
        this.topSpeedLabel.setText(listaMotores[0].getVelocidadMaxima()+"KM/H");
        this.nombreLlantaLabel.setText(listaLlantas[0].getNombre());
        this.velocidadLlantaLabel.setText(listaLlantas[0].getLimiteVelocidad()+"KM/H");
        this.trackIcon.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(listaPistas[0].getTrackImgIconPath())));
        this.circuitName.setText(listaPistas[0].getNombrePista());
        this.circuitLength.setText(listaPistas[0].getLongitudPista() + "KM");
    }

    public JComboBox<TipoLlantas> getListadoLlantas() {
        return listadoLlantas;
    }
    public void addListadoLlantasListener(java.awt.event.ActionListener l){
        this.listadoLlantas.addActionListener(l);
    }

    public JComboBox<TipoMotor> getListadoMotores() {
        return listadoMotores;
    }
    public void addListadoMotoresListener(java.awt.event.ActionListener l){
        this.listadoMotores.addActionListener(l);
    }
    public JComboBox<Pistas> getListadoPistas() {
        return listadoPistas;
    }
    public void addListadoPistasListener(java.awt.event.ActionListener l){
        this.listadoPistas.addActionListener(l);
    }
    public void addCrearConfigButtonListener(java.awt.event.MouseListener l){
        this.crearConfigButton.addMouseListener(l);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        trackIcon = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        velocidadLlantaLabel = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        nombreLlantaLabel = new javax.swing.JLabel();
        nombreMotorLabel = new javax.swing.JLabel();
        cilindradaLabel = new javax.swing.JLabel();
        topSpeedLabel = new javax.swing.JLabel();
        circuitName = new javax.swing.JLabel();
        circuitLength = new javax.swing.JLabel();
        circuitDescription = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        crearConfigButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        listadoMotores = new javax.swing.JComboBox<>();
        listadoLlantas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        listadoPistas = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("top speed (km/h)");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONFIGURACION:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/car_config/95236.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 140));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/car_config/3267509.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 170, 140));

        jLabel13.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ESPECIFICACIONES DE LAS LLANTAS");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel14.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ESPECIFICACIONES DE CIRCUITO");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        trackIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trackIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trackIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 170, 140));

        jLabel16.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ESPECIFICACIONES DEL MOTOR");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("nombre");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel18.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 0, 0));
        jLabel18.setText("cilindrada");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel19.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 0));
        jLabel19.setText("VELOCIDAD MAXIMA soportada");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        velocidadLlantaLabel.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        velocidadLlantaLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(velocidadLlantaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        jLabel21.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 0, 0));
        jLabel21.setText("nombre");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, -1));

        jLabel22.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 0, 0));
        jLabel22.setText("descripcion");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, -1, -1));

        jLabel23.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 0, 0));
        jLabel23.setText("longitud (km)");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, -1, -1));

        jLabel24.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 0, 0));
        jLabel24.setText("nombre");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        nombreLlantaLabel.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        nombreLlantaLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(nombreLlantaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        nombreMotorLabel.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        nombreMotorLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(nombreMotorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        cilindradaLabel.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        cilindradaLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(cilindradaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        topSpeedLabel.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        topSpeedLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(topSpeedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        circuitName.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        circuitName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(circuitName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, -1, -1));

        circuitLength.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        circuitLength.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(circuitLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, -1));

        circuitDescription.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        circuitDescription.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(circuitDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 580, 660));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102,150));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearConfigButton.setBackground(new java.awt.Color(0, 0, 0));
        crearConfigButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CREAR CONFIGURACION");
        crearConfigButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel3.add(crearConfigButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 400, 40));

        jLabel2.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("V.1.0.0");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        jLabel4.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ELEGIR MOTOR");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jPanel3.add(listadoMotores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 410, -1));

        jPanel3.add(listadoLlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 410, -1));

        jLabel8.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ELEGIR PISTA");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jPanel3.add(listadoPistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 410, -1));

        jLabel10.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ELEGIR LLANTAS");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 660));

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

    public JLabel getNombreLlantaLabel() {
        return nombreLlantaLabel;
    }

    public JLabel getVelocidadLlantaLabel() {
        return velocidadLlantaLabel;
    }

    public JLabel getCilindradaLabel() {
        return cilindradaLabel;
    }

    public JLabel getNombreMotorLabel() {
        return nombreMotorLabel;
    }

    public JLabel getTopSpeedLabel() {
        return topSpeedLabel;
    }

    public JLabel getTrackIcon() {
        return trackIcon;
    }

    public JLabel getCircuitDescription() {
        return circuitDescription;
    }

    public JLabel getCircuitLength() {
        return circuitLength;
    }

    public JLabel getCircuitName() {
        return circuitName;
    }

    public JPanel getCrearConfigButton() {
        return crearConfigButton;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cilindradaLabel;
    private javax.swing.JLabel circuitDescription;
    private javax.swing.JLabel circuitLength;
    private javax.swing.JLabel circuitName;
    private javax.swing.JPanel crearConfigButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<TipoLlantas> listadoLlantas;
    private javax.swing.JComboBox<TipoMotor> listadoMotores;
    private javax.swing.JComboBox<Pistas> listadoPistas;
    private javax.swing.JLabel nombreLlantaLabel;
    private javax.swing.JLabel nombreMotorLabel;
    private javax.swing.JLabel topSpeedLabel;
    private javax.swing.JLabel trackIcon;
    private javax.swing.JLabel velocidadLlantaLabel;
    // End of variables declaration//GEN-END:variables
}
