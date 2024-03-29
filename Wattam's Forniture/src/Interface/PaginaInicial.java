
package Interface;

import javax.swing.JOptionPane;
import Conection.Conec;
import wattam.s.forniture.Cliente;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PaginaInicial extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public PaginaInicial() throws ClassNotFoundException {
        initComponents();
        con = Conec.Conectar();
        this.setLocationRelativeTo(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Funcionario = new javax.swing.JMenu();
        CadFunc = new javax.swing.JMenuItem();
        ExFunc = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenu();
        CadCliente = new javax.swing.JMenuItem();
        ExCliente = new javax.swing.JMenuItem();
        PesquisarC = new javax.swing.JMenuItem();
        Produto = new javax.swing.JMenu();
        AddProduto = new javax.swing.JMenuItem();
        ExProduto = new javax.swing.JMenuItem();
        ProcurarProduto = new javax.swing.JMenuItem();
        Venda = new javax.swing.JMenu();
        Vender = new javax.swing.JMenuItem();

        jButton2.setText("jButton2");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Pristina", 1, 50)); // NOI18N
        jLabel1.setText("Wattam's Magazine");

        Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/group.png"))); // NOI18N
        Funcionario.setText("Funcionario");

        CadFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/group_add.png"))); // NOI18N
        CadFunc.setText("Cadastrar ");
        CadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncActionPerformed(evt);
            }
        });
        Funcionario.add(CadFunc);

        ExFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/group_delete.png"))); // NOI18N
        ExFunc.setText("Excluir");
        ExFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExFuncActionPerformed(evt);
            }
        });
        Funcionario.add(ExFunc);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/magnifier.png"))); // NOI18N
        jMenuItem2.setText("Pesquisar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Funcionario.add(jMenuItem2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/application_delete.png"))); // NOI18N
        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Funcionario.add(jMenuItem1);

        jMenuBar1.add(Funcionario);

        Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/user.png"))); // NOI18N
        Cliente.setText("Cliente");

        CadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/user_add.png"))); // NOI18N
        CadCliente.setText("Cadastrar");
        CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteActionPerformed(evt);
            }
        });
        Cliente.add(CadCliente);

        ExCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/user_delete.png"))); // NOI18N
        ExCliente.setText("Excluir");
        ExCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExClienteActionPerformed(evt);
            }
        });
        Cliente.add(ExCliente);

        PesquisarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/folder_user.png"))); // NOI18N
        PesquisarC.setText("Pesquisar");
        PesquisarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarCActionPerformed(evt);
            }
        });
        Cliente.add(PesquisarC);

        jMenuBar1.add(Cliente);

        Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/basket.png"))); // NOI18N
        Produto.setText("Produto");

        AddProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/basket_add.png"))); // NOI18N
        AddProduto.setText("Adicionar");
        AddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProdutoActionPerformed(evt);
            }
        });
        Produto.add(AddProduto);

        ExProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/basket_delete.png"))); // NOI18N
        ExProduto.setText("Remover");
        Produto.add(ExProduto);

        ProcurarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/folder_explore.png"))); // NOI18N
        ProcurarProduto.setText("Procurar");
        ProcurarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcurarProdutoActionPerformed(evt);
            }
        });
        Produto.add(ProcurarProduto);

        jMenuBar1.add(Produto);

        Venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/cart.png"))); // NOI18N
        Venda.setText("Venda");
        Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendaActionPerformed(evt);
            }
        });

        Vender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/cart_add.png"))); // NOI18N
        Vender.setText("Realizar Venda");
        Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderActionPerformed(evt);
            }
        });
        Venda.add(Vender);

        jMenuBar1.add(Venda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
       CadastrarCliente cl = null;
        try {
            cl = new CadastrarCliente();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        cl.setVisible(true);
    }//GEN-LAST:event_CadClienteActionPerformed

    private void ExClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExClienteActionPerformed
        ExcluirCliente ex = null;
        try {
            ex = new ExcluirCliente();
        } catch (ClassNotFoundException ex1) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex1);
        }
        ex.setVisible(true);
                
    }//GEN-LAST:event_ExClienteActionPerformed

    private void ExFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExFuncActionPerformed
        ExcluirFunc exf = null;
        try {
            exf = new ExcluirFunc();
        } catch (ClassNotFoundException ex1) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE,null, ex1);
        }
        exf.setVisible(true);
        
    }//GEN-LAST:event_ExFuncActionPerformed

    private void CadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncActionPerformed
        CadastrarFuncionario cF = null;
        try {
            cF = new CadastrarFuncionario();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        cF.setVisible(true);
    }//GEN-LAST:event_CadFuncActionPerformed

    private void VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendaActionPerformed
        InterVenda vd = null;
        
        try {
            vd = new InterVenda();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        vd.setVisible(true);
    }//GEN-LAST:event_VendaActionPerformed

    private void AddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProdutoActionPerformed
        CadastrarProduto cdp = null;
        try {
            cdp = new CadastrarProduto();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        cdp.setVisible(true);
    }//GEN-LAST:event_AddProdutoActionPerformed

    private void VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderActionPerformed
        InterVenda vd = null;
        
        try {
            vd = new InterVenda();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        vd.setVisible(true);                               

    }//GEN-LAST:event_VenderActionPerformed

    private void PesquisarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarCActionPerformed
        PesquisaCliente pc = null;
        try {
            pc = new PesquisaCliente();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        pc.setVisible(true);                               

       
    }//GEN-LAST:event_PesquisarCActionPerformed

    private void ProcurarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcurarProdutoActionPerformed
        PesquisarProduto pp = null;
        try {
            pp = new PesquisarProduto();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        pp.setVisible(true);
    }//GEN-LAST:event_ProcurarProdutoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       dispose();
        Inicial l = new Inicial();
        l.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        PesquisaFuncionario pf = null;
        try {
            pf = new PesquisaFuncionario();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        pf.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PaginaInicial().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddProduto;
    private javax.swing.JMenuItem CadCliente;
    private javax.swing.JMenuItem CadFunc;
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenuItem ExCliente;
    private javax.swing.JMenuItem ExFunc;
    private javax.swing.JMenuItem ExProduto;
    private javax.swing.JMenu Funcionario;
    private javax.swing.JMenuItem PesquisarC;
    private javax.swing.JMenuItem ProcurarProduto;
    private javax.swing.JMenu Produto;
    private javax.swing.JMenu Venda;
    private javax.swing.JMenuItem Vender;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
