package comparable;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        Human h = new Human("Aber", 1312);
        humans.add(h);

        h = new Human("Ramon", 9000);
        humans.add(h);

        humans.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
