package entity;

public class Veiculo {

    private Integer codigoVeiculo;
    private String modeloVeiculo;
    private String placaVeiculo;
    private Integer codigoClienteVeiculo;

    //CONSTRUTOR
    public Veiculo() {
    }
    
    //MASCARA DE SAIDA
    @Override
    public String toString(){
        return "" + this.modeloVeiculo + " - " + this.placaVeiculo;
    }
    
    //GET & SET
    public Integer getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(Integer codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public Integer getCodigoClienteVeiculo() {
        return codigoClienteVeiculo;
    }

    public void setCodigoClienteVeiculo(Integer codigoClienteVeiculo) {
        this.codigoClienteVeiculo = codigoClienteVeiculo;
    }
    
}