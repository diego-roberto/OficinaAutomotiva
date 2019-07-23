package dao;

import entity.Cliente;
import java.security.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO {

    //CONEXAO
    private ConnectionManager connection;

    //CONSTRUTOR
    public ClienteDAO() {
        connection = new ConnectionManager();
    }

    //GET
    public ConnectionManager getConnection() {
        return this.connection;
    }

    //METODOS    
    public boolean save(Cliente esseCliente) {
        if (esseCliente.getCodigoCliente() == null) {
            return insert(esseCliente);
        } else {
            return update(esseCliente);
        }
    }

    //INSERIR NOVO CLIENTE
    public boolean insert(Cliente novoCliente) {        
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_cliente(?, ?, ?, ?);"); //PRONTO
            preparedStatement.setString(1, novoCliente.getNomeRazaoCliente());
            preparedStatement.setString(2, novoCliente.getCpfCnpjCliente());
            preparedStatement.setString(3, novoCliente.getTelefoneCliente());
            preparedStatement.setString(4, novoCliente.getTipoCliente());

            preparedStatement.execute();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;
        } catch (Exception exception) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

    //ALTERAR CLIENTE SELECIONADO
    public boolean update(Cliente esseCliente) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_update_cliente(?, ?, ?, ?, ?);");//PRONTO
            preparedStatement.setString(1, esseCliente.getNomeRazaoCliente());
            preparedStatement.setString(2, esseCliente.getCpfCnpjCliente());
            preparedStatement.setString(3, esseCliente.getTelefoneCliente());
            preparedStatement.setString(4, esseCliente.getTipoCliente());
            preparedStatement.setInt(5, esseCliente.getCodigoCliente());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;

        } catch (Exception exception) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, exception);
            JOptionPane.showMessageDialog(null, "Não foi possível realizar ação.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    //EXCLUIR CLIENTE SELECIONADO -- deletar
    public boolean delete(Cliente esseCliente) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("DELETE FROM cliente WHERE codigo = ?");

            preparedStatement.setInt(1, esseCliente.getCodigoCliente());

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            return true;

        } catch (Exception exception) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

    //CONSULTA -- deletar
    public ResultSet search() {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("SELECT codigo_cliente, nome_razao_cliente, cpf_cnpj_cliente, telefone_cliente, tipo_cliente, data_cadastro_cliente"
                            + " FROM cliente");

            ResultSet resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            return resultSet;
        } catch (Exception exception) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }

    }

    //PESQUISA POR NOME
    public Cliente searchClienteName(String nomeRazaoCliente) {
        Cliente esseCliente;
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_cliente_name(?);");             //PRONTO
            preparedStatement.setString(1, "%" + nomeRazaoCliente + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                esseCliente = new Cliente();
                esseCliente.setCodigoCliente(resultSet.getInt("idcliente"));
                esseCliente.setNomeRazaoCliente(resultSet.getString("nome_razao_cliente"));
                esseCliente.setCpfCnpjCliente(resultSet.getString("cpf_cnpj_cliente"));
                esseCliente.setTelefoneCliente(resultSet.getString("telefone_cliente"));
                esseCliente.setTipoCliente(resultSet.getString("tipo_cliente"));
                esseCliente.setDataCadastroCliente(resultSet.getDate("data_cadastro_cliente"));
                return esseCliente;
            } else {
                return null;
            }
        } catch (Exception exception) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }

    }
    //FAZER BUSCA POR CODIGO -- PROCEDURE PRONTA sp_search_cliente_code
    
    //LISTAGEM COMPLETA
    public List<Cliente> searchAllCliente() {
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().       //pronto
                    prepareStatement("CALL sp_search_cliente_all();");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Cliente esseCliente = new Cliente();
                esseCliente.setCodigoCliente(resultSet.getInt("idcliente"));
                esseCliente.setNomeRazaoCliente(resultSet.getString("nome_razao_cliente"));
                esseCliente.setCpfCnpjCliente(resultSet.getString("cpf_cnpj_cliente"));
                esseCliente.setTelefoneCliente(resultSet.getString("telefone_cliente"));
                esseCliente.setTipoCliente(resultSet.getString("tipo_cliente"));
                esseCliente.setDataCadastroCliente(resultSet.getDate("data_cadastro_cliente"));
                listaCliente.add(esseCliente);
            }
            preparedStatement.close();
            connection.disconnect();

        } catch (Exception exception) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, exception);
            return null;
        }
        return listaCliente;
    }

}
