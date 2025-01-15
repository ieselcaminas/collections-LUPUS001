import java.util.*;

public class Sorteo {
    public static void main(String[] args) {
        System.out.println(terminaciones(new String[]{"03843", "45344", "35434", "64545"}));
    }

    public static Map<Character, Integer> terminaciones(String[] boletos){
        Map<Character, Integer> terminacion = new HashMap<>();
        Character ultimo;
        Integer cont;

        for (String boleto: boletos){
            ultimo = boleto.charAt(boleto.length() - 1);
            cont = terminacion.get(ultimo);

            if (cont == null){
                terminacion.put(ultimo, 1);
            } else {
                terminacion.put(ultimo, cont + 1);
            }
        }
        return terminacion;
    }
}
