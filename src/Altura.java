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

    public static double calcularAlumnosAlturaSuperior(ArrayList<Double> leerAltura, double media){
        double supMedia = 0;

        for (int i = 0; i < leerAltura.size(); i++) {
            if (leerAltura.get(i) > media){
               //supMedia += leerAltura.get(i);
                supMedia++;
            }
        }
        return supMedia;
    }

    public static double calcularAlumnosAlturaInferior(ArrayList<Double> leerAltura){
        double media = calcularMedia(leerAltura);
        double menMedia = 0;

        for (int i = 0; i < leerAltura.size(); i++) {
            if (leerAltura.get(i) < media){
                //supMedia += leerAltura.get(i);
                menMedia++;
            }
        }
        return menMedia;
    }

    public static void main(String[] args) {
        System.out.println("Introduce el número de alumnos");
        int numAlumnos = numeroAlumnos();
        double media;
        int alumnosSuperior;
        ArrayList<Double> alturas = new ArrayList<>();
        System.out.println(numAlumnos);

        System.out.println("Introduce las alturas");
        alturas = leerAltura(alturas, numAlumnos);

        media = calcularMedia(alturas);
        System.out.println("Media: " + media);

        //alumnosSuperior = calcularAlumnosAlturaSuperior(alturas, media);

    }
}
