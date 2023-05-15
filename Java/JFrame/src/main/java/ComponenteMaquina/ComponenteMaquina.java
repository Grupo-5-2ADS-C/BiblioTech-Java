package ComponenteMaquina;

/**
 *
 * @author vrp19
 */
public class ComponenteMaquina {
    
    private Integer id_componente_maquina;
    private String tipo;
    private String descricao;
    private String fabricante;

    public Integer getId_componente_maquina() {
        return id_componente_maquina;
    }

    public void setId_componente_maquina(Integer id_componente_maquina) {
        this.id_componente_maquina = id_componente_maquina;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public void sendToBD(){
    }
    
}
