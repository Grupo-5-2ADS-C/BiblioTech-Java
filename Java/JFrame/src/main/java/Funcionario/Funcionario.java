package Funcionario;

/**
 *
 * @author vrp19
 */
public class Funcionario {
    
     private Integer id_funcionario;
     private String nome;
     private String email;
     private String celular;
     private Integer fk_biblioteca;
     private Integer fk_cargo;

    public Integer getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Integer getFk_biblioteca() {
        return fk_biblioteca;
    }

    public void setFk_biblioteca(Integer fk_biblioteca) {
        this.fk_biblioteca = fk_biblioteca;
    }

    public Integer getFk_cargo() {
        return fk_cargo;
    }

    public void setFk_cargo(Integer fk_cargo) {
        this.fk_cargo = fk_cargo;
    }
     
     public void sendToBD(){
    }
    
}
