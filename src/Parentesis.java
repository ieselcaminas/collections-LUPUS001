import java.util.Stack;

public class Parentesis {

    public static void main(String[] args) {
        //Esta es la primera prueba, haciendo el programa básico nos dará true
        System.out.println(esBalanceado("{([()])}"));

        //esto nos daría correcto, aunque como se puede ver, no es el caso
        //por eso en lugar de un simple return true;
        //pondremos return pila.isEmpty(); para así arreglar ese fallo del programa
        System.out.println(esBalanceado("{}("));

        //ahora hay que añadir el if
        /*if (pila.isEmpty()){
                    return false;
                }*/
        //porque sino al empezar por un simbolo de cierre, el programa nos dará error, con el if
        //no nos dará este error
        System.out.println(esBalanceado("}()"));
    }
    public static boolean esBalanceado(String cadena) {
        boolean balanced = true;
        char caracter;
        char ultimo;
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            //Si son de apertura, lo pongo en la fila
            caracter = cadena.charAt(i);

            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            } else if (caracter == ')') {
                //Saco de la pila y compruebo si es '('. Si no es acabo con false
                if (pila.isEmpty()){
                    return false;
                }
                ultimo = pila.pop();
                if (ultimo != '(') {
                    return false;
                }
            } else if (cadena.charAt(i) == ']') {
                if (pila.isEmpty()){
                    return false;
                }
                ultimo = pila.pop();
                if (ultimo != '[') {
                    return false;
                }
            } else if (caracter == '}') {
                if (pila.isEmpty()){
                    return false;
                }
                ultimo = pila.pop();
                if (ultimo != '{') {
                    return false;
                }

            /*if (cadena.charAt(i) == '('){
                pila.push(')');
            } else if(cadena.charAt(i) == '['){
                pila.push(']');
            }*/
            }

        }
        return pila.isEmpty();
    }
}
