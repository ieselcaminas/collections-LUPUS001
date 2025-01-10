package flujos;

import comparable.Person;

import java.util.ArrayList;
import java.util.List;

public class Problema3 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        Person p = new Person("Aristoteles", "de Estagira", 322);
        personas.add(p);

        p = new Person("Antonio", "Calvo", 2003);
        personas.add(p);

        p = new Person("Julio", "Caesar", 1000);
        personas.add(p);

        personas.stream()
                .map(persona -> persona.getLastName())
                .distinct()
                .sorted()
                .forEach(apellido -> System.out.println(apellido));

    }
}
