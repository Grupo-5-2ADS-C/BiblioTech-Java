package Biblioteca;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vrp19
 */
public class BibliotecaRowMapper implements RowMapper<Biblioteca> {

    @Override
    public Biblioteca mapRow(ResultSet rs, int rowSum) throws SQLException {
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setId_biblioteca(rs.getInt("id_biblioteca"));
        biblioteca.setNome(rs.getString("nome"));
        biblioteca.setCnpj(rs.getString("cnpj"));
        biblioteca.setTelefone(rs.getString("telefone"));
        biblioteca.setEmail(rs.getString("email"));
        
        return biblioteca;
        
    }

}
