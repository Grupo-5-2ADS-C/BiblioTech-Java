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
public class HardwareRowMapper implements RowMapper<Hardware> {
        @Override
        public Hardware mapRow(ResultSet rs, int rowSum) throws SQLException {
        Hardware hardware = new Hardware();
        hardware.setLogin(rs.getString("login"));
        hardware.setSenha(rs.getString("senha"));
        return hardware;
    }
}
