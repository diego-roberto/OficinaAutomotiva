package dao;

import entity.Categoria;
import java.security.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CategoriaDAO {

    //
    private ConnectionManager connection;

    //CONSTRUTOR
    public CategoriaDAO() {
        connection = new ConnectionManager();
    }

    //GET
    public ConnectionManager getConnection() {
        return this.connection;
    }

    //SALVA NOVO OU ALTERADO
    public boolean save(Categoria essaCategoria) {
        if (essaCategoria.getCodigoCategoria() == 0) {
            return insert(essaCategoria);
        } else {
            return update(essaCategoria);
        }
    }

    //INSERIR NOVA CATEGORIA
    public boolean insert(Categoria novaCategoria) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_categoria(?)"); //PRONTO
            preparedStatement.setString(1, novaCategoria.getDescricaoCategoria());

            preparedStatement.executeUpdate(); //EXXEXCUTE
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (Exception exception) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

    //ALTERAR CATEGORIA SELECIONADA -- deletar --
    public boolean update(Categoria essaCategoria) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_update_categoria(?, ?)"); //FAZER
            preparedStatement.setString(1, essaCategoria.getDescricaoCategoria());
            preparedStatement.setInt(2, essaCategoria.getCodigoCategoria());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;

        } catch (Exception exception) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

    //DELETAR CATEGORIA SELECIONADA -- deletar --
    public boolean delete(Categoria categoria) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_delete_categoria(?)"); //FAZER
            preparedStatement.setInt(1, categoria.getCodigoCategoria());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;

        } catch (Exception exception) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

    //PESQUISAR POR DESCRICAO -- deletar --
    public ResultSet search(String str) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_categoria (?)"); //FAZER
            preparedStatement.setString(1, "%" + str + "%"); //ALTERAR STR

            ResultSet resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            return resultSet;
        } catch (Exception exception) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }

    }

    //PESQUISAR POR DESCRICAO -- deletar
    public List<Categoria> searchDescription(String str) {
        List<Categoria> listaCategoria = new ArrayList<Categoria>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_categoria ?");//FAZER
            preparedStatement.setString(1, "%" + str + "%");//ARRUMAR

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Categoria categoria = new Categoria();
                categoria.setCodigoCategoria(resultSet.getInt("codigo"));
                categoria.setDescricaoCategoria(resultSet.getString("descricao"));
                listaCategoria.add(categoria);
            }
            return listaCategoria;
        } catch (Exception exception) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }

    }

    //PESQUISAR TODOS
    public List<Categoria> searchAll() {
        List<Categoria> listaCategoria = new ArrayList<Categoria>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_categoria_all();"); //PRONTO          
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Categoria categoria = new Categoria();
                categoria.setCodigoCategoria(resultSet.getInt("idcategoria"));
                categoria.setDescricaoCategoria(resultSet.getString("descricao_categoria"));
                listaCategoria.add(categoria);
            }
            preparedStatement.close();
            connection.disconnect();

        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
        } catch (Exception exception) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
        return listaCategoria;
    }

}
