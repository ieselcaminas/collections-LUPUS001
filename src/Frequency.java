import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        System.out.println(frequency(new String[]{"uno", "dos", "dos", "tres", "tres", "tres"}));

    }

    public static Map<String, Integer> frequency(String[] palabras) {
        Map<String, Integer> frecuencia = new HashMap<>();
        Integer cont;

        for(String palabra: palabras){
            cont = frecuencia.get(palabra);
            if (cont == null){
                frecuencia.put(palabra, 1);
            } else {
                //frecuencia.put(palabra, frecuencia.get(palabra) + 1); esto se pondria si no tuvieramos el contador
                frecuencia.put(palabra, cont+1);
            }
        }
        return frecuencia;
    }
}
