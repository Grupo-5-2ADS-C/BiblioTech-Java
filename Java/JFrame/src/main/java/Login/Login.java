package Login;

/**
 *
 * @author vrp19
 */
public class Login {
    
    private Integer id_login;
    private String login;
    private String senha;
    private Integer fk_biblioteca;
    private Integer fk_funcionario;
    private Integer fk_biblioteca_funcionario;

    public Integer getId_login() {
        return id_login;
    }

    public void setId_login(Integer id_login) {
        this.id_login = id_login;
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

    public Integer getFk_funcionario() {
        return fk_funcionario;
    }

    public void setFk_funcionario(Integer fk_funcionario) {
        this.fk_funcionario = fk_funcionario;
    }

    public Integer getFk_biblioteca_funcionario() {
        return fk_biblioteca_funcionario;
    }

    public void setFk_biblioteca_funcionario(Integer fk_biblioteca_funcionario) {
        this.fk_biblioteca_funcionario = fk_biblioteca_funcionario;
    }
    
    public void sendToBD(){
    }
    
}
