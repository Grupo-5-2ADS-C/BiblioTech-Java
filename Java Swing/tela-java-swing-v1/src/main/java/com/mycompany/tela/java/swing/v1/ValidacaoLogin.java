package com.mycompany.tela.java.swing.v1;

/**
 *
 * @author viniciuspereira
 */
public class ValidacaoLogin {
    
    private Integer id;
    private String login;
    private String senha;

    public ValidacaoLogin(Integer id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    public ValidacaoLogin() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "ValidacaoLogin" + 
               "\nid=" + id + 
                "\nlogin=" + login + 
                "\nsenha=" + senha;
    }
    
}
