import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        System.out.println(calculo("5 5 + 3 * 2 /"));
    }
    public static boolean esNumero(String cadena){
        return Character.isDigit(cadena.charAt(0));
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
            if (esNumero(terminos[i])){
                numero = Integer.valueOf(terminos[i]);
                pila.push(numero);
            } else{
                n2 = pila.pop();
                n1 = pila.pop();
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
    }
}
