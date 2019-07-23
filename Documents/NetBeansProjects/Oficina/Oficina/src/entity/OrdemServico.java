package entity;

import java.sql.Date;

public class OrdemServico {
    
    private Integer codigoOrdem;
    private String resolucao;
    private Date dataEntrada;
    private Date dataConclusao;
    private Double valorTotal;
    private Integer formaPagamento;
    private Integer status;
    private Integer codigoFuncionario;
    private Integer codigoCliente;
    private String placaVeiculoOrdem;

    public OrdemServico() {
        //pode inicializar trazendo o nome do cliente e/ou funcionario em outro(s) atributo(s) String
    }

    public String getPlacaVeiculoOrdem() {
        return placaVeiculoOrdem;
    }

    public void setPlacaVeiculoOrdem(String placaVeiculoOrdem) {
        this.placaVeiculoOrdem = placaVeiculoOrdem;
    }
    
    public Integer getCodigoOrdem() {
        return codigoOrdem;
    }

    public void setCodigoOrdem(Integer codigoOrdem) {
        this.codigoOrdem = codigoOrdem;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Integer formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(Integer codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
            
}