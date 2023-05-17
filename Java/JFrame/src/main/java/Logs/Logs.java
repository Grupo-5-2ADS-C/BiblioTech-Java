package Logs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DenilsonReis
 */
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Logs {

    private static final Logger logger = Logger.getLogger(Logs.class.getName());

    public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConnection();

        String diretorio = "C:\\Logs";
        String nomeArquivo = "LogsAlertas.txt";

// Criar o diretório, se não existir
        File diretorioLogs = new File(diretorio);
        if (!diretorioLogs.exists()) {
            diretorioLogs.mkdirs(); // Cria os diretórios pais, se necessário
        }

// Criar o arquivo no diretório
        File arquivo = new File(diretorioLogs, nomeArquivo);
        arquivo.createNewFile();

// Criar o FileOutputStream para o arquivo
        FileOutputStream arq = new FileOutputStream(arquivo);
        DataOutputStream gravarArq = new DataOutputStream(arq);

        Integer idAlerta = 1; // Exemplo de valor para idAlerta
        String situacaoAlerta = "Ativo"; // Exemplo de valor para nome
        Double pc = 123.45; // Exemplo de valor para pc
        Integer idSituacaoAlerta = 0; // Exemplo de valor para altura

        gravarArq.writeInt(idAlerta);
        gravarArq.writeUTF(situacaoAlerta);
        gravarArq.writeDouble(pc);
        gravarArq.writeInt(idSituacaoAlerta);

        try {
            Date dateTime = new Date();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String formattedDateTime = dateFormat.format(dateTime);

            gravarArq.writeUTF(formattedDateTime);

            String selectAlertas = "SELECT * FROM alerta";

            List<Alerta> alertas = con.query(selectAlertas, new BeanPropertyRowMapper<>(Alerta.class));

            FileWriter fileWriter = new FileWriter("Logs Alertas.txt");
            String alertaData = null;

            File file = new File(alertaData);
            file.createNewFile();

            List logsAlertas = new ArrayList<>();
            logsAlertas.add(alertaData);
            logsAlertas.add(file);

            FileHandler fileHandler = new FileHandler("logs/monitoramento.log");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            for (Alerta alerta : alertas) {
                alertaData = alerta.getData();
                logger.info("Informação de alerta: " + alertaData);
            }

            fileWriter.close();
            gravarArq.close();

            logger.info("Logs gravados com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            logger.severe("Erro ao gravar logs: " + e.getMessage());
        } finally {
            con.getDataSource().getConnection().close();
        }
    }
}
