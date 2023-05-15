package Cargo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vrp19
 */
public class CargoRowMapper implements RowMapper<Cargo> {

    @Override
    public Cargo mapRow(ResultSet rs, int rowSum) throws SQLException {
        
        Cargo cargo = new Cargo();
        cargo.setId_cargo(rs.getInt("id_cargo"));
        cargo.setCargo(rs.getString("cargo"));
        
        return cargo;
        
    }
    
}
