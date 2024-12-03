import java.util.*;

public class TelefonosII {
    public static void main(String[] args) {
        //este Map contendrá los contactos y sus telefonos
        Map<String, ArrayList<String>> contacto = new HashMap<>();
        //con esto crearemos una lista de teléfonos para el contacto de Antonio
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("6125645676");
        telefonos.add("+32 3453565");
        contacto.put("Antonio", telefonos);

        //ahora la lista de teléfonos para Morales
        telefonos = new ArrayList<>();
        //creamos un nuevo ArrayList para que no se mezclen los números del primer contacto y del segundo
        telefonos.add("73423423");
        telefonos.add("+34 5465645");
        contacto.put("Morales", telefonos);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el contacto del que quieres saber su número");

        String nombre = sc.nextLine();

        mostrarTelefonos(contacto, nombre);

        sc.close();
    }

    public static String mostrarTelefonos(Map<String, ArrayList<String>> contacto, String nombre) {
        if (contacto.containsKey(nombre)) {
            System.out.println("Teléfonos de " + nombre + ":");
            for (String telefono : contacto.get(nombre)) {
                System.out.println(telefono);
            }
        } else {
            System.out.println("El contacto " + nombre + " no existe");
        }
        return nombre;
    }

}