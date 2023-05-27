package com.mycompany.tela.java.swing.v1;

import RedeTable.RedeTable;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.rede.Rede;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import com.github.britooo.looca.api.group.rede.RedeInterfaceGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import oshi.hardware.HWDiskStore;

/**
 *
 * @author wesley
 */
public class Services {
    
    Looca looca = new Looca();
    Hardware hardware = new Hardware();
    Sistema sistema = new Sistema();
    Memoria memoria = new Memoria();
    DiscoGrupo discoGroup = looca.getGrupoDeDiscos();
    Volume volumeA = discoGroup.getVolumes().get(0);
    Disco disco = discoGroup.getDiscos().get(0);
    Rede rede = looca.getRede();
    RedeInterfaceGroup gruposDeInterface = rede.getGrupoDeInterfaces();
    List<RedeInterface> interfaces = gruposDeInterface.getInterfaces();
    List<RedeInterface> ListRedesComDados = interfaces.stream().filter(
        rede -> rede.getBytesEnviados() > 0 && rede.getBytesRecebidos() > 0).toList();
    RedeInterface redeDaVez = ListRedesComDados.get(0);
    Processador processador = looca.getProcessador();
    ProcessoGrupo processos = looca.getGrupoDeProcessos(); 
    RedeTable redeTable = new RedeTable();
    
    public String getUsoDisco() {
        return String.format("%.2f",(((volumeA.getTotal().doubleValue() - volumeA.getDisponivel().doubleValue())
               * 100.0) / volumeA.getTotal())).replace(",", ".");
    }
    
    public String getFreqDisco() {
        return String.format("%.2f", disco.getBytesDeEscritas().doubleValue() / 1073741824).replace(",", ".");
    }
    
     private static Double byteConverterMega(long bytes){
        return (double) bytes / (1024 * 1024);
    }
     

    public Double getDownload() throws InterruptedException {
        long bytesRecebidosA = redeDaVez.getBytesRecebidos();
        TimeUnit.SECONDS.sleep(1);
        long bytesRecebidosB = redeDaVez.getBytesRecebidos();
        long byteRecS = bytesRecebidosB - bytesRecebidosA;
        return byteConverterMega(byteRecS);
    }

    public Double getUpload() throws InterruptedException{
        long bytesEnviadosA = redeDaVez.getBytesEnviados();
        TimeUnit.SECONDS.sleep(1);
        long bytesEnviadosB = redeDaVez.getBytesEnviados();
        long bytesEnvS = bytesEnviadosB - bytesEnviadosA;
        return byteConverterMega(bytesEnvS);

    }
    
    public Hardware enviarDados(){
        
        
      // Total processos 
      
    hardware.setTotal_processos(looca.getGrupoDeProcessos().getTotalProcessos());
        
    String convertToString = String.format("%.2f", processador.getUso()).replace(",", ".");
    
    // Inicio processador
    
    hardware.setUsoCPU(Double.valueOf(convertToString));
    hardware.setFrequenciaCPU(Double.valueOf(processador.getFrequencia()) / 1000000000.00);
    
    // fim processador
    
    // Inicio ram
        hardware.setUsoRAM(Double.valueOf(memoria.getEmUso() * 100 / memoria.getTotal()));
    // fim ram
    
    // Inicio disco
    
        //Criação do gerenciador
        DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();

        //Obtendo lista de discos a partir do getter
        List<Volume> volume = grupoDeDiscos.getVolumes();
        
        // Set Uso e Set Frequência
        hardware.setUsoDISCO(getUsoDisco());
        hardware.setFrequenciaDISCO(getFreqDisco());
    
    //fim disco
    
    // Inicio rede
     
        
    // fim rede
    
    
    
        return hardware;
    }
   
    }