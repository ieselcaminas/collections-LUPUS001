import java.util.*;

public class Sorteo {
    public static void main(String[] args) {
        System.out.println(terminaciones(new String[]{"03843", "45344", "35434", "64545"}));
        /*No sirve poner simplemente System.out.println(terminaciones("00004", "03847", "345654"));   [esto daría varias cadenas individuales]
          porque el método "terminaciones" espera un array de cadenas(String[]) y no una simple cadena (String)
          de ahí la necesidad de poner el "new String[]{}" para indicar que el valor que estamos añadiendo es un array
        */
        //Básicamente no se pueden pasar cadenas individuales a un método que espera un array. De ahí que es necesario crear el array explicitamente con el new String[]{}

    }
    public static Map<Character, Integer> terminaciones(String[] boletos){//aquí es donde vemos que pide "String[] boletos" el cuál como hemos dicho es un array de cadenas
        Map<Character, Integer> terminaciones = new HashMap<>();
        Character ultimo;
        //declaramos Integer asi y no (int) ya que como este metodo es Map, se cambia la forma de declararlo
        Integer cont;

        for (String boleto: boletos){
            //Valor de la terminación
            ultimo = boleto.charAt(boleto.length() - 1);
            //Obtenemos el valor del valor
            cont = terminaciones.get(ultimo);
            //Si la clave no existía, ponemos un 1. Si no, aumentamos en 1 el valor
            if (cont == null){
                terminaciones.put(ultimo, 1);
            } else {
                terminaciones.put(ultimo, cont + 1);
            }
        }
        return terminaciones;
    }

    //El Main Original
    /*public static void main(String[] args) {
        ArrayList<String> boletos = new ArrayList<>();
        boletos.add("00004");
        boletos.add("03847");
        boletos.add("39804");

        Map<String, ArrayList<String>> salida = new HashMap<>();
        salida.put("Gordo de Navidad", boletos);

        boletos = new ArrayList<>();
        boletos.add("58975");
        boletos.add("25894");
        boletos.add("52985");
        boletos.add("98598");

        salida.put("el del Niño", boletos);

        for (int i = 0; i < boletos.size(); i++) {
            if (boletos.get(boletos.size()) == null){

            } else {

            }
            System.out.println(boletos.get(i));
        }
        //HashMap mejor = new HashMap();


    }

    */


}
