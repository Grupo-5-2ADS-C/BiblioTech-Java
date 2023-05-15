package EspecificacaoComponenteMaquina;

/**
 *
 * @author vrp19
 */
public class EspecificacaoComponenteMaquina {
    
    private Integer id_especificacao_componente_maquina;
    private String numero_serial;
    private Float uso_maximo;
    private Float freq_maxima;

    public Integer getId_especificacao_componente_maquina() {
        return id_especificacao_componente_maquina;
    }

    public void setId_especificacao_componente_maquina(Integer id_especificacao_componente_maquina) {
        this.id_especificacao_componente_maquina = id_especificacao_componente_maquina;
    }

    public String getNumero_serial() {
        return numero_serial;
    }

    public void setNumero_serial(String numero_serial) {
        this.numero_serial = numero_serial;
    }

    public Float getUso_maximo() {
        return uso_maximo;
    }

    public void setUso_maximo(Float uso_maximo) {
        this.uso_maximo = uso_maximo;
    }

    public Float getFreq_maxima() {
        return freq_maxima;
    }

    public void setFreq_maxima(Float freq_maxima) {
        this.freq_maxima = freq_maxima;
    }
    
    public void sendToBD(){
    }
    
}
