import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ejemplo1 {
    public static void main(String[] args) {
        ArrayList<Integer>media = new ArrayList<>();
        int cont = 0;
        media.add(1);
        media.add(2);
        media.add(3);

        for (int i = 0; i < media.size(); i++) {
            cont += media.get(i);
        }

        System.out.println(cont / media.size());

        Collections.sort(media);


        ArrayList<String> coches = new ArrayList<>();
        coches.add("Seat"); //posicion 0
        coches.add("Audi"); //posicion1
        coches.add("BMW");
        coches.add("Honda");

        System.out.println(coches.get(coches.size()-1));

        for (int i = 0; i < coches.size(); i++) { //size en lugar de length
            System.out.println(coches.get(i)); //coches.get(i) en lugar de coches[i]
        }
        coches.remove(0);

        System.out.println("-----");

        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }

        if (coches.isEmpty()){
            System.out.println("El arrayList está vacio");
        }
    }
}
