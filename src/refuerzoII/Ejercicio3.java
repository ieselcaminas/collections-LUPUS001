package refuerzoII;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println(sumaDigitos("3433"));
        System.out.println(sumaDigitos("55442"));
    }
    public static String sumaDigitos(String digitos){
        String total = "";
        int num;
        int num2 = 0;
        for (int i = 0; i < digitos.length(); i++) {

            num = Integer.parseInt("" + digitos.charAt(i));
            num2 += num;
            if (i < digitos.length() - 1){
                total += digitos.charAt(i) + " + ";
            } else{
                total += digitos.charAt(i) + " = ";
            }
        }

        return total + num2;
    }
}
