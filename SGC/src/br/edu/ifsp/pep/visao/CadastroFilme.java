/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.controle.ControleFilme;
import br.edu.ifsp.pep.modelo.Filme;
import br.edu.ifsp.pep.modelo.Genero;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class CadastroFilme extends javax.swing.JDialog {

    private ControleFilme controleFilme;
    private Filme selecionado;
    private List<Genero> listaGenero;
            
    public CadastroFilme(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.listaGenero = new ArrayList<>();
        this.controleFilme = new ControleFilme();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        tfTitulo = new com.hq.swingmaterialdesign.materialdesign.MTextField();
        tfIdadeMinima = new com.hq.swingmaterialdesign.materialdesign.MTextField();
        mbSair = new com.hq.swingmaterialdesign.materialdesign.MButton();
        mbCadastrar = new com.hq.swingmaterialdesign.materialdesign.MButton();
        tfDuracao = new com.hq.swingmaterialdesign.materialdesign.MTextField();
        tfDataEstreia = new com.hq.swingmaterialdesign.materialdesign.MFormattedTextField();
        tfDirecao = new com.hq.swingmaterialdesign.materialdesign.MTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        lbDescricao = new javax.swing.JLabel();
        mbSelecionarGeneros = new com.hq.swingmaterialdesign.materialdesign.MButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPrincipal.setBackground(java.awt.Color.white);
        jpPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(410, 360));

        tfTitulo.setLabel("Título");

        tfIdadeMinima.setLabel("IdadeMinima");

        mbSair.setBackground(new java.awt.Color(73, 136, 137));
        mbSair.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbSair.setText("Sair");
        mbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbSairActionPerformed(evt);
            }
        });

        mbCadastrar.setBackground(new java.awt.Color(73, 136, 137));
        mbCadastrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbCadastrar.setText("Cadastrar");
        mbCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mbCadastrarMouseClicked(evt);
            }
        });
        mbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbCadastrarActionPerformed(evt);
            }
        });

        tfDuracao.setLabel("Duração");

        tfDataEstreia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        tfDataEstreia.setLabel("Data estreia");

        tfDirecao.setLabel("Direção");
        tfDirecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDirecaoActionPerformed(evt);
            }
        });

        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        taDescricao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(taDescricao);

        lbDescricao.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbDescricao.setText("Descrição");

        mbSelecionarGeneros.setBackground(new java.awt.Color(73, 136, 137));
        mbSelecionarGeneros.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbSelecionarGeneros.setText("Selecionar generos");
        mbSelecionarGeneros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mbSelecionarGenerosMouseClicked(evt);
            }
        });
        mbSelecionarGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbSelecionarGenerosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDataEstreia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfIdadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbDescricao)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(mbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231)
                        .addComponent(mbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbSelecionarGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tfDataEstreia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mbSelecionarGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setSelecionado(Filme f){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.selecionado = f;
        tfDataEstreia.setText(sdf.format(f.getDataEstreia()));
        tfDirecao.setText(f.getDirecao());
        tfDuracao.setText(String.valueOf(f.getDuracao()));
        tfIdadeMinima.setText(String.valueOf(f.getIdadeMinima()));
        tfTitulo.setText(f.getTitulo());
        taDescricao.setText(f.getDescricao());
        this.listaGenero = f.getGeneros();    
        mbCadastrar.setText("Editar");
    }
    
    private void mbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbSairActionPerformed
        dispose();
    }//GEN-LAST:event_mbSairActionPerformed

    private void mbCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbCadastrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mbCadastrarMouseClicked

    private void mbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbCadastrarActionPerformed
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");   
            String titulo = tfTitulo.getText();
            Integer duracao = Integer.parseInt(tfDuracao.getText());
            String direcao = tfDirecao.getText();
            Integer idadeMinima = Integer.parseInt(tfIdadeMinima.getText());
            Date dataEstreia = sdf.parse(tfDataEstreia.getText());
            String descricao = taDescricao.getText();
            
            if(!this.listaGenero.isEmpty()){
                Filme f = new Filme();
                f.setTitulo(titulo);
                f.setDuracao(duracao);
                f.setDirecao(direcao);
                f.setIdadeMinima(idadeMinima);
                f.setDataEstreia(dataEstreia);
                f.setDescricao(descricao);
                f.setGeneros(this.listaGenero);
                
                if(this.selecionado == null){
                    controleFilme.persist(f);
                    JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso");
                    dispose();
                }else{
                    controleFilme.merge(f);
                    JOptionPane.showMessageDialog(null, "Produto atualizado");
                    dispose();
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Por favor selecione os gêneros do filme!");
            } 
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Certifique-se que os campos duração, idade mínima possuem apenas números");
            System.out.println(ex);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, insira a data na forma correta dd/mm/aaaa");
            System.out.println(ex);
        }
        

    }//GEN-LAST:event_mbCadastrarActionPerformed

    private void tfDirecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDirecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDirecaoActionPerformed

    private void mbSelecionarGenerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbSelecionarGenerosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mbSelecionarGenerosMouseClicked

    private void mbSelecionarGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbSelecionarGenerosActionPerformed
        SelecionarGeneros sg = new SelecionarGeneros(null, true, this.listaGenero);
        sg.setModal(true);
        sg.setVisible(true);
    }//GEN-LAST:event_mbSelecionarGenerosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel lbDescricao;
    private com.hq.swingmaterialdesign.materialdesign.MButton mbCadastrar;
    private com.hq.swingmaterialdesign.materialdesign.MButton mbSair;
    private com.hq.swingmaterialdesign.materialdesign.MButton mbSelecionarGeneros;
    private javax.swing.JTextArea taDescricao;
    private com.hq.swingmaterialdesign.materialdesign.MFormattedTextField tfDataEstreia;
    private com.hq.swingmaterialdesign.materialdesign.MTextField tfDirecao;
    private com.hq.swingmaterialdesign.materialdesign.MTextField tfDuracao;
    private com.hq.swingmaterialdesign.materialdesign.MTextField tfIdadeMinima;
    private com.hq.swingmaterialdesign.materialdesign.MTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
