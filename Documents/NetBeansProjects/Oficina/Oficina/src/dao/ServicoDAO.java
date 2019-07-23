package dao;

import entity.Cliente;
import entity.Entrada;
import entity.Servico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicoDAO {
    
    //CONEXAO
    private ConnectionManager connection;

    //CONSTRUTOR
    public ServicoDAO() {
        connection = new ConnectionManager();
    }

    //GET
    public ConnectionManager getConnection() {
        return this.connection;
    }

    //SALVAR NOVO OU ALTERADO
    public boolean save(Servico esseServico) {
        if (esseServico.getCodigoProduto() == null) {
            return insert(esseServico);
        } else {
            return update(esseServico);
        }
    }

    //INSERIR NOVO REGISTRO
    public boolean insert(Servico novoServico) {

        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_servico(?, ?);");              //PRONTO
            preparedStatement.setString(1, novoServico.getDescricaoProduto());
            preparedStatement.setDouble(2, novoServico.getValorUnitarioProduto());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
            return false;
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
            return false;
        }
    }

    //ALTERAR REGISTRO SELECIONADO
    public boolean update(Servico esseServico) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_update_servico(?, ?, ?);");           //PRONTO
            preparedStatement.setString(1, esseServico.getDescricaoProduto());
            preparedStatement.setDouble(2, esseServico.getValorUnitarioProduto());
            preparedStatement.setInt(3, esseServico.getCodigoProduto());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;

        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
            return false;
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
            return false;
        }
    }

    //DELETAR REGISTRO SELECIONADO
    public boolean delete(Servico esseServico) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_delete_servico(?)");                  //pronto

            preparedStatement.setInt(1, esseServico.getCodigoProduto());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
            return false;
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
        }
        return false;
    }

    //PESQUISA POR CODIGO
    public Servico searchServicoCode(Integer esseCodigo) {
        Servico esseServico;
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_servico_code(?);");//ARRUMAR
            preparedStatement.setInt(1, esseCodigo);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                esseServico = new Servico();
                esseServico.setCodigoProduto(esseCodigo);
                esseServico.setDescricaoProduto(resultSet.getString("descricao_servico"));                
                esseServico.setValorUnitarioProduto(resultSet.getDouble("valor_servico"));                
                return esseServico;
            } else {
                return null;
            }
        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
            return null;
        }

    }
    //LISTAGEM COMPLETA
    public List<Servico> searchAllServico() {
        List<Servico> listaServico = new ArrayList<>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_servico_all();");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Servico esseServico = new Servico();
                esseServico.setCodigoProduto(resultSet.getInt("idservico"));
                esseServico.setDescricaoProduto(resultSet.getString("descricao_servico"));
                esseServico.setValorUnitarioProduto(resultSet.getDouble("valor_servico"));
                listaServico.add(esseServico);
            }
            preparedStatement.close();
            connection.disconnect();

        } catch (Exception exception) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
        return listaServico;
    }

}
