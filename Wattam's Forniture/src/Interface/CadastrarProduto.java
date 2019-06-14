
package Interface;
import javax.swing.JOptionPane;
import Conection.Conec;
import wattam.s.forniture.Cliente;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastrarProduto extends javax.swing.JFrame {

   Connection con =null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public CadastrarProduto() throws ClassNotFoundException {
        initComponents();
        con = Conec.Conectar();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Design = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Material = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Preco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Quantidade = new javax.swing.JTextField();
        CadastrarProd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Cor");

        jLabel3.setText("Design");

        Design.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesignActionPerformed(evt);
            }
        });

        jLabel4.setText("Material");

        jLabel5.setText("Nome");

        jLabel6.setText("Preço");

        jLabel7.setText("Quantidade");

        Quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeActionPerformed(evt);
            }
        });

        CadastrarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/basket_add.png"))); // NOI18N
        CadastrarProd.setText("Cadastrar");
        CadastrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarProdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Cadastrar Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(Codigo)
                            .addComponent(jLabel2)
                            .addComponent(Cor)
                            .addComponent(jLabel3)
                            .addComponent(Design)
                            .addComponent(jLabel4)
                            .addComponent(Material, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(Nome)
                            .addComponent(Preco)
                            .addComponent(Quantidade)
                            .addComponent(CadastrarProd, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel8)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Design, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarProd))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesignActionPerformed

    private void QuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeActionPerformed

    private void CadastrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarProdActionPerformed
        String sql = "INSERT INTO Produto (idProduto,Nome,preco,material,cor,design,QuantidadeEmEstoque) VALUES (?,?,?,?,?,?,?)";
       try {
           pst = con.prepareStatement(sql);
           pst.setString(1, Codigo.getText());
           pst.setString(2, Cor.getText());
           pst.setString(3, Design.getText());
           pst.setString(4, Material.getText());
           pst.setString(5, Nome.getText());
           pst.setDouble(6, Double.parseDouble(Preco.getText()));
           pst.setInt(7, Integer.parseInt(Quantidade.getText()));
           pst.execute();
           dispose();
           JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso");
           
           if (Codigo.getText().isEmpty() || Cor.getText().isEmpty() || Design.getText().isEmpty() || Material.getText().isEmpty() || Nome.getText().isEmpty() || Preco.getText().isEmpty() || Quantidade.getText().isEmpty()) {
               JOptionPane.showMessageDialog(null, "Há campos vazios, preencha-os por favor");
           }else{
               JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso" );
           }
       } catch (SQLException ex) {
           Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_CadastrarProdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastrarProduto().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarProd;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Cor;
    private javax.swing.JTextField Design;
    private javax.swing.JTextField Material;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Preco;
    private javax.swing.JTextField Quantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
