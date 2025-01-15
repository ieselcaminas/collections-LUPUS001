import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Anagramas {
    public static void main(String[] args) throws IOException {
        int minGroupSize = 4;
        /*para indicar el tamaño minimo del grupo anagrama, si no lo pusiera, con el simple
        hecho de compartir 1 letra ya entrarian en el mismo grupo de anagramas y entonces este programa no  tendría sentido*/

        //abrimos el archivo spanish-dict gracias al BufferedReader
        BufferedReader lector = new BufferedReader(new FileReader("src/files/spanish-dict.txt"));
        String line;
        Map<String,List<String>> anagramas = new HashMap<>();
        /*La clave String será la versión ordenada alfabéticamente de las palabras dadas
        * el valor List será la lista de las palabras que ordenadas tengan esas letras
        * el valor List que almacena las palabras podrá ser alma o mala y la clave String sería aalm
        * */

        List<String>palabras = new ArrayList<>();//en esta lista almacenaremos temporalmente las palabras asociadas a una
                                                 // clave (EJ-> mala y alma) que esta asociadas a la clave aalm
        while ((line = lector.readLine())!=null){
            anagrama(line,anagramas,palabras);
        }//leemos el archivo entero línea por línea
        lector.close();

        //hasta aqui esta la primera parte, ahora irá el método y luego el for
        //-  -  -   -   -   -   -   -   -   -   -   -   -   -   -
        for (String llave:anagramas.keySet()){
            if (anagramas.get(llave).size() >= minGroupSize) {
                System.out.println(llave + anagramas.get(llave));
            }
        }

    }
    public static void anagrama (String line,Map<String,List<String>>anagramas,List<String>palabras) {
        char[] caracteres = line.toCharArray();//descomponemos la palabra en caracteres (EJ= abobao ahora es a b o b a o)
        Arrays.sort(caracteres);//ordenamos estos caracteres que hemos descompuesto
        String palabraOrdenada = new String(caracteres);//guardamos los caracteres ordenados en esta variable

        if (!anagramas.containsKey(palabraOrdenada)){//si la clave no existe...
            palabras = new ArrayList<>();
            palabras.add(line);
            anagramas.put(palabraOrdenada,palabras);
        } //creamos una nueva lista de palabrsa para esa clave

        else {//si la clave ya existe
            palabras = anagramas.get(palabraOrdenada);
            palabras.add(line);
            anagramas.put(palabraOrdenada,palabras);
        }//se agrega la palabra a la lista que ya existe con esa clave

        /*si aalm no existía, ahora ya tenemos aalm, así que cuándo aparezca una nueva palabra ordenada que también se aalm
         *en lugar de volver a crear aalm, se añadera a la anterior lista que ya se llamaba aalm*/
        //EJ -> alma (ordenada es aalm) como no existe se crea la lista aalm -> aalm[alma]
        //mala (ordenada es aalm) como ahora la lista aalm SI que existe se añade a esta lista -> alma[alma, mala]
    }
}
