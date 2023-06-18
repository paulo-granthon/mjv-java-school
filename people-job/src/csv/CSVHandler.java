package csv;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import model.Candidato;

public class CSVHandler {
    private static final Path CANDIDATO_PATH = Paths.get("./cadastro.csv");
    static {
        try {
            if (!Files.exists(CANDIDATO_PATH)) {
                Files.createFile(CANDIDATO_PATH);
                writeLine(CANDIDATO_PATH, "nome;cpf;dataNascimento;sexo;logradouro;numero;bairro;complemento;cidade;estado;email;telefone;celular;celularWhats;profissao;empresa;salario;empregoAtual;pretencaoMinima;pretencaoMaxima;habilidades;");
            }
        } catch (Exception e) {
            System.err.println(String.format(
                "people-job.csv.CSVHandler | Initialization Error: Falha ao criar arquivo necessário \"{%s}\"", 
                CANDIDATO_PATH
            ));
            e.printStackTrace();
        }
    }

    private static void writeLine (Path path, String line) {
        try (FileChannel channel = FileChannel.open(
            path,
            StandardOpenOption.CREATE,
            StandardOpenOption.APPEND
        )) {
            channel.position(channel.size()).write(ByteBuffer.wrap(line.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            System.err.println(String.format(
                "people-job.csv.CSVHandler.writeLine | Error writing line. Path: \"%s\". line: \"%s\"",
                path,
                line
            ));
            e.printStackTrace();
        }
    }

    public static void writeCandidato (Candidato candidato) {
        try {
            writeLine(
                CANDIDATO_PATH,
                Formatter.<Candidato>getFormatted(candidato)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}