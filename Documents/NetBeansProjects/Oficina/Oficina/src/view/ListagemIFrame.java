package view;

import dao.ClienteDAO;
import dao.EntradaDAO;
import dao.FornecedorDAO;
import dao.FuncionarioDAO;
import dao.PecaDAO;
import dao.ServicoDAO;
import entity.Cliente;
import entity.Entrada;
import entity.Fornecedor;
import entity.Funcionario;
import entity.ModeloTabela;
import entity.Peca;
import entity.Servico;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

public class ListagemIFrame extends javax.swing.JInternalFrame {
    
    
    //DAOs
    ClienteDAO clienteDao;
    FuncionarioDAO funcionarioDao;
    FornecedorDAO fornecedorDao;
    PecaDAO pecaDao;
    ServicoDAO servicoDao;
    EntradaDAO compraDao;
    ////////////////////////////
    
    
    //CONSTRUTOR
    public ListagemIFrame(Object entidade) {
        initComponents();
        table.setModel(getTableModel(entidade));
        pnCenter.repaint();
    }

    //METODOS
    //COMPORTAMENTO DA TABELA
    public ModeloTabela getTableModel(Object entidade){
        //DECLARACAO DO MODELO
        ModeloTabela modeloTabela = null;
        //PESSOAS
        if (entidade instanceof Cliente) {//INSTANCE OF CLIENTE
            List<Cliente> listaCliente = new ArrayList<>();            
            clienteDao = new ClienteDAO();
            listaCliente = clienteDao.searchAllCliente();

            String[] colunaCliente = {"CODIGO", "NOME/RAZAO", "CPF/CNPJ", "TELEFONE", "TIPO", "DATA CADASTRO"};
            Object[][] dataCliente = new Object[listaCliente.size()][6];
            
            int k = 0;
            for (Cliente esseCliente : listaCliente) {
                dataCliente[k][0] = esseCliente.getCodigoCliente();
                dataCliente[k][1] = esseCliente.getNomeRazaoCliente();
                dataCliente[k][2] = esseCliente.getCpfCnpjCliente();
                dataCliente[k][3] = esseCliente.getTelefoneCliente();
                dataCliente[k][4] = esseCliente.getTipoCliente();
                dataCliente[k][5] = esseCliente.getDataCadastroCliente();                
                k++;
            }
            lblTitulo.setText("CONSULTA AO CLIENTE");
            modeloTabela = new ModeloTabela(colunaCliente, dataCliente);      
        }else if(entidade instanceof Funcionario){//INSTANCE OF FUNCIONARIO
            List<Funcionario> listaFuncionario = new ArrayList<>();
            funcionarioDao = new FuncionarioDAO();
            listaFuncionario = funcionarioDao.searchFuncionarioAll();
            
            String[] colunaFuncionario = {"CODIGO","NOME","CPF","TELEFONE"};
            Object[][] dataFuncionario = new Object[listaFuncionario.size()][4];
            int k=0;
            for(Funcionario esseFuncionario : listaFuncionario){
                dataFuncionario[k][0] = esseFuncionario.getCodigoFuncionario();
                dataFuncionario[k][1] = esseFuncionario.getNomeFuncionario();
                dataFuncionario[k][2] = esseFuncionario.getCpfFuncionario();
                dataFuncionario[k][3] = esseFuncionario.getTelefoneFuncionario();
                k++;
            }
            lblTitulo.setText("CONSULTA AO FUNCIONÁRIO");
            modeloTabela = new ModeloTabela(colunaFuncionario, dataFuncionario);            
        }else if(entidade instanceof Fornecedor){//INSTANCE OF FORNECEDOR
            List<Fornecedor> listaFornecedor = new ArrayList<>();
            fornecedorDao = new FornecedorDAO();
            listaFornecedor = fornecedorDao.searchAllFornecedor();
            
            String[] colunaFornecedor = {"CODIGO","RAZAO","CNPJ","EMAIL","TELEFONE"};
            Object[][] dataFornecedor = new Object[listaFornecedor.size()][5];
            int k=0;
            for(Fornecedor esseFornecedor : listaFornecedor){
                dataFornecedor[k][0] = esseFornecedor.getCodigoFornecedor();
                dataFornecedor[k][1] = esseFornecedor.getRazaoFornecedor();
                dataFornecedor[k][2] = esseFornecedor.getCnpjFornecedor();
                dataFornecedor[k][3] = esseFornecedor.getEmailFornecedor();
                dataFornecedor[k][4] = esseFornecedor.getTelefoneFornecedor();
                k++;
            }
            lblTitulo.setText("CONSULTA AO FORNECEDOR");
            modeloTabela = new ModeloTabela(colunaFornecedor, dataFornecedor);
        //OBJETOS-OBJETIVO
        }else if(entidade instanceof Peca){//INSTANCE OF PECA
            List<Peca> listaPeca = new ArrayList<>();
            pecaDao = new PecaDAO();
            listaPeca = pecaDao.searchAllPeca();
            
            String[] colunaPeca = {"CODIGO","DESCRIÇÃO","COD CATEGORIA","CATEGORIA","ESTOQUE","VALOR UNITARIO"};
            Object[][] dataPeca = new Object[listaPeca.size()][6];
            int k=0;
            for(Peca essaPeca : listaPeca){
                dataPeca[k][0] = ""+essaPeca.getCodigoProduto();
                dataPeca[k][1] = ""+essaPeca.getDescricaoProduto();
                dataPeca[k][2] = ""+essaPeca.getCodigoCategoriaPeca();
                dataPeca[k][3] = ""+essaPeca.getCategoriaPeca();
                dataPeca[k][4] = ""+essaPeca.getQuantidadeProduto();
                dataPeca[k][5] = "R$"+essaPeca.getValorUnitarioProduto();                
                k++;
            }
            lblTitulo.setText("CONSULTA À PEÇA");
            modeloTabela = new ModeloTabela(colunaPeca, dataPeca);        
        }else if(entidade instanceof Servico){//INSTANCE OF SERVICO
            List<Servico> listaServico = new ArrayList<>();
            servicoDao = new ServicoDAO();
            listaServico = servicoDao.searchAllServico();
            
            String[] colunaServico = {"CODIGO","DESCRIÇÃO","VALOR"};
            Object[][] dataServico = new Object[listaServico.size()][3];
            int k=0;
            for(Servico esseServico : listaServico){
                dataServico[k][0] = ""+esseServico.getCodigoProduto();
                dataServico[k][1] = ""+esseServico.getDescricaoProduto();                
                dataServico[k][2] = "R$"+esseServico.getValorUnitarioProduto();                
                k++;
            }
            lblTitulo.setText("CONSULTA AO SERVIÇO");
            modeloTabela = new ModeloTabela(colunaServico, dataServico);        
        }else if(entidade instanceof Entrada){//INSTANCE OF ENTRADA
            List<Entrada> listaCompra = new ArrayList<>();
            compraDao = new EntradaDAO();
            listaCompra = compraDao.searchEntradaAll();
            
            String[] colunaEntrada = {"CODIGO COMPRA","QUANTIDADE","UNITÁRIO","TOTAL","CODIGO PEÇA","PEÇA","CODIGO FORNECEDOR","FORNECEDOR"};
            Object[][] dataEntrada = new Object[listaCompra.size()][8];
            int k=0;
            for(Entrada essaCompra : listaCompra){
                dataEntrada[k][0] = ""+essaCompra.getCodigoEntrada();
                dataEntrada[k][1] = ""+essaCompra.getQuantidadeEntrada();                
                dataEntrada[k][2] = "R$"+essaCompra.getUnitarioEntrada();                
                dataEntrada[k][3] = "R$"+essaCompra.getTotalEntrada();                
                dataEntrada[k][4] = ""+essaCompra.getCodigoPecaEntrada();               
                dataEntrada[k][5] = ""+essaCompra.getPecaEntrada();               
                dataEntrada[k][6] = ""+essaCompra.getCodigoFornecedorEntrada();                
                dataEntrada[k][7] = ""+essaCompra.getFornecedorEntrada();                
                               
                k++;
            }
            lblTitulo.setText("CONSULTA À COMPRA");
            modeloTabela = new ModeloTabela(colunaEntrada, dataEntrada);        
        }
        return modeloTabela;
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
        lblTitulo = new javax.swing.JLabel();
        pnSouth = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        pnCenter = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setIconifiable(true);
        setTitle("LISTAGEM");

        pnNorth.setMaximumSize(new java.awt.Dimension(600, 50));
        pnNorth.setMinimumSize(new java.awt.Dimension(600, 50));
        pnNorth.setPreferredSize(new java.awt.Dimension(600, 50));
        pnNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setPreferredSize(new java.awt.Dimension(500, 40));
        pnNorth.add(lblTitulo);

        getContentPane().add(pnNorth, java.awt.BorderLayout.PAGE_START);

        pnSouth.setMaximumSize(new java.awt.Dimension(600, 50));
        pnSouth.setMinimumSize(new java.awt.Dimension(600, 50));
        pnSouth.setPreferredSize(new java.awt.Dimension(600, 50));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        pnSouth.setLayout(flowLayout1);

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel_15px.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        pnSouth.add(btnFechar);

        getContentPane().add(pnSouth, java.awt.BorderLayout.PAGE_END);

        pnCenter.setMaximumSize(new java.awt.Dimension(600, 300));
        pnCenter.setMinimumSize(new java.awt.Dimension(600, 300));
        pnCenter.setPreferredSize(new java.awt.Dimension(600, 300));
        pnCenter.setLayout(new java.awt.BorderLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollPane.setViewportView(table);

        pnCenter.add(scrollPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnNorth;
    private javax.swing.JPanel pnSouth;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
