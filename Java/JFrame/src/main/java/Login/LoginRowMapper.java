package Login;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vrp19
 */
public class LoginRowMapper implements RowMapper<Login> {

    @Override
    public Login mapRow(ResultSet rs, int rowSum) throws SQLException {
        
        Login login = new Login();
        login.setId_login(rs.getInt("id_login"));
        login.setLogin(rs.getString("login"));
        login.setSenha(rs.getString("senha"));
        login.setFk_funcionario(rs.getInt("fk_funcionario"));
        login.setFk_biblioteca(rs.getInt("fk_biblioteca"));
        login.setFk_biblioteca_funcionario(rs.getInt("fk_biblioteca_funcionario"));
        
        return login;
        
    }
    
}
