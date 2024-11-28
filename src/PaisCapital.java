import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        Map<String, String> pais = new HashMap<String, String>();
        pais.put("España", "Madrid");
        pais.put("Italia", "Roma");
        pais.put("Portugal", "Lisboa");
        pais.put("Alemania", "Berlín");

        System.out.println("Dime el nombre de un país");
        nombre = sc.nextLine();

        System.out.println(pais.get(nombre));
    }
}
