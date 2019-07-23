package view;

import dao.ClienteDAO;
import dao.VeiculoDAO;
import entity.Cliente;
import entity.Veiculo;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class ClienteIFrame extends javax.swing.JInternalFrame {

    Cliente cliente;
    Veiculo veiculo;
    ClienteDAO clienteDao;
    VeiculoDAO veiculoDao;
    JDesktopPane desktop;

    //CONSTRUTOR
    public ClienteIFrame(JDesktopPane desktop) {
        initComponents();
        disableRequiredComponent();
        cliente = new Cliente();
        veiculo = new Veiculo();
        clienteDao = new ClienteDAO();
        veiculoDao = new VeiculoDAO();
        this.desktop = desktop;
    }

    //METODOS
    //HABILITA COMPONENTES
    public void enableRequiredComponent() {
        txtNome.setEnabled(true);
        txtCpfCnpj.setEnabled(true);
        txtTelefone.setEnabled(true);
        cbTipoCliente.setEnabled(true);
        cbVeiculo.setEnabled(true);
        //btnEditarCliente.setEnabled(true);
        btnRemoverVeiculo.setEnabled(true);
        btnNovoVeiculo.setEnabled(true);
        btnSalvar.setEnabled(true);
    }

    //DESABILITA COMPONENTES
    public void disableRequiredComponent() {
        txtNome.setEnabled(false);
        txtCpfCnpj.setEnabled(false);
        txtTelefone.setEnabled(false);
        cbTipoCliente.setEnabled(false);
        cbVeiculo.setEnabled(false);
        btnEditarCliente.setEnabled(false);
        btnRemoverVeiculo.setEnabled(false);
        btnNovoVeiculo.setEnabled(false);
        btnSalvar.setEnabled(false);
    }

    //LIMPA OS CAMPOS
    public void refresh() {
        txtNome.setText("");
        txtCpfCnpj.setText("");
        txtCodigo.setText("");
        txtDataCadastro.setText("");
        txtTelefone.setText("");
        cbTipoCliente.setSelectedIndex(0);
        cbVeiculo.setSelectedIndex(-1);
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
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnListagem = new javax.swing.JButton();
        pnSouth = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        pnCenter = new javax.swing.JPanel();
        pnCenter01 = new javax.swing.JPanel();
        pnCenter01West = new javax.swing.JPanel();
        lblTipo = new javax.swing.JLabel();
        cbTipoCliente = new javax.swing.JComboBox<>();
        pnCenter01East = new javax.swing.JPanel();
        btnEditarCliente = new javax.swing.JButton();
        btnNovoCliente = new javax.swing.JButton();
        pnCenter02 = new javax.swing.JPanel();
        pnCenter02West = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        pnCenter02East = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        txtDataCadastro = new javax.swing.JTextField();
        pnCenter03 = new javax.swing.JPanel();
        pnCenter03West = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        pnCenter03East = new javax.swing.JPanel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        pnCenter05 = new javax.swing.JPanel();
        pnCenter05West = new javax.swing.JPanel();
        lblCpjCnpj = new javax.swing.JLabel();
        txtCpfCnpj = new javax.swing.JTextField();
        pnCenter05East = new javax.swing.JPanel();
        pnCenter04 = new javax.swing.JPanel();
        lblVeiculo = new javax.swing.JLabel();
        cbVeiculo = new javax.swing.JComboBox<>();
        lblEspacoAjuste01 = new javax.swing.JLabel();
        lblEspacoAjuste02 = new javax.swing.JLabel();
        btnRemoverVeiculo = new javax.swing.JButton();
        btnNovoVeiculo = new javax.swing.JButton();

        setTitle("CLIENTE");

        pnNorth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnNorth.setMaximumSize(new java.awt.Dimension(700, 50));
        pnNorth.setMinimumSize(new java.awt.Dimension(700, 50));
        pnNorth.setPreferredSize(new java.awt.Dimension(700, 50));
        pnNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblPesquisar.setText("Pesquisar:");
        pnNorth.add(lblPesquisar);

        txtPesquisar.setMaximumSize(new java.awt.Dimension(200, 20));
        txtPesquisar.setMinimumSize(new java.awt.Dimension(200, 20));
        txtPesquisar.setPreferredSize(new java.awt.Dimension(200, 20));
        pnNorth.add(txtPesquisar);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_15px.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        pnNorth.add(btnPesquisar);

        btnListagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/list_15px.png"))); // NOI18N
        btnListagem.setText("Listagem");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });
        pnNorth.add(btnListagem);

        getContentPane().add(pnNorth, java.awt.BorderLayout.PAGE_START);

        pnSouth.setMaximumSize(new java.awt.Dimension(700, 50));
        pnSouth.setMinimumSize(new java.awt.Dimension(700, 50));
        pnSouth.setPreferredSize(new java.awt.Dimension(700, 50));
        java.awt.FlowLayout flowLayout9 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 5);
        flowLayout9.setAlignOnBaseline(true);
        pnSouth.setLayout(flowLayout9);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel_15px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(120, 30));
        btnCancelar.setMinimumSize(new java.awt.Dimension(120, 30));
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnSouth.add(btnCancelar);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_20px.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(120, 30));
        btnSalvar.setMinimumSize(new java.awt.Dimension(120, 30));
        btnSalvar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnSouth.add(btnSalvar);

        getContentPane().add(pnSouth, java.awt.BorderLayout.PAGE_END);

        pnCenter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnCenter.setMaximumSize(new java.awt.Dimension(700, 300));
        pnCenter.setMinimumSize(new java.awt.Dimension(700, 300));
        pnCenter.setPreferredSize(new java.awt.Dimension(700, 300));
        pnCenter.setLayout(new java.awt.GridLayout(5, 1));

        pnCenter01.setMaximumSize(new java.awt.Dimension(700, 50));
        pnCenter01.setMinimumSize(new java.awt.Dimension(700, 50));
        pnCenter01.setPreferredSize(new java.awt.Dimension(700, 50));
        pnCenter01.setLayout(new java.awt.GridLayout(1, 0));

        pnCenter01West.setMaximumSize(new java.awt.Dimension(350, 50));
        pnCenter01West.setMinimumSize(new java.awt.Dimension(350, 50));
        pnCenter01West.setPreferredSize(new java.awt.Dimension(350, 50));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout1.setAlignOnBaseline(true);
        pnCenter01West.setLayout(flowLayout1);

        lblTipo.setText("        Tipo:");
        pnCenter01West.add(lblTipo);

        cbTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Jurídica" }));
        cbTipoCliente.setMaximumSize(new java.awt.Dimension(150, 20));
        cbTipoCliente.setMinimumSize(new java.awt.Dimension(150, 20));
        cbTipoCliente.setPreferredSize(new java.awt.Dimension(150, 20));
        pnCenter01West.add(cbTipoCliente);

        pnCenter01.add(pnCenter01West);

        pnCenter01East.setMaximumSize(new java.awt.Dimension(350, 50));
        pnCenter01East.setMinimumSize(new java.awt.Dimension(350, 50));
        pnCenter01East.setPreferredSize(new java.awt.Dimension(350, 50));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 5);
        flowLayout2.setAlignOnBaseline(true);
        pnCenter01East.setLayout(flowLayout2);

        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_20px.png"))); // NOI18N
        btnEditarCliente.setText("Editar");
        btnEditarCliente.setMaximumSize(new java.awt.Dimension(120, 30));
        btnEditarCliente.setMinimumSize(new java.awt.Dimension(120, 30));
        btnEditarCliente.setPreferredSize(new java.awt.Dimension(120, 30));
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });
        pnCenter01East.add(btnEditarCliente);

        btnNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_20px.png"))); // NOI18N
        btnNovoCliente.setText("Novo");
        btnNovoCliente.setMaximumSize(new java.awt.Dimension(120, 30));
        btnNovoCliente.setMinimumSize(new java.awt.Dimension(120, 30));
        btnNovoCliente.setPreferredSize(new java.awt.Dimension(120, 30));
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });
        pnCenter01East.add(btnNovoCliente);

        pnCenter01.add(pnCenter01East);

        pnCenter.add(pnCenter01);

        pnCenter02.setMaximumSize(new java.awt.Dimension(700, 50));
        pnCenter02.setMinimumSize(new java.awt.Dimension(700, 50));
        pnCenter02.setPreferredSize(new java.awt.Dimension(700, 50));
        pnCenter02.setLayout(new java.awt.GridLayout(1, 0));

        pnCenter02West.setMaximumSize(new java.awt.Dimension(350, 50));
        pnCenter02West.setMinimumSize(new java.awt.Dimension(350, 50));
        pnCenter02West.setPreferredSize(new java.awt.Dimension(350, 50));
        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout3.setAlignOnBaseline(true);
        pnCenter02West.setLayout(flowLayout3);

        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("    Código:");
        pnCenter02West.add(lblCodigo);

        txtCodigo.setEditable(false);
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodigo.setMaximumSize(new java.awt.Dimension(150, 20));
        txtCodigo.setMinimumSize(new java.awt.Dimension(150, 20));
        txtCodigo.setPreferredSize(new java.awt.Dimension(150, 20));
        pnCenter02West.add(txtCodigo);

        pnCenter02.add(pnCenter02West);

        pnCenter02East.setMaximumSize(new java.awt.Dimension(350, 50));
        pnCenter02East.setMinimumSize(new java.awt.Dimension(350, 50));
        pnCenter02East.setPreferredSize(new java.awt.Dimension(350, 50));
        java.awt.FlowLayout flowLayout4 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout4.setAlignOnBaseline(true);
        pnCenter02East.setLayout(flowLayout4);

        lblData.setText("Data de cadastro:");
        pnCenter02East.add(lblData);

        txtDataCadastro.setEditable(false);
        txtDataCadastro.setMaximumSize(new java.awt.Dimension(120, 20));
        txtDataCadastro.setMinimumSize(new java.awt.Dimension(120, 20));
        txtDataCadastro.setPreferredSize(new java.awt.Dimension(120, 20));
        pnCenter02East.add(txtDataCadastro);

        pnCenter02.add(pnCenter02East);

        pnCenter.add(pnCenter02);

        pnCenter03.setMaximumSize(new java.awt.Dimension(700, 50));
        pnCenter03.setMinimumSize(new java.awt.Dimension(700, 50));
        pnCenter03.setPreferredSize(new java.awt.Dimension(700, 50));
        pnCenter03.setLayout(new java.awt.GridLayout(1, 0));

        pnCenter03West.setMaximumSize(new java.awt.Dimension(350, 50));
        pnCenter03West.setMinimumSize(new java.awt.Dimension(350, 50));
        pnCenter03West.setPreferredSize(new java.awt.Dimension(350, 50));
        java.awt.FlowLayout flowLayout5 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout5.setAlignOnBaseline(true);
        pnCenter03West.setLayout(flowLayout5);

        lblNome.setText("      Nome:");
        pnCenter03West.add(lblNome);

        txtNome.setMaximumSize(new java.awt.Dimension(250, 20));
        txtNome.setMinimumSize(new java.awt.Dimension(250, 20));
        txtNome.setPreferredSize(new java.awt.Dimension(250, 20));
        pnCenter03West.add(txtNome);

        pnCenter03.add(pnCenter03West);

        pnCenter03East.setMaximumSize(new java.awt.Dimension(350, 50));
        pnCenter03East.setMinimumSize(new java.awt.Dimension(350, 50));
        pnCenter03East.setPreferredSize(new java.awt.Dimension(350, 50));
        java.awt.FlowLayout flowLayout6 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout6.setAlignOnBaseline(true);
        pnCenter03East.setLayout(flowLayout6);

        lblTelefone.setText("              Telefone:");
        pnCenter03East.add(lblTelefone);

        txtTelefone.setMaximumSize(new java.awt.Dimension(120, 20));
        txtTelefone.setMinimumSize(new java.awt.Dimension(120, 20));
        txtTelefone.setPreferredSize(new java.awt.Dimension(120, 20));
        pnCenter03East.add(txtTelefone);

        pnCenter03.add(pnCenter03East);

        pnCenter.add(pnCenter03);

        pnCenter05.setMaximumSize(new java.awt.Dimension(700, 50));
        pnCenter05.setMinimumSize(new java.awt.Dimension(700, 50));
        pnCenter05.setPreferredSize(new java.awt.Dimension(700, 50));
        pnCenter05.setLayout(new java.awt.GridLayout(1, 2));

        pnCenter05West.setMaximumSize(new java.awt.Dimension(350, 50));
        pnCenter05West.setMinimumSize(new java.awt.Dimension(350, 50));
        pnCenter05West.setPreferredSize(new java.awt.Dimension(350, 50));
        java.awt.FlowLayout flowLayout8 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout8.setAlignOnBaseline(true);
        pnCenter05West.setLayout(flowLayout8);

        lblCpjCnpj.setText("CPJ/CNPJ:");
        pnCenter05West.add(lblCpjCnpj);

        txtCpfCnpj.setMaximumSize(new java.awt.Dimension(150, 20));
        txtCpfCnpj.setMinimumSize(new java.awt.Dimension(150, 20));
        txtCpfCnpj.setPreferredSize(new java.awt.Dimension(150, 20));
        pnCenter05West.add(txtCpfCnpj);

        pnCenter05.add(pnCenter05West);

        java.awt.FlowLayout flowLayout10 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout10.setAlignOnBaseline(true);
        pnCenter05East.setLayout(flowLayout10);
        pnCenter05.add(pnCenter05East);

        pnCenter.add(pnCenter05);

        pnCenter04.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnCenter04.setMaximumSize(new java.awt.Dimension(700, 50));
        pnCenter04.setMinimumSize(new java.awt.Dimension(700, 50));
        pnCenter04.setPreferredSize(new java.awt.Dimension(700, 50));
        java.awt.FlowLayout flowLayout7 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout7.setAlignOnBaseline(true);
        pnCenter04.setLayout(flowLayout7);

        lblVeiculo.setText("    Veículo:");
        pnCenter04.add(lblVeiculo);

        cbVeiculo.setEditable(true);
        cbVeiculo.setToolTipText("Para adicionar, basta digitar uma novos modelo e placa.");
        cbVeiculo.setMaximumSize(new java.awt.Dimension(250, 20));
        cbVeiculo.setMinimumSize(new java.awt.Dimension(250, 20));
        cbVeiculo.setPreferredSize(new java.awt.Dimension(250, 20));
        pnCenter04.add(cbVeiculo);

        lblEspacoAjuste01.setText("                                                                                                                ");
        pnCenter04.add(lblEspacoAjuste01);

        lblEspacoAjuste02.setText("              ");
        lblEspacoAjuste02.setMaximumSize(new java.awt.Dimension(106, 14));
        lblEspacoAjuste02.setMinimumSize(new java.awt.Dimension(106, 14));
        lblEspacoAjuste02.setPreferredSize(new java.awt.Dimension(106, 14));
        pnCenter04.add(lblEspacoAjuste02);

        btnRemoverVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minus_15px.png"))); // NOI18N
        btnRemoverVeiculo.setText("Remover");
        btnRemoverVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverVeiculoActionPerformed(evt);
            }
        });
        pnCenter04.add(btnRemoverVeiculo);

        btnNovoVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_15px.png"))); // NOI18N
        btnNovoVeiculo.setText("Novo");
        btnNovoVeiculo.setMaximumSize(new java.awt.Dimension(95, 23));
        btnNovoVeiculo.setMinimumSize(new java.awt.Dimension(95, 23));
        btnNovoVeiculo.setPreferredSize(new java.awt.Dimension(95, 23));
        btnNovoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoVeiculoActionPerformed(evt);
            }
        });
        pnCenter04.add(btnNovoVeiculo);

        pnCenter.add(pnCenter04);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTOES
    //PESQUISAR
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String textoPesquisa = txtPesquisar.getText();
        if (textoPesquisa.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo de pesquisa vazio.", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else if (clienteDao.searchClienteName(textoPesquisa) == null) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado ou inexistente.", "ERRO", JOptionPane.OK_OPTION);
        } else {
            cliente = clienteDao.searchClienteName(textoPesquisa);
            txtCodigo.setText(cliente.getCodigoCliente().toString());
            txtNome.setText(cliente.getNomeRazaoCliente());
            txtCpfCnpj.setText(cliente.getCpfCnpjCliente());
            txtTelefone.setText(cliente.getTelefoneCliente());
            if (cliente.getDataCadastroCliente() != null) {
                txtDataCadastro.setText(cliente.getDataCadastroCliente().toString());
            }
            if (cliente.getTipoCliente().equalsIgnoreCase("PF")) {
                cbTipoCliente.setSelectedIndex(0);
            } else {
                cbTipoCliente.setSelectedIndex(1);
            }
            cliente.setListaVeiculoCliente(veiculoDao.searchVehicleByOwner(cliente.getCodigoCliente()));
            cbVeiculo.setModel(new DefaultComboBoxModel(cliente.getListaVeiculoCliente().toArray()));
            disableRequiredComponent();
            btnEditarCliente.setEnabled(true);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    //LISTAGEM
    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        ListagemIFrame listagemFrame = new ListagemIFrame(new Cliente());
        boolean windowExists = false;
        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(listagemFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(listagemFrame);
            listagemFrame.setVisible(true);
            listagemFrame.setIconifiable(true);
            listagemFrame.setClosable(true);
            listagemFrame.setLocation();
        }
    }//GEN-LAST:event_btnListagemActionPerformed

    //NOVO CLIENTE
    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        cliente = new Cliente();
        enableRequiredComponent();
        refresh();
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        enableRequiredComponent();
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnRemoverVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverVeiculoActionPerformed
        Integer opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do registro?", "CONFIRMACAO", JOptionPane.YES_NO_OPTION);
        if (opcao == 0) {
            veiculoDao.delete((Veiculo) cbVeiculo.getSelectedItem());
        }
        cbVeiculo.setModel(new DefaultComboBoxModel(cliente.getListaVeiculoCliente().toArray()));
    }//GEN-LAST:event_btnRemoverVeiculoActionPerformed

    //NOVO VEICULO
    private void btnNovoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoVeiculoActionPerformed
        VeiculoIFrame veiculoFrame = new VeiculoIFrame();
        boolean windowExists = false;
        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(veiculoFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(veiculoFrame);
            veiculoFrame.setVisible(true);
            veiculoFrame.setIconifiable(true);
            veiculoFrame.setClosable(true);
            veiculoFrame.setLocation();
        }
    }//GEN-LAST:event_btnNovoVeiculoActionPerformed

    //SALVAR
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            cliente.setCodigoCliente(Integer.parseInt(txtCodigo.getText()));
        } catch (NumberFormatException numberFormatException) {
            cliente.setCodigoCliente(null);
        } finally {
            cliente.setNomeRazaoCliente(txtNome.getText());
            cliente.setCpfCnpjCliente(txtCpfCnpj.getText());
            cliente.setTelefoneCliente(txtTelefone.getText());
            cliente.setTipoCliente(cbTipoCliente.getSelectedIndex());

            if (clienteDao.save(cliente)) {
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso.");
                disableRequiredComponent();
                refresh();
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        //ConnectionManager.cancel();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnCancelar;
    protected javax.swing.JButton btnEditarCliente;
    protected javax.swing.JButton btnListagem;
    protected javax.swing.JButton btnNovoCliente;
    protected javax.swing.JButton btnNovoVeiculo;
    protected javax.swing.JButton btnPesquisar;
    protected javax.swing.JButton btnRemoverVeiculo;
    protected javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbTipoCliente;
    private javax.swing.JComboBox<String> cbVeiculo;
    protected javax.swing.JLabel lblCodigo;
    protected javax.swing.JLabel lblCpjCnpj;
    protected javax.swing.JLabel lblData;
    protected javax.swing.JLabel lblEspacoAjuste01;
    protected javax.swing.JLabel lblEspacoAjuste02;
    protected javax.swing.JLabel lblNome;
    protected javax.swing.JLabel lblPesquisar;
    protected javax.swing.JLabel lblTelefone;
    protected javax.swing.JLabel lblTipo;
    protected javax.swing.JLabel lblVeiculo;
    protected javax.swing.JPanel pnCenter;
    protected javax.swing.JPanel pnCenter01;
    protected javax.swing.JPanel pnCenter01East;
    protected javax.swing.JPanel pnCenter01West;
    protected javax.swing.JPanel pnCenter02;
    protected javax.swing.JPanel pnCenter02East;
    protected javax.swing.JPanel pnCenter02West;
    protected javax.swing.JPanel pnCenter03;
    protected javax.swing.JPanel pnCenter03East;
    protected javax.swing.JPanel pnCenter03West;
    protected javax.swing.JPanel pnCenter04;
    protected javax.swing.JPanel pnCenter05;
    protected javax.swing.JPanel pnCenter05East;
    protected javax.swing.JPanel pnCenter05West;
    protected javax.swing.JPanel pnNorth;
    protected javax.swing.JPanel pnSouth;
    protected javax.swing.JTextField txtCodigo;
    protected javax.swing.JTextField txtCpfCnpj;
    protected javax.swing.JTextField txtDataCadastro;
    protected javax.swing.JTextField txtNome;
    protected javax.swing.JTextField txtPesquisar;
    protected javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
