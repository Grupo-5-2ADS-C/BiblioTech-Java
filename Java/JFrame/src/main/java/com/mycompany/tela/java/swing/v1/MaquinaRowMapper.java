/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tela.java.swing.v1;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author viniciuspereira
 */
public class MaquinaRowMapper implements RowMapper<Maquina> {
        @Override
        public Maquina mapRow(ResultSet rs, int rowSum) throws SQLException {
        Maquina maquina = new Maquina();
        maquina.setLogin(rs.getString("login"));
        maquina.setSenha(rs.getString("senha"));
        return maquina;
    }
}
