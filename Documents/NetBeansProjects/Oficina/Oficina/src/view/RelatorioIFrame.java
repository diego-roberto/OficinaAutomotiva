package view;

import java.awt.Dimension;

public class RelatorioIFrame extends javax.swing.JInternalFrame {

    public RelatorioIFrame(int windowBehavior) {
        initComponents();
        setComponent(windowBehavior);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnNorth = new javax.swing.JPanel();
        pnNorthNorth = new javax.swing.JPanel();
        pnNorthSouth = new javax.swing.JPanel();
        pnNorthSouthEast = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();
        btnDetalhado = new javax.swing.JButton();
        pnNorthSouthWest = new javax.swing.JPanel();
        lblFiltro = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        pnSouth = new javax.swing.JPanel();
        pnSouthNorth = new javax.swing.JPanel();
        pnSouthSouth = new javax.swing.JPanel();
        pnSouthEast = new javax.swing.JPanel();
        pnSouthWest = new javax.swing.JPanel();
        pnSouthCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("RELATÓRIO");

        pnNorth.setPreferredSize(new java.awt.Dimension(584, 50));
        pnNorth.setLayout(new java.awt.BorderLayout());

        pnNorthNorth.setPreferredSize(new java.awt.Dimension(584, 20));

        javax.swing.GroupLayout pnNorthNorthLayout = new javax.swing.GroupLayout(pnNorthNorth);
        pnNorthNorth.setLayout(pnNorthNorthLayout);
        pnNorthNorthLayout.setHorizontalGroup(
            pnNorthNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );
        pnNorthNorthLayout.setVerticalGroup(
            pnNorthNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnNorth.add(pnNorthNorth, java.awt.BorderLayout.PAGE_START);

        pnNorthSouth.setPreferredSize(new java.awt.Dimension(584, 30));
        pnNorthSouth.setLayout(new java.awt.BorderLayout());

        pnNorthSouthEast.setPreferredSize(new java.awt.Dimension(350, 30));
        pnNorthSouthEast.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 5));

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/restart_15px.png"))); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        pnNorthSouthEast.add(btnAtualizar);

        btnDetalhado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/show_property_15px.png"))); // NOI18N
        btnDetalhado.setText("DETALHADO");
        pnNorthSouthEast.add(btnDetalhado);

        pnNorthSouth.add(pnNorthSouthEast, java.awt.BorderLayout.LINE_END);

        pnNorthSouthWest.setPreferredSize(new java.awt.Dimension(574, 30));

        lblFiltro.setText("Filtro:");
        pnNorthSouthWest.add(lblFiltro);

        cbFiltro.setPreferredSize(new java.awt.Dimension(150, 20));
        pnNorthSouthWest.add(cbFiltro);

        pnNorthSouth.add(pnNorthSouthWest, java.awt.BorderLayout.CENTER);

        pnNorth.add(pnNorthSouth, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnNorth, java.awt.BorderLayout.PAGE_START);

        pnSouth.setPreferredSize(new java.awt.Dimension(584, 350));
        pnSouth.setLayout(new java.awt.BorderLayout());

        pnSouthNorth.setPreferredSize(new java.awt.Dimension(584, 30));

        javax.swing.GroupLayout pnSouthNorthLayout = new javax.swing.GroupLayout(pnSouthNorth);
        pnSouthNorth.setLayout(pnSouthNorthLayout);
        pnSouthNorthLayout.setHorizontalGroup(
            pnSouthNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );
        pnSouthNorthLayout.setVerticalGroup(
            pnSouthNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnSouth.add(pnSouthNorth, java.awt.BorderLayout.PAGE_START);

        pnSouthSouth.setPreferredSize(new java.awt.Dimension(584, 30));

        javax.swing.GroupLayout pnSouthSouthLayout = new javax.swing.GroupLayout(pnSouthSouth);
        pnSouthSouth.setLayout(pnSouthSouthLayout);
        pnSouthSouthLayout.setHorizontalGroup(
            pnSouthSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );
        pnSouthSouthLayout.setVerticalGroup(
            pnSouthSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnSouth.add(pnSouthSouth, java.awt.BorderLayout.PAGE_END);

        pnSouthEast.setPreferredSize(new java.awt.Dimension(30, 360));

        javax.swing.GroupLayout pnSouthEastLayout = new javax.swing.GroupLayout(pnSouthEast);
        pnSouthEast.setLayout(pnSouthEastLayout);
        pnSouthEastLayout.setHorizontalGroup(
            pnSouthEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnSouthEastLayout.setVerticalGroup(
            pnSouthEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        pnSouth.add(pnSouthEast, java.awt.BorderLayout.LINE_END);

        pnSouthWest.setPreferredSize(new java.awt.Dimension(30, 360));

        javax.swing.GroupLayout pnSouthWestLayout = new javax.swing.GroupLayout(pnSouthWest);
        pnSouthWest.setLayout(pnSouthWestLayout);
        pnSouthWestLayout.setHorizontalGroup(
            pnSouthWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnSouthWestLayout.setVerticalGroup(
            pnSouthWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        pnSouth.add(pnSouthWest, java.awt.BorderLayout.LINE_START);

        pnSouthCenter.setLayout(new java.awt.BorderLayout());
        pnSouthCenter.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnSouth.add(pnSouthCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnSouth, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //METODOS
    public void setComponent(int windowBehavior){
        if(windowBehavior == 1){
            cbFiltro.addItem("Total");
            cbFiltro.addItem("Por dia");
        }else if(windowBehavior == 2){
            cbFiltro.addItem("Todos");
            cbFiltro.addItem("Por cliente");
        }else if(windowBehavior == 3){
            cbFiltro.addItem("Todos");
            cbFiltro.addItem("Por fornecedor");
        }
    }
    
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDetalhado;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnNorthNorth;
    private javax.swing.JPanel pnNorthSouth;
    private javax.swing.JPanel pnNorthSouthEast;
    private javax.swing.JPanel pnNorthSouthWest;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JPanel pnSouthCenter;
    private javax.swing.JPanel pnSouthEast;
    private javax.swing.JPanel pnSouthNorth;
    private javax.swing.JPanel pnSouthSouth;
    private javax.swing.JPanel pnSouthWest;
    // End of variables declaration//GEN-END:variables
}
