package gui;

import controller.PessoaFisicaController;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.PessoaFisica;

public class JFrmPessoaFisica extends javax.swing.JFrame {

    private boolean alt = false;
    private int idPessoaFisica = 0;

    public JFrmPessoaFisica(PessoaFisica pf) {
        initComponents();
        this.setLocationRelativeTo(null);

        if (pf != null) {
            preencheCampos(pf);
        } else {
            jTxtNome.requestFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlCampos = new javax.swing.JPanel();
        jTxtNome = new javax.swing.JTextField();
        jTxtEndereco = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtCpf = new javax.swing.JTextField();
        jTxtFone = new javax.swing.JTextField();
        jPnlBotoes = new javax.swing.JPanel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Projetos - Cadastro Pessoa Física");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPnlCampos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTxtNome.setBackground(new java.awt.Color(240, 240, 240));
        jTxtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome:"));
        jTxtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNomeKeyTyped(evt);
            }
        });

        jTxtEndereco.setBackground(new java.awt.Color(240, 240, 240));
        jTxtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));
        jTxtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNomeKeyTyped(evt);
            }
        });

        jTxtEmail.setBackground(new java.awt.Color(240, 240, 240));
        jTxtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("E-mail:"));
        jTxtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNomeKeyTyped(evt);
            }
        });

        jTxtCpf.setBackground(new java.awt.Color(240, 240, 240));
        jTxtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF:"));
        jTxtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNomeKeyTyped(evt);
            }
        });

        jTxtFone.setBackground(new java.awt.Color(240, 240, 240));
        jTxtFone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone:"));
        jTxtFone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNomeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPnlCamposLayout = new javax.swing.GroupLayout(jPnlCampos);
        jPnlCampos.setLayout(jPnlCamposLayout);
        jPnlCamposLayout.setHorizontalGroup(
            jPnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtNome)
                    .addComponent(jTxtEndereco)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnlCamposLayout.createSequentialGroup()
                        .addComponent(jTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPnlCamposLayout.setVerticalGroup(
            jPnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        PessoaFisicaController pfc = new PessoaFisicaController();
        int erro = pfc.incluir(jTxtNome.getText(), jTxtEndereco.getText(), jTxtCpf.getText(), jTxtEmail.getText(), jTxtFone.getText());

        if (erro > -1) {
            if (erro == 1062) {
                JOptionPane.showMessageDialog(this, "CPF já cadastrado!", "Controle de Projetos - Cadastro Pessoa Física", JOptionPane.ERROR_MESSAGE);
                jTxtCpf.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Erro número: " + erro, "Controle de Projetos - Cadastro Pessoa Física", JOptionPane.ERROR_MESSAGE);
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

    private void jTxtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNomeKeyTyped
        if (alt) {
            jBtnExcluir.setEnabled(false);
            jBtnSalvar.setEnabled(true);
        }
        jBtnCancelar.setEnabled(true);
    }//GEN-LAST:event_jTxtNomeKeyTyped

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        JFrmLstPessoaFisica frmLstPessoaFisica = new JFrmLstPessoaFisica();
        frmLstPessoaFisica.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        PessoaFisicaController pfc = new PessoaFisicaController();
        int erro = pfc.alterar(idPessoaFisica, jTxtNome.getText(), jTxtEndereco.getText(), jTxtCpf.getText(), jTxtEmail.getText(), jTxtFone.getText());

        if (erro > -1) {
            if (erro == 1062) {
                JOptionPane.showMessageDialog(this, "CPF já cadastrado!", "Controle de Projetos - Cadastro Pessoa Física", JOptionPane.ERROR_MESSAGE);
                jTxtCpf.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Erro número: " + erro, "Controle de Projetos - Cadastro Pessoa Física", JOptionPane.ERROR_MESSAGE);
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
        switch (JOptionPane.showConfirmDialog(this, "Confirma a exclusão?", "Controle de Projetos - Cadastro Pessoa Física", JOptionPane.YES_NO_OPTION)) {
            case 0: {
                PessoaFisicaController pfc = new PessoaFisicaController();
                int erro = pfc.excluir(idPessoaFisica);

                if (erro > -1) {
                    JOptionPane.showMessageDialog(this, "Erro número: " + erro, "Controle de Projetos - Cadastro Pessoa Física", JOptionPane.ERROR_MESSAGE);
                } else {
                    jBtnSalvar.setEnabled(false);
                    jBtnCancelar.setEnabled(false);
                    jBtnExcluir.setEnabled(false);
                    jBtnIncluir.setEnabled(true);
                    limpaCampos(jPnlCampos);
                }
            }
            case 1: break;
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFrmLstPessoaFisica frmLstPessoaFisica = new JFrmLstPessoaFisica();
        frmLstPessoaFisica.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void limpaCampos(Container container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
            }
            jTxtNome.requestFocus();
        }
    }

    private void preencheCampos(PessoaFisica pf) {
        idPessoaFisica = pf.getIdCliente();
        jTxtNome.setText(pf.getNome());
        jTxtEndereco.setText(pf.getEndereco());
        jTxtEmail.setText(pf.getEmail());
        jTxtCpf.setText(pf.getCpf());
        jTxtFone.setText(pf.getFone());
        jBtnIncluir.setEnabled(false);
        jBtnSalvar.setEnabled(false);
        jBtnExcluir.setEnabled(true);
        alt = true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JPanel jPnlBotoes;
    private javax.swing.JPanel jPnlCampos;
    private javax.swing.JTextField jTxtCpf;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtFone;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
