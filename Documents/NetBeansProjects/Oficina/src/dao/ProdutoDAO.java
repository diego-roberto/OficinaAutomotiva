package dao;

import entity.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    //
    private ConnectionManager connection;
    
    //CONSTRUTOR
    public ProdutoDAO(){
        connection = new ConnectionManager();
    }
    
    //GET
    public ConnectionManager getConnection(){
        return this.connection;
    }
    
    //PESQUISAR
    public ResultSet consultar (){
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("");//O QUE FAZER
                        
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(null,"Nenhum registro foi encontrado.","ERRO", JOptionPane.ERROR_MESSAGE);
            }
            
            return resultSet;
                    
        } catch(Exception exception){
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
        
    }
    
    //PESQUISAR DESCRICAO
    public List<Produto> searchAll(String str) {
        List<Produto> listaProduto = new ArrayList<Produto>();
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("");
            
            preparedStatement.setString(1, "%"+str+"%");
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
             while (resultSet.next()) {
                Produto esseProduto = new Produto();
                esseProduto.setCodigoProduto(resultSet.getInt("codigo"));
                esseProduto.setDescricaoProduto(resultSet.getString("descricao"));
                esseProduto.setQuantidadeProduto(resultSet.getInt("quantidade"));
                esseProduto.setValorUnitarioProduto(resultSet.getDouble("valorUn"));
                esseProduto.setSubtotalProduto(resultSet.getDouble("subtotal"));
                listaProduto.add(esseProduto);
             }
            
            return listaProduto;
                    
        } catch(Exception exception){
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
        
    }
}