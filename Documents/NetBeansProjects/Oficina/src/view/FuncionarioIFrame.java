package view;

import dao.FuncionarioDAO;
import dao.StoredMessage;
import entity.Cliente;
import entity.Funcionario;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class FuncionarioIFrame extends javax.swing.JInternalFrame {

    Funcionario funcionario;
    FuncionarioDAO funcionarioDao;
    JDesktopPane desktop;

    public FuncionarioIFrame(JDesktopPane desktop) {
        initComponents();
        this.desktop = desktop;
        funcionario = new Funcionario();
        funcionarioDao = new FuncionarioDAO();
        disableRequiredComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNorth = new javax.swing.JPanel();
        lblPesquisa = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnListagem = new javax.swing.JButton();
        pnSouth = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        pnCenter = new javax.swing.JPanel();
        pnCenter01 = new javax.swing.JPanel();
        pnCenter01West = new javax.swing.JPanel();
        lblCodigoFuncionario = new javax.swing.JLabel();
        txtCodigoFuncionario = new javax.swing.JTextField();
        pnCenter01East = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        pnCenter02 = new javax.swing.JPanel();
        pnCenter02West = new javax.swing.JPanel();
        lblNomeFuncionario = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        pnCenter02East = new javax.swing.JPanel();
        pnCenter03 = new javax.swing.JPanel();
        pnCenter03West = new javax.swing.JPanel();
        lblCpfFuncionario = new javax.swing.JLabel();
        txtCpfFuncionario = new javax.swing.JTextField();
        pnCenter03East = new javax.swing.JPanel();
        pnCenter04 = new javax.swing.JPanel();
        lblTelefoneFuncionario = new javax.swing.JLabel();
        txtTelefoneFuncionario = new javax.swing.JTextField();

        pnNorth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout1.setAlignOnBaseline(true);
        pnNorth.setLayout(flowLayout1);

        lblPesquisa.setText("Funcionário:");
        pnNorth.add(lblPesquisa);

        txtPesquisa.setToolTipText("Nome completo");
        txtPesquisa.setMaximumSize(new java.awt.Dimension(200, 20));
        txtPesquisa.setMinimumSize(new java.awt.Dimension(200, 20));
        txtPesquisa.setPreferredSize(new java.awt.Dimension(200, 20));
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        pnNorth.add(txtPesquisa);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_15px.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        pnNorth.add(btnPesquisar);

        btnListagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/list_15px.png"))); // NOI18N
        btnListagem.setText("Listagem");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });
        pnNorth.add(btnListagem);

        getContentPane().add(pnNorth, java.awt.BorderLayout.PAGE_START);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel_15px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnSouth.add(btnCancelar);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_15px.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnSouth.add(btnSalvar);

        getContentPane().add(pnSouth, java.awt.BorderLayout.PAGE_END);

        pnCenter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnCenter.setLayout(new java.awt.GridLayout(4, 1));

        pnCenter01.setLayout(new java.awt.GridLayout(1, 0));

        pnCenter01West.setMaximumSize(new java.awt.Dimension(300, 57));
        pnCenter01West.setMinimumSize(new java.awt.Dimension(300, 57));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout2.setAlignOnBaseline(true);
        pnCenter01West.setLayout(flowLayout2);

        lblCodigoFuncionario.setText("   Código:");
        pnCenter01West.add(lblCodigoFuncionario);

        txtCodigoFuncionario.setEnabled(false);
        txtCodigoFuncionario.setMaximumSize(new java.awt.Dimension(100, 20));
        txtCodigoFuncionario.setMinimumSize(new java.awt.Dimension(100, 20));
        txtCodigoFuncionario.setPreferredSize(new java.awt.Dimension(100, 20));
        pnCenter01West.add(txtCodigoFuncionario);

        pnCenter01.add(pnCenter01West);

        pnCenter01East.setMaximumSize(new java.awt.Dimension(300, 57));
        pnCenter01East.setMinimumSize(new java.awt.Dimension(300, 57));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_15px.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnCenter01East.add(btnEditar);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_15px.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        pnCenter01East.add(btnNovo);

        pnCenter01.add(pnCenter01East);

        pnCenter.add(pnCenter01);

        pnCenter02.setLayout(new java.awt.GridLayout(1, 0));

        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout3.setAlignOnBaseline(true);
        pnCenter02West.setLayout(flowLayout3);

        lblNomeFuncionario.setText("     Nome:");
        pnCenter02West.add(lblNomeFuncionario);

        txtNomeFuncionario.setMaximumSize(new java.awt.Dimension(200, 20));
        txtNomeFuncionario.setMinimumSize(new java.awt.Dimension(200, 20));
        txtNomeFuncionario.setPreferredSize(new java.awt.Dimension(200, 20));
        pnCenter02West.add(txtNomeFuncionario);

        pnCenter02.add(pnCenter02West);

        java.awt.FlowLayout flowLayout4 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout4.setAlignOnBaseline(true);
        pnCenter02East.setLayout(flowLayout4);
        pnCenter02.add(pnCenter02East);

        pnCenter.add(pnCenter02);

        pnCenter03.setLayout(new java.awt.GridLayout(1, 0));

        java.awt.FlowLayout flowLayout6 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout6.setAlignOnBaseline(true);
        pnCenter03West.setLayout(flowLayout6);

        lblCpfFuncionario.setText("        CPF:");
        pnCenter03West.add(lblCpfFuncionario);

        txtCpfFuncionario.setMaximumSize(new java.awt.Dimension(100, 20));
        txtCpfFuncionario.setMinimumSize(new java.awt.Dimension(100, 20));
        txtCpfFuncionario.setPreferredSize(new java.awt.Dimension(100, 20));
        pnCenter03West.add(txtCpfFuncionario);

        pnCenter03.add(pnCenter03West);

        java.awt.FlowLayout flowLayout5 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout5.setAlignOnBaseline(true);
        pnCenter03East.setLayout(flowLayout5);
        pnCenter03.add(pnCenter03East);

        pnCenter.add(pnCenter03);

        java.awt.FlowLayout flowLayout7 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout7.setAlignOnBaseline(true);
        pnCenter04.setLayout(flowLayout7);

        lblTelefoneFuncionario.setText("Telefone:");
        pnCenter04.add(lblTelefoneFuncionario);

        txtTelefoneFuncionario.setMaximumSize(new java.awt.Dimension(100, 20));
        txtTelefoneFuncionario.setMinimumSize(new java.awt.Dimension(100, 20));
        txtTelefoneFuncionario.setPreferredSize(new java.awt.Dimension(100, 20));
        pnCenter04.add(txtTelefoneFuncionario);

        pnCenter.add(pnCenter04);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //PESQUISAR
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String funcionarioPesquisado = txtPesquisa.getText();
        if (funcionarioPesquisado.isEmpty()) {
            StoredMessage.emptyFieldErrorMessage();
        } else if (funcionarioDao.searchFuncionarioName(funcionarioPesquisado) == null) {
            StoredMessage.notFoundErrorMessage();
        } else {
            funcionario = funcionarioDao.searchFuncionarioName(funcionarioPesquisado);
            txtCodigoFuncionario.setText(funcionario.getCodigoFuncionario().toString());
            txtNomeFuncionario.setText(funcionario.getNomeFuncionario());
            txtCpfFuncionario.setText(funcionario.getCpfFuncionario());
            txtTelefoneFuncionario.setText(funcionario.getTelefoneFuncionario());
            disableRequiredComponent();
            btnEditar.setEnabled(true);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    //LISTAGEM
    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        ListagemIFrame listagemFrame = new ListagemIFrame(new Funcionario());
        boolean windowExists = false;
        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(listagemFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }        
        if(!windowExists){
            desktop.add(listagemFrame);            
            listagemFrame.setVisible(true);
            listagemFrame.setIconifiable(true);
            listagemFrame.setClosable(true);
            listagemFrame.setLocation();            
        }
    }//GEN-LAST:event_btnListagemActionPerformed

    //EDITAR
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        enableRequiredComponent();
    }//GEN-LAST:event_btnEditarActionPerformed

    //NOVO
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        funcionario = new Funcionario();
        enableRequiredComponent();
        refresh();
    }//GEN-LAST:event_btnNovoActionPerformed

    //SALVAR
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        try {
            funcionario.setCodigoFuncionario(Integer.parseInt(txtCodigoFuncionario.getText()));
        } catch (NumberFormatException numberFormatException) {
            funcionario.setCodigoFuncionario(null);
        } finally {
            funcionario.setNomeFuncionario(txtNomeFuncionario.getText());
            funcionario.setCpfFuncionario(txtCpfFuncionario.getText());
            funcionario.setTelefoneFuncionario(txtTelefoneFuncionario.getText());

            if (funcionarioDao.save(funcionario)) {
                StoredMessage.saveSuccessMessage();
                disableRequiredComponent();
                refresh();
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    //CANCELAR
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        //MISSCLICK
    }//GEN-LAST:event_txtPesquisaActionPerformed

    //METODOS
       

    //HABILITA COMPONENTES
    public void enableRequiredComponent() {
        txtNomeFuncionario.setEnabled(true);
        txtCpfFuncionario.setEnabled(true);
        txtTelefoneFuncionario.setEnabled(true);
        //btnEditar.setEnabled(true);
        btnSalvar.setEnabled(true);
    }

    //DESABILITA COMPONENTES
    public void disableRequiredComponent() {
        txtNomeFuncionario.setEnabled(false);
        txtCpfFuncionario.setEnabled(false);
        txtTelefoneFuncionario.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);

    }

    //LIMPA CAMPOS
    public void refresh() {
        txtCodigoFuncionario.setText("");
        txtNomeFuncionario.setText("");
        txtCpfFuncionario.setText("");
        txtTelefoneFuncionario.setText("");
    }

    //LOCALIZA A JANELA NO CENTRO
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCodigoFuncionario;
    private javax.swing.JLabel lblCpfFuncionario;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblTelefoneFuncionario;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnCenter01;
    private javax.swing.JPanel pnCenter01East;
    private javax.swing.JPanel pnCenter01West;
    private javax.swing.JPanel pnCenter02;
    private javax.swing.JPanel pnCenter02East;
    private javax.swing.JPanel pnCenter02West;
    private javax.swing.JPanel pnCenter03;
    private javax.swing.JPanel pnCenter03East;
    private javax.swing.JPanel pnCenter03West;
    private javax.swing.JPanel pnCenter04;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JTextField txtCodigoFuncionario;
    private javax.swing.JTextField txtCpfFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTelefoneFuncionario;
    // End of variables declaration//GEN-END:variables
}
