/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JPanel;

/**
 *
 * @author Trujirendjj
 */
public class DashBoardForm extends javax.swing.JFrame {

    /**
     * Creates new form DashBoardForm
     */
    public DashBoardForm() {
        initComponents();
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
        jPanel3 = new javax.swing.JPanel();
        seleccionarConfigButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        modificarConfigButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        crearConfigButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,200));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102,150));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seleccionarConfigButton.setBackground(new java.awt.Color(0, 0, 0));
        seleccionarConfigButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECCIONAR CONFIGURACION");
        seleccionarConfigButton.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel3.add(seleccionarConfigButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 400, 40));

        modificarConfigButton.setBackground(new java.awt.Color(0, 0, 0));
        modificarConfigButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MODIFICAR CONFIGURACION");
        modificarConfigButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel3.add(modificarConfigButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 400, 40));

        crearConfigButton.setBackground(new java.awt.Color(0, 0, 0));
        crearConfigButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CREAR CONFIGURACIÓN");
        crearConfigButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel3.add(crearConfigButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 400, 40));

        jLabel2.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("V.1.0.0");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/main_menu/images.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190)
                .addComponent(jLabel6)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(195, 195, 195))
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

    public JPanel getCrearConfigButton() {
        return crearConfigButton;
    }

    public JPanel getModificarConfigButton() {
        return modificarConfigButton;
    }

    public JPanel getSeleccionarConfigButton() {
        return seleccionarConfigButton;
    }

    public void addCrearConfigButtonListener(java.awt.event.MouseListener l) {
        this.crearConfigButton.addMouseListener(l);
    }

    public void addModificarConfigButtonListener(java.awt.event.MouseListener l) {
        this.modificarConfigButton.addMouseListener(l);
    }

    public void addSeleccionarConfigButtonListener(java.awt.event.MouseListener l) {
        this.seleccionarConfigButton.addMouseListener(l);
    }
    public void createForm(){
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel crearConfigButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel modificarConfigButton;
    private javax.swing.JPanel seleccionarConfigButton;
    // End of variables declaration//GEN-END:variables
}
