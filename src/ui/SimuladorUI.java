/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JLabel;

/**
 *
 * @author Trujirendjj
 */
public class SimuladorUI extends javax.swing.JFrame {

    /**
     * Creates new form SimuladorUI
     */
    public boolean isVisible = false;
    public SimuladorUI() {
        initComponents();
        this.errorPanel.setVisible(isVisible);
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
        frenarButton = new javax.swing.JLabel();
        frenarBruscamenteButton = new javax.swing.JLabel();
        acelerarButton = new javax.swing.JLabel();
        encenderButton = new javax.swing.JLabel();
        apagarButton = new javax.swing.JLabel();
        errorPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frenarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frenarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/1593815.png"))); // NOI18N
        frenarButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(frenarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 110, -1));

        frenarBruscamenteButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frenarBruscamenteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/3410140.png"))); // NOI18N
        frenarBruscamenteButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(frenarBruscamenteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 110, 90));

        acelerarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acelerarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/16013421.png"))); // NOI18N
        acelerarButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(acelerarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 110, -1));

        encenderButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encenderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/4943215.png"))); // NOI18N
        encenderButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(encenderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 90, -1));

        apagarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apagarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/9068977.png"))); // NOI18N
        apagarButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(apagarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 90, -1));

        errorPanel.setBackground(new java.awt.Color(255, 255, 255));
        errorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/simulation/error.png"))); // NOI18N
        errorPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 50, 50));

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("ROG Fonts", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("jLabel5");
        errorPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 450, 30));

        jPanel1.add(errorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 510, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/102408671-futuro-vehículo-autónomo-interior-de-coche-sin-conductor-con-obstáculos-y-paisaje-nocturno-exterior (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/1820663.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/2422850.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MOTOR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TIPO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("LLANTAS");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getAcelerarButton() {
        return acelerarButton;
    }
    
    public JLabel getApagarButton() {
        return apagarButton;
    }
    
    public JLabel getEncenderButton() {
        return encenderButton;
    }
    
    public JLabel getFrenarBruscamenteButton() {
        return frenarBruscamenteButton;
    }
    
    public JLabel getFrenarButton() {
        return frenarButton;
    }
    public void setErrorLabelVisibility(){
        this.isVisible = !isVisible;
        this.errorPanel.setVisible(this.isVisible);
    }
    public void addAcelerarButtonListener(java.awt.event.MouseListener l) {
        this.acelerarButton.addMouseListener(l);
    }

    public void addApagarButtonListener(java.awt.event.MouseListener l) {
        this.apagarButton.addMouseListener(l);
    }

    public void addEncenderButtonListener(java.awt.event.MouseListener l) {
        this.encenderButton.addMouseListener(l);
        
    }

    public void addFrenarBruscamenteButtonListener(java.awt.event.MouseListener l) {
        this.frenarBruscamenteButton.addMouseListener(l);
    }

    public void addFrenarButtonListener(java.awt.event.MouseListener l) {
        this.frenarButton.addMouseListener(l);
    }
    
    public void createForm(){
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acelerarButton;
    private javax.swing.JLabel apagarButton;
    private javax.swing.JLabel encenderButton;
    private javax.swing.JPanel errorPanel;
    private javax.swing.JLabel frenarBruscamenteButton;
    private javax.swing.JLabel frenarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
