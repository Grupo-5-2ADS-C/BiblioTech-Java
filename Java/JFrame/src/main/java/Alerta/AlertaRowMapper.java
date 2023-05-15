package Alerta;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vrp19
 */
public class AlertaRowMapper implements RowMapper<Alerta> {

    @Override
    public Alerta mapRow(ResultSet rs, int rowSum) throws SQLException {
        
        Alerta alerta = new Alerta();
        alerta.setId_alerta(rs.getInt("id_alerta"));
        alerta.setDt_alerta(rs.getDate("dt_alerta"));
        alerta.setTexto_aviso(rs.getString("texto_aviso"));
        alerta.setFk_metrica(rs.getInt("fk_metrica"));
        alerta.setFk_tipo_alerta(rs.getInt("fk_tipo_alerta"));
        alerta.setFk_situacao_alerta(rs.getInt("fk_situacao_alerta"));
        
        return alerta;
                
    }
    
}
