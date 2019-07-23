package view;

import dao.OrdemServicoDAO;
import dao.StoredMessage;
import entity.ModeloTabela;
import entity.OrdemServico;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;

public class OficinaIFrame extends javax.swing.JInternalFrame {

    JDesktopPane desktop;
    OrdemServico ordemServico;
    OrdemServicoDAO ordemServicoDao;
    List<OrdemServico> listaOrdem;

    public OficinaIFrame(JDesktopPane desktop) {
        initComponents();
        btnExecutar.setEnabled(false);
        this.desktop = desktop;
        ordemServico = new OrdemServico();
        ordemServicoDao = new OrdemServicoDAO();
        listaOrdem = new ArrayList<>();
        tbTabela.setModel(getModeloTabela());
        //listar OSs
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNorth = new javax.swing.JPanel();
        btnVer = new javax.swing.JButton();
        pnCenter = new javax.swing.JPanel();
        pnCenterWest = new javax.swing.JPanel();
        pnTabela = new javax.swing.JScrollPane();
        tbTabela = new javax.swing.JTable();
        pnCenterEast = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        pnSouth = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnExecutar = new javax.swing.JButton();

        setTitle("OFICINA");
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 500));

        pnNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 5));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/visible_15px.png"))); // NOI18N
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        pnNorth.add(btnVer);

        getContentPane().add(pnNorth, java.awt.BorderLayout.PAGE_START);

        pnCenter.setLayout(new java.awt.GridLayout());

        pnCenterWest.setLayout(new java.awt.BorderLayout());

        tbTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        pnTabela.setViewportView(tbTabela);

        pnCenterWest.add(pnTabela, java.awt.BorderLayout.CENTER);

        pnCenter.add(pnCenterWest);

        pnCenterEast.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));
        pnCenterEast.setLayout(new java.awt.BorderLayout());

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        pnCenterEast.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnCenter.add(pnCenterEast);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pnSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 5));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel_15px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnSouth.add(btnCancelar);

        btnExecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ok_15px.png"))); // NOI18N
        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });
        pnSouth.add(btnExecutar);

        getContentPane().add(pnSouth, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //VER
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        if (tbTabela.getSelectedRow() == -1) {
            StoredMessage.emptySelectionErrorMessage();
        } else {
            int linhaSelecionada = tbTabela.getSelectedRow();
            ordemServico = listaOrdem.get(linhaSelecionada);
            txtDescricao.setText(ordemServico.getResolucao());
            btnExecutar.setEnabled(true);
        }
    }//GEN-LAST:event_btnVerActionPerformed
    //EXECUTAR
    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        ordemServico.setResolucao(txtDescricao.getText());
        if (ordemServicoDao.updateResolucaoStatus(ordemServico)) {
            StoredMessage.saveSuccessMessage();
            refresh();
        }
    }//GEN-LAST:event_btnExecutarActionPerformed
    //CANCELAR
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    //REFRESH
    public void refresh() {
        tbTabela.setModel(getModeloTabela());
        txtDescricao.setText("");
   }

    //LISTAR OSs
    public ModeloTabela getModeloTabela() {
        ModeloTabela modeloTabela = null;
        //List<OrdemServico> listaOrdem = new ArrayList<>();
        ordemServicoDao = new OrdemServicoDAO();
        listaOrdem = ordemServicoDao.searchOrdemAll();

        String[] colunaOrdem = {"CODIGO ORDEM", "PLACA", "STATUS"};
        Object[][] dataOrdem = new Object[listaOrdem.size()][3];
        int k = 0;
        for (OrdemServico essaOrdem : listaOrdem) {
            dataOrdem[k][0] = "" + essaOrdem.getCodigoOrdem();
            dataOrdem[k][1] = "" + essaOrdem.getPlacaVeiculoOrdem();
            if (essaOrdem.getStatus() == 0) {
                dataOrdem[k][2] = "ABERTO";
            } else {
                dataOrdem[k][2] = "FECHADO";
            }
            k++;
        }
        modeloTabela = new ModeloTabela(colunaOrdem, dataOrdem);
        return modeloTabela;
    }

    //LOCALIZA A JANELA NO CENTRO
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExecutar;
    private javax.swing.JButton btnVer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnCenterEast;
    private javax.swing.JPanel pnCenterWest;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JScrollPane pnTabela;
    private javax.swing.JTable tbTabela;
    private javax.swing.JTextArea txtDescricao;
    // End of variables declaration//GEN-END:variables
}
