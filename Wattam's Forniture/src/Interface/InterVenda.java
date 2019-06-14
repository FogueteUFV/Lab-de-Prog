
package Interface;
import javax.swing.JOptionPane;
import Conection.Conec;
import wattam.s.forniture.Produto;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.font.TrueTypeFont;

public class InterVenda extends javax.swing.JFrame {
    
    Connection con =null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
    Produto p;
  
    public InterVenda() throws ClassNotFoundException {
        initComponents();
        con = Conec.Conectar();
        this.setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CpfFunc = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        CpfCliente = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        Data = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        IdVenda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IdProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        End = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ValorCm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Quantidade = new javax.swing.JTextField();
        ConfirmaCm = new javax.swing.JButton();

        jFormattedTextField3.setText("jFormattedTextField3");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CPF Funcionario");

        try {
            CpfFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("CPF Cliente");

        try {
            CpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpfClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Data");

        try {
            Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo de Venda");

        jLabel5.setText("Codigo do Produto");

        jLabel6.setText("Endereço Para Entrega");

        jLabel7.setText("Valor da Compra");

        jLabel8.setText("Qunatidade");

        Quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeActionPerformed(evt);
            }
        });

        ConfirmaCm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/cart_go.png"))); // NOI18N
        ConfirmaCm.setText("Confirmar Compra");
        ConfirmaCm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaCmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(Data)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(IdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpfFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(CpfCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(ValorCm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmaCm))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorCm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(ConfirmaCm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpfClienteActionPerformed

    private void DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataActionPerformed

    private void QuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeActionPerformed

    private void ConfirmaCmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaCmActionPerformed
        String sql = "INSERT INTO venda (idVenda, Funcionario_cpf,Cliente_cCpf,dara_2,Valor,enderecoEntrega)VALUES (?, ?,?, ?, ?, ?)";
        String sql1 = "INSERT INTO venda_nota(Quantidade,Venda_idVenda,Produto_idProduto) VALUES (?,?,?)";
        String sql2 = "select QuantidadeEmEstoque from produto where idProduto = ?";
        String cp = "   .    .    -   ";
        try {
            pst = con.prepareStatement(sql);
            pst1 = con.prepareStatement(sql1);
            pst2 = con.prepareStatement(sql2);
            rs = pst2.executeQuery();
            p.setQuantidadeEmEstoque(rs.getInt("QuantidadeEmEstoque"));
            if (Integer.parseInt(Quantidade.getText())<=p.getQuantidadeEmEstoque()) {
               pst.setInt(1,Integer.parseInt(IdVenda.getText()));
               pst.setString(2,CpfFunc.getText());
               pst.setString(3, CpfCliente.getText());
               pst.setDate(4, Date.valueOf(Data.getText()));
               pst.setFloat(5, Float.parseFloat(ValorCm.getText()));
               pst.setString(6, End.getText());
               pst1.setInt(1,Integer.parseInt(Quantidade.getText()));
               pst1.setInt(2,Integer.parseInt(IdVenda.getText()));
               pst1.setInt(3, Integer.parseInt(IdProduto.getText()));
               pst.execute();
               pst1.execute();
               
                if (cp.equals(CpfCliente.getText()) && cp.equals(CpfFunc.getText())) {
                    JOptionPane.showMessageDialog(null, "Campo cpf vazio, por favor preencha-o");
                    
                }else if (IdVenda.getText().isEmpty() || IdProduto.getText().isEmpty() || Data.getText().isEmpty() || ValorCm.getText().isEmpty() || End.getText().isEmpty() || Quantidade.getText().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Há campos vazios, preencha-os por favor");
                    
                }
               
            } else {
               JOptionPane.showMessageDialog(null,"QUANTIDADE INDIPOSNIVEL NO ESTOQUE");
            }
        } catch (SQLException ex) {
            Logger.getLogger(InterVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConfirmaCmActionPerformed

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
            java.util.logging.Logger.getLogger(InterVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterVenda().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(InterVenda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmaCm;
    private javax.swing.JFormattedTextField CpfCliente;
    private javax.swing.JFormattedTextField CpfFunc;
    private javax.swing.JFormattedTextField Data;
    private javax.swing.JTextField End;
    private javax.swing.JTextField IdProduto;
    private javax.swing.JTextField IdVenda;
    private javax.swing.JTextField Quantidade;
    private javax.swing.JTextField ValorCm;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
