
package gui;

import controller.ColaboradorController;
import tablemodel.ColaboradorTableModel;
import model.Colaborador;

public class JFrmLstColaborador extends javax.swing.JFrame {

    private ColaboradorTableModel cTblModel;
    private final ColaboradorController cc = new ColaboradorController();
    
    public JFrmLstColaborador() {
        initComponents();
        this.setLocationRelativeTo(null);
        cTblModel = new ColaboradorTableModel(cc.lstColaborador());
        jTblColaborador.setModel(cTblModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCmbCampos = new javax.swing.JComboBox<>();
        jTxtProcura = new javax.swing.JTextField();
        jBtnTarefas = new javax.swing.JButton();
        jBtnAlocacoes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblColaborador = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Projetos - Colaboradores Cadastrados");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBtnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        jBtnAdicionar.setText("Adicionar");
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        jLabel1.setText("Campo para busca:");

        jCmbCampos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Matricula", "Nome" }));
        jCmbCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbCamposActionPerformed(evt);
            }
        });

        jTxtProcura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtProcuraKeyTyped(evt);
            }
        });

        jBtnTarefas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tarefas.png"))); // NOI18N
        jBtnTarefas.setText("Tarefas");
        jBtnTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTarefasActionPerformed(evt);
            }
        });

        jBtnAlocacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alocacoes.png"))); // NOI18N
        jBtnAlocacoes.setText("Alocações");
        jBtnAlocacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlocacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCmbCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtProcura, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnAlocacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnTarefas)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAdicionar)
                    .addComponent(jBtnTarefas)
                    .addComponent(jBtnAlocacoes))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCmbCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtProcura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTblColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTblColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblColaboradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblColaborador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTblColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblColaboradorMouseClicked
        ColaboradorTableModel modelo = (ColaboradorTableModel) jTblColaborador.getModel();
        Colaborador c = modelo.getColaborador(jTblColaborador.getSelectedRow());
        JFrmColaboradores frmColaboradores = new JFrmColaboradores(c);
        frmColaboradores.setVisible(true);
        dispose();
    }//GEN-LAST:event_jTblColaboradorMouseClicked

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        JFrmColaboradores frmColaboradores = new JFrmColaboradores(null);
        frmColaboradores.setVisible(true);
        dispose();        
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jTxtProcuraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtProcuraKeyTyped
        String chave = jTxtProcura.getText();
        if (chave.equals("")) {
            chave = String.valueOf(evt.getKeyChar());
        } else if (evt.getKeyChar() != '\b') {
            chave = chave + evt.getKeyChar();
        }
        switch (jCmbCampos.getSelectedIndex()) {
            case 1: cTblModel = new ColaboradorTableModel(cc.getColaboradorMatricula(chave)); break;
            case 2: cTblModel = new ColaboradorTableModel(cc.getColaboradorNome(chave)); break;
        }
        jTblColaborador.setModel(cTblModel);
    }//GEN-LAST:event_jTxtProcuraKeyTyped

    private void jCmbCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbCamposActionPerformed
        if (jCmbCampos.getSelectedIndex() == 0) {
            cTblModel = new ColaboradorTableModel(cc.lstColaborador());
            jTblColaborador.setModel(cTblModel);
        }
        jTxtProcura.requestFocus();
    }//GEN-LAST:event_jCmbCamposActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFrmPrincipal frmPrincipal = new JFrmPrincipal();
        frmPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jBtnTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTarefasActionPerformed
        // chamar frame do Tarefas.
    }//GEN-LAST:event_jBtnTarefasActionPerformed

    private void jBtnAlocacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlocacoesActionPerformed
        // chamar frame do Alocações.
        JFrmLstAlocacao frmLstAlocacao = new JFrmLstAlocacao();
        frmLstAlocacao.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnAlocacoesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnAlocacoes;
    private javax.swing.JButton jBtnTarefas;
    private javax.swing.JComboBox<String> jCmbCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblColaborador;
    private javax.swing.JTextField jTxtProcura;
    // End of variables declaration//GEN-END:variables
}
