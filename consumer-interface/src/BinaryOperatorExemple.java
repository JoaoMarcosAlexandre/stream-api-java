import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemple {
    public static void main(String[] args) {
        //Criando lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //Usando BINARY OPERATOR com LAMBDA para somar dois numeros inteiros
        BinaryOperator<Integer> somar = Integer::sum;

        //Somando todos os numeros no Stream usando o BinaryOperator
        int resultado = numeros.stream()
        .reduce(0, Integer::sum);

        //Imprimindo o resultado da soma
        System.out.println("A soma dos numeros é: " + resultado);
    }
}
