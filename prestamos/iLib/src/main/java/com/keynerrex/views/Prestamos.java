package com.keynerrex.views;

import java.awt.Color;

public class Prestamos extends javax.swing.JPanel {

    public Prestamos() {
        initComponents();
    }

    private void initStyles() {
        tituloFolio.putClientProperty("FlatLaf.styleClass","large");
        tituloFolio.setForeground(Color.BLACK);
        tituloLibro.putClientProperty("FlatLaf.styleClass","large");
        tituloLibro.setForeground(Color.BLACK);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        tituloFolio = new javax.swing.JLabel();
        txtFolioUsr = new javax.swing.JTextField();
        tituloLibro = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        txtFolioUsr1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnPrestar = new javax.swing.JButton();
        Image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setMinimumSize(new java.awt.Dimension(750, 430));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tituloFolio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloFolio.setText("Folio Usuario");

        txtFolioUsr.setForeground(new java.awt.Color(102, 102, 102));

        tituloLibro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloLibro.setText("Libro ID");

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titulo.setText("Nuevo Prestamo");

        txtFolioUsr1.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));

        btnPrestar.setBackground(new java.awt.Color(18, 90, 173));
        btnPrestar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPrestar.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestar.setText("Prestar");
        btnPrestar.setBorderPainted(false);
        btnPrestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrestar.setFocusable(false);

        Image.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prestamo.jpg"))); // NOI18N

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addGap(270, 270, 270))
                    .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloFolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFolioUsr1)
                    .addComponent(jSeparator3)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(tituloLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(140, 140, 140))
                    .addComponent(txtFolioUsr)
                    .addComponent(jSeparator2)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnPrestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20)))
                .addGap(30, 30, 30))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(380, 380, 380))
            .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1)
                .addGap(50, 50, 50))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(tituloFolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(txtFolioUsr1)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3)
                .addGap(20, 20, 20)
                .addComponent(tituloLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(txtFolioUsr)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2)
                .addGap(60, 60, 60)
                .addComponent(btnPrestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloFolio;
    private javax.swing.JLabel tituloLibro;
    private javax.swing.JTextField txtFolioUsr;
    private javax.swing.JTextField txtFolioUsr1;
    // End of variables declaration//GEN-END:variables
}
