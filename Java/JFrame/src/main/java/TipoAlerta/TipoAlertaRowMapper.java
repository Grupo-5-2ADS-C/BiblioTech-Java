package TipoAlerta;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vrp19
 */
public class TipoAlertaRowMapper implements RowMapper<TipoAlerta> {

    @Override
    public TipoAlerta mapRow(ResultSet rs, int rowSum) throws SQLException {
        
        TipoAlerta tipo = new TipoAlerta();
        tipo.setId_tipo_alerta(rs.getInt("id_tipo_alerta"));
        tipo.setTipo_alerta(rs.getString("tipo_alerta"));
        
        return tipo;
        
    }
    
}
