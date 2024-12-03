import java.util.*;

public class Telefonos {
    public static void main(String[] args) {
        Map<String, String> contacto = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        contacto.put("Aaron","754456534");
        contacto.put("Alejandro", "+34 64354373");
        contacto.put("Morales", "+34 6756657");

        System.out.println("Pon el contacto para averiguar sus teléfonos");
        String nombre = sc.nextLine();

        if (contacto.containsKey(nombre)) {
            System.out.println("El teléfono de " + nombre + " es: " + contacto.get(nombre));
        } else {
            System.out.println("El contacto " + nombre + " no existe");
        }
        sc.close();
    }
}
