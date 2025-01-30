import java.util.*;

public class Sorteo {
    public static void main(String[] args) {
        System.out.println(terminaciones(new String[]{"12123", "34324"}));
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

        for (int i = 0; i < boletos.length; i++) {
            ultimo = boletos[i].charAt(boletos.length - 1);
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