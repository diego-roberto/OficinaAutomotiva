package entity;

import javax.swing.JOptionPane;

 
public class Categoria {

    private Integer codigoCategoria;
    private String descricaoCategoria;

    //MASCARA DE SAIDA
    @Override
    public String toString() {
        return "" + this.descricaoCategoria;
    }
    
    //GET & SET
    public int getCodigoCategoria() {
        return this.codigoCategoria;
    }

    public void setCodigoCategoria(int codigo) {
        this.codigoCategoria = codigo;
    }
    
    public void setCodigoCategoria(String codigo) {
        try{
            this.codigoCategoria = Integer.parseInt(codigo);
            
        }catch(NumberFormatException numberFormatException){
            JOptionPane.showMessageDialog(null, "Informe um número inteiro");
        }
        
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }
    
}