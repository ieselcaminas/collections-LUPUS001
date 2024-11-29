import java.util.*;

public class TelefonosII {
    public static void main(String[] args) {
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("612");
        telefonos.add("23");

        //creamos una li
        Map<String, ArrayList<String>> contacto = new HashMap<>();

        contacto.put("Antonio", telefonos);

        telefonos = new ArrayList<>();
        //creamos un nuevo ArrayList para que no se mezclen los números del primer contacto y del segundo
        telefonos.add("734");
        telefonos.add("34");

        contacto.put("Morales", telefonos);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el contacto del que quieres saber su número");
        String numero = sc.next();
        if (contacto.containsKey(numero)){
            System.out.println(contacto.get(numero));
        }
    }
    public static String numeroTelefono (HashMap<String, String> contacto, String numero){
        return contacto.get(numero);
    }
}