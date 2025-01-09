package flujos;

import java.util.ArrayList;
import java.util.List;

public class Problema1 {
    public static void main(String[] args) {
        List<Person2> personas = new ArrayList<>();
        Person2 p = new Person2("Aarón", "García", 2004);
        personas.add(p);
        Person2 p2 = new Person2("Julio", "Caesar", 100);
        personas.add(p2);

        long cantidadPersonas = personas.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();
        System.out.println("Personas nacidas antes de 1970: " + cantidadPersonas);
    }
}
