package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class RelatorioDAO {
    //CONEXAO
    private ConnectionManager connection;
    
    //CONSTRUTOR
    public RelatorioDAO(){
        connection = new ConnectionManager();
    }
    
    //GET
    private ConnectionManager getConnection(){
        return this.connection;
    }
    
    //DAOs
    //BALANCO - TOTAL
    public ResultSet balancoTotalQuery(){
        ResultSet resultado = null;
        try{
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL procedure_balanco_total;");
            resultado = preparedStatement.getResultSet();
        }catch(Exception exception){
            JOptionPane.showMessageDialog(null, "Exception em 'balanco_total_query'","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
}
