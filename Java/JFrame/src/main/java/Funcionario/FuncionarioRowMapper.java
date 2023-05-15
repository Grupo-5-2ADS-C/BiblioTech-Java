package Funcionario;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vrp19
 */
public class FuncionarioRowMapper implements RowMapper<Funcionario> {

    @Override
    public Funcionario mapRow(ResultSet rs, int rowSum) throws SQLException {
        
        Funcionario funcionario = new Funcionario();
        funcionario.setId_funcionario(rs.getInt("id_funcionario"));
        funcionario.setNome(rs.getString("nome"));
        funcionario.setEmail(rs.getString("email"));
        funcionario.setCelular(rs.getString("celular"));
        funcionario.setFk_biblioteca(rs.getInt("fk_biblioteca"));
        funcionario.setFk_cargo(rs.getInt("fk_cargo"));
        
        return funcionario;
        
    }
    
}
