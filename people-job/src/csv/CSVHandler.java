package csv;

import java.io.IOException;
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

    public static void writeCandidato (Candidato candidato) {
        try {
            if (!Files.exists(CANDIDATO_PATH)) Files.createFile(CANDIDATO_PATH);
            FileChannel channel = FileChannel.open(
                CANDIDATO_PATH,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
            );
            channel.position(channel.size()).write(ByteBuffer.wrap(
                Formatter.getFormatted(candidato).getBytes(StandardCharsets.UTF_8)
            ));
            channel.close();
            System.out.println("Line written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}