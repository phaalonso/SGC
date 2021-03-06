/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.controle.ControleProduto;
import br.edu.ifsp.pep.modelo.ComboProduto;
import br.edu.ifsp.pep.modelo.Item;
import br.edu.ifsp.pep.modelo.Produto;
import java.util.List;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class ItensCombo extends javax.swing.JDialog {
    
    private List<Produto> listaProdutos;
    private List<ComboProduto> listaCombo;
    private ControleProduto controleP;
    
    /**
     * Creates new form ItemsCombo
     */
    public ItensCombo(java.awt.Frame parent, boolean modal, List<ComboProduto> lista) {
        super(parent, modal);
        initComponents();
        this.controleP = new ControleProduto();
        this.listaCombo = lista;
        this.listaProdutos = this.controleP.findAll();
        atualizarTabelaProdutos();
        atualizarSelecionados();
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
        mbAdicionarProduto = new com.hq.swingmaterialdesign.materialdesign.MButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSelecionado = new javax.swing.JTable();
        mbRemoverProduto = new com.hq.swingmaterialdesign.materialdesign.MButton();
        mbConcluir = new com.hq.swingmaterialdesign.materialdesign.MButton();
        tfPesquisaProduto = new com.hq.swingmaterialdesign.materialdesign.MTextField();
        mCPesquisaProduto = new com.hq.swingmaterialdesign.materialdesign.MComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tfQuantidade = new com.hq.swingmaterialdesign.materialdesign.MTextField();
        mbPesquisar = new com.hq.swingmaterialdesign.materialdesign.MButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        mbAdicionarProduto.setBackground(new java.awt.Color(73, 136, 137));
        mbAdicionarProduto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbAdicionarProduto.setText("Adicionar PRODUTo");
        mbAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbAdicionarProdutoActionPerformed(evt);
            }
        });

        tbSelecionado.setAutoCreateRowSorter(true);
        tbSelecionado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbSelecionado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço", "Estoque", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbSelecionado.setColumnSelectionAllowed(true);
        tbSelecionado.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbSelecionado);
        tbSelecionado.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        mbRemoverProduto.setBackground(new java.awt.Color(73, 136, 137));
        mbRemoverProduto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbRemoverProduto.setText("REMOVER SELECIONADO");
        mbRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbRemoverProdutoActionPerformed(evt);
            }
        });

        mbConcluir.setBackground(new java.awt.Color(73, 136, 137));
        mbConcluir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbConcluir.setText("Concluir");
        mbConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbConcluirActionPerformed(evt);
            }
        });

        tfPesquisaProduto.setLabel("Pesquisa");

        mCPesquisaProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Nome" }));
        mCPesquisaProduto.setAccent(new java.awt.Color(73, 136, 137));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel1.setText("Selecionados");

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbProdutos);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel2.setText("Produtos");

        tfQuantidade.setLabel("Quantidade");

        mbPesquisar.setBackground(new java.awt.Color(73, 136, 137));
        mbPesquisar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mbPesquisar.setText("Pesquisar");
        mbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mbAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(tfQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mbRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mbConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mCPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mCPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mbAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void atualizarTabelaProdutos(){
        for(ComboProduto cp: this.listaCombo){
            this.listaProdutos.remove(cp.getProduto());
        }
        
        DefaultTableModel model = (DefaultTableModel) tbProdutos.getModel();
        model.setNumRows(0);
        for(Produto p: this.listaProdutos){
            model.addRow(new Object[]{p.getCodigo(), p.getDescricao(), p.getPreco(), p.getEstoque()});
        }
    }
    
    public void atualizarSelecionados(){
        DefaultTableModel model = (DefaultTableModel) tbSelecionado.getModel();
        model.setNumRows(0);
        Produto p = null;
        for(ComboProduto cp : this.listaCombo){
            p = cp.getProduto();
            model.addRow(new Object[]{p.getCodigo(), p.getDescricao(), p.getPreco(), p.getEstoque(), 
                cp.getQuantidade() });
        }
    }
    
    private void mbAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbAdicionarProdutoActionPerformed
        int row = tbProdutos.getSelectedRow();
        if(!tfQuantidade.getText().isEmpty()){
            if(row > -1){
                try{
                    try{
                        Integer quantidade = Integer.parseInt(tfQuantidade.getText().trim());
                        Integer cod = (Integer) tbProdutos.getValueAt(row, 0);
                        Produto p = controleP.findByCodigo(cod);
                        ComboProduto cp = new ComboProduto();
                        cp.setProduto(p);
                        cp.setQuantidade(quantidade);
                        this.listaCombo.add(cp);
                        atualizarTabelaProdutos();
                        atualizarSelecionados();
                    }catch(NoResultException ex){
                        JOptionPane.showMessageDialog(null, "Esse produto não foi encontrado!");
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Insira apenas números na quantidade");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um produto!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Insira a quantidade de produtos que irá pertencer ao combo!");
        }
    }//GEN-LAST:event_mbAdicionarProdutoActionPerformed

    private void mbRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbRemoverProdutoActionPerformed
        int row = tbSelecionado.getSelectedRow();

        if(row > -1){
            Integer cod = null;
            cod = (Integer) tbSelecionado.getValueAt(row, 0);
            Produto p = controleP.findByCodigo(cod);
            int index = -1;
            for(ComboProduto cp: this.listaCombo){
                if(cp.getProduto().equals(p)){
                    index = this.listaCombo.indexOf(cp);
                }
            }
            
            if(index > -1){
                this.listaCombo.remove(index);
                this.listaProdutos.add(p);
                atualizarTabelaProdutos();
                atualizarSelecionados();
            }else{
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
            }            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um item do combo na tabela!");
        }
    }//GEN-LAST:event_mbRemoverProdutoActionPerformed

    public void atualizarTabela(){
        DefaultTableModel model = (DefaultTableModel) tbSelecionado.getModel();
        model.setNumRows(0);
        for(ComboProduto cp: this.listaCombo){
            model.addRow(new Object[] {cp.getProduto().getCodigo(), cp.getProduto().getDescricao(), cp.getQuantidade()});
        }
    }
    
    private void mbConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbConcluirActionPerformed
        dispose();
    }//GEN-LAST:event_mbConcluirActionPerformed

    private void mbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbPesquisarActionPerformed
        System.out.println(mCPesquisaProduto.getSelectedIndex());
        if(tfPesquisaProduto.getText().isEmpty()){
            this.listaProdutos = controleP.findAll();
                atualizarTabelaProdutos();
        }else{
            switch(mCPesquisaProduto.getSelectedIndex()){
                case -1:
                    this.listaProdutos = controleP.findAll();
                    atualizarTabelaProdutos();
                    break;
                case 0:
                    try{
                        Integer codigo = Integer.parseInt(tfPesquisaProduto.getText());
                        try{
                            Produto p = controleP.findByCodigo(codigo);
                            this.listaProdutos.clear();
                            this.listaProdutos.add(p);   
                            atualizarTabelaProdutos();
                        }catch(NoResultException ex){
                            JOptionPane.showMessageDialog(null, "Nenhum resultado com esse código!");
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Digite apenas número para pesquisar por código");
                    }
                    break;
                case 1:
                    try{
                        this.listaProdutos = controleP.findByDesc(tfPesquisaProduto.getText().trim());
                        atualizarTabelaProdutos();
                    }catch(NoResultException ex){
                        JOptionPane.showMessageDialog(null, "Nenhum resultado com esse código!");
                    }
                    break;
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_mbPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private com.hq.swingmaterialdesign.materialdesign.MComboBox mCPesquisaProduto;
    private com.hq.swingmaterialdesign.materialdesign.MButton mbAdicionarProduto;
    private com.hq.swingmaterialdesign.materialdesign.MButton mbConcluir;
    private com.hq.swingmaterialdesign.materialdesign.MButton mbPesquisar;
    private com.hq.swingmaterialdesign.materialdesign.MButton mbRemoverProduto;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTable tbSelecionado;
    private com.hq.swingmaterialdesign.materialdesign.MTextField tfPesquisaProduto;
    private com.hq.swingmaterialdesign.materialdesign.MTextField tfQuantidade;
    // End of variables declaration//GEN-END:variables
}
