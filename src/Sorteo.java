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

    //Este método recibe el array "boletos" y devolverá un Map en donde las claves son los carácteres de las terminaciones y los valores son la cantidad de veces que aparecen
    public static Map<Character, Integer> terminaciones(String[] boletos){//aquí es donde vemos que pide "String[] boletos" el cuál como hemos dicho es un array de cadenas
        Map<Character, Integer> terminacion = new HashMap<>(); //en este HashMap se almacenan/guardan los resultados
        /* ¿Qué guarda?
        Las CLAVES (Character) son las terminaciones. El último dígito de cada boleto ("03843"[3], "45344"[4], "35434"[4], "64545"[5])
        Los VALORES (Integer) son el número de veces que aparecerá esa terminación / por así decirlo un contador
        */
        //esto ahora se explicará mas a fondo, pero: Si la terminación ya esta en el Map, el valor "contador" se incrementará + 1
        //Y si no existe, se agregará esta terminación con un valor inicial de 1.

        Character ultimo;
        /*Esta variable guardará el último carácter (que sorpresa) que será la terminación de cada boleto
        de "03843" guardará el valor [3] y de "45344" el [4]
        más adelante a esta variable le daremos el valor [ultimo = boleto.charAt(boleto.length() - 1);]
        desglosado veremos que [boleto.length() - 1] calcula la posición del último carácter del boleto.
        REPASO: Ya que el boleto.length de "03843" sacará que tiene una longitud de 5 y le restamos - 1 para no salirnos del rango (5 - 1 = 4) | Pos 0: 0, Pos 1: 3, Pos 2: 8, Pos 3: 4, Pos 4: 3 El que está en la posición 4 es 3, así que este es el digito que guardamos
        [boleto.charAt] para poder obtener el carácter en la posición que hemos sacado del length. En esta caso, obtener el carácter en la posición 4

        ultimo = boleto.charAt(posición 4) = 3
        ultimo = 3

        EJ2:
        Si boleto = "00004", entonces:

        boleto.length() es 5.
        boleto.charAt(4) devuelve '4'.
        Por lo tanto, ultimo tendrá el valor '4'.
        */
        //Al identificar la terminación de cada boleto, sacaremos la clave que usaremos para actualizar el Map "terminacion"

        //declaramos Integer asi y no (int) ya que como este metodo es Map, se cambia la forma de declararlo
        Integer cont;
        /*esta variable [cont = terminacion.get(ultimo);] almacena temporalmente el valor de la clave "ultimo" del mapa "terminacion"
         terminacion.get(ultimo) busca en el mapa si ya existe una entrada {3 = 1} con el valor de la clave ultimo

         Si la clave  no existe (es la primera vez que aparece) devuelve null
         se agregara la clave al mapa con un valor inicial de 1
         EJ: Si la clave '3' no existía, el mapa será {3=1}

         Si clave ya existe incrementamos su valor en 1.
         si el mapa terminacion ya contiene la clave '3' {3 = 1} y aparecé otra terminación con el valor de '3'
         se actualizará con la operación `(ultimo, cont + 1)` y ahora será {3 = 2}
        */

        for (String boleto: boletos){
            //Valor de la terminación
            ultimo = boleto.charAt(boleto.length() - 1);
            //Obtenemos el valor del valor
            cont = terminacion.get(ultimo);

            //Si la clave no existía, ponemos un 1. Si no, aumentamos en 1 el valor
            if (cont == null){
                terminacion.put(ultimo, 1);
            } else {
                terminacion.put(ultimo, cont + 1);
            }
            //Mas explicado:
            /*Si el mapa no tiene la terminación (el campo es null), se agregará esta terminación con un valor que empezará en 1
             EJ= de "03843" nos saldrá la terminacion '3' así que {3 = 1}, pero cómo no se repite que una cadena terminé en 3 este número no subirá
             peero en "45344" terminá en '4' por lo que al igual que el anterior ahora aparecerá {4 = 1} pero la diferencia es que el 4 SI que se repite
             por lo que cuándo se llegue a "35434" ahora el 4 será {4 = 2} ya que se repite que un String termine en 4
            */
        }
        return terminacion;
        //una vez terminado el recorrido el map contiene la cantidad de veces que aparece cada terminación y lo devuelve como resultado
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
