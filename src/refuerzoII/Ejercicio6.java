package refuerzoII;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(esHyperpar(123));
        System.out.println(esHyperpar(24680));
    }
    public static boolean esHyperpar(int num){
        int numIes;
        while (num > 0){
            numIes = num % 10;
            num = num / 10;
            if (numIes % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
