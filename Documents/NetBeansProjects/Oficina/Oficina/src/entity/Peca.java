package entity;

public class Peca extends Produto {

    private String categoriaPeca;
    private Integer codigoCategoriaPeca;

    //CONSTRUTOR
    public Peca() {
    }

    //MASCARA DE SAIDA
    @Override
    public String toString() {
        return "" + super.getDescricaoProduto();
    }

    //GET & SET
    public Integer getCodigoCategoriaPeca() {
        return codigoCategoriaPeca;
    }

    public void setCodigoCategoriaPeca(Integer codigoCategoriaPeca) {
        this.codigoCategoriaPeca = codigoCategoriaPeca;
    }

    public String getCategoriaPeca() {
        return categoriaPeca;
    }

    public void setCategoriaPeca(String categoriaPeca) {
        this.categoriaPeca = categoriaPeca;
    }

}
