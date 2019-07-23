package entity;
public class Usuario {
    private Integer codigoUsuario;
    private Integer matriculaUsuario;
    private String senhaUsuario;
    private Integer nivelUsuario;
    private Integer codigoFuncionario;
    private String nomeUsuario;
    
    //GET & SET
    public Integer getCodigoUsuario() {    
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {    
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getMatriculaUsuario() {
        return matriculaUsuario;
    }

    public void setMatriculaUsuario(Integer matriculaUsuario) {
        this.matriculaUsuario = matriculaUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Integer getNivelUsuario() {
        return nivelUsuario;
    }

    public void setNivelUsuario(Integer nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }

    public Integer getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(Integer codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
}
