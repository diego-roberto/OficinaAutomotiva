package entity;

import java.util.Date;

public class Compra {

    private Integer codigoCompra;
    private Double totalCompra;
    private Integer quantidadeCompra;
    private String funcionarioCompra;
    private String pecaCompra;
    private String fornecedorCompra;
    private Date dataCompra;

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    
    
    public Integer getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(Integer codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public Double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public Integer getQuantidadeCompra() {
        return quantidadeCompra;
    }

    public void setQuantidadeCompra(Integer quantidadeCompra) {
        this.quantidadeCompra = quantidadeCompra;
    }

    public String getFuncionarioCompra() {
        return funcionarioCompra;
    }

    public void setFuncionarioCompra(String funcionarioCompra) {
        this.funcionarioCompra = funcionarioCompra;
    }

    public String getPecaCompra() {
        return pecaCompra;
    }

    public void setPecaCompra(String pecaCompra) {
        this.pecaCompra = pecaCompra;
    }

    public String getFornecedorCompra() {
        return fornecedorCompra;
    }

    public void setFornecedorCompra(String fornecedorCompra) {
        this.fornecedorCompra = fornecedorCompra;
    }

}
