package view;

import dao.FuncionarioDAO;
import dao.StoredMessage;
import dao.UsuarioDAO;
import entity.Funcionario;
import entity.Usuario;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class UsuarioIFrame extends javax.swing.JInternalFrame {

    String senha;

    Usuario usuario;
    UsuarioDAO usuarioDao;
    Funcionario funcionario;
    FuncionarioDAO funcionarioDao;

    public UsuarioIFrame() {
        initComponents();
        usuario = new Usuario();
        usuarioDao = new UsuarioDAO();
        funcionario = new Funcionario();
        funcionarioDao = new FuncionarioDAO();       
        
        listagem(funcionarioDao.searchFuncionarioAll());            
       
    }

    //LISTAGEM FUNCIONARIO TENTATIVA  2
    private void listagem(List<Funcionario> listaFuncionario) {
        List<String> essaListaFuncionario = new ArrayList<String>();
        for (Funcionario esseFuncionario : listaFuncionario) {
            
            essaListaFuncionario.add(esseFuncionario.toString());
        }        
        cbFuncionario.setModel(new DefaultComboBoxModel(essaListaFuncionario.toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblMatricula = new javax.swing.JLabel();
        cbFuncionario = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lblMatricula1 = new javax.swing.JLabel();
        pssNovaSenha = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        lblMatricula2 = new javax.swing.JLabel();
        cbNivel = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();

        setTitle("NOVO USUARIO");
        setMaximumSize(new java.awt.Dimension(350, 250));
        setMinimumSize(new java.awt.Dimension(350, 250));
        setPreferredSize(new java.awt.Dimension(350, 250));
        getContentPane().setLayout(new java.awt.GridLayout(6, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblMatricula.setText("Funcionário:");
        jPanel2.add(lblMatricula);

        cbFuncionario.setMaximumSize(new java.awt.Dimension(200, 20));
        cbFuncionario.setMinimumSize(new java.awt.Dimension(200, 20));
        cbFuncionario.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel2.add(cbFuncionario);

        getContentPane().add(jPanel2);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblMatricula1.setText("        Senha:");
        jPanel3.add(lblMatricula1);

        pssNovaSenha.setMaximumSize(new java.awt.Dimension(120, 20));
        pssNovaSenha.setMinimumSize(new java.awt.Dimension(120, 20));
        pssNovaSenha.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel3.add(pssNovaSenha);

        getContentPane().add(jPanel3);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblMatricula2.setText("          Nível:");
        jPanel4.add(lblMatricula2);

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        jPanel4.add(cbNivel);

        getContentPane().add(jPanel4);

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_15px.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel5.add(btnCadastrar);

        getContentPane().add(jPanel5);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel_15px.png"))); // NOI18N
        btnCancelar.setText("Sair");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel6.add(btnCancelar);

        getContentPane().add(jPanel6);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        char[] novaSenha = pssNovaSenha.getPassword();
        //funcionario = (Funcionario) cbFuncionario.getSelectedItem();        
        usuario.setNomeUsuario(cbFuncionario.getSelectedItem().toString());
        usuario.setSenhaUsuario(String.valueOf(novaSenha));
        usuario.setNivelUsuario(Integer.parseInt(cbNivel.getSelectedItem().toString()));
        if (novaSenha.length < 6 || novaSenha.length > 12) {
            StoredMessage.passwordSizeErrorMessage();
        } else {
            if (usuarioDao.save(usuario, funcionario)) {
                StoredMessage.saveSuccessMessage();
                refresh();
            }
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    //METODOS
    //REFRESH
    public void refresh() {
        cbFuncionario.setSelectedIndex(-1);
        cbNivel.setSelectedIndex(-1);
        pssNovaSenha.setText("");
    }

    //LOCALIZA A JANELA NO CENTRO
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbFuncionario;
    private javax.swing.JComboBox<String> cbNivel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblMatricula1;
    private javax.swing.JLabel lblMatricula2;
    private javax.swing.JPasswordField pssNovaSenha;
    // End of variables declaration//GEN-END:variables
}
