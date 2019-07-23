package view;

import dao.ClienteDAO;
import dao.StoredMessage;
import entity.Cliente;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class AbrirOsIFrame extends javax.swing.JInternalFrame {

    Cliente cliente;
    ClienteDAO clienteDao;

    public AbrirOsIFrame(JDesktopPane desktop) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnEast = new javax.swing.JPanel();
        pnWest = new javax.swing.JPanel();
        pnCenter = new javax.swing.JPanel();
        pnCenterNorth = new javax.swing.JPanel();
        lblIndiceCliente = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblIndicePlaca = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        btnImportarCliente = new javax.swing.JButton();
        pnCenterSouth = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        pnCenterCenter = new javax.swing.JPanel();
        pnDescricao = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setTitle("ABERTURA DE O.S.");
        setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout pnEastLayout = new javax.swing.GroupLayout(pnEast);
        pnEast.setLayout(pnEastLayout);
        pnEastLayout.setHorizontalGroup(
            pnEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnEastLayout.setVerticalGroup(
            pnEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(pnEast, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout pnWestLayout = new javax.swing.GroupLayout(pnWest);
        pnWest.setLayout(pnWestLayout);
        pnWestLayout.setHorizontalGroup(
            pnWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnWestLayout.setVerticalGroup(
            pnWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(pnWest, java.awt.BorderLayout.LINE_START);

        pnCenter.setLayout(new java.awt.BorderLayout());

        pnCenterNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblIndiceCliente.setText("Cliente:");
        pnCenterNorth.add(lblIndiceCliente);

        lblCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblCliente.setMaximumSize(new java.awt.Dimension(200, 20));
        lblCliente.setMinimumSize(new java.awt.Dimension(200, 20));
        lblCliente.setPreferredSize(new java.awt.Dimension(200, 20));
        pnCenterNorth.add(lblCliente);

        lblIndicePlaca.setText("Placa:");
        pnCenterNorth.add(lblIndicePlaca);

        lblPlaca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblPlaca.setMaximumSize(new java.awt.Dimension(100, 20));
        lblPlaca.setMinimumSize(new java.awt.Dimension(100, 20));
        lblPlaca.setPreferredSize(new java.awt.Dimension(100, 20));
        pnCenterNorth.add(lblPlaca);

        btnImportarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/circled_down_15px.png"))); // NOI18N
        btnImportarCliente.setText("Importar Cliente");
        btnImportarCliente.setMaximumSize(new java.awt.Dimension(130, 20));
        btnImportarCliente.setMinimumSize(new java.awt.Dimension(130, 20));
        btnImportarCliente.setPreferredSize(new java.awt.Dimension(130, 20));
        btnImportarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarClienteActionPerformed(evt);
            }
        });
        pnCenterNorth.add(btnImportarCliente);

        pnCenter.add(pnCenterNorth, java.awt.BorderLayout.PAGE_START);

        pnCenterSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 5));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel_15px.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnCenterSouth.add(btnCancelar);

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ok_15px.png"))); // NOI18N
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        pnCenterSouth.add(btnConfirmar);

        pnCenter.add(pnCenterSouth, java.awt.BorderLayout.PAGE_END);

        pnCenterCenter.setLayout(new java.awt.BorderLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        pnDescricao.setViewportView(jTextArea1);

        pnCenterCenter.add(pnDescricao, java.awt.BorderLayout.CENTER);

        pnCenter.add(pnCenterCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTOES
    //CANCELAR
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    //IMPORTAR CLIENTE
    private void btnImportarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarClienteActionPerformed
//        cliente = new Cliente();
//        clienteDao = new ClienteDAO();
//        try {
//            String importarNomeCliente = JOptionPane.showInputDialog(null, "Nome completo do cliente:", "IMPORTAR CLIENTE", JOptionPane.OK_CANCEL_OPTION);
//            cliente.setNomeRazaoCliente(importarNomeCliente);
//            if(clienteDao.searchClienteName(cliente.getNomeRazaoCliente())== null){
//                StoredMessage.notFoundErrorMessage();
//            }else{
//                
//            }
//        }
    }//GEN-LAST:event_btnImportarClienteActionPerformed
    //CONFIRMAR
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

    }//GEN-LAST:event_btnConfirmarActionPerformed

    //METODOS
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnImportarCliente;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblIndiceCliente;
    private javax.swing.JLabel lblIndicePlaca;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnCenterCenter;
    private javax.swing.JPanel pnCenterNorth;
    private javax.swing.JPanel pnCenterSouth;
    private javax.swing.JScrollPane pnDescricao;
    private javax.swing.JPanel pnEast;
    private javax.swing.JPanel pnWest;
    // End of variables declaration//GEN-END:variables
}
