
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

        jPanel2 = new javax.swing.JPanel();
        btAdicionarCarrinho = new javax.swing.JButton();
        btVisuCarrinho = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Produtos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        btAdicionarCarrinho.setBackground(new java.awt.Color(255, 255, 0));
        btAdicionarCarrinho.setForeground(new java.awt.Color(255, 0, 51));
        btAdicionarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-adicionar-o-carrinho-de-compras-30.png"))); // NOI18N
        btAdicionarCarrinho.setText("Adicionar ao Carrinho");
        btAdicionarCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAdicionarCarrinhoMouseClicked(evt);
            }
        });

        btVisuCarrinho.setBackground(new java.awt.Color(255, 255, 0));
        btVisuCarrinho.setForeground(new java.awt.Color(255, 0, 51));
        btVisuCarrinho.setText("Visualizar o Carrinho");
        btVisuCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVisuCarrinhoMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tipo:");

        lbPreco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPreco.setForeground(new java.awt.Color(0, 0, 0));
        lbPreco.setText("...");

        lbTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTipo.setForeground(new java.awt.Color(0, 0, 0));
        lbTipo.setText("...");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Preço:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tela de Compras");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btAdicionarCarrinho))
                        .addComponent(btVisuCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbPreco))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAdicionarCarrinho)
                .addGap(30, 30, 30)
                .addComponent(btVisuCarrinho)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JTable tb_Produtos;
    // End of variables declaration//GEN-END:variables
}
