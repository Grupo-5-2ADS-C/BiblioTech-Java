package com.mycompany.tela.java.swing.v1;

import ComponenteMaquina.*;
import ConexaoMySQL.ConexaoSQL;
import EspecificacaoComponenteMaquina.EspecificacaoComponenteMaquina;

// Autenticacao
//import Autenticacao.Login;
//import Autenticacao.LoginRowMapper;
import Maquina.*;

import java.io.IOException;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/**
 *
 * @author viniciuspereira
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iptLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        iptPassword = new javax.swing.JPasswordField();
        buttonLogin = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(87, 180, 206));
        jPanel3.setForeground(new java.awt.Color(87, 180, 206));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BiblioTech");
        jLabel4.setAlignmentX(0.5F);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/logo bibliotech 67px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(110, 110, 110))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setText("Login");
        jLabel2.setAlignmentX(0.5F);

        iptLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptLoginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setText("Senha");
        jLabel3.setAlignmentX(0.5F);

        iptPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptPasswordActionPerformed(evt);
            }
        });

        buttonLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(iptLogin)
                    .addComponent(jLabel3)
                    .addComponent(iptPassword)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addGap(0, 65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iptLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iptPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonLogin)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptLoginActionPerformed

    private void iptPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptPasswordActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed

        Services d = new Services();
        Conexao conexao = new Conexao();
        Maquina maquina = new Maquina();

        // Pegando dados da input
        String getLogin = iptLogin.getText();
        String getSenha = iptPassword.getText();

        ConexaoSQL conexaoMySQL = new ConexaoSQL();

        JdbcTemplate con = conexao.getConnection();
        JdbcTemplate conMysql = conexaoMySQL.getConnection();

        ComponenteMaquina componente1 = new ComponenteMaquina("Processador", d.processador.getNome().toString(), d.processador.getFabricante().toString());
        ComponenteMaquina componente2 = new ComponenteMaquina("Memoria ram", Long.toString(d.memoria.getTotal()), "null");
        ComponenteMaquina componente3 = new ComponenteMaquina("Disco", d.discoGroup.getQuantidadeDeVolumes().toString(), "null");

        con.update(String.format("insert into componente_maquina (tipo,descricao,fabricante) values ('%s','%s','%s')",
                componente1.getTipo(), componente1.getDescricao(), componente1.getFabricante()));

        con.update(String.format("insert into componente_maquina (tipo,descricao,fabricante) values ('%s','%s','%s')",
                componente2.getTipo(), componente2.getDescricao(), componente2.getFabricante()));

        con.update(String.format("insert into componente_maquina (tipo,descricao,fabricante) values ('%s','%s','%s')",
                componente3.getTipo(), componente3.getDescricao(), componente3.getFabricante()));

        List<ComponenteMaquina> comp = con.query("select id_componente_maquina from componente_maquina order by id_componente_maquina desc;", new BeanPropertyRowMapper(ComponenteMaquina.class));
        List<Maquina> searchLogin = con.query("select id_maquina,sistema_operacional,setor,login,senha,fk_biblioteca from maquina where login = ? and senha = ?;", new BeanPropertyRowMapper(Maquina.class), getLogin, getSenha);

        Maquina result = searchLogin.get(0);
        
                ComponenteMaquina resultComp = comp.get(0);
                ComponenteMaquina resultComp1 = comp.get(1);
                ComponenteMaquina resultComp2 = comp.get(2);
                
                System.out.println(resultComp.getId_componente_maquina());  
                System.out.println(resultComp1.getId_componente_maquina());    
                System.out.println(resultComp2.getId_componente_maquina());    


        //con.update(String.format("insert into rede (ipv4, ipv6, fk_maquina) values ('%s', '%s', %d)",
        //        d.redeTable.getIpv4(), d.redeTable.getIpv6(), result.getId_maquina()));
        EspecificacaoComponenteMaquina spec1 = new EspecificacaoComponenteMaquina(d.processador.getId(), d.processador.getUso(), ((d.processador.getFrequencia().doubleValue()) / 1000000000.0));
        EspecificacaoComponenteMaquina spec2 = new EspecificacaoComponenteMaquina("null", (d.memoria.getTotal().doubleValue() / 1000000000), null);
        EspecificacaoComponenteMaquina spec3 = new EspecificacaoComponenteMaquina(d.disco.getSerial(), (d.discoGroup.getTamanhoTotal().doubleValue() / 1000000000), null);

        con.update(String.format("insert into especificacao_componente_maquina (fk_componente_maquina ,fk_maquina, numero_serial, uso_maximo, freq_maxima) values (%d, %d, '%s','%s','%s')",
                resultComp2.getId_componente_maquina(), result.getId_maquina(), spec1.getNumero_serial(), spec1.getUso_maximo().toString(), spec1.getFreq_maxima().toString()));

        con.update(String.format("insert into especificacao_componente_maquina (fk_componente_maquina ,fk_maquina, numero_serial, uso_maximo, freq_maxima) values (%d, %d, '%s','%s', null)",
                resultComp1.getId_componente_maquina(), result.getId_maquina(), spec2.getNumero_serial(), spec2.getUso_maximo().toString()));

        con.update(String.format("insert into especificacao_componente_maquina (fk_componente_maquina ,fk_maquina, numero_serial, uso_maximo, freq_maxima) values (%d, %d, '%s','%s', null)",
                resultComp.getId_componente_maquina(), result.getId_maquina(), spec3.getNumero_serial(), spec3.getUso_maximo().toString()));

        List<EspecificacaoComponenteMaquina> spec = con.query("select id_especificacao from especificacao_componente_maquina order by id_especificacao desc;",
                new BeanPropertyRowMapper(EspecificacaoComponenteMaquina.class));
        EspecificacaoComponenteMaquina resultSpec = spec.get(0); 
        EspecificacaoComponenteMaquina resultSpec1 = spec.get(1);
        EspecificacaoComponenteMaquina resultSpec2 = spec.get(2);


        Boolean validar = true;

        if (searchLogin.size() > 0) {
            SucessoLogin success = new SucessoLogin();
            success.setVisible(true);
            dispose();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dispose();

            do {
                        Hardware hardware = d.enviarDados();
                //List<Rede> searchRede = con.query("select id_rede from rede order by id_rede desc", new BeanPropertyRowMapper(Rede.class));
                //Rede resultRede = searchRede.get(0);
                con.update(String.format("INSERT INTO metrica (uso, frequencia, fk_especificacao, fk_componente_maquina, fk_maquina, total_processos) VALUES (%s, %s, %d, %d, %d, %s)",
                        hardware.getUsoCPU(), hardware.getFrequenciaCPU(), resultSpec2.getId_especificacao(), resultComp2.getId_componente_maquina(), result.getId_maquina(), hardware.getTotal_processos()));

                con.update(String.format("INSERT INTO metrica (uso, frequencia, fk_especificacao, fk_componente_maquina, fk_maquina, total_processos) VALUES (%s, null, %d, %d, %d, %s)",
                        (hardware.getUsoRAM()), resultSpec1.getId_especificacao(), resultComp1.getId_componente_maquina(), result.getId_maquina(), hardware.getTotal_processos()));

                con.update(String.format("INSERT INTO metrica (uso, frequencia, fk_especificacao, fk_componente_maquina, fk_maquina, total_processos) VALUES ('%s', '%s', %d, %d, %d, %s)",
                        d.getUsoDisco(), d.getFreqDisco(), resultSpec.getId_especificacao(), resultComp.getId_componente_maquina(), result.getId_maquina(), hardware.getTotal_processos()));

                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (d.processador.getUso() >= 90.0) {

                }

                if (d.processador.getUso() < 2.0) {
                    ProcessBuilder Alerta = new ProcessBuilder("/bin/bash", "-c", "notify-send ALERTA 'Tela está sendo bloqueada por inatividade'");
                    ProcessBuilder bloquearTela = new ProcessBuilder("/bin/bash", "-c", "xdg-screensaver lock");
                    // rundll32.exe user32.dll,LockWorkStation p/ Windows
                    try {
                        Process alerta = Alerta.start();
                    } catch (IOException ex) {
                        Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        Thread.sleep(210000);
                        Process bloquear = bloquearTela.start();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    validar = false;
                } else {

                }

            } while (validar == true);

        } else {
            FalhaLogin fail = new FalhaLogin();
            fail.setVisible(true);

        }

    }//GEN-LAST:event_buttonLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JTextField iptLogin;
    private javax.swing.JPasswordField iptPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
