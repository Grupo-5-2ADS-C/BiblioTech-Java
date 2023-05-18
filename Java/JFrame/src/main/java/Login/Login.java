package Login;

/**
 *
 * @author vrp19
 */
public class Login {
    
   protected Integer id_login;
   protected String login;
   protected String senha;
   protected Integer fk_biblioteca;
   protected Integer fk_funcionario;
   protected Integer fk_biblioteca_funcionario;

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
