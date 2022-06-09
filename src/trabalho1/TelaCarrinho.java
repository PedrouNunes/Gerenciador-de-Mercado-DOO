
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
        btCalcular = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

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

        lbPagar.setForeground(new java.awt.Color(0, 0, 0));
        lbPagar.setText("<R$>");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total a Pagar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPagar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btNotaFiscal.setText("Emitir nota fiscal");
        btNotaFiscal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNotaFiscalMouseClicked(evt);
            }
        });

        btCalcular.setText("Calcular valor a ser pago");
        btCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCalcularMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNotaFiscal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalcular, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btNotaFiscal)
                .addGap(58, 58, 58)
                .addComponent(btCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_CarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_CarrinhoMouseClicked
        Object temp;
        int column = 0;
        int row = this.tb_Carrinho.getSelectedRow();
        temp = this.tb_Carrinho.getModel().getValueAt(row, column);
        
        Produto p = null;
        try{
            if(temp != null){
                this.selecionado = temp.toString();
                for(int i=0; i<TelaPrincipal.listaProdutos.size(); i++){
                    if(this.selecionado.equals(TelaPrincipal.listaProdutos.get(i).getNome())){
                        p = (Produto) TelaPrincipal.listaProdutos.get(i);
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
        janela.getContentPane().remove(TelaPrincipal.tCarrinho); 
        janela.add(TelaPrincipal.tNota, BorderLayout.CENTER); 
        janela.pack();
    }//GEN-LAST:event_btNotaFiscalMouseClicked

    private void btCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCalcularMouseClicked
       if (TelaPrincipal.listaCarrinho.isEmpty() == false) {
           for (int i = 0; i < TelaPrincipal.listaCarrinho.size(); i++) {
               contTotalPagar = contTotalPagar +  TelaPrincipal.listaCarrinho.get(i).getPreco();
               lbPagar.setText("<R$" + contTotalPagar + ">");
           }
           TelaPrincipal.supermercado = new Supermercado(pessoa, contTotalPagar);
                }
    }//GEN-LAST:event_btCalcularMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btNotaFiscal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPagar;
    private javax.swing.JTable tb_Carrinho;
    // End of variables declaration//GEN-END:variables
}
