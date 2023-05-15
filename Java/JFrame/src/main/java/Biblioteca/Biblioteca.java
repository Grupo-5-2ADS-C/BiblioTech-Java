package Biblioteca;

import com.mycompany.tela.java.swing.v1.Conexao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author vrp19
 */
public class Biblioteca {
    
    Conexao conexao = new Conexao();
    JdbcTemplate con = new JdbcTemplate();
    
    private Integer id_biblioteca;
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;

    public Conexao getConexao() {
        return conexao;
    }

    public void setConexao(Conexao conexao) {
        this.conexao = conexao;
    }

    public JdbcTemplate getCon() {
        return con;
    }

    public void setCon(JdbcTemplate con) {
        this.con = con;
    }

    public Integer getId_biblioteca() {
        return id_biblioteca;
    }

    public void setId_biblioteca(Integer id_biblioteca) {
        this.id_biblioteca = id_biblioteca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void sendToBD(){
    }
    
}
