
package trabalho1;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaVisualizarProduto extends javax.swing.JPanel {

    DefaultTableModel model;
    String selecionado = null;
    public TelaVisualizarProduto() {
        initComponents();
        
        this.model = (DefaultTableModel) this.tb_Produtos.getModel();
        
        inicializaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Produtos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Preço:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tipo:");

        lbPreco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPreco.setForeground(new java.awt.Color(0, 0, 0));
        lbPreco.setText("...");

        lbTipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTipo.setForeground(new java.awt.Color(0, 0, 0));
        lbTipo.setText("...");

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        tb_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ));
        tb_Produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Produtos);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tabela de Produtos Cadastrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btExcluir.setBackground(new java.awt.Color(255, 255, 0));
        btExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btExcluir.setText("Excluir");
        btExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExcluirMouseClicked(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(255, 255, 0));
        btEditar.setForeground(new java.awt.Color(0, 0, 0));
        btEditar.setText("Editar");
        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditarMouseClicked(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(255, 255, 0));
        btVoltar.setForeground(new java.awt.Color(0, 0, 0));
        btVoltar.setText("Voltar");
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lbPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbPreco))
                .addGap(65, 65, 65)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

     public void inicializaTabela(){
        for(int i=0; i<TelaPrincipal.listaProdutos.size(); i++){ 
           this.model.insertRow(i, new Object[] { TelaPrincipal.listaProdutos.get(i).getNome() });
        }
        
        this.tb_Produtos.setModel(model);
    }
    private void tb_ProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ProdutosMouseClicked
        Object temp;
        int column = 0;
        int row = this.tb_Produtos.getSelectedRow(); 
        temp = this.tb_Produtos.getModel().getValueAt(row, column); 

        Produto p = null;
        try{
            if(temp != null){
                this.selecionado = temp.toString();
                for(int i=0; i<TelaPrincipal.listaProdutos.size(); i++){  
                    if(this.selecionado.equals(TelaPrincipal.listaProdutos.get(i).getNome())){  
                        p = (Produto) TelaPrincipal.listaProdutos.get(i);
                    }
                }
                
                 if(p != null){
                this.lbPreco.setText(p.getCategoria()); 
                this.lbTipo.setText("R$" + p.getPreco());
            }else{
                     JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Erro!", JOptionPane.ERROR_MESSAGE);
                 }
            }
            else{
                throw new Exception();
            }
        }catch(Exception e){
            this.lbPreco.setText("");
             this.lbTipo.setText("");
            JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tb_ProdutosMouseClicked

    private void btExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseClicked
        switch(JOptionPane.showConfirmDialog(this, "Continuar?")){
            case 0: 
        Object temp;
        int column = 0;
        int row = this.tb_Produtos.getSelectedRow();  
        temp = this.tb_Produtos.getModel().getValueAt(row, column); 
        Produto p = null;
        try{
            if(temp != null){
                this.selecionado = temp.toString();
                for(int i=0; i<TelaPrincipal.listaProdutos.size(); i++){  
                    if(this.selecionado.equals(TelaPrincipal.listaProdutos.get(i).getNome())){  
                        this.model.removeRow(i);
                        p = (Produto) TelaPrincipal.listaProdutos.remove(i);
                    }
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
            break;
            
        }
        if (TelaPrincipal.listaProdutos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os produtos foram excluidos!", "Remoção!", JOptionPane.INFORMATION_MESSAGE);
            JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().removeAll();
            janela.add(TelaPrincipal.tCadastroProduto, BorderLayout.CENTER);
            janela.pack();  
        }
    }//GEN-LAST:event_btExcluirMouseClicked

    private void btVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseClicked
                JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this); 
                janela.getContentPane().remove(TelaPrincipal.tVisualizarProdutos); 
                janela.add(TelaPrincipal.tCadastroProduto, BorderLayout.CENTER); 
                janela.pack();
    }//GEN-LAST:event_btVoltarMouseClicked

    private void btEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseClicked
       try{
           if(this.selecionado != null){ 
            Produto p = null;
        
            for(int i=0; i<TelaPrincipal.listaProdutos.size(); i++){  
                if(selecionado.equals(TelaPrincipal.listaProdutos.get(i).getNome())){ 
                    p = (Produto) TelaPrincipal.listaProdutos.get(i);
                }
            }

            if(p != null){
                TelaPrincipal.tEditarProduto = new TelaEdicaoProdutos(p); 
                JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);  
                janela.getContentPane().remove(TelaPrincipal.tVisualizarProdutos); 
                janela.add(TelaPrincipal.tEditarProduto, BorderLayout.CENTER);   
                janela.pack();
            }
        }
        else{ 
         throw new Exception();
        }
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selecione algum produto da tabela antes de continuar!", "Erro!", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btEditarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JTable tb_Produtos;
    // End of variables declaration//GEN-END:variables
}
