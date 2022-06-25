
package trabalho1;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaCarrinho extends javax.swing.JPanel {
 DefaultTableModel model;
 String selecionado = null;
 double contTotalPagar = 0;
private Cliente pessoa;
    public TelaCarrinho(Pessoa p) {
        initComponents();
        this.pessoa = (Cliente) p;
         this.model = (DefaultTableModel) this.tb_Carrinho.getModel();
        inicializaTabela();
        
         if (TelaPrincipal.listaCarrinho.isEmpty() == false) {
           for (int i = 0; i < TelaPrincipal.listaCarrinho.size(); i++) {
               contTotalPagar = contTotalPagar +  TelaPrincipal.listaCarrinho.get(i).getPreco();
               lbPagar.setText("<R$" + contTotalPagar + ">");
               TelaPrincipal.supermercado = new Supermercado(contTotalPagar);
           }
                }
    }

  public void inicializaTabela(){
        for(int i=0; i<TelaPrincipal.listaCarrinho.size(); i++){ 
           this.model.insertRow(i, new Object[] { TelaPrincipal.listaCarrinho.get(i).getNome() });
        }
        
        this.tb_Carrinho.setModel(model);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Carrinho = new javax.swing.JTable();
        lbPagar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btNotaFiscal = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        tb_Carrinho.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_Carrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_CarrinhoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Carrinho);

        lbPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPagar.setForeground(new java.awt.Color(0, 0, 0));
        lbPagar.setText("<R$>");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total a Pagar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbPagar)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btNotaFiscal.setBackground(new java.awt.Color(255, 255, 0));
        btNotaFiscal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btNotaFiscal.setForeground(new java.awt.Color(255, 51, 51));
        btNotaFiscal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-tomando-nota-30.png"))); // NOI18N
        btNotaFiscal.setText("Emitir nota fiscal");
        btNotaFiscal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNotaFiscalMouseClicked(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(255, 255, 0));
        btRemover.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btRemover.setForeground(new java.awt.Color(255, 51, 51));
        btRemover.setText("Remover Item ");
        btRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRemoverMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-adicionar-o-carrinho-de-compras-30.png"))); // NOI18N
        jLabel3.setText("Carrinho");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btRemover)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(84, 84, 84)
                .addComponent(btNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_CarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_CarrinhoMouseClicked
        Object temp;
        int column = 0;
        int row = this.tb_Carrinho.getSelectedRow();
        temp = this.tb_Carrinho.getModel().getValueAt(row, column);
        
        Produto c = null;
        try{
            if(temp != null){
                this.selecionado = temp.toString();
                for(int i=0; i<TelaPrincipal.listaProdutos.size(); i++){
                    if(this.selecionado.equals(TelaPrincipal.listaProdutos.get(i).getNome())){
                        c = (Produto) TelaPrincipal.listaProdutos.get(i);
                    }
                }
            }
            else{
                throw new Exception();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selecione um produto da tabela!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tb_CarrinhoMouseClicked

    private void btNotaFiscalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNotaFiscalMouseClicked
        TelaPrincipal.tNota = new TelaNotaFiscal();
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this); 
        janela.getContentPane().removeAll(); 
        janela.add(TelaPrincipal.tNota, BorderLayout.CENTER); 
        janela.pack();
    }//GEN-LAST:event_btNotaFiscalMouseClicked

    private void btRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRemoverMouseClicked
         switch(JOptionPane.showConfirmDialog(this, "Continuar?")){
            case 0: 
        Object temp;
        int column = 0;
        int row = this.tb_Carrinho.getSelectedRow();  
        temp = this.tb_Carrinho.getModel().getValueAt(row, column); 
        Produto c = null;
        try{
            if(temp != null){
                this.selecionado = temp.toString();
                for(int i=0; i<TelaPrincipal.listaCarrinho.size(); i++){  
                    if(this.selecionado.equals(TelaPrincipal.listaCarrinho.get(i).getNome())){  
                        this.model.removeRow(i);
                        c = (Produto) TelaPrincipal.listaCarrinho.remove(i);
                    }
                }
                contTotalPagar -= c.getPreco();
                lbPagar.setText("<R$" + contTotalPagar + ">");
                TelaPrincipal.supermercado = new Supermercado(contTotalPagar);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
            break;
        }
        if (TelaPrincipal.listaProdutos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os produtos foram excluidos do carrinho!", "Remoção!", JOptionPane.INFORMATION_MESSAGE);
            JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().removeAll();
            janela.add(TelaPrincipal.tCadastroProduto, BorderLayout.CENTER);
            janela.pack();  
        }
    }//GEN-LAST:event_btRemoverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNotaFiscal;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPagar;
    private javax.swing.JTable tb_Carrinho;
    // End of variables declaration//GEN-END:variables
}
