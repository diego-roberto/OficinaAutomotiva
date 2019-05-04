package financeiro;

//@autor Diego Roberto, Francisco Miranda, João Carlos
 
public class OrdemServico {

    private String descricao, resolucao, formaPagamento;
    private Integer dataEntrada, dataConclusao;
    private Double valorFinal, valorSubtotal;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Integer getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Integer dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Integer getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Integer dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
        
}
