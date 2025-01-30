import java.util.Stack;

//push: Inserta un elemento en la parte superior de la pila.
//pop: Elimina y devuelve el elemento en la parte superior de la pila.

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        System.out.println(calculo("6 4 + 3 * 2 /"));
    }
    public static boolean esNumero(String cadena){
        return Character.isDigit(cadena.charAt(0));
        //verificamos que sea un número comprobando que el primer carácter es un dígito
    }
    public static int calculo(String expresion){
        String terminos[] = expresion.split(" ");
        Integer numero;
        Integer n1;
        Integer n2;
        Stack<Integer> pila = new Stack<>();

        /*
        5 5 + 2 * + 3 -
        5
        5
        + = 10
        3
        * = 30
        2
        / = 15
        */

        for (int i = 0; i < terminos.length; i++) {
            if (esNumero(terminos[i])){//En caso de que cada carácter de 'terminos' sea un número
                numero = Integer.valueOf(terminos[i]);//convertimos estos carácteres en enteros y los guardamos en la variable 'numero'
                pila.push(numero);//lo apilamos
            } else{
                n2 = pila.pop();//guarda/desapila el último número que se ha apilado '4'
                n1 = pila.pop();//guarda/desapila el penúltimo número que se ha apilado '6'
                if (terminos[i].equals("+")){
                    pila.push(n2 + n1);
                } else if(terminos[i].equals("-")){
                    pila.push(n1 - n2);
                } else if (terminos[i].equals("*")){
                    pila.push(n1 * n2);
                } else if(terminos[i].equals("/")){
                    pila.push(n1 / n2);
                }
            }
        }
        return pila.pop();
        //una vez hemos vaciado la pila, comprobado y calculado en caso necesario todos los caracteres, 
        // devolvemos el resultado con este pop
    }
}
