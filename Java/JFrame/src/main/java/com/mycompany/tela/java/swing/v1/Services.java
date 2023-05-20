/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tela.java.swing.v1;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;
import ComponenteMaquina.*;
import java.util.List;

/**
 *
 * @author wesley
 */
public class Services {
    Looca looca = new Looca();
    Hardware hardware = new Hardware();
    Sistema sistema = new Sistema();
    Memoria memoria = new Memoria();
    DiscoGrupo disco = looca.getGrupoDeDiscos();
    Processador processador = looca.getProcessador();
    ProcessoGrupo processos = looca.getGrupoDeProcessos(); 
    
    
    
    public Hardware enviarDados(){
        
        
      // Total processos 
      
    hardware.setTotal_processos(looca.getGrupoDeProcessos().getTotalProcessos());
        
    String convertToString = String.format("%.2f", processador.getUso()).replace(",", ".");
    
    // Inicio processador
    
    hardware.setUsoCPU(Double.valueOf(convertToString));
    hardware.setFrequenciaCPU(Double.valueOf(processador.getFrequencia()) / 1000000000.00);
    
    // fim processador
    
    // Inicio ram
        hardware.setUsoRAM(Double.valueOf(memoria.getEmUso() / 1048576));
    // fim ram
    
    // Inicio disco
    
        //Criação do gerenciador
        DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();

        //Obtendo lista de discos a partir do getter
        List<Volume> volume = grupoDeDiscos.getVolumes();
    
    //fim disco
    
    // Inicio rede
    
    
    
    // fim rede
    
    
    
        return hardware;
    }
   
    }
