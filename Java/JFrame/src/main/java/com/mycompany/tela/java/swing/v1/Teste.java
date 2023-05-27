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

        
                List<ComponenteMaquina> comp = con.query("select id_componente_maquina from componente_maquina order by id_componente_maquina desc;", new BeanPropertyRowMapper(ComponenteMaquina.class));
                ComponenteMaquina resultComp = comp.get(0);
                ComponenteMaquina resultComp1 = comp.get(1);
                ComponenteMaquina resultComp2 = comp.get(2);
                
                System.out.println(resultComp.getId_componente_maquina());  
                System.out.println(resultComp1.getId_componente_maquina());    
                System.out.println(resultComp2.getId_componente_maquina());    






    }

}
