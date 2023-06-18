package csv;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

import model.Candidato;

public class Formatter {
    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    private static final HashMap<Class<?>, List<Function<?, ?>>> TYPE_TO_SUPPLIER_HMAP = new HashMap<>(); 
    static {
        TYPE_TO_SUPPLIER_HMAP.put(Candidato.class, List.of(
            candidato -> ((Candidato)candidato).getNome(),
            candidato -> ((Candidato)candidato).getCpf(),
            candidato -> ((Candidato)candidato).getDataNascimento().format(dateFormat),
            candidato -> ((Candidato)candidato).getSexo(),
            candidato -> ((Candidato)candidato).getLogradouro(),
            candidato -> ((Candidato)candidato).getNumero(),
            candidato -> ((Candidato)candidato).getBairro(),
            candidato -> ((Candidato)candidato).getComplemento(),
            candidato -> ((Candidato)candidato).getCidade(),
            candidato -> ((Candidato)candidato).getBairro(),
            candidato -> ((Candidato)candidato).getEmail(),
            candidato -> ((Candidato)candidato).getTelefone(),
            candidato -> ((Candidato)candidato).getCelular(),
            candidato -> ((Candidato)candidato).isCelularWhats(),
            candidato -> ((Candidato)candidato).getProfissao(),
            candidato -> ((Candidato)candidato).getEmpresa(),
            candidato -> ((Candidato)candidato).getSalario(),
            candidato -> ((Candidato)candidato).hasEmpregoAtual(),
            candidato -> ((Candidato)candidato).getPretencaoMinima(),
            candidato -> ((Candidato)candidato).getPretencaoMaxima(),
            candidato -> ((Candidato)candidato).getHabilidades()
        ));
    }

    @SuppressWarnings("unchecked") public static <T> String getFormatted (T item) throws Exception {
        StringBuilder sb = new StringBuilder(System.lineSeparator());
        for (Function<T, ?> function : (List<Function<T, ?>>) (List<?>) TYPE_TO_SUPPLIER_HMAP.get(item.getClass())) {
            sb.append(function.apply(item)).append(";");
        }
        return sb.toString();
    }
}
