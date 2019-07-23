package dao;

import entity.Peca;
import java.security.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

 
public class PecaDAO {
    //
    private ConnectionManager connection;

    //CONSTRUTOR
    public PecaDAO(){
        connection = new ConnectionManager();
    }
    
    //GET
    public ConnectionManager getConnection(){
        return this.connection;
    }
    
    //SALVAR OU ALTERAR PECA
    public boolean save(Peca essaPeca) {
        if (essaPeca.getCodigoProduto() == null) {
            return insert(essaPeca);
        } else {
            return update(essaPeca);
        }
    }
    
    //Insere um novo cadastro com os registros obtidos
    public boolean insert(Peca novaPeca){
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_peca(?, ?, ?);");
            preparedStatement.setDouble(1, novaPeca.getValorUnitarioProduto());
            preparedStatement.setString(2, novaPeca.getDescricaoProduto());
            preparedStatement.setString(3, novaPeca.getCategoriaPeca());
            
            preparedStatement.executeUpdate(); // EXECUTE
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (Exception exception){
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, exception);
        } return false;
    }
    
    //ALTERAR REGISTRO SELECIONADO
    public boolean update (Peca essaPeca){
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_update_peca(?, ?, ?, ?);");
            
            preparedStatement.setDouble(1, essaPeca.getValorUnitarioProduto());
            preparedStatement.setString(2, essaPeca.getDescricaoProduto());
            preparedStatement.setString(3, essaPeca.getCategoriaPeca());            
            preparedStatement.setInt(4, essaPeca.getCodigoProduto());
            
            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
                    
        } catch(Exception exception){
            Logger.getLogger(Peca.class.getName()).log(Level.SEVERE, null, exception);
        } return false;
    }
    
    //EXCLUIR REGISTRO SELECIONADO -- deletar --
    public boolean delete(Peca essaPeca){
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_delete_peca(?);");
           
            preparedStatement.setInt(1, essaPeca.getCodigoProduto());
            
            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
                    
        } catch(Exception exception){
            Logger.getLogger(Peca.class.getName()).log(Level.SEVERE, null, exception);
        } return false;
    }
    
    //PESQUISAR
    public ResultSet search(){
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("SELECT valor_peca, descricao_peca, categoria_codigo_categoria"
                                    + " FROM Peca");
                        
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(null,"Nenhum registro foi encontrado.","ERRO", JOptionPane.ERROR_MESSAGE);
            }            
            return resultSet;                    
        } catch(Exception exception){
            Logger.getLogger(Peca.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
        
    }
    //PESQUISA POR CODIGO
    public Peca searchPecaCode(Integer esseCodigo){
        Peca essaPeca;
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_peca_code(?);");
            preparedStatement.setInt(1, esseCodigo);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()){
                essaPeca = new Peca();
                essaPeca.setCodigoProduto(esseCodigo);
                essaPeca.setDescricaoProduto(resultSet.getString("descricao_peca"));
                essaPeca.setValorUnitarioProduto(resultSet.getDouble("valor_peca"));
                essaPeca.setCategoriaPeca(resultSet.getString("descricao_categoria"));
                essaPeca.setQuantidadeProduto(resultSet.getInt("quantidade_peca"));
                return essaPeca;
            }else{
                return null;
            }
        }catch(SQLException sQLException){
            StoredMessage.sqlErrorMessage();
            return null;
        }
        
    }
    
    
    //PESQUISAR POR CODIGO -- deletar --
    public List<Peca> searchByCodeOld(Integer esseCodigo) {
        List<Peca> listaPeca = new ArrayList<Peca>();
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_peca_by_code(?);");
            
            preparedStatement.setInt(1, esseCodigo);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
             while (resultSet.next()) {
                Peca essaPeca = new Peca();
                essaPeca.setCodigoProduto(resultSet.getInt("codigo_peca"));
                essaPeca.setValorUnitarioProduto(resultSet.getDouble("valor_peca"));
                essaPeca.setDescricaoProduto(resultSet.getString("descricao_peca"));
                essaPeca.setCategoriaPeca(resultSet.getString("categoria_codigo_categoria"));
                listaPeca.add(essaPeca);
             }
            
            return listaPeca;
                    
        } catch(Exception exception){
            Logger.getLogger(Peca.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
        
    }
    //PESQUISAR TODOS -- deletar
    public List<Peca> searchAll(){
        List<Peca> listaPeca = new ArrayList<Peca>();
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_all_peca");            
            ResultSet resultSet = preparedStatement.executeQuery();
            
             while (resultSet.next()) {
                Peca peca = new Peca();
                peca.setCodigoProduto(resultSet.getInt("codigo_peca"));
                peca.setValorUnitarioProduto(resultSet.getDouble("valor_peca"));
                peca.setDescricaoProduto(resultSet.getString("descricao_peca"));
                peca.setCategoriaPeca(resultSet.getString("categoria_codigo_categoria"));
                listaPeca.add(peca);
             }
            preparedStatement.close();
            connection.disconnect();
                    
        } catch(Exception exception){
            Logger.getLogger(Peca.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
            return listaPeca;
    }
    //PESQUISAR TODOS
    public List<Peca> buildListPeca(){
        List<Peca> listaPeca = new ArrayList<Peca>();
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_peca_all");            
            ResultSet resultSet = preparedStatement.executeQuery();
            
             while (resultSet.next()) {
                Peca peca = new Peca();
                peca.setCodigoProduto(resultSet.getInt("idpeca"));
                peca.setValorUnitarioProduto(resultSet.getDouble("valor_peca"));
                peca.setDescricaoProduto(resultSet.getString("descricao_peca"));
                listaPeca.add(peca);
             }
            preparedStatement.close();
            connection.disconnect();
                    
        } catch(Exception exception){
            Logger.getLogger(Peca.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
            return listaPeca;
    }
    //// EM USO
    public List<Peca> searchAllPeca(){
        List<Peca> listaPeca = new ArrayList<Peca>();
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_peca_categoria");            
            ResultSet resultSet = preparedStatement.executeQuery();
            
             while (resultSet.next()) {
                Peca peca = new Peca();
                peca.setCodigoProduto(resultSet.getInt("idpeca"));
                peca.setDescricaoProduto(resultSet.getString("descricao_peca"));
                peca.setValorUnitarioProduto(resultSet.getDouble("valor_peca"));
                peca.setQuantidadeProduto(resultSet.getInt("quantidade_peca"));
                peca.setCodigoCategoriaPeca(resultSet.getInt("categoria_idcategoria"));
                peca.setCategoriaPeca(resultSet.getString("descricao_categoria"));
                listaPeca.add(peca);
             }
            preparedStatement.close();
            connection.disconnect();
                    
        } catch(Exception exception){
            Logger.getLogger(Peca.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
            return listaPeca;
    }
    
}