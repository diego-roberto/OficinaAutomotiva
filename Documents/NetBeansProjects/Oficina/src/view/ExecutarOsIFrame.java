package view;

import dao.OrdemServicoDAO;
import dao.StoredMessage;
import entity.OrdemServico;
import java.awt.Dimension;
import javax.swing.JDesktopPane;

public class ExecutarOsIFrame extends javax.swing.JInternalFrame {

    JDesktopPane desktop;
    OrdemServico ordemServico;
    OrdemServicoDAO ordemServicoDao;
    
    public ExecutarOsIFrame(JDesktopPane desktop) {
        initComponents();
        this.desktop = desktop;
        ordemServico = new OrdemServico();
        ordemServicoDao = new OrdemServicoDAO();
        
        //listar OSs
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTxtOS = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        txtResolucaoOS = new javax.swing.JTextArea();
        pnTabelaOS = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        pnNorth = new javax.swing.JPanel();
        pnBotoes = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();

        txtResolucaoOS.setColumns(20);
        txtResolucaoOS.setRows(5);
        jScrollPane.setViewportView(txtResolucaoOS);

        pnTxtOS.add(jScrollPane);

        getContentPane().add(pnTxtOS, java.awt.BorderLayout.CENTER);

        pnTabelaOS.setLayout(new java.awt.BorderLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollPane.setViewportView(table);

        pnTabelaOS.add(scrollPane, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnNorthLayout = new javax.swing.GroupLayout(pnNorth);
        pnNorth.setLayout(pnNorthLayout);
        pnNorthLayout.setHorizontalGroup(
            pnNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        pnNorthLayout.setVerticalGroup(
            pnNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnTabelaOS.add(pnNorth, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pnTabelaOS, java.awt.BorderLayout.PAGE_START);

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/checkmark_48px.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        pnBotoes.add(btnFinalizar);

        getContentPane().add(pnBotoes, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        ordemServico.setCodigo(table.getSelectedRow()); //ver como vai selecionar a OS a partir da tabela
        ordemServico.setResolucao(txtResolucaoOS.getText());

        if (ordemServicoDao.updateResolucao(ordemServico)) {
            StoredMessage.saveSuccessMessage();
            refresh();
        }

    }//GEN-LAST:event_btnFinalizarActionPerformed

    //REFRESH
    public void refresh() {
        //relistar
    }  
    
    //LOCALIZA A JANELA NO CENTRO
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnTabelaOS;
    private javax.swing.JPanel pnTxtOS;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txtResolucaoOS;
    // End of variables declaration//GEN-END:variables
}
