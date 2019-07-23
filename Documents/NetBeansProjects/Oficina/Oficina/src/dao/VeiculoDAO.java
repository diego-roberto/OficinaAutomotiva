package dao;

import entity.Veiculo;
import java.security.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VeiculoDAO {

    //CONEXAO
    private ConnectionManager connection;

    //CONSTRUTOR
    public VeiculoDAO() {
        connection = new ConnectionManager();
    }

    //GET
    public ConnectionManager getConnection() {
        return this.connection;
    }

    //Insere ou Altera, mas retorna true ou false se funcionou
//    public boolean salvar(Veiculo valida) {
//        if (valida.getCodigo() == 0) {
//            return insert(valida);
//        } else {
//            return update(valida);
//        }
//    }
    //INSERIR NOVO REGISTRO
    public boolean insert(Veiculo novoVeiculo) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_veiculo(?, ?, ?);");
                    //prepareStatement("INSERT INTO veiculo "
                    ///        + "(modelo_veiculo, placa_veiculo, cliente_codigo_cliente) "
                    //        + "VALUES (?, ?, ?)");
            preparedStatement.setString(1, novoVeiculo.getModeloVeiculo());
            preparedStatement.setString(2, novoVeiculo.getPlacaVeiculo());
            preparedStatement.setInt(3, novoVeiculo.getCodigoClienteVeiculo());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (Exception exception) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

    //ALTERAR REGISTRO SELECIONADO  -- deletar --
    public boolean update(Veiculo esseVeiculo) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().                    
                    prepareStatement("UPDATE Veiculo SET "
                            + "(codigo_veiculo = ?, modelo_veiculo = ?, placa_veiculo = ?, cliente_codigo_cliente = ?"
                            + " WHERE codigo_veiculo = ?");
            preparedStatement.setInt(1, esseVeiculo.getCodigoVeiculo());
            preparedStatement.setString(2, esseVeiculo.getModeloVeiculo());
            preparedStatement.setString(3, esseVeiculo.getPlacaVeiculo());
            preparedStatement.setInt(4, esseVeiculo.getCodigoClienteVeiculo());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;

        } catch (Exception exception) {
            Logger.getLogger(Veiculo.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

    //DELETAR REGISTRO SELECIONADO
    public boolean delete(Veiculo esseVeiculo) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_delete_veiculo(?)");

            preparedStatement.setInt(1, esseVeiculo.getCodigoVeiculo());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;

        } catch (Exception exception) {
            Logger.getLogger(Veiculo.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

    //PESQUISAR  -- deletar --
    public ResultSet search() {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("SELECT codigo_veiculo, modelo_veiculo, placa_veiculo, cliente_codigo_cliente"
                            + " FROM veiculo");

            ResultSet resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            return resultSet;

        } catch (Exception exception) {
            Logger.getLogger(Veiculo.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }

    }

    //PESQUISAR REGISTRO POR PROPRIETARIO/CLIENTE
    public List<Veiculo> searchVeiculoClienteCode(Integer cod) {//CODIGOOOOO
        List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_veiculo_cliente_code(?)");
                    //prepareStatement("SELECT idveiculo, modelo_veiculo, placa_veiculo, cliente_codigo_cliente"
                    //        + " FROM veiculo WHERE cliente_idcliente = ?");

            preparedStatement.setInt(1, cod);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Veiculo esseVeiculo = new Veiculo();
                esseVeiculo.setCodigoVeiculo(resultSet.getInt("idveiculo"));
                esseVeiculo.setModeloVeiculo(resultSet.getString("modelo_Veiculo"));
                esseVeiculo.setPlacaVeiculo(resultSet.getString("placa_veiculo"));
                esseVeiculo.setCodigoClienteVeiculo(resultSet.getInt("cliente_idcliente"));
                listaVeiculo.add(esseVeiculo);
            }

            return listaVeiculo;

        } catch (Exception exception) {
            Logger.getLogger(Veiculo.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }

    }
    //PESQUISAR VEICULO PELA PLACA
    public Veiculo searchVeiculoLicense(String essaPlaca){
        Veiculo esseVeiculo;
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_veiculo_license(?);");             //PRONTO
            preparedStatement.setString(1, essaPlaca);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                esseVeiculo = new Veiculo();
                esseVeiculo.setCodigoVeiculo(resultSet.getInt("idveiculo"));
                esseVeiculo.setModeloVeiculo(resultSet.getString("modelo_veiculo"));
                esseVeiculo.setPlacaVeiculo(essaPlaca);
                esseVeiculo.setCodigoClienteVeiculo(resultSet.getInt("cliente_idcliente"));                
                return esseVeiculo;
            } else {
                return null;
            }
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
            return null;
        }
    }

    //PESQUISAR TODOS  -- deletar --
    public List<Veiculo> searchAll() {
        List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("SELECT codigo_Veiculo, razao_Veiculo, cnpj_Veiculo, email_Veiculo, telefone_Veiculo"
                            + " FROM Veiculo");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Veiculo esseVeiculo = new Veiculo();
                esseVeiculo.setCodigoVeiculo(resultSet.getInt("codigo_veiculo"));
                esseVeiculo.setModeloVeiculo(resultSet.getString("modelo_Veiculo"));
                esseVeiculo.setPlacaVeiculo(resultSet.getString("placa_veiculo"));
                esseVeiculo.setCodigoClienteVeiculo(resultSet.getInt("cliente_codigo_cliente"));
                listaVeiculo.add(esseVeiculo);
            }
            preparedStatement.close();
            connection.disconnect();
        } catch (Exception exception) {
            Logger.getLogger(Veiculo.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
        return listaVeiculo;
    }

}
