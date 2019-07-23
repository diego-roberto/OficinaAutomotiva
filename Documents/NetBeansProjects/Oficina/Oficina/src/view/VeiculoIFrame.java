package view;

import dao.VeiculoDAO;
import entity.Veiculo;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class VeiculoIFrame extends javax.swing.JInternalFrame {
    
    Veiculo veiculo;
    VeiculoDAO veiculoDao;
    
    public VeiculoIFrame() {
        initComponents();
        veiculo = new Veiculo();
        veiculoDao = new VeiculoDAO();
    }

    //LOCALIZA A JANELA NO CENTRO
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNorth = new javax.swing.JPanel();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        pnCenter = new javax.swing.JPanel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        pnSouth = new javax.swing.JPanel();
        pnSouthWest = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        pnSouthEast = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();

        setTitle("NOVO VEICULO");
        setMaximumSize(new java.awt.Dimension(360, 150));
        setMinimumSize(new java.awt.Dimension(360, 150));
        setPreferredSize(new java.awt.Dimension(360, 150));
        getContentPane().setLayout(new java.awt.GridLayout(3, 1));

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout1.setAlignOnBaseline(true);
        pnNorth.setLayout(flowLayout1);

        lblModelo.setText("Modelo:");
        pnNorth.add(lblModelo);

        txtModelo.setMaximumSize(new java.awt.Dimension(250, 20));
        txtModelo.setMinimumSize(new java.awt.Dimension(250, 20));
        txtModelo.setPreferredSize(new java.awt.Dimension(250, 20));
        pnNorth.add(txtModelo);

        getContentPane().add(pnNorth);

        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout2.setAlignOnBaseline(true);
        pnCenter.setLayout(flowLayout2);

        lblPlaca.setText("   Placa:");
        pnCenter.add(lblPlaca);

        txtPlaca.setMaximumSize(new java.awt.Dimension(80, 20));
        txtPlaca.setMinimumSize(new java.awt.Dimension(80, 20));
        txtPlaca.setPreferredSize(new java.awt.Dimension(80, 20));
        pnCenter.add(txtPlaca);

        getContentPane().add(pnCenter);

        pnSouth.setLayout(new java.awt.GridLayout(1, 2));

        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout3.setAlignOnBaseline(true);
        pnSouthWest.setLayout(flowLayout3);

        lblCodigo.setText("Codigo:");
        pnSouthWest.add(lblCodigo);

        txtCodigo.setMaximumSize(new java.awt.Dimension(80, 20));
        txtCodigo.setMinimumSize(new java.awt.Dimension(80, 20));
        txtCodigo.setPreferredSize(new java.awt.Dimension(80, 20));
        pnSouthWest.add(txtCodigo);

        pnSouth.add(pnSouthWest);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_15px.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnSouthEast.add(btnSalvar);

        pnSouth.add(pnSouthEast);

        getContentPane().add(pnSouth);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //SALVAR
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       if(Integer.parseInt(txtCodigo.getText())>0){
           veiculo.setCodigoClienteVeiculo(Integer.parseInt(txtCodigo.getText()));
           veiculo.setModeloVeiculo(txtModelo.getText());
           veiculo.setPlacaVeiculo(txtPlaca.getText());
           if(veiculoDao.insert(veiculo)){
               JOptionPane.showMessageDialog(null, "Veículo salvo com sucesso.");
               this.dispose();
           }
       }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JPanel pnSouthEast;
    private javax.swing.JPanel pnSouthWest;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
