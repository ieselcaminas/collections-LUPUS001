import java.util.ArrayList;
import java.util.Scanner;

public class Altura {

    public static int numeroAlumnos(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static ArrayList<Double>leerAltura(ArrayList<Double> alturaAlumnos, int numAlumnos){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numAlumnos; i++) {
            alturaAlumnos.add(sc.nextDouble());
        }
        return alturaAlumnos;
    }

    public static double calcularMedia(ArrayList<Double> alturaAlumnos) {
        double media = 0;
        for (int i = 0; i < alturaAlumnos.size(); i++) {
            media += alturaAlumnos.get(i);
        }
        return media/alturaAlumnos.size();
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> leerAltura, double media){
        int supMedia = 0;

        for (int i = 0; i < leerAltura.size(); i++) {
            if (leerAltura.get(i) > media){
               //supMedia += leerAltura.get(i);
                supMedia++;
            }
        }
        return supMedia;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Double> leerAltura){
        double media = calcularMedia(leerAltura);
        int menMedia = 0;

        for (int i = 0; i < leerAltura.size(); i++) {
            if (leerAltura.get(i) < media){
                menMedia++;
            }
        }
        return menMedia;
    }

    public static void main(String[] args) {
        System.out.println("Introduce el número de alumnos");
        int numAlumnos = numeroAlumnos(); //Pedir el número de alumnos

        System.out.println("Introduce las alturas");
        ArrayList<Double> alturas = new ArrayList<>(); //crear un ArrayList en donde guardar/almacenar las alturas
        leerAltura(alturas, numAlumnos); //leer las alturas de los alumnos

        double media = calcularMedia(alturas); //calcular la altura media

        //Calcular los alumnos con una altura superior e inferior a la media
        int alumnosSuperior = calcularAlumnosAlturaSuperior(alturas, media);
        int alumnosInferior = calcularAlumnosAlturaInferior(alturas);

        //Mostrar resultados
        System.out.println("\nRESULTADOS: ");
        System.out.println("Número de alumnos: " + numAlumnos);
        System.out.println("Altura promedio: " + media);
        System.out.println("Alumnos con altura superior a la media: " + alumnosSuperior);
        System.out.println("Alumnos con altura inferior a la media: " + alumnosInferior);

    }
}
