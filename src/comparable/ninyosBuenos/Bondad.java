package comparable.ninyosBuenos;

import java.util.ArrayList;
import java.util.List;

public class Bondad {
    public static void main(String[] args) {
        List<Ninyo> ninyos = new ArrayList<>();
        Ninyo n = new Ninyo(80,20);
        ninyos.add(n);

        n = new Ninyo(100, 12);
        ninyos.add(n);

        Ninyo n2 = new Ninyo(100, 3);
        ninyos.add(n2);
        n2 = new Ninyo(200, 1);
        ninyos.add(n2);

        ninyos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
