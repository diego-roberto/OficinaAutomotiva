package view;

import dao.FuncionarioDAO;
import dao.StoredMessage;
import dao.UsuarioDAO;
import entity.Funcionario;
import entity.Usuario;

public class LogonFrame extends javax.swing.JFrame {

    Funcionario funcionario;
    FuncionarioDAO funcionarioDao;
    Usuario usuario;
    UsuarioDAO usuarioDao;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LogonFrame() {
        initComponents();
        setLocationRelativeTo(null);
        funcionario = new Funcionario();
        usuario = new Usuario();
        funcionarioDao = new FuncionarioDAO();
        usuarioDao = new UsuarioDAO();
    }

    public LogonFrame(Funcionario funcionario, Usuario usuario) {
        initComponents();
        this.funcionario = funcionario;
        this.usuario = usuario;
        funcionarioDao = new FuncionarioDAO();
        usuarioDao = new UsuarioDAO();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnNorth = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnSouth = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        pnEast = new javax.swing.JPanel();
        pnWest = new javax.swing.JPanel();
        pnCenter = new javax.swing.JPanel();
        pnCenter01 = new javax.swing.JPanel();
        lblMatricula = new javax.swing.JLabel();
        pnCenter02 = new javax.swing.JPanel();
        txtMatricula = new javax.swing.JTextField();
        pnCenter03 = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        pnCenter04 = new javax.swing.JPanel();
        pssSenha = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("LOGON");
        setMaximumSize(new java.awt.Dimension(500, 350));
        setMinimumSize(new java.awt.Dimension(500, 350));

        pnNorth.setMaximumSize(new java.awt.Dimension(500, 100));
        pnNorth.setMinimumSize(new java.awt.Dimension(500, 100));
        pnNorth.setPreferredSize(new java.awt.Dimension(500, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/!logo2.PNG"))); // NOI18N

        javax.swing.GroupLayout pnNorthLayout = new javax.swing.GroupLayout(pnNorth);
        pnNorth.setLayout(pnNorthLayout);
        pnNorthLayout.setHorizontalGroup(
            pnNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(pnNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNorthLayout.createSequentialGroup()
                    .addContainerGap(110, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addContainerGap(110, Short.MAX_VALUE)))
        );
        pnNorthLayout.setVerticalGroup(
            pnNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
            .addGroup(pnNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNorthLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(pnNorth, java.awt.BorderLayout.PAGE_START);

        pnSouth.setMaximumSize(new java.awt.Dimension(500, 60));
        pnSouth.setMinimumSize(new java.awt.Dimension(500, 60));
        pnSouth.setPreferredSize(new java.awt.Dimension(500, 60));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel_15px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnSouth.add(btnCancelar);

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login_rounded_right_20px.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setMaximumSize(new java.awt.Dimension(93, 23));
        btnEntrar.setMinimumSize(new java.awt.Dimension(93, 23));
        btnEntrar.setPreferredSize(new java.awt.Dimension(93, 23));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        pnSouth.add(btnEntrar);

        getContentPane().add(pnSouth, java.awt.BorderLayout.PAGE_END);

        pnEast.setMaximumSize(new java.awt.Dimension(100, 100));
        pnEast.setMinimumSize(new java.awt.Dimension(100, 100));
        pnEast.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout pnEastLayout = new javax.swing.GroupLayout(pnEast);
        pnEast.setLayout(pnEastLayout);
        pnEastLayout.setHorizontalGroup(
            pnEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnEastLayout.setVerticalGroup(
            pnEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        getContentPane().add(pnEast, java.awt.BorderLayout.LINE_END);

        pnWest.setMaximumSize(new java.awt.Dimension(100, 100));
        pnWest.setMinimumSize(new java.awt.Dimension(100, 100));
        pnWest.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout pnWestLayout = new javax.swing.GroupLayout(pnWest);
        pnWest.setLayout(pnWestLayout);
        pnWestLayout.setHorizontalGroup(
            pnWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnWestLayout.setVerticalGroup(
            pnWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        getContentPane().add(pnWest, java.awt.BorderLayout.LINE_START);

        pnCenter.setMaximumSize(new java.awt.Dimension(300, 150));
        pnCenter.setMinimumSize(new java.awt.Dimension(300, 150));
        pnCenter.setPreferredSize(new java.awt.Dimension(300, 150));
        pnCenter.setLayout(new java.awt.GridLayout(4, 1));

        pnCenter01.setMaximumSize(new java.awt.Dimension(300, 41));
        pnCenter01.setMinimumSize(new java.awt.Dimension(300, 41));
        pnCenter01.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblMatricula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMatricula.setText("           Matrícula");
        lblMatricula.setMaximumSize(new java.awt.Dimension(106, 45));
        lblMatricula.setMinimumSize(new java.awt.Dimension(106, 45));
        lblMatricula.setPreferredSize(new java.awt.Dimension(106, 45));
        pnCenter01.add(lblMatricula);

        pnCenter.add(pnCenter01);

        pnCenter02.setMaximumSize(new java.awt.Dimension(300, 20));
        pnCenter02.setMinimumSize(new java.awt.Dimension(300, 20));
        pnCenter02.setPreferredSize(new java.awt.Dimension(300, 20));
        pnCenter02.setRequestFocusEnabled(false);

        txtMatricula.setMaximumSize(new java.awt.Dimension(200, 20));
        txtMatricula.setMinimumSize(new java.awt.Dimension(200, 20));
        txtMatricula.setPreferredSize(new java.awt.Dimension(200, 20));
        pnCenter02.add(txtMatricula);

        pnCenter.add(pnCenter02);

        pnCenter03.setMaximumSize(new java.awt.Dimension(300, 20));
        pnCenter03.setMinimumSize(new java.awt.Dimension(300, 20));
        pnCenter03.setPreferredSize(new java.awt.Dimension(300, 20));
        pnCenter03.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenha.setText("           Senha");
        lblSenha.setMaximumSize(new java.awt.Dimension(87, 45));
        lblSenha.setMinimumSize(new java.awt.Dimension(87, 45));
        lblSenha.setPreferredSize(new java.awt.Dimension(87, 45));
        pnCenter03.add(lblSenha);

        pnCenter.add(pnCenter03);

        pnCenter04.setMaximumSize(new java.awt.Dimension(300, 41));
        pnCenter04.setMinimumSize(new java.awt.Dimension(300, 41));

        pssSenha.setMaximumSize(new java.awt.Dimension(200, 20));
        pssSenha.setMinimumSize(new java.awt.Dimension(200, 20));
        pssSenha.setPreferredSize(new java.awt.Dimension(200, 20));
        pnCenter04.add(pssSenha);

        pnCenter.add(pnCenter04);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //BOTAO
    //ENTRAR
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Usuario usuarioLogon = new Usuario();
        if (txtMatricula.getText().equals("rick") && pssSenha.getText().equals("morty")) {
            txtMatricula.setText("");
            pssSenha.setText("");
            rick();
        } else {
            char[] essaSenha = pssSenha.getPassword();
            if (essaSenha.length < 6 || essaSenha.length > 12) {
                StoredMessage.passwordSizeErrorMessage();
            } else {
                try {
                    usuario.setMatriculaUsuario(Integer.parseInt(txtMatricula.getText()));
                    usuario.setSenhaUsuario(String.valueOf(essaSenha));
                    if (usuarioDao.searchByEnrollment(usuario.getMatriculaUsuario(), usuario.getSenhaUsuario()) == null) {
                        StoredMessage.enrollmentNotFoundErrorMessage();
                    } else {
                        this.setVisible(false);
                        usuarioLogon = usuarioDao.searchByEnrollment(usuario.getMatriculaUsuario(), usuario.getSenhaUsuario());
                        MainFrame mainFrame = new MainFrame(usuarioLogon);
                        mainFrame.setResizable(false);
                        mainFrame.setVisible(true);
                    }
                } catch (NumberFormatException numberFormatException) {
                    StoredMessage.enrollmentErrorMessage();
                }
            }
        }

    }//GEN-LAST:event_btnEntrarActionPerformed
    //CANCELAR
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rick() {
        Wldd easterEgg = new Wldd();
        easterEgg.setVisible(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogonFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnCenter01;
    private javax.swing.JPanel pnCenter02;
    private javax.swing.JPanel pnCenter03;
    private javax.swing.JPanel pnCenter04;
    private javax.swing.JPanel pnEast;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JPanel pnWest;
    private javax.swing.JPasswordField pssSenha;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables
}
