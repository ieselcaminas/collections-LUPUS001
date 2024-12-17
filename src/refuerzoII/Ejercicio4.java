package refuerzoII;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Llamamos al método moda con un array de números
        System.out.println(moda(new int[]{2, 3, 5, 2, 5, 6, 2, 1}));
    }

    // Método que devuelve el número que más se repite (moda) en un array
    public static int moda(int[] numeros) {
        int max = 0;  // Máximo número de repeticiones
        int moda = 0; // Valor que más se repite (la moda)
        Map<Integer, Integer> mapa = new HashMap<>();//almacenará cada número del array como clave y su cantidad de apariciones como valor
        //con el array dado en el main, el map al final tendrá:
        /*Clave 2 → Valor 3 (se repite 3 veces)
          Clave 3 → Valor 1
          Clave 5 → Valor 2
          Clave 6 → Valor 1
          Clave 1 → Valor 1 */

        // 1. Contamos las frecuencias de cada número
        for (int i = 0; i < numeros.length; i++) {
            // Si el número existe, incrementa su frecuencia; si no, lo inicializa a 1
            mapa.put(numeros[i], mapa.getOrDefault(numeros[i], 0) + 1);
            //la función getOrDefault(numeros[i], 0) obtiene el valor actual asociado a numeros[i]. Si no existe, devuelve 0.
            //se incrementa en 1 (+ 1) la frecuencia del número y se actualiza en el mapa

        }
            /*  Iteración 1: Número = 2 → Mapa: {2=1}
                Iteración 2: Número = 3 → Mapa: {2=1, 3=1}
                Iteración 3: Número = 5 → Mapa: {2=1, 3=1, 5=1}
                Iteración 4: Número = 2 → Mapa: {2=2, 3=1, 5=1}
                Iteración 5: Número = 5 → Mapa: {2=2, 3=1, 5=2}
                Iteración 6: Número = 6 → Mapa: {2=2, 3=1, 5=2, 6=1}
                Iteración 7: Número = 2 → Mapa: {2=3, 3=1, 5=2, 6=1}
                Iteración 8: Número = 1 → Mapa: {2=3, 3=1, 5=2, 6=1, 1=1}*/

        // 2. Encontramos la clave con la frecuencia más alta/encontramos la moda con este bucle
        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            //entrySet(): Recorre todas las entradas (pares clave-valor) del mapa.

            // Si la frecuencia actual (valor) es mayor que el máximo anterior
            if (entry.getValue() > max) {
                max = entry.getValue();   // Actualizamos el máximo de repeticiones
                moda = entry.getKey();    // Actualizamos la moda con el número actual
            }
        }
          /* Iteración sobre el mapa {2=3, 3=1, 5=2, 6=1, 1=1}:
                Entrada 1: 2=3 → 3 > 0 → Actualizamos: max = 3, moda = 2.
                Entrada 2: 3=1 → 1 > 3 → No se actualiza.
                Entrada 3: 5=2 → 2 > 3 → No se actualiza.
                Entrada 4: 6=1 → 1 > 3 → No se actualiza.
                Entrada 5: 1=1 → 1 > 3 → No se actualiza.

                Resultado final: moda = 2.*/

        return moda;//finalmente devolvemos la moda, que será el número con la mayor frecuencia en el array.
    }
}

/*
1.Se recibe un array de números.
2.Se recorre el array y se cuenta la frecuencia de cada número usando un HashMap.
3.Se busca el número con la frecuencia más alta en el mapa.
4.El método devuelve ese número como resultado.*/