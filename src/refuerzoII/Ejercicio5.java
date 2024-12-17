package refuerzoII;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {1,2,6,17,18,22,35,46,109,143,200};
        System.out.println(mediana(numeros));
    }
    public static double mediana(int[] numeros){
        double mediana;
        Arrays.sort(numeros);

        if (numeros.length % 2 == 0){
            double a = (double)numeros[numeros.length / 2];
            double b = (double)numeros[numeros.length / 2 - 1];
            mediana = (a + b) / 2;
        } else{
            mediana = numeros[numeros.length / 2];
        }
        return mediana;
    }
}

