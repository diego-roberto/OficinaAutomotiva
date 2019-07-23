package view;

import dao.FornecedorDAO;
import dao.StoredMessage;
import entity.Fornecedor;
import entity.Funcionario;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class FornecedorIFrame extends javax.swing.JInternalFrame {

    Fornecedor fornecedor;
    FornecedorDAO fornecedorDao;
    JDesktopPane desktop;

    public FornecedorIFrame(JDesktopPane desktop) {
        initComponents();
        this.desktop = desktop;
        fornecedor = new Fornecedor();
        fornecedorDao = new FornecedorDAO();
        disableRequiredComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNorth = new javax.swing.JPanel();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnListagem = new javax.swing.JButton();
        pnSouth = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        pnCenter = new javax.swing.JPanel();
        pnCenterOne = new javax.swing.JPanel();
        lblRazaoSocial = new javax.swing.JLabel();
        txtRazao = new javax.swing.JTextField();
        pnCenterTwo = new javax.swing.JPanel();
        lblCnpj = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        pnCenterThree = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pnCenterFour = new javax.swing.JPanel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        pnCenterFive = new javax.swing.JPanel();
        pnCenterFiveEast = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        pnCenterFiveWest = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        setTitle("FORNECEDOR");
        setMaximumSize(new java.awt.Dimension(600, 300));
        setMinimumSize(new java.awt.Dimension(600, 300));
        setPreferredSize(new java.awt.Dimension(600, 300));

        pnNorth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnNorth.setMaximumSize(new java.awt.Dimension(684, 100));
        pnNorth.setMinimumSize(new java.awt.Dimension(684, 100));
        pnNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblPesquisar.setText("  Fornecedor:");
        pnNorth.add(lblPesquisar);

        txtPesquisar.setToolTipText("Insira o CNPJ");
        txtPesquisar.setMaximumSize(new java.awt.Dimension(200, 20));
        txtPesquisar.setMinimumSize(new java.awt.Dimension(200, 20));
        txtPesquisar.setName(""); // NOI18N
        txtPesquisar.setPreferredSize(new java.awt.Dimension(200, 20));
        pnNorth.add(txtPesquisar);
        txtPesquisar.getAccessibleContext().setAccessibleName("");
        txtPesquisar.getAccessibleContext().setAccessibleDescription("");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_15px.png"))); // NOI18N
        btnPesquisar.setMaximumSize(new java.awt.Dimension(50, 20));
        btnPesquisar.setMinimumSize(new java.awt.Dimension(50, 20));
        btnPesquisar.setPreferredSize(new java.awt.Dimension(50, 20));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        pnNorth.add(btnPesquisar);

        btnListagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/list_15px.png"))); // NOI18N
        btnListagem.setText("Listagem");
        btnListagem.setMaximumSize(new java.awt.Dimension(93, 20));
        btnListagem.setMinimumSize(new java.awt.Dimension(93, 20));
        btnListagem.setPreferredSize(new java.awt.Dimension(93, 20));
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });
        pnNorth.add(btnListagem);

        getContentPane().add(pnNorth, java.awt.BorderLayout.PAGE_START);

        pnSouth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSouth.setMaximumSize(new java.awt.Dimension(684, 100));
        pnSouth.setMinimumSize(new java.awt.Dimension(684, 100));
        pnSouth.setPreferredSize(new java.awt.Dimension(684, 40));
        pnSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

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
        pnCenter.setLayout(new java.awt.GridLayout(5, 1));

        pnCenterOne.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblRazaoSocial.setText("Razão Social:");
        pnCenterOne.add(lblRazaoSocial);

        txtRazao.setMaximumSize(new java.awt.Dimension(300, 20));
        txtRazao.setMinimumSize(new java.awt.Dimension(300, 20));
        txtRazao.setPreferredSize(new java.awt.Dimension(300, 20));
        pnCenterOne.add(txtRazao);

        pnCenter.add(pnCenterOne);

        pnCenterTwo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblCnpj.setText("            CNPJ:");
        pnCenterTwo.add(lblCnpj);

        txtCnpj.setMaximumSize(new java.awt.Dimension(100, 20));
        txtCnpj.setMinimumSize(new java.awt.Dimension(100, 20));
        txtCnpj.setPreferredSize(new java.awt.Dimension(100, 20));
        pnCenterTwo.add(txtCnpj);

        pnCenter.add(pnCenterTwo);

        pnCenterThree.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblEmail.setText("           E-Mail:");
        pnCenterThree.add(lblEmail);

        txtEmail.setMaximumSize(new java.awt.Dimension(200, 20));
        txtEmail.setMinimumSize(new java.awt.Dimension(200, 20));
        txtEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        pnCenterThree.add(txtEmail);

        pnCenter.add(pnCenterThree);

        pnCenterFour.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblTelefone.setText("      Telefone:");
        pnCenterFour.add(lblTelefone);

        txtTelefone.setMaximumSize(new java.awt.Dimension(100, 20));
        txtTelefone.setMinimumSize(new java.awt.Dimension(100, 20));
        txtTelefone.setPreferredSize(new java.awt.Dimension(100, 20));
        pnCenterFour.add(txtTelefone);

        pnCenter.add(pnCenterFour);

        pnCenterFive.setLayout(new java.awt.BorderLayout());

        pnCenterFiveEast.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_15px.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(90, 23));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnCenterFiveEast.add(btnEditar);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_15px.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setPreferredSize(new java.awt.Dimension(90, 23));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        pnCenterFiveEast.add(btnNovo);

        pnCenterFive.add(pnCenterFiveEast, java.awt.BorderLayout.LINE_END);

        pnCenterFiveWest.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblCodigo.setText("         Código:");
        pnCenterFiveWest.add(lblCodigo);

        txtCodigo.setEditable(false);
        txtCodigo.setMaximumSize(new java.awt.Dimension(100, 20));
        txtCodigo.setMinimumSize(new java.awt.Dimension(100, 20));
        txtCodigo.setPreferredSize(new java.awt.Dimension(100, 20));
        pnCenterFiveWest.add(txtCodigo);

        pnCenterFive.add(pnCenterFiveWest, java.awt.BorderLayout.CENTER);

        pnCenter.add(pnCenterFive);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTAO
    //PESQUISAR
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String cnpjPesquisado = txtPesquisar.getText();
        if (cnpjPesquisado.isEmpty()) {
            StoredMessage.emptyFieldErrorMessage();
        } else if (fornecedorDao.searchCnpjFornecedor(cnpjPesquisado) == null) {
            StoredMessage.notFoundErrorMessage();
        } else {
            fornecedor = fornecedorDao.searchCnpjFornecedor(cnpjPesquisado);
            txtCodigo.setText(fornecedor.getCodigoFornecedor().toString());
            txtRazao.setText(fornecedor.getRazaoFornecedor());
            txtCnpj.setText(fornecedor.getCnpjFornecedor());
            txtEmail.setText(fornecedor.getEmailFornecedor());
            txtTelefone.setText(fornecedor.getTelefoneFornecedor());
            disableRequiredComponent();
            btnEditar.setEnabled(true);
        }


    }//GEN-LAST:event_btnPesquisarActionPerformed

    //LISTAGEM
    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        ListagemIFrame listagemFrame = new ListagemIFrame(new Fornecedor());
        boolean windowExists = false;
        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(listagemFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(listagemFrame);
            listagemFrame.setVisible(true);
            listagemFrame.setIconifiable(true);
            listagemFrame.setClosable(true);
            listagemFrame.setLocation();
        }
    }//GEN-LAST:event_btnListagemActionPerformed

    //NOVO
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        fornecedor = new Fornecedor();
        enableRequiredComponent();
        refresh();
    }//GEN-LAST:event_btnNovoActionPerformed

    //EDITAR
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        enableRequiredComponent();
    }//GEN-LAST:event_btnEditarActionPerformed

    //SALVAR
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
            fornecedor.setCodigoFornecedor(Integer.parseInt(txtCodigo.getText()));
        } catch (NumberFormatException numberFormatException) {
            fornecedor.setCodigoFornecedor(null);
        } finally {
            fornecedor.setRazaoFornecedor(txtRazao.getText());
            fornecedor.setCnpjFornecedor(txtCnpj.getText());
            fornecedor.setEmailFornecedor(txtEmail.getText());
            fornecedor.setTelefoneFornecedor(txtTelefone.getText());

            if (fornecedorDao.save(fornecedor)) {
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

    //METODOS
    //HABILITA COMPONENTES
    public void enableRequiredComponent() {
        txtRazao.setEnabled(true);
        txtCnpj.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTelefone.setEnabled(true);
        //btnEditar.setEnabled(false);
        btnSalvar.setEnabled(true);
    }

    //DESABILITA COMPONENTES
    public void disableRequiredComponent() {
        txtRazao.setEnabled(false);
        txtCnpj.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelefone.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);
    }

    //LIMPA OS CAMPOS
    public void refresh() {
        txtRazao.setText("");
        txtCnpj.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtCodigo.setText("");
    }

    //ORIENTA O FRAME AO CENTRO DA TELA
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
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblRazaoSocial;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnCenterFive;
    private javax.swing.JPanel pnCenterFiveEast;
    private javax.swing.JPanel pnCenterFiveWest;
    private javax.swing.JPanel pnCenterFour;
    private javax.swing.JPanel pnCenterOne;
    private javax.swing.JPanel pnCenterThree;
    private javax.swing.JPanel pnCenterTwo;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtRazao;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
