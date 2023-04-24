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
        
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        dataSource.setUrl("jdbc:sqlserver://svr-bibliotech.database.windows.net:1433;databaName=bibliotech");
        
        dataSource.setUsername("admin-bibliotech");
        
        dataSource.setPassword("#Gfgrupo5");
        
        this.connection = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return connection;
    }
    
}
