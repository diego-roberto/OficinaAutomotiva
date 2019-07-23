package dao;

import entity.OrdemServico;
import java.security.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class OrdemServicoDAO {

    //CONEXAO
    private ConnectionManager connection;

    //CONSTRUTOR
    public OrdemServicoDAO() {
        connection = new ConnectionManager();
    }

    //GET
    public ConnectionManager getConnection() {
        return this.connection;
    }


    //INSERIR NOVO OrdemServico
    public boolean novaOS(OrdemServico novaOrdemServico) {        
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_ordem_servico(?, ?, ?, ?, ?, ?, ?, ?, ?);");
            preparedStatement.setInt(1, novaOrdemServico.getCodigo());
            preparedStatement.setString(2, novaOrdemServico.getResolucao());
            preparedStatement.setDate(3, novaOrdemServico.getDataEntrada());
            preparedStatement.setDate(4, novaOrdemServico.getDataConclusao());
            preparedStatement.setDouble(5, novaOrdemServico.getValorTotal());
            preparedStatement.setInt(6, novaOrdemServico.getFormaPagamento());
            preparedStatement.setInt(7, novaOrdemServico.getStatus());
            preparedStatement.setInt(8, novaOrdemServico.getCodigoFuncionario());
            preparedStatement.setInt(9, novaOrdemServico.getCodigoCliente());

            preparedStatement.execute();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (Exception exception) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

    //ALTERAR OrdemServico SELECIONADA
    public boolean updateResolucao(OrdemServico essaOrdemServico) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL PROCEDURE sp_update_resolucao_ordem_servico(?, ?, ?, ?);");
            preparedStatement.setInt(1, essaOrdemServico.getCodigo());
            preparedStatement.setString(2, essaOrdemServico.getResolucao());
            preparedStatement.setInt(3, essaOrdemServico.getStatus()); //definir qual status uma OS vai receber quando efetuar o serviço (pode passar o valor direto tbm)
            preparedStatement.setInt(4, essaOrdemServico.getCodigoFuncionario());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;

        } catch (Exception exception) {
            Logger.getLogger(OrdemServico.class.getName()).log(Level.SEVERE, null, exception);
            JOptionPane.showMessageDialog(null, "Não foi possível realizar ação.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    //não parece ser necessário
    //EXCLUIR OrdemServico SELECIONADA
    public boolean delete(OrdemServico essaOrdemServico) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("DELETE FROM ordem_servico WHERE codigo_ordem_servico = ?");

            preparedStatement.setInt(1, essaOrdemServico.getCodigo());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;

        } catch (Exception exception) {
            Logger.getLogger(OrdemServico.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

    //CONSULTA
    public ResultSet search() {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL whatever_the_fuck_procedure");

            ResultSet resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            return resultSet;
        } catch (Exception exception) {
            Logger.getLogger(OrdemServico.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }

    }

    //LISTAGEM COMPLETA
    public List<OrdemServico> searchAllOrdemServico() {
        List<OrdemServico> listaOrdemServico = new ArrayList<OrdemServico>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_all_ordem_servico();");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                OrdemServico essaOrdemServico = new OrdemServico();
                essaOrdemServico.setCodigo(resultSet.getInt("codigo_ordem_servico"));
                essaOrdemServico.setResolucao(resultSet.getString("resolucao_ordem_servico"));
                essaOrdemServico.setDataEntrada(resultSet.getDate("data_entrada_ordem_servico"));
                essaOrdemServico.setDataConclusao(resultSet.getDate("data_conclusao_ordem_servico"));
                essaOrdemServico.setValorTotal(resultSet.getDouble("valor_total_ordem_servico"));
                essaOrdemServico.setFormaPagamento(resultSet.getInt("forma_pagamento_ordem_servico"));
                essaOrdemServico.setStatus(resultSet.getInt("status_ordem_servico"));
                essaOrdemServico.setCodigoFuncionario(resultSet.getInt("funcionario_codigo_funcionario"));
                essaOrdemServico.setCodigoCliente(resultSet.getInt("cliente_codigo_cliente"));
                listaOrdemServico.add(essaOrdemServico);
            }
            preparedStatement.close();
            connection.disconnect();

        } catch (Exception exception) {
            Logger.getLogger(OrdemServico.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
        return listaOrdemServico;
    }
}
