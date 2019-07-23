package view;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class AdministracaoIFrame extends javax.swing.JInternalFrame {

    JDesktopPane desktop;
    RelatorioIFrame relatorioFrame;

    public AdministracaoIFrame(JDesktopPane desktop) {
        initComponents();
        this.desktop = desktop;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNorth = new javax.swing.JPanel();
        pnSouth = new javax.swing.JPanel();
        pnEast = new javax.swing.JPanel();
        pnWest = new javax.swing.JPanel();
        pnCenter = new javax.swing.JPanel();
        btnBalanco = new javax.swing.JButton();
        btnEntradas = new javax.swing.JButton();
        btnSaidas = new javax.swing.JButton();

        setTitle("ADMINISTRAÇÃO");

        pnNorth.setPreferredSize(new java.awt.Dimension(600, 75));

        javax.swing.GroupLayout pnNorthLayout = new javax.swing.GroupLayout(pnNorth);
        pnNorth.setLayout(pnNorthLayout);
        pnNorthLayout.setHorizontalGroup(
            pnNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        pnNorthLayout.setVerticalGroup(
            pnNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        getContentPane().add(pnNorth, java.awt.BorderLayout.PAGE_START);

        pnSouth.setPreferredSize(new java.awt.Dimension(600, 75));

        javax.swing.GroupLayout pnSouthLayout = new javax.swing.GroupLayout(pnSouth);
        pnSouth.setLayout(pnSouthLayout);
        pnSouthLayout.setHorizontalGroup(
            pnSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        pnSouthLayout.setVerticalGroup(
            pnSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        getContentPane().add(pnSouth, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout pnEastLayout = new javax.swing.GroupLayout(pnEast);
        pnEast.setLayout(pnEastLayout);
        pnEastLayout.setHorizontalGroup(
            pnEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnEastLayout.setVerticalGroup(
            pnEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
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
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(pnWest, java.awt.BorderLayout.LINE_START);

        pnCenter.setLayout(new java.awt.GridLayout(1, 0));

        btnBalanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cashflow_48px.png"))); // NOI18N
        btnBalanco.setText("BALANÇO");
        btnBalanco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBalanco.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBalanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalancoActionPerformed(evt);
            }
        });
        pnCenter.add(btnBalanco);

        btnEntradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/request_money_48px.png"))); // NOI18N
        btnEntradas.setText("ENTRADAS");
        btnEntradas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntradas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });
        pnCenter.add(btnEntradas);

        btnSaidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/initiate_money_transfer_48px.png"))); // NOI18N
        btnSaidas.setText("SAÍDAS");
        btnSaidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaidas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidasActionPerformed(evt);
            }
        });
        pnCenter.add(btnSaidas);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTOES
    private void btnBalancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalancoActionPerformed
        relatorioFrame = new RelatorioIFrame(1); //RECEBE COMO ARGUMENTO O COMPORTAMENTO DA JANELA
        boolean windowExists = false;
        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(relatorioFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(relatorioFrame);
            relatorioFrame.setVisible(true);
            relatorioFrame.setClosable(true);
            relatorioFrame.setIconifiable(true);
            relatorioFrame.setTitle("");
            relatorioFrame.setLocation();
        }

    }//GEN-LAST:event_btnBalancoActionPerformed

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        relatorioFrame = new RelatorioIFrame(2);
        boolean windowExists = false;
        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(relatorioFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(relatorioFrame);
            relatorioFrame.setVisible(true);
            relatorioFrame.setClosable(true);
            relatorioFrame.setIconifiable(true);
            relatorioFrame.setTitle("");
            relatorioFrame.setLocation();
        }
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void btnSaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidasActionPerformed
        relatorioFrame = new RelatorioIFrame(3);
        boolean windowExists = false;
        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(relatorioFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(relatorioFrame);
            relatorioFrame.setVisible(true);
            relatorioFrame.setClosable(true);
            relatorioFrame.setIconifiable(true);
            relatorioFrame.setTitle("");
            relatorioFrame.setLocation();
        }
    }//GEN-LAST:event_btnSaidasActionPerformed

    //METODOS
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalanco;
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnSaidas;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnEast;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JPanel pnWest;
    // End of variables declaration//GEN-END:variables
}
