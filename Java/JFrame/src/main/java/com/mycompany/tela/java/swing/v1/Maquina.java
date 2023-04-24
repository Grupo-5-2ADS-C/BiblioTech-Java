package com.mycompany.tela.java.swing.v1;

/**
 *
 * @author viniciuspereira
 */
public class Maquina {
    
    private Integer id;
    private String sistema_operacional;
    private String fabricante;
    private String arquitetura;
    private String setor;
    private String login;
    private String senha;
    private Integer fk_biblioteca;

    public Maquina(Integer id, String sistema_operacional, String fabricante, String arquitetura, String setor, String login, String senha, Integer fk_biblioteca) {
        this.id = id;
        this.sistema_operacional = sistema_operacional;
        this.fabricante = fabricante;
        this.arquitetura = arquitetura;
        this.setor = setor;
        this.login = login;
        this.senha = senha;
        this.fk_biblioteca = fk_biblioteca;
    }

    public Maquina() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSistema_operacional() {
        return sistema_operacional;
    }

    public void setSistema_operacional(String sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getArquitetura() {
        return arquitetura;
    }

    public void setArquitetura(String arquitetura) {
        this.arquitetura = arquitetura;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getFk_biblioteca() {
        return fk_biblioteca;
    }

    public void setFk_biblioteca(Integer fk_biblioteca) {
        this.fk_biblioteca = fk_biblioteca;
    }

    @Override
    public String toString() {
        return "Maquina{" + 
                "id=" + id + 
                ", sistema_operacional=" + sistema_operacional 
                + ", fabricante=" + fabricante + 
                ", arquitetura=" + arquitetura + 
                ", setor=" + setor + 
                ", login=" + login + 
                ", senha=" + senha + 
                ", fk_biblioteca=" + fk_biblioteca + '}';
    }

    
    
}
