package csv;

import java.time.format.DateTimeFormatter;

import model.Candidato;

public class Formatter {
    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static String getFormatted(Candidato candidato) {
        return new StringBuilder(candidato.getNome())
        .append(candidato.getCpf()).append(";")
        .append(candidato.getDataNascimento().format(dateFormat)).append(";")
        .append(candidato.getSexo()).append(";")
        .append(candidato.getLogradouro()).append(";")
        .append(candidato.getNumero()).append(";")
        .append(candidato.getBairro()).append(";")
        .append(candidato.getComplemento()).append(";")
        .append(candidato.getCidade()).append(";")
        .append(candidato.getBairro()).append(";")
        .append(candidato.getEmail()).append(";")
        .append(candidato.getTelefone()).append(";")
        .append(candidato.getCelular()).append(";")
        .append(candidato.isCelularWhats()).append(";")
        .append(candidato.getProfissao()).append(";")
        .append(candidato.getEmpresa()).append(";")
        .append(candidato.getSalario()).append(";")
        .append(candidato.hasEmpregoAtual()).append(";")
        .append(candidato.getPretencaoMinima()).append(";")
        .append(candidato.getPretencaoMaxima()).append(";")
        .append(candidato.getHabilidades()).append(";")
        .append("\n")
        .toString();
    }
}
