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

        PMain = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        lbMenu = new javax.swing.JLabel();
        mBHome = new com.hq.swingmaterialdesign.materialdesign.MToggleButton();
        mbSair = new com.hq.swingmaterialdesign.materialdesign.MToggleButton();
        mbVendas = new com.hq.swingmaterialdesign.materialdesign.MToggleButton();
        mbProdutos = new com.hq.swingmaterialdesign.materialdesign.MToggleButton();
        mbFilmes = new com.hq.swingmaterialdesign.materialdesign.MToggleButton();
        mbSessoes = new com.hq.swingmaterialdesign.materialdesign.MToggleButton();
        jpPrincipal = new javax.swing.JPanel();
        jpHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpVenda = new javax.swing.JPanel();
        jpSessoes = new javax.swing.JPanel();
        jpProdutos = new javax.swing.JPanel();
        jpFilmes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 720));

        PMain.setBackground(java.awt.Color.white);
        PMain.setPreferredSize(new java.awt.Dimension(960, 720));

        jpMenu.setBackground(new java.awt.Color(73, 136, 137));
        jpMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lbMenu.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbMenu.setText("SGC");

        mBHome.setBackground(new java.awt.Color(73, 136, 137));
        mBHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mBHome.setText("Home");
        mBHome.setEndColor(new java.awt.Color(73, 136, 137));
        mBHome.setFocusPainted(false);
        mBHome.setHoverEndColor(new java.awt.Color(37, 157, 218));
        mBHome.setHoverStartColor(new java.awt.Color(37, 157, 218));
        mBHome.setSelected(true);
        mBHome.setSelectedColor(new java.awt.Color(37, 157, 218));
        mBHome.setStartColor(new java.awt.Color(73, 136, 137));
        mBHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBHomeActionPerformed(evt);
            }
        });

        mbSair.setBackground(new java.awt.Color(73, 136, 137));
        mbSair.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbSair.setText("Sair");
        mbSair.setEndColor(new java.awt.Color(73, 136, 137));
        mbSair.setHoverEndColor(new java.awt.Color(37, 157, 218));
        mbSair.setHoverStartColor(new java.awt.Color(37, 157, 218));
        mbSair.setSelectedColor(new java.awt.Color(37, 157, 218));
        mbSair.setStartColor(new java.awt.Color(73, 136, 137));
        mbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbSairActionPerformed(evt);
            }
        });
        mbSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mbSairKeyPressed(evt);
            }
        });

        mbVendas.setBackground(new java.awt.Color(73, 136, 137));
        mbVendas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbVendas.setText("Vendas");
        mbVendas.setEndColor(new java.awt.Color(73, 136, 137));
        mbVendas.setHoverEndColor(new java.awt.Color(37, 157, 218));
        mbVendas.setHoverStartColor(new java.awt.Color(37, 157, 218));
        mbVendas.setSelectedColor(new java.awt.Color(37, 157, 218));
        mbVendas.setStartColor(new java.awt.Color(73, 136, 137));
        mbVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbVendasActionPerformed(evt);
            }
        });

        mbProdutos.setBackground(new java.awt.Color(73, 136, 137));
        mbProdutos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbProdutos.setText("Produtos");
        mbProdutos.setEndColor(new java.awt.Color(73, 136, 137));
        mbProdutos.setHoverEndColor(new java.awt.Color(37, 157, 218));
        mbProdutos.setHoverStartColor(new java.awt.Color(37, 157, 218));
        mbProdutos.setSelectedColor(new java.awt.Color(37, 157, 218));
        mbProdutos.setStartColor(new java.awt.Color(73, 136, 137));
        mbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbProdutosActionPerformed(evt);
            }
        });

        mbFilmes.setBackground(new java.awt.Color(73, 136, 137));
        mbFilmes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbFilmes.setText("Filmes");
        mbFilmes.setEndColor(new java.awt.Color(73, 136, 137));
        mbFilmes.setHoverEndColor(new java.awt.Color(37, 157, 218));
        mbFilmes.setHoverStartColor(new java.awt.Color(37, 157, 218));
        mbFilmes.setSelectedColor(new java.awt.Color(37, 157, 218));
        mbFilmes.setStartColor(new java.awt.Color(73, 136, 137));
        mbFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbFilmesActionPerformed(evt);
            }
        });

        mbSessoes.setBackground(new java.awt.Color(73, 136, 137));
        mbSessoes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbSessoes.setText("SESSÕES");
        mbSessoes.setEndColor(new java.awt.Color(73, 136, 137));
        mbSessoes.setHoverEndColor(new java.awt.Color(37, 157, 218));
        mbSessoes.setHoverStartColor(new java.awt.Color(37, 157, 218));
        mbSessoes.setSelectedColor(new java.awt.Color(37, 157, 218));
        mbSessoes.setStartColor(new java.awt.Color(73, 136, 137));
        mbSessoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbSessoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mBHome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbSessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lbMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbMenu)
                .addGap(108, 108, 108)
                .addComponent(mBHome, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mbVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mbFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mbSessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
        );

        jpPrincipal.setBackground(java.awt.Color.white);

        jpHome.setBackground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel1.setText("Bem vindo, usuário !");

        javax.swing.GroupLayout jpHomeLayout = new javax.swing.GroupLayout(jpHome);
        jpHome.setLayout(jpHomeLayout);
        jpHomeLayout.setHorizontalGroup(
            jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(548, Short.MAX_VALUE))
        );
        jpHomeLayout.setVerticalGroup(
            jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(864, Short.MAX_VALUE))
        );

        jpVenda.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jpVendaLayout = new javax.swing.GroupLayout(jpVenda);
        jpVenda.setLayout(jpVendaLayout);
        jpVendaLayout.setHorizontalGroup(
            jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );
        jpVendaLayout.setVerticalGroup(
            jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );

        jpSessoes.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jpSessoesLayout = new javax.swing.GroupLayout(jpSessoes);
        jpSessoes.setLayout(jpSessoesLayout);
        jpSessoesLayout.setHorizontalGroup(
            jpSessoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );
        jpSessoesLayout.setVerticalGroup(
            jpSessoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jpProdutos.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jpProdutosLayout = new javax.swing.GroupLayout(jpProdutos);
        jpProdutos.setLayout(jpProdutosLayout);
        jpProdutosLayout.setHorizontalGroup(
            jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        jpProdutosLayout.setVerticalGroup(
            jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        jpFilmes.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jpFilmesLayout = new javax.swing.GroupLayout(jpFilmes);
        jpFilmes.setLayout(jpFilmesLayout);
        jpFilmesLayout.setHorizontalGroup(
            jpFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );
        jpFilmesLayout.setVerticalGroup(
            jpFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpSessoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                    .addComponent(jpFilmes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpPrincipalLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jpVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(24, 24, 24)))
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpPrincipalLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jpSessoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(36, 36, 36)))
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpPrincipalLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jpProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(48, 48, 48)))
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpPrincipalLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jpFilmes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(36, 36, 36)))
        );

        javax.swing.GroupLayout PMainLayout = new javax.swing.GroupLayout(PMain);
        PMain.setLayout(PMainLayout);
        PMainLayout.setHorizontalGroup(
            PMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PMainLayout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PMainLayout.setVerticalGroup(
            PMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PMainLayout.createSequentialGroup()
                .addGroup(PMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PMain, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PMain, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mbSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mbSairKeyPressed
    }//GEN-LAST:event_mbSairKeyPressed

    private void mbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbSairActionPerformed
        dispose();
    }//GEN-LAST:event_mbSairActionPerformed

    private void mBHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBHomeActionPerformed
        mbFilmes.setSelected(false);
        jpFilmes.setEnabled(false);
        
        mbProdutos.setSelected(false);
        jpProdutos.setEnabled(false);
        
        mbSessoes.setSelected(false);
        jpSessoes.setEnabled(false);
        
        mbVendas.setSelected(false);
        jpVenda.setEnabled(false);
        
        mBHome.setSelected(true);
        jpHome.setVisible(true);
    }//GEN-LAST:event_mBHomeActionPerformed

    private void mbVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbVendasActionPerformed
        mbFilmes.setSelected(false);
        jpFilmes.setEnabled(false);
        
        mbProdutos.setSelected(false);
        jpProdutos.setEnabled(false);
        
        mbSessoes.setSelected(false);
        jpSessoes.setEnabled(false);
        
        mbVendas.setSelected(true);
        jpVenda.setEnabled(true);
        
        mBHome.setSelected(false);
        jpHome.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_mbVendasActionPerformed

    private void mbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbProdutosActionPerformed
        mbFilmes.setSelected(false);
        jpFilmes.setEnabled(false);
        
        mbProdutos.setSelected(true);
        jpProdutos.setEnabled(true);
        
        mbSessoes.setSelected(false);
        jpSessoes.setEnabled(false);
        
        mbVendas.setSelected(false);
        jpVenda.setEnabled(false);
        
        mBHome.setSelected(false);
        jpHome.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_mbProdutosActionPerformed

    private void mbFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbFilmesActionPerformed
        mbFilmes.setSelected(true);
        jpFilmes.setEnabled(true);
        
        mbProdutos.setSelected(false);
        jpProdutos.setEnabled(false);
        
        mbSessoes.setSelected(true);
        jpSessoes.setEnabled(true);
        
        mbVendas.setSelected(false);
        jpVenda.setEnabled(false);
        
        mBHome.setSelected(false);
        jpHome.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_mbFilmesActionPerformed

    private void mbSessoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbSessoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbSessoesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpFilmes;
    private javax.swing.JPanel jpHome;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpProdutos;
    private javax.swing.JPanel jpSessoes;
    private javax.swing.JPanel jpVenda;
    private javax.swing.JLabel lbMenu;
    private com.hq.swingmaterialdesign.materialdesign.MToggleButton mBHome;
    private com.hq.swingmaterialdesign.materialdesign.MToggleButton mbFilmes;
    private com.hq.swingmaterialdesign.materialdesign.MToggleButton mbProdutos;
    private com.hq.swingmaterialdesign.materialdesign.MToggleButton mbSair;
    private com.hq.swingmaterialdesign.materialdesign.MToggleButton mbSessoes;
    private com.hq.swingmaterialdesign.materialdesign.MToggleButton mbVendas;
    // End of variables declaration//GEN-END:variables
}
