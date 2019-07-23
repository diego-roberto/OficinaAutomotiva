package view;

import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.OrdemServicoDAO;
import dao.PecaDAO;
import dao.ProdutoDAO;
import dao.ServicoDAO;
import dao.StoredMessage;
import dao.VeiculoDAO;
import entity.Cliente;
import entity.Funcionario;
import entity.ModeloTabela;
import entity.OrdemServico;
import entity.Produto;
import entity.Veiculo;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class PdvIFrame extends javax.swing.JInternalFrame {

    OrdemServico ordemServico;
    OrdemServicoDAO ordemServicoDao;
    Cliente cliente;
    ClienteDAO clienteDao;
    Veiculo veiculo;
    VeiculoDAO veiculoDao;
    Funcionario funcionario;
    FuncionarioDAO funcionarioDao;
    Produto produto;
    ProdutoDAO produtoDao;
    PecaDAO pecaDao;
    ServicoDAO servicoDao;
    ModeloTabela modeloTabela;
    List<Produto> listaProduto = new ArrayList<>();

    public PdvIFrame(JDesktopPane desktop) {
        initComponents();
        ordemServico = new OrdemServico();
        ordemServicoDao = new OrdemServicoDAO();
        cliente = new Cliente();
        clienteDao = new ClienteDAO();
        veiculo = new Veiculo();
        veiculoDao = new VeiculoDAO();
        funcionario = new Funcionario();
        funcionarioDao = new FuncionarioDAO();
        produto = new Produto();
        produtoDao = new ProdutoDAO();
        pecaDao = new PecaDAO();
        servicoDao = new ServicoDAO();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        pnSouthNorth = new javax.swing.JPanel();
        lblNomeResponsavel = new javax.swing.JLabel();
        lblResponsavel = new javax.swing.JLabel();
        pnCenter = new javax.swing.JPanel();
        pnCenterSouth = new javax.swing.JPanel();
        pnCenterSouthEast = new javax.swing.JPanel();
        btnPagamento = new javax.swing.JButton();
        pnCenterSouthWest = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        pnCenterNorth = new javax.swing.JPanel();
        pnCenterNorthEast = new javax.swing.JPanel();
        btnAdicionarItem = new javax.swing.JButton();
        btnRemoverItem = new javax.swing.JButton();
        pnCenterNorthWest = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabela = new javax.swing.JTable();

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

        txtCliente.setEnabled(false);
        txtCliente.setPreferredSize(new java.awt.Dimension(150, 20));
        pnNorthWestWestNorth.add(txtCliente);

        pnNorthWestWest.add(pnNorthWestWestNorth);

        pnNorthWestWestSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblPlaca.setLabelFor(txtPlaca);
        lblPlaca.setText("  Placa:");
        pnNorthWestWestSouth.add(lblPlaca);

        txtPlaca.setEnabled(false);
        txtPlaca.setPreferredSize(new java.awt.Dimension(80, 20));
        pnNorthWestWestSouth.add(txtPlaca);

        pnNorthWestWest.add(pnNorthWestWestSouth);

        pnNorthWest.add(pnNorthWestWest);

        pnNorthWestEast.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnNorthWestEast.setMaximumSize(new java.awt.Dimension(200, 200));

        btnImportarOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/circled_down_15px.png"))); // NOI18N
        btnImportarOs.setText("Importar O.S.");
        btnImportarOs.setPreferredSize(new java.awt.Dimension(150, 20));
        btnImportarOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarOsActionPerformed(evt);
            }
        });
        pnNorthWestEast.add(btnImportarOs);

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minus_15px.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setPreferredSize(new java.awt.Dimension(150, 20));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
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

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setEnabled(false);
        jScrollPane2.setViewportView(txtDescricao);

        pnSouthSouth.add(jScrollPane2, java.awt.BorderLayout.CENTER);

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

        btnPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/checkout_40px.png"))); // NOI18N
        btnPagamento.setText("PAGAMENTO");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });
        pnCenterSouthEast.add(btnPagamento);

        pnCenterSouth.add(pnCenterSouthEast, java.awt.BorderLayout.LINE_END);

        pnCenterSouthWest.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TOTAL: R$");
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

        btnAdicionarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_30px.png"))); // NOI18N
        btnAdicionarItem.setMaximumSize(new java.awt.Dimension(70, 50));
        btnAdicionarItem.setMinimumSize(new java.awt.Dimension(70, 50));
        btnAdicionarItem.setPreferredSize(new java.awt.Dimension(70, 50));
        btnAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarItemActionPerformed(evt);
            }
        });
        pnCenterNorthEast.add(btnAdicionarItem);

        btnRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minus_30px.png"))); // NOI18N
        btnRemoverItem.setMaximumSize(new java.awt.Dimension(70, 50));
        btnRemoverItem.setMinimumSize(new java.awt.Dimension(70, 50));
        btnRemoverItem.setPreferredSize(new java.awt.Dimension(70, 50));
        btnRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverItemActionPerformed(evt);
            }
        });
        pnCenterNorthEast.add(btnRemoverItem);

        pnCenterNorth.add(pnCenterNorthEast, java.awt.BorderLayout.LINE_END);

        pnCenterNorthWest.setMaximumSize(new java.awt.Dimension(784, 270));
        pnCenterNorthWest.setMinimumSize(new java.awt.Dimension(784, 270));
        pnCenterNorthWest.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(784, 270));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(784, 270));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(784, 270));

        tbTabela.setModel(new javax.swing.table.DefaultTableModel(
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
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTabela.setMaximumSize(new java.awt.Dimension(784, 270));
        tbTabela.setMinimumSize(new java.awt.Dimension(784, 270));
        tbTabela.setPreferredSize(new java.awt.Dimension(784, 270));
        tbTabela.setRowHeight(20);
        jScrollPane1.setViewportView(tbTabela);

        pnCenterNorthWest.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnCenterNorth.add(pnCenterNorthWest, java.awt.BorderLayout.CENTER);

        pnCenter.add(pnCenterNorth, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarOsActionPerformed
        ordemServico = new OrdemServico();
        try {
            int importarCodigoOs = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código da OS:", "IMPORTAR OS", JOptionPane.OK_CANCEL_OPTION));
            ordemServico.setCodigoOrdem(importarCodigoOs);
            if (ordemServicoDao.searchOrdemCode(ordemServico.getCodigoOrdem()) == null) {
                StoredMessage.notFoundErrorMessage();
            } else {
                ordemServico = ordemServicoDao.searchOrdemCode(importarCodigoOs);
                txtCliente.setText(ordemServico.getCodigoCliente().toString());
                txtPlaca.setText(ordemServico.getPlacaVeiculoOrdem());
                txtDescricao.setText(ordemServico.getResolucao());
            }

        } catch (NumberFormatException numberFormatException) {
            StoredMessage.validNumberErrorMessage();
        }


    }//GEN-LAST:event_btnImportarOsActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        ordemServico = new OrdemServico();
        txtCliente.setText("");
        txtPlaca.setText("");
        txtDescricao.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarItemActionPerformed
        produto = new Produto();
        try {
            //1 PARA PECA, 2 PRA SERVICO
            int tipoProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tipo do produto:", "ADICIONAR", JOptionPane.OK_CANCEL_OPTION));
            int codigoProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código do produto:", "ADICIONAR", JOptionPane.OK_CANCEL_OPTION));
            if (tipoProduto == 1) {
                if (pecaDao.searchPecaCode(codigoProduto) == null) {
                    StoredMessage.notFoundErrorMessage();
                } else {
                    produto = pecaDao.searchPecaCode(codigoProduto);
                    produto.setTipoProduto(1);
                    addProdutoToLista(produto);
                }
            } else if (tipoProduto == 2) {
                if (servicoDao.searchServicoCode(codigoProduto) == null) {
                    StoredMessage.notFoundErrorMessage();
                } else {
                    produto = servicoDao.searchServicoCode(codigoProduto);
                    produto.setTipoProduto(2);
                    addProdutoToLista(produto);
                }

            }

        } catch (NumberFormatException numberFormatException) {
            StoredMessage.validNumberErrorMessage();
        }
    }//GEN-LAST:event_btnAdicionarItemActionPerformed

    private void btnRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverItemActionPerformed
        int selecionado = tbTabela.getSelectedRow();
        if (selecionado != -1) {
            listaProduto.remove(selecionado);
        }
        tbTabela.setModel(modeloTabela(listaProduto));
        calculoTotal(listaProduto);
    }//GEN-LAST:event_btnRemoverItemActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        if (ordemServico == null || listaProduto == null) {
            StoredMessage.emptySelectionErrorMessage();
        } else {
            StoredMessage.paymentOption();
            try {
                int modoPagamento = 1;
                modoPagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Meio de pagamento:", "PAGAMENTO", JOptionPane.OK_CANCEL_OPTION));
                ordemServico.setFormaPagamento(modoPagamento);
                ordemServico.setValorTotal(Double.parseDouble(lblTotal.getText()));
                if(ordemServicoDao.updateOrdemPdv(ordemServico, listaProduto)){
                    StoredMessage.saveSuccessMessage();
                }
            } catch (NumberFormatException numberFormatException) {
                StoredMessage.validNumberErrorMessage();
                numberFormatException.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnPagamentoActionPerformed

    //ADICIONAR PRODUTO A LISTA
    public void addProdutoToLista(Produto esseProduto) {
        try {
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade:", "ADICIONAR", JOptionPane.OK_CANCEL_OPTION));
            produto.setQuantidadePdv(quantidade);
            listaProduto.add(produto);
        } catch (NumberFormatException numberFormatException) {
            StoredMessage.validNumberErrorMessage();
        }

        tbTabela.setModel(modeloTabela(listaProduto));
        calculoTotal(listaProduto);
    }

    //LISTAR
    public ModeloTabela modeloTabela(List<Produto> essaLista) {
        String[] colunaTabela = {"CODIGO", "DESCRIÇÃO", "UNITÁRIO", "QUANTIDADE", "SUBTOTAL"};
        Object[][] dataTabela = new Object[essaLista.size()][5];

        int k = 0;
        for (Produto esseProduto : essaLista) {

            dataTabela[k][0] = esseProduto.getCodigoProduto();
            dataTabela[k][1] = esseProduto.getDescricaoProduto();
            dataTabela[k][2] = esseProduto.getValorUnitarioProduto();
            dataTabela[k][3] = esseProduto.getQuantidadePdv();
            dataTabela[k][4] = esseProduto.getValorUnitarioProduto() * esseProduto.getQuantidadePdv();
            k++;
        }

        return modeloTabela = new ModeloTabela(colunaTabela, dataTabela);
    }

    //CALCULO TOTAL
    public void calculoTotal(List<Produto> essaLista) {
        double totalSomado = 0;
        for (Produto esseProduto : essaLista) {
            totalSomado += esseProduto.getValorUnitarioProduto() * esseProduto.getQuantidadePdv();
        }
        lblTotal.setText(totalSomado+"");
    }

    //METODOS
    public void setLocation() {
        Dimension dimension = this.getDesktopPane().getSize();
        this.setLocation((dimension.width - this.getSize().width) / 2, (dimension.height - this.getSize().height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarItem;
    private javax.swing.JButton btnImportarOs;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnRemoverItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAtendente;
    private javax.swing.JLabel lblAtendimento;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData01;
    private javax.swing.JLabel lblData02;
    private javax.swing.JLabel lblDataAbertura;
    private javax.swing.JLabel lblDataFechamento;
    private javax.swing.JLabel lblNomeResponsavel;
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
    private javax.swing.JTable tbTabela;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
