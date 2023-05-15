package ComponenteMaquina;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vrp19
 */
public class ComponenteMaquinaRowMapper implements RowMapper<ComponenteMaquina> {

    @Override
    public ComponenteMaquina mapRow(ResultSet rs, int rowSum) throws SQLException {
       
        ComponenteMaquina componente = new ComponenteMaquina();
        componente.setId_componente_maquina(rs.getInt("id_componente"));
        componente.setTipo(rs.getString("tipo"));
        componente.setDescricao(rs.getString("descricao"));
        componente.setFabricante(rs.getString("fabricante"));
        
        return componente;
        
    }
    
}
