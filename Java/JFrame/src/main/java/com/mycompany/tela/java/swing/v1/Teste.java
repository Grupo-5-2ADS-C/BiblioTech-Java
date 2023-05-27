package com.mycompany.tela.java.swing.v1;

import ComponenteMaquina.ComponenteMaquina;
import EspecificacaoComponenteMaquina.EspecificacaoComponenteMaquina;
import Maquina.Maquina;
import RedeTable.*;
import com.github.britooo.looca.api.group.rede.Rede;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author viniciuspereira
 */
public class Teste {

    public static void main(String[] args) {

        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConnection();
        Services d = new Services();
        Hardware hardware = new Hardware();

        System.out.println(d.getUsoDisco());
        System.out.println(d.getFreqDisco());

    }

}
