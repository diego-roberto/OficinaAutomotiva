package view;

//@autor Diego Roberto, Francisco Miranda, João Carlos

public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jBtnPecas = new javax.swing.JButton();
        jBtnOficina = new javax.swing.JButton();
        jBtnCaixa = new javax.swing.JButton();
        jBtnVendas = new javax.swing.JButton();
        jBtnOS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnPecas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/large/Box.png"))); // NOI18N
        jBtnPecas.setText("Estoque");
        jBtnPecas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnPecas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBtnOficina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/large/Tools.png"))); // NOI18N
        jBtnOficina.setText("Oficina");
        jBtnOficina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnOficina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBtnCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/large/Monitor.png"))); // NOI18N
        jBtnCaixa.setText("Caixa");
        jBtnCaixa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnCaixa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBtnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/large/Line Chart.png"))); // NOI18N
        jBtnVendas.setText("Vendas");
        jBtnVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnVendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBtnOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/large/Paste.png"))); // NOI18N
        jBtnOS.setText("Ordem de Serviço");
        jBtnOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnOS.setVerifyInputWhenFocusTarget(false);
        jBtnOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jBtnOS)
                        .addGap(26, 26, 26)
                        .addComponent(jBtnPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jBtnOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jBtnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jBtnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnOS, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCaixa;
    private javax.swing.JButton jBtnOS;
    private javax.swing.JButton jBtnOficina;
    private javax.swing.JButton jBtnPecas;
    private javax.swing.JButton jBtnVendas;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables
}
