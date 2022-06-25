
package trabalho1;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;

public class TelaPrincipal extends javax.swing.JFrame {
    static TelaIdentificacao tIdentificacao;
    static ArrayList<Produto> listaProdutos;
    static ArrayList<Produto> listaCarrinho;
    static TelaCadastroProdutos tCadastroProduto;
    static TelaVisualizarProduto tVisualizarProdutos;
    static TelaEdicaoProdutos tEditarProduto;
    static TelaComprar tComprar;
    static TelaCarrinho tCarrinho;
    static Supermercado supermercado;
    static Pessoa pessoa;
    static TelaNotaFiscal tNota;
    public TelaPrincipal() {
        initComponents();
        Supermercado.clientesNotaFiscal = new ArrayList<Cliente>();
        tIdentificacao = new TelaIdentificacao(); 
        this.setLayout(new BorderLayout());  
        this.add(tIdentificacao, BorderLayout.CENTER); 
        this.pack(); 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
