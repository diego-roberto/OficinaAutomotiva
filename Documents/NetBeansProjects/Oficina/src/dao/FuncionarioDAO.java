package dao;

import entity.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class FuncionarioDAO {

    UsuarioDAO usuarioDao = new UsuarioDAO();
    //CONEXAO
    private ConnectionManager connection;

    //CONSTRUTOR
    public FuncionarioDAO() {
        connection = new ConnectionManager();
    }

    //GET
    public ConnectionManager getConnection() {
        return this.connection;
    }

    //SALVAR NOVO OU ALTERADO
    public boolean save(Funcionario esseFuncionario) {
        if (esseFuncionario.getCodigoFuncionario() == null) {
            return insert(esseFuncionario);
        } else {
            return update(esseFuncionario);
        }
    }

    //INSERIR NOVO REGISTRO
    public boolean insert(Funcionario novoFuncionario) {

        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_funcionario(?, ?, ?)");//ARRUMAR
            preparedStatement.setString(1, novoFuncionario.getNomeFuncionario());
            preparedStatement.setString(2, novoFuncionario.getCpfFuncionario());
            preparedStatement.setString(3, novoFuncionario.getTelefoneFuncionario());

            preparedStatement.executeUpdate(); //EXECUTE
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
            return false;
        }
    }

    //ALTERAR REGISTRO SELECIONADO
    public boolean update(Funcionario esseFuncionario) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_update_funcionario(?, ?, ?, ?);");//ARRUMAR
            preparedStatement.setString(1, esseFuncionario.getNomeFuncionario());
            preparedStatement.setString(2, esseFuncionario.getCpfFuncionario());
            preparedStatement.setString(3, esseFuncionario.getTelefoneFuncionario());
            preparedStatement.setInt(4, esseFuncionario.getCodigoFuncionario());

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
    public boolean delete(Funcionario esseFuncionario) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_delete_fornecedor(?)");//ARRUMAR

            preparedStatement.setInt(1, esseFuncionario.getCodigoFuncionario());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
        }
        return false;
    }

    //PESQUISA POR NOME
    public Funcionario searchFuncionarioName(String funcionarioPesquisado) {
        Funcionario esseFuncionario;
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_funcionario_name(?);");
            preparedStatement.setString(1, "%" + funcionarioPesquisado + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                esseFuncionario = new Funcionario();
                esseFuncionario.setCodigoFuncionario(resultSet.getInt("idfuncionario"));
                esseFuncionario.setNomeFuncionario(resultSet.getString("nome_funcionario"));
                esseFuncionario.setCpfFuncionario(resultSet.getString("cpf_funcionario"));
                esseFuncionario.setTelefoneFuncionario(resultSet.getString("telefone_funcionario"));
                return esseFuncionario;
            } else {
                return null;
            }
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
            return null;
        }
    }


    //PESQUISAR TODOS
    public List<Funcionario> searchFuncionarioAll() {
        List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_funcionario_all");            //PRONTO
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setCodigoFuncionario(resultSet.getInt("idfuncionario"));
                funcionario.setNomeFuncionario(resultSet.getString("nome_funcionario"));
                funcionario.setCpfFuncionario(resultSet.getString("cpf_funcionario"));
                funcionario.setTelefoneFuncionario(resultSet.getString("telefone_funcionario"));
                listaFuncionario.add(funcionario);                
            }
            preparedStatement.close();
            connection.disconnect();
            return listaFuncionario;
        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
            return null;
        }
        return null;
    }

}
