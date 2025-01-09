package flujos;

import java.util.ArrayList;
import java.util.List;

public class Problema2 {
    public static void main(String[] args) {
        List<Person2> personas = new ArrayList<>();
        Person2 p = new Person2("Aarón", "García", 2004);
        personas.add(p);
        p = new Person2("Julio", "Ambar", 100);
        personas.add(p);
        p = new Person2("Edward", "Morales", 2003);
        personas.add(p);

        long cantidadPersonas = personas.stream()
                .filter(n -> n.getLastName().startsWith("A"))
                .count();
        System.out.println(cantidadPersonas);
    }
}
