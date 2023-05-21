package Metrica;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vrp19
 */
public class MetricaRowMapper implements RowMapper<Metrica> {

    @Override
    public Metrica mapRow(ResultSet rs, int rowSum) throws SQLException {
        
        Metrica metrica = new Metrica();
        
        metrica.setId_metrica(rs.getInt("id_metrica"));
        metrica.setUso(rs.getDouble("uso"));
        metrica.setFrequencia(rs.getDouble("frequencia"));
        metrica.setFk_especificacao(rs.getInt("especificacao"));
        metrica.setFk_componente_maquina(rs.getInt("fk_componente_maquina"));
        metrica.setFk_maquina(rs.getInt("fk_maquina"));
        
        return metrica;
        
    }
}
