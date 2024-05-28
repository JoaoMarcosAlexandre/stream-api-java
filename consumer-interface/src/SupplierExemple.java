import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemple {
    public static void main(String[] args) {

        //Usando SUPPLIER com expressão LAMBDA para trazer saudação
        Supplier<String> saudacao  = () -> "Olá, seja bem-vindo!";

        //Usando SUPPLIER para obter lista com saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .collect(Collectors.toList());

        //Imprimindo as saudações com method reference
        listaSaudacoes.forEach(System.out::println);
    }
}
