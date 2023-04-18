package com.mycompany.tela.java.swing.v1;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author viniciuspereira
 */
public class Conexao {
    
    private JdbcTemplate connection;
    
    public Conexao() {
        
        BasicDataSource dataSource = new BasicDataSource();
        
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        
        dataSource.setUrl("jdbc:mysql://localhost:3306/bibliotech");
        
        dataSource.setUsername("admin-bibliotech");
        
        dataSource.setPassword("#Gfgrupo5");
        
        this.connection = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return connection;
    }
    
}
