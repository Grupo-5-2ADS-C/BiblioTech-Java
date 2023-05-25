package com.mycompany.tela.java.swing.v1;

import ComponenteMaquina.ComponenteMaquina;
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

        List<ComponenteMaquina> comp = con.query("select id_componente_maquina from componente_maquina order by id_componente_maquina desc;", new BeanPropertyRowMapper(ComponenteMaquina.class));
        List<Rede> searchRede = con.query("select id_rede from rede order by id_rede desc", new BeanPropertyRowMapper(Rede.class));

        ComponenteMaquina resultComp = comp.get(0);
        Rede resultRede = searchRede.get(0);

        System.out.println(String.format("%d", resultComp.getId_componente_maquina()));
        System.out.println(String.format("%s", resultRede.getGrupoDeInterfaces()));

    }

}
