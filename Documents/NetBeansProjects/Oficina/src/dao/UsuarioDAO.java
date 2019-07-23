package dao;

import entity.Funcionario;
import entity.Servico;
import entity.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class UsuarioDAO {
    //CONEXAO
    private ConnectionManager connection;

    //CONSTRUTOR
    public UsuarioDAO() {
        connection = new ConnectionManager();
    }

    //GET
    public ConnectionManager getConnection() {
        return this.connection;
    }

    //SALVAR NOVO OU ALTERADO
    public boolean save(Usuario esseUsuario, Funcionario esseFuncionario) {
        if (esseUsuario.getMatriculaUsuario()== null) {
            return insert(esseUsuario, esseFuncionario);
        } else {
            return update(esseUsuario);
        }
    }

    //INSERIR NOVO REGISTRO
    public boolean insert(Usuario novoUsuario, Funcionario funcionario) {
        Integer novaMatricula = gerarMatricula();
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_insert_usuario(?, ?, ?, ?);"); //PRONTO
            preparedStatement.setInt(1, novaMatricula);
            preparedStatement.setString(2, novoUsuario.getSenhaUsuario());
            preparedStatement.setInt(3, novoUsuario.getNivelUsuario());
            preparedStatement.setString(4, novoUsuario.getNomeUsuario());            

            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.disconnect();
            StoredMessage.matriculaSaveSuccessMessage(novaMatricula);
            return true;
        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
            return false;
        } catch (Exception exception) {
            StoredMessage.generalErrorMessage();
            return false;
        }
    }

    //ALTERAR REGISTRO SELECIONADO
    public boolean update(Usuario usuario) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_update_servico(?, ?, ?);");       // PRONTO
            preparedStatement.setString(1, usuario.getSenhaUsuario());
            preparedStatement.setDouble(2, usuario.getNivelUsuario());
            preparedStatement.setInt(3, usuario.getMatriculaUsuario());

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
    public boolean delete(Servico esseServico) {
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_delete_servico(?)");                  //PRONTO
            preparedStatement.setInt(1, esseServico.getCodigoProduto());

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
        }
        return false;
    }

    //PESQUISA POR MATRICULA
    public Usuario searchByEnrollment(Integer essaMatricula, String essaSenha) {
        Usuario esseUsuario;
        try {
            connection.connect();
            PreparedStatement preparedStatement = connection.getConnection().
                    prepareStatement("CALL sp_search_usuario_enrollment(?, ?);");//ARRUMAR // fazer
            preparedStatement.setInt(1, essaMatricula);
            preparedStatement.setString(2, essaSenha);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            
            
            if (resultSet.next()) {
                esseUsuario = new Usuario();
                esseUsuario.setCodigoUsuario(resultSet.getInt("idusuario"));
                esseUsuario.setMatriculaUsuario(resultSet.getInt("matricula_usuario"));
                esseUsuario.setSenhaUsuario(resultSet.getString("senha_usuario"));
                esseUsuario.setNivelUsuario(resultSet.getInt("nivel_usuario"));
                esseUsuario.setNomeUsuario(resultSet.getString("nome_funcionario"));
                //esseUsuario.setCodigoFuncionario(Integer.parseInt("codigo_funcionario"));
                return esseUsuario;
            } else {
                return null;
            }
        } catch (SQLException sQLException) {
            StoredMessage.sqlErrorMessage();
            return null;
        }

    }
    //GERADOR DE MATRICULA
    public Integer gerarMatricula() {
        Random random = new Random();
        Integer novaMatricula;
        return novaMatricula = 100000 + random.nextInt(90000);
    }
    
    
}
