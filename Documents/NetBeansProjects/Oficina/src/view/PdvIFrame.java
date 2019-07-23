
package view;

import java.awt.Dimension;
import javax.swing.JDesktopPane;

public class PdvIFrame extends javax.swing.JInternalFrame {

    public PdvIFrame(JDesktopPane desktop) {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNorth = new javax.swing.JPanel();
        pnNorthWest = new javax.swing.JPanel();
        pnNorthWestWest = new javax.swing.JPanel();
        pnNorthWestWestNorth = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        pnNorthWestWestSouth = new javax.swing.JPanel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        pnNorthWestEast = new javax.swing.JPanel();
        btnImportarOs = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        pnNorthEast = new javax.swing.JPanel();
        pnNorthEastNorth = new javax.swing.JPanel();
        lblAtendimento = new javax.swing.JLabel();
        lblAtendente = new javax.swing.JLabel();
        pnNorthEastCenter = new javax.swing.JPanel();
        lblData01 = new javax.swing.JLabel();
        lblDataAbertura = new javax.swing.JLabel();
        pnNorthEastSouth = new javax.swing.JPanel();
        lblData02 = new javax.swing.JLabel();
        lblDataFechamento = new javax.swing.JLabel();
        pnSouth = new javax.swing.JPanel();
        pnSouthSouth = new javax.swing.JPanel();
        lblObservacao = new javax.swing.JLabel();
        pnSouthNorth = new javax.swing.JPanel();
        lblNomeResponsavel = new javax.swing.JLabel();
        lblResponsavel = new javax.swing.JLabel();
        pnCenter = new javax.swing.JPanel();
        pnCenterSouth = new javax.swing.JPanel();
        pnCenterSouthEast = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnCenterSouthWest = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        pnCenterNorth = new javax.swing.JPanel();
        pnCenterNorthEast = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        pnCenterNorthWest = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("PONTO DE VENDA");
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        pnNorth.setMaximumSize(new java.awt.Dimension(900, 100));
        pnNorth.setMinimumSize(new java.awt.Dimension(884, 100));
        pnNorth.setLayout(new java.awt.GridLayout(1, 2));

        pnNorthWest.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnNorthWest.setMaximumSize(new java.awt.Dimension(442, 32767));
        pnNorthWest.setLayout(new java.awt.GridLayout(1, 0));

        pnNorthWestWest.setLayout(new java.awt.GridLayout(2, 1));

        pnNorthWestWestNorth.setPreferredSize(new java.awt.Dimension(219, 50));
        pnNorthWestWestNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblCliente.setText("Cliente:");
        pnNorthWestWestNorth.add(lblCliente);

        txtCliente.setPreferredSize(new java.awt.Dimension(150, 20));
        pnNorthWestWestNorth.add(txtCliente);

        pnNorthWestWest.add(pnNorthWestWestNorth);

        pnNorthWestWestSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblPlaca.setLabelFor(txtPlaca);
        lblPlaca.setText("  Placa:");
        pnNorthWestWestSouth.add(lblPlaca);

        txtPlaca.setPreferredSize(new java.awt.Dimension(80, 20));
        pnNorthWestWestSouth.add(txtPlaca);

        pnNorthWestWest.add(pnNorthWestWestSouth);

        pnNorthWest.add(pnNorthWestWest);

        pnNorthWestEast.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnNorthWestEast.setMaximumSize(new java.awt.Dimension(200, 200));

        btnImportarOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/circled_down_15px.png"))); // NOI18N
        btnImportarOs.setText("Importar O.S.");
        btnImportarOs.setPreferredSize(new java.awt.Dimension(150, 20));
        pnNorthWestEast.add(btnImportarOs);

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minus_15px.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setPreferredSize(new java.awt.Dimension(150, 20));
        pnNorthWestEast.add(btnLimpar);

        pnNorthWest.add(pnNorthWestEast);

        pnNorth.add(pnNorthWest);

        pnNorthEast.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnNorthEast.setPreferredSize(new java.awt.Dimension(442, 100));
        pnNorthEast.setLayout(new java.awt.GridLayout(3, 1));

        pnNorthEastNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblAtendimento.setText("           Atendente:");
        pnNorthEastNorth.add(lblAtendimento);

        lblAtendente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblAtendente.setMaximumSize(new java.awt.Dimension(300, 20));
        lblAtendente.setMinimumSize(new java.awt.Dimension(200, 20));
        lblAtendente.setName(""); // NOI18N
        lblAtendente.setPreferredSize(new java.awt.Dimension(250, 20));
        pnNorthEastNorth.add(lblAtendente);

        pnNorthEast.add(pnNorthEastNorth);

        pnNorthEastCenter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblData01.setText("     Data Abertura:");
        pnNorthEastCenter.add(lblData01);

        lblDataAbertura.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblDataAbertura.setMaximumSize(new java.awt.Dimension(150, 20));
        lblDataAbertura.setMinimumSize(new java.awt.Dimension(150, 20));
        lblDataAbertura.setPreferredSize(new java.awt.Dimension(150, 20));
        pnNorthEastCenter.add(lblDataAbertura);

        pnNorthEast.add(pnNorthEastCenter);

        pnNorthEastSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblData02.setText("Data Fechamento:");
        pnNorthEastSouth.add(lblData02);

        lblDataFechamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblDataFechamento.setMaximumSize(new java.awt.Dimension(150, 20));
        lblDataFechamento.setMinimumSize(new java.awt.Dimension(150, 20));
        lblDataFechamento.setPreferredSize(new java.awt.Dimension(150, 20));
        pnNorthEastSouth.add(lblDataFechamento);

        pnNorthEast.add(pnNorthEastSouth);

        pnNorth.add(pnNorthEast);

        getContentPane().add(pnNorth, java.awt.BorderLayout.PAGE_START);

        pnSouth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSouth.setMaximumSize(new java.awt.Dimension(884, 150));
        pnSouth.setMinimumSize(new java.awt.Dimension(884, 150));
        pnSouth.setPreferredSize(new java.awt.Dimension(884, 150));
        pnSouth.setLayout(new java.awt.BorderLayout());

        pnSouthSouth.setPreferredSize(new java.awt.Dimension(880, 110));
        pnSouthSouth.setLayout(new java.awt.BorderLayout());

        lblObservacao.setBackground(new java.awt.Color(225, 225, 225));
        lblObservacao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblObservacao.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObservacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblObservacao.setOpaque(true);
        pnSouthSouth.add(lblObservacao, java.awt.BorderLayout.CENTER);

        pnSouth.add(pnSouthSouth, java.awt.BorderLayout.PAGE_END);

        pnSouthNorth.setPreferredSize(new java.awt.Dimension(880, 40));
        pnSouthNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblNomeResponsavel.setText("Responsável:");
        pnSouthNorth.add(lblNomeResponsavel);

        lblResponsavel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblResponsavel.setMaximumSize(new java.awt.Dimension(200, 20));
        lblResponsavel.setMinimumSize(new java.awt.Dimension(200, 20));
        lblResponsavel.setPreferredSize(new java.awt.Dimension(200, 20));
        pnSouthNorth.add(lblResponsavel);

        pnSouth.add(pnSouthNorth, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnSouth, java.awt.BorderLayout.PAGE_END);

        pnCenter.setMaximumSize(new java.awt.Dimension(884, 300));
        pnCenter.setMinimumSize(new java.awt.Dimension(884, 300));
        pnCenter.setPreferredSize(new java.awt.Dimension(884, 300));
        pnCenter.setLayout(new java.awt.BorderLayout());

        pnCenterSouth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnCenterSouth.setLayout(new java.awt.BorderLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/checkout_40px.png"))); // NOI18N
        jButton1.setText("PAGAMENTO");
        pnCenterSouthEast.add(jButton1);

        pnCenterSouth.add(pnCenterSouthEast, java.awt.BorderLayout.LINE_END);

        pnCenterSouthWest.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TOTAL:");
        pnCenterSouthWest.add(jLabel1);

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTotal.setMaximumSize(new java.awt.Dimension(200, 29));
        lblTotal.setMinimumSize(new java.awt.Dimension(200, 29));
        lblTotal.setPreferredSize(new java.awt.Dimension(200, 29));
        pnCenterSouthWest.add(lblTotal);

        pnCenterSouth.add(pnCenterSouthWest, java.awt.BorderLayout.CENTER);

        pnCenter.add(pnCenterSouth, java.awt.BorderLayout.PAGE_END);

        pnCenterNorth.setMaximumSize(new java.awt.Dimension(884, 270));
        pnCenterNorth.setLayout(new java.awt.BorderLayout());

        pnCenterNorthEast.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnCenterNorthEast.setMaximumSize(new java.awt.Dimension(100, 270));
        pnCenterNorthEast.setMinimumSize(new java.awt.Dimension(100, 270));
        pnCenterNorthEast.setLayout(new javax.swing.BoxLayout(pnCenterNorthEast, javax.swing.BoxLayout.PAGE_AXIS));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_30px.png"))); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(70, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(70, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(70, 50));
        pnCenterNorthEast.add(jButton4);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minus_30px.png"))); // NOI18N
        jButton6.setMaximumSize(new java.awt.Dimension(70, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(70, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(70, 50));
        pnCenterNorthEast.add(jButton6);

        pnCenterNorth.add(pnCenterNorthEast, java.awt.BorderLayout.LINE_END);

        pnCenterNorthWest.setMaximumSize(new java.awt.Dimension(784, 270));
        pnCenterNorthWest.setMinimumSize(new java.awt.Dimension(784, 270));
        pnCenterNorthWest.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(784, 270));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(784, 270));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(784, 270));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "DESCRIÇÃO", "UNITÁRIO", "QUANTIDADE", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setMaximumSize(new java.awt.Dimension(784, 270));
        jTable1.setMinimumSize(new java.awt.Dimension(784, 270));
        jTable1.setPreferredSize(new java.awt.Dimension(784, 270));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        pnCenterNorthWest.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnCenterNorth.add(pnCenterNorthWest, java.awt.BorderLayout.CENTER);

        pnCenter.add(pnCenterNorth, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //METODOS
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportarOs;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAtendente;
    private javax.swing.JLabel lblAtendimento;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData01;
    private javax.swing.JLabel lblData02;
    private javax.swing.JLabel lblDataAbertura;
    private javax.swing.JLabel lblDataFechamento;
    private javax.swing.JLabel lblNomeResponsavel;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblResponsavel;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnCenterNorth;
    private javax.swing.JPanel pnCenterNorthEast;
    private javax.swing.JPanel pnCenterNorthWest;
    private javax.swing.JPanel pnCenterSouth;
    private javax.swing.JPanel pnCenterSouthEast;
    private javax.swing.JPanel pnCenterSouthWest;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnNorthEast;
    private javax.swing.JPanel pnNorthEastCenter;
    private javax.swing.JPanel pnNorthEastNorth;
    private javax.swing.JPanel pnNorthEastSouth;
    private javax.swing.JPanel pnNorthWest;
    private javax.swing.JPanel pnNorthWestEast;
    private javax.swing.JPanel pnNorthWestWest;
    private javax.swing.JPanel pnNorthWestWestNorth;
    private javax.swing.JPanel pnNorthWestWestSouth;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JPanel pnSouthNorth;
    private javax.swing.JPanel pnSouthSouth;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}