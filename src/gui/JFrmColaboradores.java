package gui;

import controller.ColaboradorController;
import java.awt.Component;
import java.awt.Container;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Colaborador;

public class JFrmColaboradores extends javax.swing.JFrame {

    private boolean alt = false;
    private int idColaborador = 0;

    public JFrmColaboradores(Colaborador c) {
        initComponents();
        this.setLocationRelativeTo(null);
        if (c != null) {
            preencheCampos(c);
        } else {
            jTxtMatricula.requestFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupCliente = new javax.swing.ButtonGroup();
        jPnlCampos = new javax.swing.JPanel();
        jTxtMatricula = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();
        jTxtDataInicio = new javax.swing.JTextField();
        jTxtDataConclusao = new javax.swing.JTextField();
        jPnlBotoes = new javax.swing.JPanel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Projetos - Cadastro Projeto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPnlCampos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTxtMatricula.setBackground(new java.awt.Color(240, 240, 240));
        jTxtMatricula.setBorder(javax.swing.BorderFactory.createTitledBorder("Matrícula:"));
        jTxtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtMatriculaKeyTyped(evt);
            }
        });

        jTxtNome.setBackground(new java.awt.Color(240, 240, 240));
        jTxtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome:"));
        jTxtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtMatriculaKeyTyped(evt);
            }
        });

        jTxtDataInicio.setBackground(new java.awt.Color(240, 240, 240));
        jTxtDataInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Admissão:"));
        jTxtDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDataInicioActionPerformed(evt);
            }
        });
        jTxtDataInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtMatriculaKeyTyped(evt);
            }
        });

        jTxtDataConclusao.setBackground(new java.awt.Color(240, 240, 240));
        jTxtDataConclusao.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Desligamento:"));
        jTxtDataConclusao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtMatriculaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPnlCamposLayout = new javax.swing.GroupLayout(jPnlCampos);
        jPnlCampos.setLayout(jPnlCamposLayout);
        jPnlCamposLayout.setHorizontalGroup(
            jPnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtMatricula)
                    .addComponent(jTxtNome)
                    .addGroup(jPnlCamposLayout.createSequentialGroup()
                        .addComponent(jTxtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPnlCamposLayout.setVerticalGroup(
            jPnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTxtDataInicio.getAccessibleContext().setAccessibleName("Data Admissão:");

        jPnlBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPnlBotoes.setDoubleBuffered(false);

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jBtnSalvar.setText("Salvar");
        jBtnSalvar.setEnabled(false);
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.setEnabled(false);
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.setEnabled(false);
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlBotoesLayout = new javax.swing.GroupLayout(jPnlBotoes);
        jPnlBotoes.setLayout(jPnlBotoesLayout);
        jPnlBotoesLayout.setHorizontalGroup(
            jPnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnCancelar)
                .addGap(18, 18, 18)
                .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlBotoesLayout.setVerticalGroup(
            jPnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnSalvar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnSair)
                    .addComponent(jBtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        ColaboradorController pc = new ColaboradorController();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dataInicio = null, dataConclusao = null;
        try {
            dataInicio = formatter.parse(jTxtDataInicio.getText());
            dataConclusao = formatter.parse(jTxtDataConclusao.getText());
        } catch (ParseException ex) {
            if (dataInicio == null) {
                JOptionPane.showMessageDialog(this, "Forneça uma data válida! (yyyy-MM-dd)", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        int erro = pc.incluir(jTxtMatricula.getText(), jTxtNome.getText(), dataInicio, dataConclusao);

        if (erro > -1) {
            if (erro == 1062) {
                JOptionPane.showMessageDialog(this, "Matrícula já cadastrada!", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                jTxtMatricula.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Erro número: " + erro, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            jBtnCancelar.setEnabled(false);
            limpaCampos(jPnlCampos);
        }
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        jBtnIncluir.setEnabled(true);
        jBtnCancelar.setEnabled(false);
        jBtnSalvar.setEnabled(false);
        alt = false;
        limpaCampos(jPnlCampos);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jTxtMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtMatriculaKeyTyped
        alterarButtons();
    }//GEN-LAST:event_jTxtMatriculaKeyTyped

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        JFrmLstColaborador frmLstColaborador = new JFrmLstColaborador();
        frmLstColaborador.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        ColaboradorController pc = new ColaboradorController();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dataInicio = null, dataConclusao = null;
        try {
            dataInicio = formatter.parse(jTxtDataInicio.getText());
            dataConclusao = formatter.parse(jTxtDataConclusao.getText());
        } catch (ParseException ex) {
            if (dataInicio == null) {
                JOptionPane.showMessageDialog(this, "Forneça uma data válida! (yyyy-MM-dd)", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        int erro = pc.alterar(idColaborador, jTxtMatricula.getText(), jTxtNome.getText(), dataInicio, dataConclusao);

        if (erro > -1) {
            if (erro == 1062) {
                JOptionPane.showMessageDialog(this, "Matrícula já cadastrada!", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                jTxtMatricula.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Erro número: " + erro, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            jBtnSalvar.setEnabled(false);
            jBtnCancelar.setEnabled(false);
            jBtnIncluir.setEnabled(true);
            alt = false;
            limpaCampos(jPnlCampos);
        }
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        switch (JOptionPane.showConfirmDialog(this, "Confirma a exclusão?", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION)) {
            case 0: {
                ColaboradorController pc = new ColaboradorController();
                int erro = pc.excluir(idColaborador);

                if (erro > -1) {
                    JOptionPane.showMessageDialog(this, "Erro número: " + erro, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    jBtnSalvar.setEnabled(false);
                    jBtnCancelar.setEnabled(false);
                    jBtnExcluir.setEnabled(false);
                    jBtnIncluir.setEnabled(true);
                    limpaCampos(jPnlCampos);
                }
            }
            case 1:
                break;
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFrmLstColaborador frmLstColaborador = new JFrmLstColaborador();
        frmLstColaborador.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jTxtDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDataInicioActionPerformed

    private void limpaCampos(Container container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
            }
            jTxtMatricula.requestFocus();
        }
    }

    private void preencheCampos(Colaborador c) {
        idColaborador = c.getIdColaborador();
        jTxtMatricula.setText(c.getMatricula());
        jTxtNome.setText(c.getNome());
        jTxtDataInicio.setText(c.getDataAdmissao().toString());
        
        if (c.getDataDesligamento()!= null) {
            jTxtDataConclusao.setText(c.getDataDesligamento().toString());
        }
        
        jBtnIncluir.setEnabled(false);
        jBtnSalvar.setEnabled(false);
        jBtnExcluir.setEnabled(true);
        alt = true;
    }

    private void alterarButtons() {
        if (alt) {
            jBtnExcluir.setEnabled(false);
            jBtnSalvar.setEnabled(true);
        }
        jBtnCancelar.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupCliente;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JPanel jPnlBotoes;
    private javax.swing.JPanel jPnlCampos;
    private javax.swing.JTextField jTxtDataConclusao;
    private javax.swing.JTextField jTxtDataInicio;
    private javax.swing.JTextField jTxtMatricula;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
