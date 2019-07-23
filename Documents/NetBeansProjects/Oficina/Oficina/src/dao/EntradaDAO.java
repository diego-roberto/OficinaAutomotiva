package dao;

import entity.Entrada;
import entity.Fornecedor;
import entity.Peca;
import entity.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntradaDAO {

    //CONEXAO
    private ConnectionManager connection;

    //CONSTRUTOR
    public EntradaDAO() {
        connection = new ConnectionManager();
    }

    //GET
    public ConnectionManager getConnection() {
        return this.connection;
    }

    //METODOS    
    public boolean save(Entrada essaEntrada, Peca essaPeca, Fornecedor esseFornecedor,Usuario esseUsuario) {
        if (essaEntrada.getCodigoEntrada() == null) {
            return insert(essaEntrada, essaPeca, esseFornecedor, esseUsuario);
        } else {
            return false;
        }
    }

    //INSERIR NOVO CLIENTE
    public boolean insert(Entrada novaEntrada,Peca essaPeca, Fornecedor esseFornecedor,Usuario esseUsuario) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_entrada(?, ?, ?, ?);");
            preparedStatement.setInt(1, novaEntrada.getQuantidadeEntrada());
            preparedStatement.setDouble(2, essaPeca.getValorUnitarioProduto());
            preparedStatement.setInt(3, essaPeca.getCodigoProduto());
            preparedStatement.setInt(4, esseFornecedor.getCodigoFornecedor());

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

    public List<Entrada> searchEntradaAll() {
        List<Entrada> listaEntrada = new ArrayList<>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_entrada_all");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Entrada essaEntrada = new Entrada();
                essaEntrada.setCodigoEntrada(resultSet.getInt("identrada"));
                essaEntrada.setQuantidadeEntrada(resultSet.getInt("quantidade_entrada"));
                essaEntrada.setUnitarioEntrada(resultSet.getDouble("valor_unitario_entrada"));
                essaEntrada.setTotalEntrada(resultSet.getDouble("valor_total_entrada"));
                essaEntrada.setCodigoPecaEntrada(resultSet.getInt("idpeca"));
                essaEntrada.setPecaEntrada(resultSet.getString("descricao_peca"));                
                essaEntrada.setCodigoFornecedorEntrada(resultSet.getInt("idfornecedor"));
                essaEntrada.setFornecedorEntrada(resultSet.getString("razao_fornecedor"));                
                listaEntrada.add(essaEntrada);
            }
            preparedStatement.close();
            connection.disconnect();

        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
            return null;
        }
        return listaEntrada;
    }
}
