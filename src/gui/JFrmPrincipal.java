
package gui;

public class JFrmPrincipal extends javax.swing.JFrame {

    public JFrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnPessoaFisica = new javax.swing.JButton();
        jBtnPessoaJuridica = new javax.swing.JButton();
        jBtnColaborador = new javax.swing.JButton();
        jBtnProjetos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Projetos");
        setResizable(false);

        jBtnPessoaFisica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pessoaFisica.png"))); // NOI18N
        jBtnPessoaFisica.setText("Pessoa Física");
        jBtnPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPessoaFisicaActionPerformed(evt);
            }
        });

        jBtnPessoaJuridica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pessoaJuridica.png"))); // NOI18N
        jBtnPessoaJuridica.setText("Pessoa Jurídica");
        jBtnPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPessoaJuridicaActionPerformed(evt);
            }
        });

        jBtnColaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/colaborador.png"))); // NOI18N
        jBtnColaborador.setText("Colaborador");
        jBtnColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnColaboradorActionPerformed(evt);
            }
        });

        jBtnProjetos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/projetos.png"))); // NOI18N
        jBtnProjetos.setText("Projetos");
        jBtnProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProjetosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnPessoaJuridica)
                .addGap(18, 18, 18)
                .addComponent(jBtnColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPessoaFisica)
                    .addComponent(jBtnPessoaJuridica)
                    .addComponent(jBtnProjetos)
                    .addComponent(jBtnColaborador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPessoaFisicaActionPerformed
        JFrmLstPessoaFisica frmLstPessoaFisica = new JFrmLstPessoaFisica();
        frmLstPessoaFisica.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnPessoaFisicaActionPerformed

    private void jBtnPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPessoaJuridicaActionPerformed
        JFrmLstPessoaJuridica frmLstPessoaJuridica = new JFrmLstPessoaJuridica();
        frmLstPessoaJuridica.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnPessoaJuridicaActionPerformed

    private void jBtnColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnColaboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnColaboradorActionPerformed

    private void jBtnProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProjetosActionPerformed
        JFrmLstProjeto frmLstProjeto = new JFrmLstProjeto();
        frmLstProjeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnProjetosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnColaborador;
    private javax.swing.JButton jBtnPessoaFisica;
    private javax.swing.JButton jBtnPessoaJuridica;
    private javax.swing.JButton jBtnProjetos;
    // End of variables declaration//GEN-END:variables
}
