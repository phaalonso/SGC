/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.modelo.UsuarioComum;

/**
 *
 * @author pedro
 */
public class Menu extends javax.swing.JFrame {

    private UsuarioComum usuario;
    
    public Menu(UsuarioComum usuario) {
        this.usuario = usuario;
        initComponents();
        this.setResizable(false);
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
        mGradientPanel1 = new com.hq.swingmaterialdesign.materialdesign.MGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        mButton1 = new com.hq.swingmaterialdesign.materialdesign.MButton();
        mButton2 = new com.hq.swingmaterialdesign.materialdesign.MButton();
        mButton3 = new com.hq.swingmaterialdesign.materialdesign.MButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(768, 640));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(768, 640));

        mGradientPanel1.setEndColor(new java.awt.Color(148, 11, 3));
        mGradientPanel1.setStartColor(new java.awt.Color(255, 14, 0));
        mGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("SGC");
        mGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 54, -1, -1));

        mButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mButton1.setText("Menu");
        mGradientPanel1.add(mButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 133, 188, 70));

        mButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mButton2.setText("SESSOES");
        mGradientPanel1.add(mButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 188, 69));

        mButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mButton3.setText("VENDA");
        mGradientPanel1.add(mButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 188, 69));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(mGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 580, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.hq.swingmaterialdesign.materialdesign.MButton mButton1;
    private com.hq.swingmaterialdesign.materialdesign.MButton mButton2;
    private com.hq.swingmaterialdesign.materialdesign.MButton mButton3;
    private com.hq.swingmaterialdesign.materialdesign.MGradientPanel mGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
