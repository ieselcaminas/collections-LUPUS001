import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        ArrayList<String>cocheMarca = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String marcas;

        do {
            marcas = sc.nextLine();
            if (!marcas.isEmpty())
                cocheMarca.add(marcas);

        } while (!marcas.isEmpty());

        Collections.sort(cocheMarca);
        for (int i = 0; i < cocheMarca.size(); i++) {
            System.out.println(cocheMarca.get(i));
        }
    }


}
