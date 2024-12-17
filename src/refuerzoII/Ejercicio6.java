package refuerzoII;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(esHyperpar(123));
        System.out.println(esHyperpar(24680));
    }
    public static boolean esHyperpar(int num){
        int numIes; //esta variable nos servirá para almacenar el último dígito en cada iteración del número
        //si num = 123 -> los valores serán 3, 2, 1 hasta que termine siendo cero.

        while (num > 0){
            // Mientras que el número tenga dígitos (sea mayor que 0), se repetirá el bucle.
            // En cada iteración, el número se va "descomponiendo" quitando su último dígito:
            // Ejemplo: 123 -> 12 -> 1 -> 0 (termina el bucle aquí).

            numIes = num % 10;//guardamos en numIES el último dígito del número (si num= 123, numIES = 3)
            num = num / 10; // Eliminamos el último dígito del número dividiendo entre 10
                            // Ej: si num = 123, ahora num = 12)

            if (numIes % 2 != 0) { // Si el último dígito no es par (es impar), entonces el número no es Hyperpar.
                return false;      // Devolvemos false y terminamos el método.
            }
        }
        return true; // Si hemos recorrido todos los dígitos sin encontrar impares, el número es Hyperpar
    }
}
