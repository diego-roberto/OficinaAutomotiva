package entity;

import java.util.Date;

public class Entrada {

    private Integer codigoEntrada;
    private Double unitarioEntrada;
    private Double totalEntrada;
    private Integer quantidadeEntrada;
    private String funcionarioEntrada;
    private Integer codigoPecaEntrada;
    private String pecaEntrada;
    private Integer codigoFornecedorEntrada;
    private String fornecedorEntrada;
    private Date dataEntrada;

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Double getUnitarioEntrada() {
        return unitarioEntrada;
    }

    public void setUnitarioEntrada(Double unitarioEntrada) {
        this.unitarioEntrada = unitarioEntrada;
    }

    public Integer getCodigoPecaEntrada() {
        return codigoPecaEntrada;
    }

    public void setCodigoPecaEntrada(Integer codigoPecaEntrada) {
        this.codigoPecaEntrada = codigoPecaEntrada;
    }

    public Integer getCodigoFornecedorEntrada() {
        return codigoFornecedorEntrada;
    }

    public void setCodigoFornecedorEntrada(Integer codigoFornecedorEntrada) {
        this.codigoFornecedorEntrada = codigoFornecedorEntrada;
    }
    
    
    
    public Integer getCodigoEntrada() {
        return codigoEntrada;
    }

    public void setCodigoEntrada(Integer codigoEntrada) {
        this.codigoEntrada = codigoEntrada;
    }

    public Double getTotalEntrada() {
        return totalEntrada;
    }

    public void setTotalEntrada(Double totalEntrada) {
        this.totalEntrada = totalEntrada;
    }

    public Integer getQuantidadeEntrada() {
        return quantidadeEntrada;
    }

    public void setQuantidadeEntrada(Integer quantidadeCompra) {
        this.quantidadeEntrada = quantidadeCompra;
    }

    public String getFuncionarioEntrada() {
        return funcionarioEntrada;
    }

    public void setFuncionarioEntrada(String funcionarioEntrada) {
        this.funcionarioEntrada = funcionarioEntrada;
    }

    public String getPecaEntrada() {
        return pecaEntrada;
    }

    public void setPecaEntrada(String pecaEntrada) {
        this.pecaEntrada = pecaEntrada;
    }

    public String getFornecedorEntrada() {
        return fornecedorEntrada;
    }

    public void setFornecedorEntrada(String fornecedorEntrada) {
        this.fornecedorEntrada = fornecedorEntrada;
    }

}
