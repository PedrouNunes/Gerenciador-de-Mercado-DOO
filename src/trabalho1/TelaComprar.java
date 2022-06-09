
package trabalho1;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaComprar extends javax.swing.JPanel {
    DefaultTableModel model;
    String selecionado = null;
    
private Pessoa pessoa;
    public TelaComprar(Pessoa p) {
        initComponents();
        
        TelaPrincipal.listaCarrinho = new ArrayList<Produto>();
        this.pessoa = p;
        
        this.model = (DefaultTableModel) this.tb_Produtos.getModel();
        inicializaTabela();
    }

     public void inicializaTabela(){
        for(int i=0; i<TelaPrincipal.listaProdutos.size(); i++){ 
           this.model.insertRow(i, new Object[] { TelaPrincipal.listaProdutos.get(i).getNome() });
        }
        this.tb_Produtos.setModel(model);
    }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Produtos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        btAdicionarCarrinho = new javax.swing.JButton();
        btVisuCarrinho = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel1.setText("Preço:");

        jLabel2.setText("Tipo:");

        lbPreco.setText("...");

        lbTipo.setText("...");

        btAdicionarCarrinho.setText("Adicionar ao Carrinho");
        btAdicionarCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAdicionarCarrinhoMouseClicked(evt);
            }
        });

        btVisuCarrinho.setText("Visualizar o Carrinho");
        btVisuCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVisuCarrinhoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btAdicionarCarrinho)))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVisuCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbPreco))
                .addGap(71, 71, 71)
                .addComponent(btAdicionarCarrinho)
                .addGap(18, 18, 18)
                .addComponent(btVisuCarrinho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
                lbPreco.setText("R$" + p.getPreco());
                lbTipo.setText(p.getCategoria());
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um produto da tabela!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            throw new Exception();
        }
        }catch(Exception e){
            lbPreco.setText("");
            lbTipo.setText("");
            JOptionPane.showMessageDialog(null, "Selecione um produto da tabela!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tb_ProdutosMouseClicked

    private void btAdicionarCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAdicionarCarrinhoMouseClicked
        try{
           if(this.selecionado != null){ 
            Produto p = null;
        
            for(int i=0; i<TelaPrincipal.listaProdutos.size(); i++){  
                if(selecionado.equals(TelaPrincipal.listaProdutos.get(i).getNome())){ 
                    p = (Produto) TelaPrincipal.listaProdutos.get(i);
                }
            }

            if(p != null){
               TelaPrincipal.listaCarrinho.add(p);
            JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho!", "Erro!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{ 
         throw new Exception();
        }
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selecione algum produto da tabela antes de continuar!", "Erro!", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btAdicionarCarrinhoMouseClicked

    private void btVisuCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVisuCarrinhoMouseClicked
                    if (!TelaPrincipal.listaCarrinho.isEmpty()) {
                    TelaPrincipal.tCarrinho = new TelaCarrinho(this.pessoa);     
                    JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this); 
                    janela.getContentPane().remove(TelaPrincipal.tComprar); 
                    janela.add(TelaPrincipal.tCarrinho, BorderLayout.CENTER); 
                    janela.pack();
        }else{
                        JOptionPane.showMessageDialog(null, "Adicione algum produto ao carrinho antes de continuar!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    }
    }//GEN-LAST:event_btVisuCarrinhoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarCarrinho;
    private javax.swing.JButton btVisuCarrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JTable tb_Produtos;
    // End of variables declaration//GEN-END:variables
}
