package comparable.tutankamon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tesoro> tesoros = new ArrayList<>();

        Tesoro t = new Tesoro(1, "Mascara", 23, 120);
        tesoros.add(t);

        t = new Tesoro(3, "Sarcofago", 200, 496);
        tesoros.add(t);

        t = new Tesoro(2, "Arco", 200, 20);
        tesoros.add(t);

        t = new Tesoro(1, "Cuerpo Faraon", 23, 40);
        tesoros.add(t);

        tesoros.stream()
                .sorted()
                .forEach(System.out::println);


    }
}
