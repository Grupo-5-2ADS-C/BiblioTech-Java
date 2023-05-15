package SituacaoAlerta;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vrp19
 */
public class SituacaoAlertaRowMapper implements RowMapper<SituacaoAlerta> {

    @Override
    public SituacaoAlerta mapRow(ResultSet rs, int rowSum) throws SQLException {
        
        SituacaoAlerta situacao = new SituacaoAlerta();
        situacao.setId_situacao_alerta(rs.getInt("id_situacao"));
        situacao.setSituacao_alerta(rs.getString("situacao_alerta"));
        
        return situacao;
        
    }
    
}
