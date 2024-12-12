import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        //System.out.println(aritmetica(12, 2));
        String cadena = "50 2 4 * 4 +";
        System.out.println(calculo(cadena));
    }

    public static boolean esNumero(String cadena){
        /*String[] digitos = expresiones.split(" ");
        for (int i = 0; i < digitos.length; i++) {
            if (digitos[i].charAt(0) ==)
        }*/
        return  Character.isDigit(cadena.charAt(0));
    }

    public static int calculo(String expresion){
        String[] terminos = expresion.split(" ");
        Integer numero;
        Integer n1;
        Integer n2;
        Integer resultado = 0;
        Stack<Integer> pila = new Stack<>();

        /*
        5 1 2 * + 3 -
        5
        1
        2
        +
        4
        *
        3
        * */

        for (int i = 0; i < terminos.length; i++) {
            if (esNumero(terminos[i])) {
                numero = Integer.parseInt("" + terminos[i]);
                pila.push(numero);
            }else{
                n2 = pila.pop();
                n1 = pila.pop();
                if (terminos[i].equals("+")){
                    pila.push(n1 + n2);
                }
                else if (terminos[i].equals("-")){
                    pila.push(n1 - n2);
                }
                else if (terminos[i].equals("*")){
                    pila.push(n1 * n2);
                }
                else if (terminos[i].equals("/")){
                    pila.push(n1 / n2);
                }
            }
        }
        for (int i = 0; i < pila.size(); i++) {
            resultado += pila.get(i);
        }
        return resultado;
    }
}
