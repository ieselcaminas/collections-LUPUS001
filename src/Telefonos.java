import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroTelefono;
        Map<String, Integer> telefono = new HashMap<>();
        telefono.put("Contacto1", 1);
        telefono.put("Contacto2", 2);
        telefono.put("Contacto3", 3);

        System.out.println("Añada un nuevo contacto");
        numeroTelefono = sc.nextInt();
        
    }
}
