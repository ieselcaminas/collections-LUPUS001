package flujos;

import java.util.ArrayList;
import java.util.List;

public class Problema4 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(9);
        numeros.add(8);
        numeros.add(6);
        numeros.add(3);
        numeros.add(-5);
        numeros.add(4);

        numeros.stream()
                .filter(n -> n >=1 && n <= 5)
                //.forEach(n -> System.out.println(n)); //Forma 1
                .forEach(System.out::println); //Forma más corta de imprimirlo
    }
}
