package EspecificacaoComponenteMaquina;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vrp19
 */
public class EspecificacaoComponenteMaquinaRowMapper implements RowMapper<EspecificacaoComponenteMaquina> {

    @Override
    public EspecificacaoComponenteMaquina mapRow(ResultSet rs, int rowSum) throws SQLException {
        
        EspecificacaoComponenteMaquina spec = new EspecificacaoComponenteMaquina();
        spec.setId_especificacao_componente_maquina(rs.getInt("id_especificacao_componente_maquina"));
        spec.setNumero_serial(rs.getString("numero_serial"));
        spec.setUso_maximo(rs.getFloat("uso_maximo"));
        spec.setFreq_maxima(rs.getFloat("freq_maxima"));
        
        return spec;
        
    }
    
}
