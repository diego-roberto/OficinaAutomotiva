package dao;

import javax.swing.JOptionPane;

public class StoredMessage {
    
    
    //ERRO PADRAO
    public static void generalErrorMessage() {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro.", "ERROR",
                JOptionPane.ERROR_MESSAGE);
    }

    //ERRO SQL
    public static void sqlErrorMessage() {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro SQL.", "ERROR",
                JOptionPane.ERROR_MESSAGE);
    }

    //ERRO DE CAMPO VAZIO
    public static void emptyFieldErrorMessage() {
        JOptionPane.showMessageDialog(null, "Campo não pode ficar vazio.", "ERROR",
                JOptionPane.ERROR_MESSAGE);
    }

    //ERRO DE SELECAO DE ITEM
    public static void emptySelectionErrorMessage() {
        JOptionPane.showMessageDialog(null, "Selecione um item!", "ERROR",
                JOptionPane.ERROR_MESSAGE);
    }

    //ERRO DE REGISTRO NAO ENCONTRADO
    public static void notFoundErrorMessage() {
        JOptionPane.showMessageDialog(null, "Registro não encontrado ou inexistente.",
                "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    //ERRO DE COMPRIMENTO DE SENHA
    public static void passwordSizeErrorMessage() {
        JOptionPane.showMessageDialog(null, "Tamanho da senha incorreto.\n "
                + "O campo deve conter entre 4 e 12 dígitos.", "ERROR",
                JOptionPane.ERROR_MESSAGE);
    }

    //ERRO DE MATRICULA
    public static void enrollmentErrorMessage() {
        JOptionPane.showMessageDialog(null, "A matrícula compreende somente números.",
                "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    //ERRO DE USUARIO
    public static void enrollmentNotFoundErrorMessage() {
        JOptionPane.showMessageDialog(null, "Usuário não encontrado. Cheque suas credenciais.",
                "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    //ERRO DE USUARIO
    public static void validNumberErrorMessage() {
        JOptionPane.showMessageDialog(null, "A quantidade não pode ser nula ou negativa.",
                "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    //MENSAGEM DE SUCESSO
    public static void saveSuccessMessage() {
        JOptionPane.showMessageDialog(null, "Registro salvo com sucesso", "SUCESSO",
                JOptionPane.INFORMATION_MESSAGE);
    }

    //MENSAGEM DE MATRICULA
    public static void matriculaSaveSuccessMessage(Integer matricula) {
        JOptionPane.showMessageDialog(null, "Sua matrícula: " + matricula, "SUCESSO",
                JOptionPane.INFORMATION_MESSAGE);
    }
//MENSAGEM DE MATRICULA
    public static void underDevelopmentMessage() {
        JOptionPane.showMessageDialog(null, "Espaço em desenvolvimento.", "INFO",
                JOptionPane.INFORMATION_MESSAGE);
    }
    //LISTAGEM DE MEIO DE PAGAMENTO
    public static void paymentOption() {
        JOptionPane.showMessageDialog(null, "2 - DINHEIRO \n"
                + "3 - DEBITO \n"
                + "4 - CREDITO \n"
                + "5 - CHEQUE", "INFO",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
