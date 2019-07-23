package view;

import dao.ServicoDAO;
import dao.StoredMessage;
import entity.Servico;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class ServicoIFrame extends javax.swing.JInternalFrame {

    Servico servico;
    ServicoDAO servicoDao;
    JDesktopPane desktop;

    public ServicoIFrame(JDesktopPane desktop) {
        initComponents();
        this.desktop = desktop;
        servico = new Servico();
        servicoDao = new ServicoDAO();
        disableRequiredComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNorth = new javax.swing.JPanel();
        lblPesquisa = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        btnListagem = new javax.swing.JButton();
        pnCenter = new javax.swing.JPanel();
        pnCenter01 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        pnCenter02 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        pnCenter03 = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        pnCenter04 = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        pnSouth = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setTitle("SERVICO");
        setMaximumSize(new java.awt.Dimension(450, 250));
        setMinimumSize(new java.awt.Dimension(450, 250));
        setPreferredSize(new java.awt.Dimension(450, 250));

        pnNorth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnNorth.setMaximumSize(new java.awt.Dimension(434, 40));
        pnNorth.setMinimumSize(new java.awt.Dimension(434, 40));
        pnNorth.setPreferredSize(new java.awt.Dimension(434, 40));
        pnNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblPesquisa.setText(" Pesquisa:");
        pnNorth.add(lblPesquisa);

        txtPesquisa.setToolTipText("Código");
        txtPesquisa.setMaximumSize(new java.awt.Dimension(190, 20));
        txtPesquisa.setMinimumSize(new java.awt.Dimension(190, 20));
        txtPesquisa.setPreferredSize(new java.awt.Dimension(190, 20));
        pnNorth.add(txtPesquisa);

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_15px.png"))); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        pnNorth.add(btnPesquisa);

        btnListagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/list_15px.png"))); // NOI18N
        btnListagem.setText("Listagem");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });
        pnNorth.add(btnListagem);

        getContentPane().add(pnNorth, java.awt.BorderLayout.PAGE_START);

        pnCenter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnCenter.setLayout(new java.awt.GridLayout(2, 2));

        pnCenter01.setMaximumSize(new java.awt.Dimension(215, 68));
        pnCenter01.setMinimumSize(new java.awt.Dimension(215, 68));
        pnCenter01.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblCodigo.setText("    Código:");
        pnCenter01.add(lblCodigo);

        txtCodigo.setEnabled(false);
        txtCodigo.setMaximumSize(new java.awt.Dimension(50, 20));
        txtCodigo.setMinimumSize(new java.awt.Dimension(50, 20));
        txtCodigo.setPreferredSize(new java.awt.Dimension(50, 20));
        pnCenter01.add(txtCodigo);

        pnCenter.add(pnCenter01);

        pnCenter02.setMaximumSize(new java.awt.Dimension(215, 68));
        pnCenter02.setMinimumSize(new java.awt.Dimension(215, 68));
        pnCenter02.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 5));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_15px.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setMaximumSize(new java.awt.Dimension(93, 23));
        btnEditar.setMinimumSize(new java.awt.Dimension(93, 23));
        btnEditar.setPreferredSize(new java.awt.Dimension(93, 23));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnCenter02.add(btnEditar);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_15px.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setMaximumSize(new java.awt.Dimension(93, 23));
        btnNovo.setMinimumSize(new java.awt.Dimension(93, 23));
        btnNovo.setPreferredSize(new java.awt.Dimension(93, 23));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        pnCenter02.add(btnNovo);

        pnCenter.add(pnCenter02);

        pnCenter03.setMaximumSize(new java.awt.Dimension(215, 68));
        pnCenter03.setMinimumSize(new java.awt.Dimension(215, 68));
        pnCenter03.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblDescricao.setText("Descrição:");
        pnCenter03.add(lblDescricao);

        txtDescricao.setMaximumSize(new java.awt.Dimension(150, 20));
        txtDescricao.setMinimumSize(new java.awt.Dimension(150, 20));
        txtDescricao.setPreferredSize(new java.awt.Dimension(150, 20));
        pnCenter03.add(txtDescricao);

        pnCenter.add(pnCenter03);

        pnCenter04.setMaximumSize(new java.awt.Dimension(215, 68));
        pnCenter04.setMinimumSize(new java.awt.Dimension(215, 68));
        pnCenter04.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblValor.setText("Valor:");
        pnCenter04.add(lblValor);

        txtValor.setMaximumSize(new java.awt.Dimension(70, 20));
        txtValor.setMinimumSize(new java.awt.Dimension(70, 20));
        txtValor.setPreferredSize(new java.awt.Dimension(70, 20));
        pnCenter04.add(txtValor);

        pnCenter.add(pnCenter04);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pnSouth.setMaximumSize(new java.awt.Dimension(434, 40));
        pnSouth.setMinimumSize(new java.awt.Dimension(434, 40));
        pnSouth.setPreferredSize(new java.awt.Dimension(434, 40));
        pnSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 5));

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
        btnSalvar.setMaximumSize(new java.awt.Dimension(93, 23));
        btnSalvar.setMinimumSize(new java.awt.Dimension(93, 23));
        btnSalvar.setPreferredSize(new java.awt.Dimension(93, 23));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnSouth.add(btnSalvar);

        getContentPane().add(pnSouth, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        String servicoProcurado = txtPesquisa.getText();
        if (servicoProcurado.isEmpty()) {
            StoredMessage.emptyFieldErrorMessage();
        } else if (servicoDao.searchServicoCode(Integer.parseInt(servicoProcurado)) == null) {
            StoredMessage.notFoundErrorMessage();
        } else {
            servico = servicoDao.searchServicoCode(Integer.parseInt(servicoProcurado));
            txtCodigo.setText(servico.getCodigoProduto().toString());
            txtDescricao.setText(servico.getDescricaoProduto());
            txtValor.setText(servico.getValorUnitarioProduto().toString());
            disableRequiredComponent();
            btnEditar.setEnabled(true);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        ListagemIFrame listagemFrame = new ListagemIFrame(new Servico());
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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        enableRequiredComponent();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        enableRequiredComponent();
        refresh();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        servico = new Servico();
        try {
            servico.setCodigoProduto(Integer.parseInt(txtCodigo.getText()));
        } catch (NumberFormatException numberFormatException) {
            servico.setCodigoProduto(null);
        } finally {
            servico.setDescricaoProduto(txtDescricao.getText());
            servico.setValorUnitarioProduto(Double.parseDouble(txtValor.getText()));

            if (servicoDao.save(servico)) {
                StoredMessage.saveSuccessMessage();
                disableRequiredComponent();
                refresh();
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    //METODOS    
    //HABILITA COMPONENTES
    public void enableRequiredComponent() {
        txtDescricao.setEnabled(true);
        txtValor.setEnabled(true);
        btnSalvar.setEnabled(true);
    }

    //DESABILITA COMPONENTES
    public void disableRequiredComponent() {
        txtDescricao.setEnabled(false);
        txtValor.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);

    }

    //LIMPA CAMPOS
    public void refresh() {
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtValor.setText("");
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
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnCenter01;
    private javax.swing.JPanel pnCenter02;
    private javax.swing.JPanel pnCenter03;
    private javax.swing.JPanel pnCenter04;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
