import java.time.LocalDate;

import csv.CSVHandler;
import model.Candidato;
import model.Sexo;

public class Main {
    public static void main(String[] args) {
        CSVHandler.writeCandidato(new Candidato(
            "José",
            "123.456.789.10",
            LocalDate.of(1985, 1, 1),
            Sexo.Masculino,
            "Rua Exemplo",
            "123",
            "Jardim Exemplo",
            "complemento",
            "Exemplo city",
            "São Exemplo",
            "e@xem.plo",
            1212345678,
            1212345678,
            true,
            "Exemplificador",
            "Ex. Corp",
            10000.0,
            true,
            9990.99,
            1000.01,
            "Alvenaria, Pintura, Aplicação de argamassa" 
        ));
    }
}
