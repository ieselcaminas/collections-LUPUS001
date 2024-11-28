import java.util.ArrayList;
import java.util.HashMap;

/*public class TelefonosII {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> telefonos= new HashMap<>();
        telefonos.put("1", new ArrayList<>());
        telefonos.put("2", new ArrayList<>());

        ArrayList<String> agenda = new ArrayList<>();
        agenda.add("11");
        agenda.add("22");
        agenda.add("33");
        telefonos.put("3", agenda);

        System.out.println(telefonos);

        for (String imprimir : telefonos.keySet()) {
            System.out.println(imprimir);
        }

    }
}*/

import java.util.*;
public class TelefonosII {
    public static void main(String[] args) {
        ArrayList<String> telefonos = new ArrayList<>();
        HashMap<String, ArrayList<String>> contacto = new HashMap<>();
        telefonos.add("612");
        telefonos.add("23");
        contacto.put("Antonio", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("734");
        telefonos.add("34");
        contacto.put("Morales", telefonos);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el contacto del que quieres saber su número");
        String numero = sc.next();
        if (contacto.containsKey(numero)){
            System.out.println(contacto.get(numero));
        }
        System.out.println(contacto);
    }
    public static String numeroTelefono (HashMap<String, String> contacto, String numero){
        return contacto.get(numero);
    }
}