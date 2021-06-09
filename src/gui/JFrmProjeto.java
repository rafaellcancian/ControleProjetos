package gui;

import controller.PessoaFisicaController;
import controller.PessoaJuridicaController;
import controller.ProjetoController;
import java.awt.Component;
import java.awt.Container;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Cliente;
import model.Colaborador;
import model.PessoaFisica;
import model.PessoaJuridica;
import model.Projeto;

public class JFrmProjeto extends javax.swing.JFrame {

    private boolean alt = false;
    private int idProjeto = 0;

    public JFrmProjeto(Projeto p) {
        initComponents();
        this.setLocationRelativeTo(null);
        populaJComboLider();
        populaJComboCliente(0);

        if (p != null) {
            preencheCampos(p);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtAreaEscopo = new javax.swing.JTextArea();
        jLabelEscopo = new javax.swing.JLabel();
        jLabelLider = new javax.swing.JLabel();
        jCmbLider = new javax.swing.JComboBox<>();
        jPanelCliente = new javax.swing.JPanel();
        jRadioPessoaFisica = new javax.swing.JRadioButton();
        jRadioPessoaJuridica = new javax.swing.JRadioButton();
        jCmbCliente = new javax.swing.JComboBox<>();
        jTxtDataInicio = new javax.swing.JTextField();
        jTxtDataConclusao = new javax.swing.JTextField();
        jTxtDataPrevConclusao = new javax.swing.JTextField();
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

        jTxtAreaEscopo.setBackground(new java.awt.Color(240, 240, 240));
        jTxtAreaEscopo.setColumns(20);
        jTxtAreaEscopo.setLineWrap(true);
        jTxtAreaEscopo.setRows(5);
        jTxtAreaEscopo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtMatriculaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTxtAreaEscopo);

        jLabelEscopo.setText("Escopo:");

        jLabelLider.setText("Líder:");

        jCmbLider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbLiderActionPerformed(evt);
            }
        });

        jPanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente:"));

        btnGroupCliente.add(jRadioPessoaFisica);
        jRadioPessoaFisica.setSelected(true);
        jRadioPessoaFisica.setText("Pessoa Física");
        jRadioPessoaFisica.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioPessoaFisicaItemStateChanged(evt);
            }
        });

        btnGroupCliente.add(jRadioPessoaJuridica);
        jRadioPessoaJuridica.setText("Pessoa Jurídica");

        jCmbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(jRadioPessoaFisica)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioPessoaJuridica)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioPessoaFisica)
                    .addComponent(jRadioPessoaJuridica))
                .addGap(18, 18, 18)
                .addComponent(jCmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTxtDataInicio.setBackground(new java.awt.Color(240, 240, 240));
        jTxtDataInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Início:"));
        jTxtDataInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtMatriculaKeyTyped(evt);
            }
        });

        jTxtDataConclusao.setBackground(new java.awt.Color(240, 240, 240));
        jTxtDataConclusao.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Conclusão:"));
        jTxtDataConclusao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtMatriculaKeyTyped(evt);
            }
        });

        jTxtDataPrevConclusao.setBackground(new java.awt.Color(240, 240, 240));
        jTxtDataPrevConclusao.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Previsão Conclusão:"));
        jTxtDataPrevConclusao.addKeyListener(new java.awt.event.KeyAdapter() {
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
                    .addComponent(jPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTxtMatricula)
                    .addComponent(jTxtNome)
                    .addComponent(jScrollPane2)
                    .addGroup(jPnlCamposLayout.createSequentialGroup()
                        .addComponent(jTxtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtDataPrevConclusao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnlCamposLayout.createSequentialGroup()
                        .addGroup(jPnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLider)
                            .addComponent(jLabelEscopo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jCmbLider, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jLabelEscopo)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDataPrevConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCmbLider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jPnlBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        ProjetoController pc = new ProjetoController();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dataInicio = null, dataPrevConclusao = null, dataConclusao = null;
        try {
            dataInicio = formatter.parse(jTxtDataInicio.getText());
            dataPrevConclusao = formatter.parse(jTxtDataPrevConclusao.getText());
            dataConclusao = formatter.parse(jTxtDataConclusao.getText());
        } catch (ParseException ex) {
            if (dataInicio == null) {
                JOptionPane.showMessageDialog(this, "Forneça uma data válida! (yyyy-MM-dd)", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        int tipoCliente;
        if (jRadioPessoaFisica.isSelected()) {
            tipoCliente = 0;
        } else {
            tipoCliente = 1;
        }

        Cliente cliente = (Cliente) jCmbCliente.getSelectedItem();
        Colaborador lider = (Colaborador) jCmbLider.getSelectedItem();

        int erro = pc.incluir(jTxtMatricula.getText(), jTxtNome.getText(), jTxtAreaEscopo.getText(), dataInicio, dataPrevConclusao, dataConclusao,
                tipoCliente, cliente, lider);

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
        JFrmLstProjeto frmLstProjeto = new JFrmLstProjeto();
        frmLstProjeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        ProjetoController pc = new ProjetoController();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dataInicio = null, dataPrevConclusao = null, dataConclusao = null;
        try {
            dataInicio = formatter.parse(jTxtDataInicio.getText());
            dataPrevConclusao = formatter.parse(jTxtDataPrevConclusao.getText());
            dataConclusao = formatter.parse(jTxtDataConclusao.getText());
        } catch (ParseException ex) {
            if (dataInicio == null) {
                JOptionPane.showMessageDialog(this, "Forneça uma data válida! (yyyy-MM-dd)", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        int tipoCliente;
        if (jRadioPessoaFisica.isSelected()) {
            tipoCliente = 0;
        } else {
            tipoCliente = 1;
        }

        Cliente cliente = (Cliente) jCmbCliente.getSelectedItem();
        Colaborador lider = (Colaborador) jCmbLider.getSelectedItem();

        int erro = pc.alterar(idProjeto, jTxtMatricula.getText(), jTxtNome.getText(), jTxtAreaEscopo.getText(), dataInicio, dataPrevConclusao, dataConclusao,
                tipoCliente, cliente, lider);

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
                ProjetoController pc = new ProjetoController();
                int erro = pc.excluir(idProjeto);

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
        JFrmLstProjeto frmLstProjeto = new JFrmLstProjeto();
        frmLstProjeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jRadioPessoaFisicaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioPessoaFisicaItemStateChanged
        if (jRadioPessoaFisica.isSelected()) {
            populaJComboCliente(0);
        } else {
            populaJComboCliente(1);
        }
    }//GEN-LAST:event_jRadioPessoaFisicaItemStateChanged

    private void jCmbLiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbLiderActionPerformed
        alterarButtons();
    }//GEN-LAST:event_jCmbLiderActionPerformed

    private void jCmbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbClienteActionPerformed
        alterarButtons();
    }//GEN-LAST:event_jCmbClienteActionPerformed

    private void limpaCampos(Container container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
            }
            jTxtAreaEscopo.setText("");
            jCmbLider.setSelectedIndex(0);
            jCmbCliente.setSelectedIndex(0);
            jTxtMatricula.requestFocus();
        }
    }

    private void preencheCampos(Projeto p) {
        idProjeto = p.getIdProjeto();
        jTxtMatricula.setText(p.getMatricula());
        jTxtNome.setText(p.getNome());
        jTxtAreaEscopo.setText(p.getEscopo());
        jTxtDataInicio.setText(p.getDataInicio().toString());
        if (p.getDataPrevConclusao() != null && p.getDataConclusao() != null) {
            jTxtDataPrevConclusao.setText(p.getDataPrevConclusao().toString());
            jTxtDataConclusao.setText(p.getDataConclusao().toString());
        }

        if (p.getTipoCliente() == 0) {
            jRadioPessoaFisica.setSelected(true);
        } else {
            jRadioPessoaJuridica.setSelected(true);
        }
        
        for (int i = 0; i < jCmbLider.getItemCount(); i++) {
            if (p.getLider().getIdColaborador() == jCmbLider.getItemAt(i).getIdColaborador()) {
                jCmbLider.setSelectedIndex(i);
                break;
            }
        }
        
        for (int i = 0; i < jCmbCliente.getItemCount(); i++) {
            if (p.getCliente().getIdCliente() == jCmbCliente.getItemAt(i).getIdCliente()) {
                jCmbCliente.setSelectedIndex(i);
                break;
            }
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

    private void populaJComboLider() {
        jCmbLider.removeAllItems();

        //ColaboradorController cc = new ColaboradorController();
        //List<Colaborador> lstColaborador = cc.lstColaborador();
        
        //Adicionando manualmente o JCombo do líder, pois colaborador ainda não foi implementado
        Colaborador c = new Colaborador();
        c.setIdColaborador(1);
        c.setNome("Teste");
        jCmbLider.addItem(c);
    }

    private void populaJComboCliente(int tipoCliente) {
        jCmbCliente.removeAllItems();

        if (tipoCliente == 0) {
            PessoaFisicaController pfc = new PessoaFisicaController();
            List<PessoaFisica> lstPessoaFisica = pfc.lstPessoaFisica();
            for (PessoaFisica pf : lstPessoaFisica) {
                jCmbCliente.addItem(pf);
            }
        } else {
            PessoaJuridicaController pjc = new PessoaJuridicaController();
            List<PessoaJuridica> lstPessoaJuridica = pjc.lstPessoaJuridica();
            for (PessoaJuridica pj : lstPessoaJuridica) {
                jCmbCliente.addItem(pj);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupCliente;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JComboBox<Cliente> jCmbCliente;
    private javax.swing.JComboBox<Colaborador> jCmbLider;
    private javax.swing.JLabel jLabelEscopo;
    private javax.swing.JLabel jLabelLider;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPnlBotoes;
    private javax.swing.JPanel jPnlCampos;
    private javax.swing.JRadioButton jRadioPessoaFisica;
    private javax.swing.JRadioButton jRadioPessoaJuridica;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTxtAreaEscopo;
    private javax.swing.JTextField jTxtDataConclusao;
    private javax.swing.JTextField jTxtDataInicio;
    private javax.swing.JTextField jTxtDataPrevConclusao;
    private javax.swing.JTextField jTxtMatricula;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
