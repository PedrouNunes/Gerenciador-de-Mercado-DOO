
package trabalho1;

import java.awt.BorderLayout;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaCadastroProdutos extends javax.swing.JPanel {

    public TelaCadastroProdutos() {
        initComponents();
        TelaPrincipal.listaProdutos = new ArrayList();
    }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btOpcoes = new javax.swing.JButton();
        btDeslogar = new javax.swing.JButton();

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limpeza", "Alimentos", "Casa", "Materiais" }));

        jLabel2.setText("Tipo:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Preço: R$");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Produtos:");

        btCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btCadastrar.setText("Cadastrar");
        btCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrarMouseClicked(evt);
            }
        });

        btOpcoes.setBackground(new java.awt.Color(255, 255, 255));
        btOpcoes.setForeground(new java.awt.Color(0, 0, 0));
        btOpcoes.setText("Mais Opções");
        btOpcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btOpcoesMouseClicked(evt);
            }
        });

        btDeslogar.setBackground(new java.awt.Color(255, 255, 255));
        btDeslogar.setForeground(new java.awt.Color(0, 0, 0));
        btDeslogar.setText("Deslogar");
        btDeslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeslogarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btOpcoes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btDeslogar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btOpcoes)
                .addGap(18, 18, 18)
                .addComponent(btDeslogar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarMouseClicked

        try{
            if (!tfNome.getText().isEmpty() || !tfPreco.getText().isEmpty()) {
                Produto produto = new Produto(tfNome.getText(), parseDouble(tfPreco.getText()), cbTipo.getSelectedItem().toString());
                TelaPrincipal.listaProdutos.add(produto);
                tfNome.setText("");
                tfPreco.setText("");
                
                JOptionPane.showMessageDialog(null, "O produto " + produto.getNome() + " foi cadastrado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            } else{
                throw new Exception();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos para que o produto seja cadastrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCadastrarMouseClicked

    private void btOpcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btOpcoesMouseClicked
           try{
               if (!TelaPrincipal.listaProdutos.isEmpty()) {    
                TelaPrincipal.tVisualizarProdutos = new TelaVisualizarProduto();     
                JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this); 
                janela.getContentPane().remove(TelaPrincipal.tCadastroProduto); 
                janela.add(TelaPrincipal.tVisualizarProdutos, BorderLayout.CENTER); 
                janela.pack();
               }else{
                    throw new Exception();
               }
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Você deve cadastrar um produto antes de ter acesso a outras opções!", "Erro!", JOptionPane.ERROR_MESSAGE);
           }
    }//GEN-LAST:event_btOpcoesMouseClicked

    private void btDeslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeslogarMouseClicked
        TelaPrincipal.tIdentificacao = new TelaIdentificacao();
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);  
        janela.getContentPane().remove(TelaPrincipal.tCadastroProduto); 
        janela.add(TelaPrincipal.tIdentificacao, BorderLayout.CENTER);   
        janela.pack();
    }//GEN-LAST:event_btDeslogarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btDeslogar;
    private javax.swing.JButton btOpcoes;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
