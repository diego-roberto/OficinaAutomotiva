package view;

import dao.StoredMessage;
import java.awt.Dimension;
import javax.swing.JDesktopPane;

public class ConsultarOsIFrame extends javax.swing.JInternalFrame {

    public ConsultarOsIFrame(JDesktopPane desktop) {
        initComponents();  
        StoredMessage.underDevelopmentMessage();
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpEscolha = new javax.swing.ButtonGroup();
        pnEast = new javax.swing.JPanel();
        pnWest = new javax.swing.JPanel();
        pnCenter = new javax.swing.JPanel();
        pnCenterNorth = new javax.swing.JPanel();
        pnCenterNorthWest = new javax.swing.JPanel();
        rdAmbos = new javax.swing.JRadioButton();
        rdAberta = new javax.swing.JRadioButton();
        rdFechadas = new javax.swing.JRadioButton();
        pnCenterNorthEast = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnCenterSouth = new javax.swing.JPanel();
        pnCenterCenter = new javax.swing.JPanel();
        pnOrdemServico = new javax.swing.JScrollPane();
        tbOrdemServico = new javax.swing.JTable();

        setTitle("CONSULTA DE O.S.");

        javax.swing.GroupLayout pnEastLayout = new javax.swing.GroupLayout(pnEast);
        pnEast.setLayout(pnEastLayout);
        pnEastLayout.setHorizontalGroup(
            pnEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnEastLayout.setVerticalGroup(
            pnEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
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
            .addGap(0, 482, Short.MAX_VALUE)
        );

        getContentPane().add(pnWest, java.awt.BorderLayout.LINE_START);

        pnCenter.setLayout(new java.awt.BorderLayout());

        pnCenterNorth.setLayout(new java.awt.GridLayout(1, 2));

        pnCenterNorthWest.setMinimumSize(new java.awt.Dimension(71, 100));
        pnCenterNorthWest.setLayout(new java.awt.GridLayout(3, 1));

        grpEscolha.add(rdAmbos);
        rdAmbos.setText("Ambos");
        pnCenterNorthWest.add(rdAmbos);

        grpEscolha.add(rdAberta);
        rdAberta.setText("Abertas");
        pnCenterNorthWest.add(rdAberta);

        grpEscolha.add(rdFechadas);
        rdFechadas.setText("Fechadas");
        pnCenterNorthWest.add(rdFechadas);

        pnCenterNorth.add(pnCenterNorthWest);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/restart_48px.png"))); // NOI18N
        jButton1.setText("ATUALIZAR");
        pnCenterNorthEast.add(jButton1);

        pnCenterNorth.add(pnCenterNorthEast);

        pnCenter.add(pnCenterNorth, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout pnCenterSouthLayout = new javax.swing.GroupLayout(pnCenterSouth);
        pnCenterSouth.setLayout(pnCenterSouthLayout);
        pnCenterSouthLayout.setHorizontalGroup(
            pnCenterSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );
        pnCenterSouthLayout.setVerticalGroup(
            pnCenterSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnCenter.add(pnCenterSouth, java.awt.BorderLayout.PAGE_END);

        pnCenterCenter.setLayout(new java.awt.BorderLayout());

        tbOrdemServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "PLACA", "DT ABERTO", "DT FECHADO", "STATUS"
            }
        ));
        pnOrdemServico.setViewportView(tbOrdemServico);

        pnCenterCenter.add(pnOrdemServico, java.awt.BorderLayout.CENTER);

        pnCenter.add(pnCenterCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //METODOS
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grpEscolha;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnCenterCenter;
    private javax.swing.JPanel pnCenterNorth;
    private javax.swing.JPanel pnCenterNorthEast;
    private javax.swing.JPanel pnCenterNorthWest;
    private javax.swing.JPanel pnCenterSouth;
    private javax.swing.JPanel pnEast;
    private javax.swing.JScrollPane pnOrdemServico;
    private javax.swing.JPanel pnWest;
    private javax.swing.JRadioButton rdAberta;
    private javax.swing.JRadioButton rdAmbos;
    private javax.swing.JRadioButton rdFechadas;
    private javax.swing.JTable tbOrdemServico;
    // End of variables declaration//GEN-END:variables
}
