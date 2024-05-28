import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemple {
    public static void main(String[] args) {
        // Criando lista de palavras
        List<String> palavras = Arrays.asList("Java", "Go", "Kotlin", "Node.Js", "C#", "Python");

        // Criando um PREDICATE que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCinco = palavra -> palavra.length() > 5;

        // Usando o STREAM para filtrar as palavras com mais de 5 caracteres e
        // imprimir cada palavra que passou no filtro usando method reference
        palavras.stream()
                .filter(maisDeCinco)
                .forEach(System.out::println);
    }
}
