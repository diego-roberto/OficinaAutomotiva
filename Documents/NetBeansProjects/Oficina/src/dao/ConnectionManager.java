package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionManager {
    
    //CONNECTION ITSELF
    private static Connection connection;
    
    //GET CONNECTION
    public Connection getConnection(){
        return connection;
    }

    //CONNECTING
    public static Connection connect() {
        String conexao = "jdbc:mysql://127.0.0.1/oficina";
        String user = "root";
        String password = "";
            
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(conexao, user, password);
            connection.setAutoCommit(false);
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            return connection;
        } catch (ClassNotFoundException classNotFoundException) {
            JOptionPane.showMessageDialog(null, "1");
            return null;
        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, "2"+sqlException.getStackTrace());
            return null;
        }
    }

    //DISCONNECTING
    public Boolean disconnect() {
        try {
            connection.close();
        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, sqlException.getStackTrace());
            return false;
        }
        return true;
    }

    //COMMITTING
    public Boolean commit() {
        try {
            connection.commit();
        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, sqlException.getStackTrace());
            return false;
        }
        return true;
    }

    //CANCELLING
    public static Boolean cancel() {
        try {
            connection.rollback();
        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, sqlException.getStackTrace());
            return null;
        }
        return true;
    }

}
