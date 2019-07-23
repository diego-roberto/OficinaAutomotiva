package entity;

public class Fornecedor {

    private Integer codigoFornecedor;
    private String razaoFornecedor;
    private String cnpjFornecedor;
    private String emailFornecedor;
    private String telefoneFornecedor;

    //CONSTRUTOR
    public Fornecedor() {
    }

    public Fornecedor(Integer codigo, String razao, String cnpj, String email, String telefone) {
        this.codigoFornecedor = codigo;
        this.razaoFornecedor = razao;
        this.cnpjFornecedor = cnpj;
        this.emailFornecedor = email;
        this.telefoneFornecedor = telefone;
    }

    @Override
    public String toString() {
        return "" + getRazaoFornecedor();
    }

    //GET & SET
    public String getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(String telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public Integer getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(Integer codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getRazaoFornecedor() {
        return razaoFornecedor;
    }

    public void setRazaoFornecedor(String razaoFornecedor) {
        this.razaoFornecedor = razaoFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

}
