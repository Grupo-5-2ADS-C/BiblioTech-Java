package com.mycompany.tela.java.swing.v1;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author viniciuspereira
 */
public class Hardware {
     Conexao conexao = new Conexao();
     JdbcTemplate con = conexao.getConnection();

    private Integer id;
    private Integer fk_componente;
    private String tipo;
    private Double usoCPU;
    private Double frequenciaCPU;
    private Double usoRAM;
    private Double frequenciaRAM;
    private Double usoDISCO;
    private Double frequenciaDISCO;
    private Integer total_processos;
    private String login;
    private String senha;
    
    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setUsoCPU(Double uso) {
        this.usoCPU = uso;
    }

    public void setFrequenciaCPU(Double frequencia) {
        this.frequenciaCPU = frequencia;
    }

    public Double getUso() {
        return usoCPU;
    }

    public Double getUsoRAM() {
        return usoRAM;
    }

    public void setUsoRAM(Double usoRAM) {
        this.usoRAM = usoRAM;
    }

    public Double getFrequenciaRAM() {
        return frequenciaRAM;
    }

    public void setFrequenciaRAM(Double frequenciaRAM) {
        this.frequenciaRAM = frequenciaRAM;
    }

    public Double getUsoDISCO() {
        return usoDISCO;
    }

    public void setUsoDISCO(Double usoDISCO) {
        this.usoDISCO = usoDISCO;
    }

    public Double getFrequenciaDISCO() {
        return frequenciaDISCO;
    }

    public void setFrequenciaDISCO(Double frequenciaDISCO) {
        this.frequenciaDISCO = frequenciaDISCO;
    }

    
    public Double getFrequencia() {
        return frequenciaCPU;
    }

    public Integer getTotal_processos() {
        return total_processos;
    }

    public void setTotal_processos(Integer total_processos) {
        this.total_processos = total_processos;
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
    
    
    public void sendToBD(){
    }
    
}
