package Endereco;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vrp19
 */
public class EnderecoRowMapper implements RowMapper<Endereco> {

    @Override
    public Endereco mapRow(ResultSet rs, int rowSum) throws SQLException {
        
        Endereco endereco = new Endereco();
        endereco.setId_endereco(rs.getInt("id_endereco"));
        endereco.setLogradouro(rs.getString("logradouro"));
        endereco.setBairro(rs.getString("bairro"));
        endereco.setCidade(rs.getString("cidade"));
        endereco.setNumero(rs.getString("numero"));
        endereco.setComplemento(rs.getString("complemento"));
        endereco.setFk_biblioteca(rs.getInt("fk_biblioteca"));
        
        return endereco;
        
    }
    
    
}
