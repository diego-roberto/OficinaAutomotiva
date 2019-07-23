package entity;

public class Produto {
    
    //este objeto vai ser listado na tabela do PDV e vai possuir informações de tabelas de Peça e Serviço
    
    private Integer codigoProduto;
    private String descricaoProduto;
    private Integer quantidadeProduto;
    private Double valorUnitarioProduto;
    private Double subtotalProduto;    //este campo vai ser calculado no banco ( valorUnitarioProduto * quantidadeProduto )
    private Integer quantidadePdv;
    private Integer tipoProduto;
    //CONSTRUTOR
    public Produto() {
    }
    
    //GET & SET
    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public Integer getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(Integer tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    

    public Integer getQuantidadePdv() {
        return quantidadePdv;
    }

    public void setQuantidadePdv(Integer quantidadePdv) {
        this.quantidadePdv = quantidadePdv;
    }
    

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Double getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public void setValorUnitarioProduto(Double valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
    }

    public Double getSubtotalProduto() {
        return subtotalProduto;
    }

    public void setSubtotalProduto(Double subtotalProduto) {
        this.subtotalProduto = subtotalProduto;
    }
    
}
