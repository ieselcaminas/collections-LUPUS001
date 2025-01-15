import java.util.HashMap;
import java.util.Map;

public class Botin {
    public static void main(String[] args) {
        Map<Integer, String> reparto = botin(2, new String[]{"10", "20", "100", "50", "200"});
        System.out.println(reparto.toString());
    }

    public static Map<Integer, String> botin(int ladronesCant, String[] billetes) {
        Map<Integer, String> repartir = new HashMap<>();
        int leTocaA;
        String billeteARepartir;
        String botin;

        for (int i = 0; i < billetes.length; i++) {
            billeteARepartir = billetes[i];
            leTocaA = i % ladronesCant;
            botin = repartir.get(leTocaA);

            if (botin == null) {
                repartir.put(leTocaA, billeteARepartir);
            } else {
                repartir.put(leTocaA, botin + " " + billeteARepartir);
            }
        }

        return repartir;
    }
}
