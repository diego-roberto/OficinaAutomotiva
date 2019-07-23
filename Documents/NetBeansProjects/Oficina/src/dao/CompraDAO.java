package dao;

import entity.Compra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompraDAO {

    //CONEXAO
    private ConnectionManager connection;

    //CONSTRUTOR
    public CompraDAO() {
        connection = new ConnectionManager();
    }

    //GET
    public ConnectionManager getConnection() {
        return this.connection;
    }

    //METODOS    
    public boolean save(Compra essaCompra) {
        if (essaCompra.getCodigoCompra() == null) {
            return insert(essaCompra);
        } else {
            return false;
        }
    }

    //INSERIR NOVO CLIENTE
    public boolean insert(Compra novaCompra) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_compra(?, ?, ?, ?);");
            preparedStatement.setInt(1, novaCompra.getQuantidadeCompra());
            preparedStatement.setString(2, novaCompra.getPecaCompra());
            preparedStatement.setString(3, novaCompra.getFuncionarioCompra());
            preparedStatement.setString(4, novaCompra.getFornecedorCompra());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
            sQLException.printStackTrace();
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
        }
        return false;
    }

    public List<Compra> searchAllCompra() {
        List<Compra> listaCompra = new ArrayList<>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_all_compra_full();");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Compra essaCompra = new Compra();
                essaCompra.setCodigoCompra(resultSet.getInt("codigo_compra"));
                essaCompra.setPecaCompra(resultSet.getString("descricao_peca"));
                essaCompra.setFuncionarioCompra(resultSet.getString("nome_funcionario"));
                essaCompra.setFornecedorCompra(resultSet.getString("razao_fornecedor"));
                essaCompra.setDataCompra(resultSet.getDate("data_compra"));
                essaCompra.setQuantidadeCompra(resultSet.getInt("quantidade"));
                essaCompra.setTotalCompra(resultSet.getDouble("total_compra"));
                listaCompra.add(essaCompra);
            }
            preparedStatement.close();
            connection.disconnect();

        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
            return null;
        }
        return listaCompra;
    }
}
