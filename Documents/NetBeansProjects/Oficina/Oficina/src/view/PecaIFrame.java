package view;

import dao.CategoriaDAO;
import dao.PecaDAO;
import dao.StoredMessage;
import entity.Categoria;
import entity.Funcionario;
import entity.Peca;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class PecaIFrame extends javax.swing.JInternalFrame {

    Peca peca;
    PecaDAO pecaDao;
    Categoria categoria;
    CategoriaDAO categoriaDao;
    JDesktopPane desktop;

    public PecaIFrame(JDesktopPane desktop) {
        initComponents();
        this.desktop = desktop;
        peca = new Peca();
        pecaDao = new PecaDAO();
        categoria = new Categoria();
        categoriaDao = new CategoriaDAO();
        disableRequiredComponent();
        listarCategoria(categoriaDao.searchAll());
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
        lblCategoria = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        lblEspaco = new javax.swing.JLabel();
        btnNovaCategoria = new javax.swing.JButton();
        pnCenter03 = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        pnCenter04 = new javax.swing.JPanel();
        pnCenter05 = new javax.swing.JPanel();
        lblValorUnitario = new javax.swing.JLabel();
        txtValorUnitario = new javax.swing.JTextField();
        pnCenter06 = new javax.swing.JPanel();
        pnCenter07 = new javax.swing.JPanel();
        lblEstoque = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        pnCenter08 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        pnSouth = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setTitle("PEÇA - ESTOQUE");
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        pnNorth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnNorth.setMaximumSize(new java.awt.Dimension(584, 40));
        pnNorth.setMinimumSize(new java.awt.Dimension(584, 40));
        pnNorth.setPreferredSize(new java.awt.Dimension(584, 40));
        pnNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblPesquisa.setText("Pesquisa:");
        pnNorth.add(lblPesquisa);

        txtPesquisa.setMaximumSize(new java.awt.Dimension(250, 20));
        txtPesquisa.setMinimumSize(new java.awt.Dimension(250, 20));
        txtPesquisa.setPreferredSize(new java.awt.Dimension(250, 20));
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
        pnCenter.setMaximumSize(new java.awt.Dimension(584, 290));
        pnCenter.setMinimumSize(new java.awt.Dimension(584, 290));
        pnCenter.setLayout(new java.awt.GridLayout(4, 2));

        pnCenter01.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblCodigo.setText("          Código:");
        pnCenter01.add(lblCodigo);

        txtCodigo.setEnabled(false);
        txtCodigo.setMaximumSize(new java.awt.Dimension(80, 20));
        txtCodigo.setMinimumSize(new java.awt.Dimension(80, 20));
        txtCodigo.setPreferredSize(new java.awt.Dimension(80, 20));
        pnCenter01.add(txtCodigo);

        pnCenter.add(pnCenter01);

        pnCenter02.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnCenter02.setMaximumSize(new java.awt.Dimension(290, 71));
        pnCenter02.setMinimumSize(new java.awt.Dimension(290, 71));
        pnCenter02.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblCategoria.setText("Categoria:");
        pnCenter02.add(lblCategoria);

        cbCategoria.setMaximumSize(new java.awt.Dimension(170, 20));
        cbCategoria.setMinimumSize(new java.awt.Dimension(170, 20));
        cbCategoria.setName(""); // NOI18N
        cbCategoria.setPreferredSize(new java.awt.Dimension(170, 20));
        pnCenter02.add(cbCategoria);

        lblEspaco.setText("                                                ");
        pnCenter02.add(lblEspaco);

        btnNovaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_15px.png"))); // NOI18N
        btnNovaCategoria.setText("Novo");
        btnNovaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaCategoriaActionPerformed(evt);
            }
        });
        pnCenter02.add(btnNovaCategoria);

        pnCenter.add(pnCenter02);

        pnCenter03.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblDescricao.setText("      Descrição:");
        pnCenter03.add(lblDescricao);

        txtDescricao.setMaximumSize(new java.awt.Dimension(200, 20));
        txtDescricao.setMinimumSize(new java.awt.Dimension(200, 20));
        txtDescricao.setPreferredSize(new java.awt.Dimension(200, 20));
        pnCenter03.add(txtDescricao);

        pnCenter.add(pnCenter03);

        javax.swing.GroupLayout pnCenter04Layout = new javax.swing.GroupLayout(pnCenter04);
        pnCenter04.setLayout(pnCenter04Layout);
        pnCenter04Layout.setHorizontalGroup(
            pnCenter04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        pnCenter04Layout.setVerticalGroup(
            pnCenter04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        pnCenter.add(pnCenter04);

        pnCenter05.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblValorUnitario.setText("Valor Unitário:");
        pnCenter05.add(lblValorUnitario);

        txtValorUnitario.setMaximumSize(new java.awt.Dimension(80, 20));
        txtValorUnitario.setMinimumSize(new java.awt.Dimension(80, 20));
        txtValorUnitario.setPreferredSize(new java.awt.Dimension(80, 20));
        pnCenter05.add(txtValorUnitario);

        pnCenter.add(pnCenter05);

        javax.swing.GroupLayout pnCenter06Layout = new javax.swing.GroupLayout(pnCenter06);
        pnCenter06.setLayout(pnCenter06Layout);
        pnCenter06Layout.setHorizontalGroup(
            pnCenter06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        pnCenter06Layout.setVerticalGroup(
            pnCenter06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        pnCenter.add(pnCenter06);

        pnCenter07.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblEstoque.setText("        Estoque:");
        pnCenter07.add(lblEstoque);

        txtEstoque.setEnabled(false);
        txtEstoque.setMaximumSize(new java.awt.Dimension(80, 20));
        txtEstoque.setMinimumSize(new java.awt.Dimension(80, 20));
        txtEstoque.setPreferredSize(new java.awt.Dimension(80, 20));
        pnCenter07.add(txtEstoque);

        pnCenter.add(pnCenter07);

        pnCenter08.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 5));

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
        pnCenter08.add(btnEditar);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_15px.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        pnCenter08.add(btnNovo);

        pnCenter.add(pnCenter08);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pnSouth.setMaximumSize(new java.awt.Dimension(584, 40));
        pnSouth.setMinimumSize(new java.awt.Dimension(584, 40));
        pnSouth.setPreferredSize(new java.awt.Dimension(584, 40));
        pnSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 5));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        String codigoPesquisado = txtPesquisa.getText();
        try {

            if (codigoPesquisado.isEmpty()) {
                StoredMessage.emptyFieldErrorMessage();
            } else if (pecaDao.searchPecaCode(Integer.parseInt(codigoPesquisado)) == null) {
                StoredMessage.notFoundErrorMessage();
            } else {
                peca = pecaDao.searchPecaCode(Integer.parseInt(codigoPesquisado));
                txtCodigo.setText(peca.getCodigoProduto().toString());
                txtDescricao.setText(peca.getDescricaoProduto());
                txtValorUnitario.setText(peca.getValorUnitarioProduto().toString());
                txtEstoque.setText(peca.getQuantidadeProduto().toString());
                cbCategoria.setSelectedItem(peca.getCategoriaPeca());
                disableRequiredComponent();
                btnEditar.setEnabled(true);
            }
        } catch (NumberFormatException numberFormatException) {
            StoredMessage.validNumberErrorMessage();
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        ListagemIFrame listagemFrame = new ListagemIFrame(new Peca());
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

    private void btnNovaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaCategoriaActionPerformed
        String descricaoNovaCategoria = JOptionPane.showInputDialog(null, "Informe o nome da categoria:", "Inserir categoria", JOptionPane.OK_CANCEL_OPTION);
        categoria.setDescricaoCategoria(descricaoNovaCategoria);
        if (categoriaDao.insert(categoria)) {
            JOptionPane.showMessageDialog(null, "Categoria salva com Sucesso!");
            listarCategoria(categoriaDao.searchAll());
            categoria = new Categoria();
        }
    }//GEN-LAST:event_btnNovaCategoriaActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        enableRequiredComponent();
        refresh();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        enableRequiredComponent();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            peca.setCodigoProduto(Integer.parseInt(txtCodigo.getText()));
        } catch (NumberFormatException numberFormatException) {
            peca.setCodigoProduto(null);
        } finally {
            peca.setDescricaoProduto(txtDescricao.getText());
            peca.setValorUnitarioProduto(Double.parseDouble(txtValorUnitario.getText()));
            peca.setCategoriaPeca(cbCategoria.getSelectedItem().toString());

            if (pecaDao.save(peca)) {
                StoredMessage.saveSuccessMessage();
                disableRequiredComponent();
                refresh();
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    //METODOS
    //LISTAGEM PECA
    private void listarPeca(List<Peca> listaPeca) {
        DefaultListModel modeloListaPeca = new DefaultListModel();
        for (Peca peca : listaPeca) {
            modeloListaPeca.addElement(peca);
        }
        //lstPeca.setModel(modeloListaPeca);
    }

    //LISTAGEM CATEGORIA 
    private void listarCategoria(List<Categoria> listaCategoria) {
        List<String> essaListaCategoria = new ArrayList<String>();
        for (Categoria categoria : listaCategoria) {
            essaListaCategoria.add(categoria.toString());
        }
        cbCategoria.setModel(new DefaultComboBoxModel(essaListaCategoria.toArray()));
    }

    //HABILITA COMPONENTES
    public void enableRequiredComponent() {
        txtDescricao.setEnabled(true);
        txtValorUnitario.setEnabled(true);
        //btnEditar.setEnabled(true);
        btnSalvar.setEnabled(true);
        cbCategoria.setEnabled(true);
    }

    //DESABILITA COMPONENTES
    public void disableRequiredComponent() {
        txtDescricao.setEnabled(false);
        txtValorUnitario.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);
        cbCategoria.setEnabled(false);
    }

    //REFRESH
    private void refresh() {
        //listarCategoria(categoriaDao.searchAll());
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtEstoque.setText("");
        txtValorUnitario.setText("");
        cbCategoria.setSelectedIndex(-1);
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
    private javax.swing.JButton btnNovaCategoria;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEspaco;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnCenter01;
    private javax.swing.JPanel pnCenter02;
    private javax.swing.JPanel pnCenter03;
    private javax.swing.JPanel pnCenter04;
    private javax.swing.JPanel pnCenter05;
    private javax.swing.JPanel pnCenter06;
    private javax.swing.JPanel pnCenter07;
    private javax.swing.JPanel pnCenter08;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
