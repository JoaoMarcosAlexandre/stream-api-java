import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class FunctionExemple {
    public static void main(String[] args) {
        //Criando lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Usando a FUNCTION com expressão LAMBDA para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usando a função para dobrar todos os numeros no Stream e armazenar em outra lista
        List<Integer> numerosDobrados = numeros.stream()
            .map(dobrar)
            .collect(Collectors.toList());

        //Imprimindo a lista de numeros dobrados com method reference
        numerosDobrados.forEach(System.out::println);
    }
}
