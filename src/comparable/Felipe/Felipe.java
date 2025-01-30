package comparable.Felipe;

import java.util.ArrayList;
import java.util.List;

public class Felipe {
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();
        Tarea t = new Tarea(1,30);
        tareas.add(t);

        Tarea t2 = new Tarea(2, 30);
        tareas.add(t2);

        Tarea t3 = new Tarea(3,10);
        tareas.add(t3);

        Tarea t4 = new Tarea(1, 40);
        tareas.add(t4);

        tareas.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
