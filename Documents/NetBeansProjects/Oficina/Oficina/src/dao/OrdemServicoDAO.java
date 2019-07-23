package dao;

import entity.Cliente;
import entity.OrdemServico;
import entity.Produto;
import entity.Veiculo;
import java.security.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    //INSERIR NOVO OrdemServico -- deletar --
    public boolean novaOS(OrdemServico novaOrdemServico) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_ordem_servico(?, ?, ?, ?, ?, ?, ?, ?, ?);");
            preparedStatement.setInt(1, novaOrdemServico.getCodigoOrdem());
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

    //ABRIR OS SEM CLIENTE
    public boolean insertOsSemCliente(OrdemServico novaOrdemServico) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_ordem_sem_cliente(?);");
            preparedStatement.setString(1, novaOrdemServico.getResolucao());
            preparedStatement.execute();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
        }
        return false;
    }

    //ABRIR OS COM CLIENTE
    public boolean insertOsComCliente(OrdemServico novaOrdemServico, Cliente esseCliente, Veiculo esseVeiculo) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_ordem_com_cliente(?, ?, ?);");
            preparedStatement.setString(1, novaOrdemServico.getResolucao());
            preparedStatement.setInt(2, esseCliente.getCodigoCliente());
            preparedStatement.setString(3, esseVeiculo.getPlacaVeiculo());
            preparedStatement.execute();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
        }
        return false;
    }

    //ALTERAR OrdemServico SELECIONADA
    public boolean updateResolucaoStatus(OrdemServico essaOrdemServico) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_update_ordem_oficina(?, ?);");
            preparedStatement.setInt(1, essaOrdemServico.getCodigoOrdem());
            preparedStatement.setString(2, essaOrdemServico.getResolucao());

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
    
    public boolean updateOrdemPdv(OrdemServico essaOrdemServico, List<Produto>listaProduto) {
        try {
            for(Produto esseProduto : listaProduto){
                
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_update_ordem_pdv(?, ?, ?, ?, ?, ?);");
            preparedStatement.setInt(1, essaOrdemServico.getCodigoOrdem());
            preparedStatement.setDouble(2, essaOrdemServico.getValorTotal());
            preparedStatement.setInt(3, essaOrdemServico.getFormaPagamento());
            preparedStatement.setInt(4, esseProduto.getCodigoProduto());
            preparedStatement.setInt(5, esseProduto.getTipoProduto());
            preparedStatement.setInt(6, esseProduto.getQuantidadePdv());
            

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            }
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

            preparedStatement.setInt(1, essaOrdemServico.getCodigoOrdem());

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
    public List<OrdemServico> searchOrdemAll() {
        List<OrdemServico> listaOrdemServico = new ArrayList<OrdemServico>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_ordem_all();");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                OrdemServico essaOrdemServico = new OrdemServico();
                essaOrdemServico.setCodigoOrdem(resultSet.getInt("idordem"));
                essaOrdemServico.setResolucao(resultSet.getString("descricao_ordem"));
                essaOrdemServico.setPlacaVeiculoOrdem(resultSet.getString("placa_veiculo_ordem"));
                essaOrdemServico.setStatus(resultSet.getInt("status_ordem"));

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

    public OrdemServico searchOrdemCode(Integer esseCodigo) {
        OrdemServico essaOrdemServico = new OrdemServico();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_ordem_code(?);");
            preparedStatement.setInt(1, esseCodigo);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                essaOrdemServico.setCodigoOrdem(resultSet.getInt("idordem"));
                essaOrdemServico.setResolucao(resultSet.getString("descricao_ordem"));
                essaOrdemServico.setPlacaVeiculoOrdem(resultSet.getString("placa_veiculo_ordem"));
                essaOrdemServico.setCodigoCliente(resultSet.getInt("cliente_idcliente"));
            }
            preparedStatement.close();
            connection.disconnect();

        } catch (Exception exception) {
            Logger.getLogger(OrdemServico.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
        return essaOrdemServico;
    }
}
