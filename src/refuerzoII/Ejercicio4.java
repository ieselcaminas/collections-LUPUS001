package refuerzoII;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println(moda(new int[]{2,3,5,2,5,6,2,1}));
    }
    public static int moda(int[] numeros){
        int max = 0;
        int moda = 0;
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < numeros.length; i++) {
            mapa.put(numeros[i], mapa.getOrDefault(numeros[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                moda = entry.getKey();
            }
        }
        return moda;
    }
}

