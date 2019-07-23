package view;

import dao.CompraDAO;
import dao.FornecedorDAO;
import dao.PecaDAO;
import dao.StoredMessage;
import entity.Compra;
import entity.Fornecedor;
import entity.Peca;
import entity.Usuario;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;

public class CompraIFrame extends javax.swing.JInternalFrame {

    JDesktopPane desktop;
    PecaDAO pecaDao;
    FornecedorDAO fornecedorDao;
    Compra compra;
    CompraDAO compraDao;
    Usuario usuario;

    public CompraIFrame(JDesktopPane desktop, Usuario usuario) {
        initComponents();
        this.desktop = desktop;
        pecaDao = new PecaDAO();
        fornecedorDao = new FornecedorDAO();
        compra = new Compra();
        compraDao = new CompraDAO();
        
        this.usuario = usuario;
        listarPeca(pecaDao.buildListPeca());
        listarFornecedor(fornecedorDao.searchAllFornecedor());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNorth = new javax.swing.JPanel();
        btnListagem = new javax.swing.JButton();
        pnCenter = new javax.swing.JPanel();
        pnCenterNorth = new javax.swing.JPanel();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        pnCenterCenter = new javax.swing.JPanel();
        lblPeca = new javax.swing.JLabel();
        cbPeca = new javax.swing.JComboBox<>();
        pnCenterSouth = new javax.swing.JPanel();
        lblFornecedor = new javax.swing.JLabel();
        cbFornecedor = new javax.swing.JComboBox<>();
        pnSouth = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setTitle("ENTRADA");
        setMaximumSize(new java.awt.Dimension(450, 250));
        setMinimumSize(new java.awt.Dimension(450, 250));
        setPreferredSize(new java.awt.Dimension(450, 250));

        pnNorth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnNorth.setMaximumSize(new java.awt.Dimension(434, 35));
        pnNorth.setMinimumSize(new java.awt.Dimension(434, 35));
        pnNorth.setPreferredSize(new java.awt.Dimension(434, 35));
        pnNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

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
        pnCenter.setMaximumSize(new java.awt.Dimension(434, 150));
        pnCenter.setMinimumSize(new java.awt.Dimension(434, 150));
        pnCenter.setLayout(new java.awt.GridLayout(3, 1));

        pnCenterNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblQuantidade.setText("Quantidade:");
        pnCenterNorth.add(lblQuantidade);

        txtQuantidade.setMaximumSize(new java.awt.Dimension(80, 20));
        txtQuantidade.setMinimumSize(new java.awt.Dimension(80, 20));
        txtQuantidade.setPreferredSize(new java.awt.Dimension(80, 20));
        pnCenterNorth.add(txtQuantidade);

        pnCenter.add(pnCenterNorth);

        pnCenterCenter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblPeca.setText("           Peça:");
        pnCenterCenter.add(lblPeca);

        cbPeca.setMaximumRowCount(999999);
        cbPeca.setMaximumSize(new java.awt.Dimension(250, 20));
        cbPeca.setMinimumSize(new java.awt.Dimension(250, 20));
        cbPeca.setPreferredSize(new java.awt.Dimension(250, 20));
        pnCenterCenter.add(cbPeca);

        pnCenter.add(pnCenterCenter);

        pnCenterSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblFornecedor.setText("Fornecedor:");
        pnCenterSouth.add(lblFornecedor);

        cbFornecedor.setMaximumRowCount(999);
        cbFornecedor.setMaximumSize(new java.awt.Dimension(250, 20));
        cbFornecedor.setMinimumSize(new java.awt.Dimension(250, 20));
        cbFornecedor.setPreferredSize(new java.awt.Dimension(250, 20));
        pnCenterSouth.add(cbFornecedor);

        pnCenter.add(pnCenterSouth);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pnSouth.setMaximumSize(new java.awt.Dimension(434, 35));
        pnSouth.setMinimumSize(new java.awt.Dimension(434, 35));
        pnSouth.setPreferredSize(new java.awt.Dimension(434, 35));
        pnSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 5));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel_15px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnSouth.add(btnCancelar);

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ok_15px.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        pnSouth.add(btnConfirmar);

        getContentPane().add(pnSouth, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTOES
    //LISTAGEM
    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed

    }//GEN-LAST:event_btnListagemActionPerformed
    //CONFIRMAR
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            compra.setQuantidadeCompra(Integer.parseInt(txtQuantidade.getText()));
        } catch (NumberFormatException numberFormatException) {
            compra.setQuantidadeCompra(0);
        } finally {
            compra.setPecaCompra(cbPeca.getSelectedItem().toString());
            compra.setFuncionarioCompra(usuario.getNomeUsuario());
            compra.setFornecedorCompra(cbFornecedor.getSelectedItem().toString());

            if (compra.getQuantidadeCompra() < 1) {
                StoredMessage.validNumberErrorMessage();
            } else if (compraDao.save(compra)) {
                StoredMessage.saveSuccessMessage();
                refresh();
            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed
    //CANCELAR
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    //LISTAGEM PECA
    private void listarPeca(List<Peca> listaPeca) {
        List<String> essaListaPeca = new ArrayList<String>();
        for (Peca peca : listaPeca) {
            essaListaPeca.add(peca.toString());
        }
        cbPeca.setModel(new DefaultComboBoxModel(essaListaPeca.toArray()));
    }

    //LISTAGEM FORNECEDOR
    private void listarFornecedor(List<Fornecedor> listaFornecedor) {
        List<String> essaListaFornecedor = new ArrayList<String>();
        for (Fornecedor esseFornecedor : listaFornecedor) {
            essaListaFornecedor.add(esseFornecedor.toString());
        }
        cbFornecedor.setModel(new DefaultComboBoxModel(essaListaFornecedor.toArray()));
    }

    //REFRESH
    public void refresh() {
        txtQuantidade.setText("");
        cbPeca.setSelectedIndex(0);
        cbFornecedor.setSelectedIndex(0);
    }

    //LOCALIZA A JANELA NO CENTRO
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JComboBox<String> cbFornecedor;
    private javax.swing.JComboBox<String> cbPeca;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblPeca;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnCenterCenter;
    private javax.swing.JPanel pnCenterNorth;
    private javax.swing.JPanel pnCenterSouth;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
