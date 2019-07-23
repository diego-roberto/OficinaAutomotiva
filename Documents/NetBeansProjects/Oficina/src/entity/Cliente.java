package entity;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private Integer codigoCliente;
    private String nomeRazaoCliente;
    private String cpfCnpjCliente;
    private String telefoneCliente;
    private String tipoCliente;
    private Date dataCadastroCliente;
    private List<Veiculo> listaVeiculoCliente;

    //CONSTRUTOR
    public Cliente() {
        listaVeiculoCliente = new ArrayList<Veiculo>();
    }

    //GET & SET
    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeRazaoCliente() {
        return nomeRazaoCliente;
    }

    public void setNomeRazaoCliente(String nomeRazaoCliente) {
        this.nomeRazaoCliente = nomeRazaoCliente;
    }

    public String getCpfCnpjCliente() {
        return cpfCnpjCliente;
    }

    public void setCpfCnpjCliente(String cpf_cnpj) {
        this.cpfCnpjCliente = cpf_cnpj;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setTipoCliente(Integer tipoCliente) {
        if (tipoCliente == 0) {
            this.tipoCliente = "PF";
        } else if(tipoCliente == 1){
            this.tipoCliente = "PJ";
        }
    }

    public Date getDataCadastroCliente() {
        return dataCadastroCliente;
    }

    public void setDataCadastroCliente(Date dataCadastroCliente) {
        this.dataCadastroCliente = dataCadastroCliente;
    }

    public List<Veiculo> getListaVeiculoCliente() {
        return listaVeiculoCliente;
    }

    public void setListaVeiculoCliente(List<Veiculo> listaVeiculoCliente) {
        this.listaVeiculoCliente = listaVeiculoCliente;
    }

}
