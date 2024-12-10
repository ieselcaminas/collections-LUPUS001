import java.util.*;

public class Botin {
    public static void main(String[] args) {
        Map<Integer, String> reparto = botin(2, new String[]{"10", "20", "100", "50", "200"});
        System.out.println(reparto.toString());
    }
    public static Map<Integer, String> botin(int ladronesCant, String[] billetes){
        Map<Integer, String> repartir = new HashMap<>();
        int leTocaA;
        String billeteARepartir;
        String botin;

        for (int i = 0; i < billetes.length; i++) {
            billeteARepartir = billetes[i];
            //Para que sea un reparto circular (que vuelva a 0 una vez alcanzado ladronesCant)
            leTocaA = i % ladronesCant;
            botin = repartir.get(leTocaA);

            if (botin == null){
                repartir.put(leTocaA, billeteARepartir);
            } else{
                repartir.put(leTocaA, botin + " " + billeteARepartir);
            }

            //Segunda forma de hacerlo
            // repartir.put(leTocaA, repartir.getOrDefault(leTocaA, billeteARepartir) + " " + billeteARepartir);
        }

        return repartir;
    }
}
