package dao;

import entity.Fornecedor;
import java.security.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FornecedorDAO {

    //
    private ConnectionManager connection;

    //CONSTRUTOR
    public FornecedorDAO() {
        connection = new ConnectionManager();
    }

    //GET
    public ConnectionManager getConnection() {
        return this.connection;
    }

    //SALVAR NOVO OU ALTERADO
    public boolean save(Fornecedor esseFornecedor) {
        if (esseFornecedor.getCodigoFornecedor() == null) {
            return insert(esseFornecedor);
        } else {
            return update(esseFornecedor);
        }
    }

    //INSERIR NOVO FORNECEDOR
    public boolean insert(Fornecedor novoFornecedor) {

        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_fornecedor(?, ?, ?, ?)");
            preparedStatement.setString(1, novoFornecedor.getRazaoFornecedor());
            preparedStatement.setString(2, novoFornecedor.getCnpjFornecedor());
            preparedStatement.setString(3, novoFornecedor.getEmailFornecedor());
            preparedStatement.setString(4, novoFornecedor.getTelefoneFornecedor());

            preparedStatement.executeUpdate(); 
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (Exception exception) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, exception);
            return false;
        }
    }

    //ALTERAR FORNECEDOR SELECIONADO
    public boolean update(Fornecedor esseFornecedor) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_update_fornecedor(?, ?, ?, ?, ?);");
            preparedStatement.setString(1, esseFornecedor.getRazaoFornecedor());
            preparedStatement.setString(2, esseFornecedor.getCnpjFornecedor());
            preparedStatement.setString(3, esseFornecedor.getEmailFornecedor());
            preparedStatement.setString(4, esseFornecedor.getTelefoneFornecedor());
            preparedStatement.setInt(5, esseFornecedor.getCodigoFornecedor());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;

        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
            return false;
        } catch (Exception exception) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, exception);
            return false;
        }
    }

    //DELETAR FORNECEDOR SELECIONADO 
    public boolean delete(Fornecedor esseFornecedor) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_delete_fornecedor(?)");           // PRONTO

            preparedStatement.setInt(1, esseFornecedor.getCodigoFornecedor());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;

        } catch (Exception exception) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

    //PESQUISAR -- DELETAR -- 
    public ResultSet search() {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_fornecedor(?)");

            ResultSet resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

            return resultSet;

        } catch (Exception exception) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }

    }

    //PESQUISA POR CNPJ
    public Fornecedor searchCnpjFornecedor(String cnpjPesquisado) {
        Fornecedor esseFornecedor;
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().       //PRONTO
                    prepareStatement("CALL sp_search_fornecedor_cnpj(?);");
            preparedStatement.setString(1, cnpjPesquisado);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                esseFornecedor = new Fornecedor();
                esseFornecedor.setCodigoFornecedor(resultSet.getInt("idfornecedor"));
                esseFornecedor.setRazaoFornecedor(resultSet.getString("razao_fornecedor"));
                esseFornecedor.setCnpjFornecedor(resultSet.getString("cnpj_fornecedor"));
                esseFornecedor.setEmailFornecedor(resultSet.getString("email_fornecedor"));
                esseFornecedor.setTelefoneFornecedor(resultSet.getString("telefone_fornecedor"));
                return esseFornecedor;
            } else {
                return null;
            }

        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
            return null;
        }
    }

    //PESQUISAR POR DESCRICAO -- deletar --
    public List<Fornecedor> searchDescription(String str) {
        List<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_fornecedor(?)");

            preparedStatement.setString(1, "%" + str + "%");//ARRUMAR

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Fornecedor esseFornecedor = new Fornecedor();
                esseFornecedor.setCodigoFornecedor(resultSet.getInt("codigo_fornecedor"));
                esseFornecedor.setRazaoFornecedor(resultSet.getString("razao_fornecedor"));
                esseFornecedor.setCnpjFornecedor(resultSet.getString("cnpj_fornecedor"));
                esseFornecedor.setEmailFornecedor(resultSet.getString("email_fornecedor"));
                esseFornecedor.setTelefoneFornecedor(resultSet.getString("telefone_fornecedor"));
                listaFornecedor.add(esseFornecedor);
            }

            return listaFornecedor;

        } catch (Exception exception) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }

    }

    //PESQUISAR TODOS
    public List<Fornecedor> searchAllFornecedor() {
        List<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().       //PRONTO
                    prepareStatement("CALL sp_search_fornecedor_all");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Fornecedor esseFornecedor = new Fornecedor();
                esseFornecedor.setCodigoFornecedor(resultSet.getInt("idfornecedor"));
                esseFornecedor.setRazaoFornecedor(resultSet.getString("razao_fornecedor"));
                esseFornecedor.setCnpjFornecedor(resultSet.getString("cnpj_fornecedor"));
                esseFornecedor.setEmailFornecedor(resultSet.getString("email_fornecedor"));
                esseFornecedor.setTelefoneFornecedor(resultSet.getString("telefone_fornecedor"));
                listaFornecedor.add(esseFornecedor);
            }
            preparedStatement.close();
            connection.disconnect();
        } catch (Exception exception) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
        return listaFornecedor;
    }

}
