import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Usando o CONSUMER com expressão LAMBDA para imprimir numeros pares
        @SuppressWarnings("unused")
        Consumer<Integer> imprimirNumeroPar = numero -> {
         if (numero %2 == 0){
            System.out.println(numero);
         }
        };

        //Usando CONSUMER parra imprimir os numeros pares no Stream

    numeros.forEach(n -> {
       if (n % 2 == 0) {
        System.out.println(n);
       } 
    });
    }
}