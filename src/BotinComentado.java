import java.util.*;

//los billetes se distribuyen de manera circular (vuelta al principio cuando se acaba la lista de miembros). El resultado es un map donde cada miembro tiene asignados los billetes que le tocaron.
public class BotinComentado {
    public static void main(String[] args) {
        Map<Integer, String> reparto = botin(2, new String[]{"10", "20", "100", "50", "200"});
        /*
         Map<Integer, String> reparto
                Este objeto almacenará el resultado del reparto de billetes.
                <Integer> representa a cada ladrón
                <String> Es la lista de billetes que el ladrón ha recibido
           este map es la libreta ordenada en donde cada página (clave) pertenece a un ladrón
           y en esta se anotan los billetes (valor) de cada ladrón*/

        /*
            botin(2, new String[]{"10", "20", "100", "50", "200"})
                Llamamos al método "botin" y le pasamos:
                - "2": el número de ladrones (participantes en el reparto).
                - "{"10", "20", "100", "50", "200"}": la lista de billetes a repartir.
        */

        System.out.println(reparto.toString());
        // Usamos toString() para que los datos del mapa "reparto" sean legibles,
    }
    public static Map<Integer, String> botin(int ladronesCant, String[] billetes){
        Map<Integer, String> repartir = new HashMap<>(); //almacenará el resultado del reparto de billetes entre los ladrones. La lógica se ha explicado en el Map 'reparto' del método main
        //new Hashmap<>(): Crea un map vacío en donde se guardará la información
        int leTocaA; //Representa el índice del ladrón que recibe el  billete actual
        String billeteARepartir; //El billete que estamos repartiendo en este momento
        String botin; //La acumulación de billetes para cada ladrón || La variable en donde cada ladrón va acumulando los billetes que le tocan || Los billetes que le han tocado durante el reparto y va acumulando cada ladrón por separado

        /*
        Ladrón 0 recibe 10 (primer billete), luego 100 (tercer billete), luego 200 (quinto billete).
        Ladrón 1 recibe 20 (segundo billete), luego 50 (cuarto billete).
        */

        //Recorremos todos billetes de principio a fin, uno a uno
        for (int i = 0; i < billetes.length; i++) { //vamos desde el indice 0 (i=0) hasta la máxima longitud de los billetes (que billetes.length recordemos que es la cantidad total de billetes)
            billeteARepartir = billetes[i]; //guardamos el billete actual en la variable || con esta variable guardaremos el billete que esta en la posicion 1 (10), luego el de la pos 2 (20), pos 3 (100)...

            leTocaA = i % ladronesCant; //Para que sea un reparto circular (que vuelva a 0 una vez alcanzado ladronesCant)
            //VResumida: i % ladronesCant asegura que al llegar al último ladrón, el siguiente recibirá el primer billete nuevamente.
            //V2: i % ladronesCant: Aquí es donde entra el concepto de reparto circular. El operador módulo devuelve el resto de la división entre el número i y el número de ladrones (ladronesCant).
            /*
                Por ejemplo, si tienes 5 billetes y 3 ladrones, y estás en el billete número 4 (i=4):
                    4 % 3 = 1. Esto significa que, aunque el índice i va de 0 a 4, el reparto se hace circularmente: cuando llega a 3, vuelve a 0.
                    Si i=0, entonces 0 % 3 = 0, le toca al ladrón 0.
                    Si i=1, entonces 1 % 3 = 1, le toca al ladrón 1.
                    Si i=2, entonces 2 % 3 = 2, le toca al ladrón 2.
                    Y cuando i=3, entonces 3 % 3 = 0, vuelve al ladrón 0. (vuelve al principio)
                    i = 4: 4 % 3 = 1 → Ladrón 1 recibe el billete.
                    i = 5: 5 % 3 = 2 → Ladrón 2 recibe el billete.
                    Esto asegura que los billetes se reparten circularmente entre los ladrones.
            */

            botin = repartir.get(leTocaA);
            //es una variable que le da al map 'repartir', el valor que se ha calculado en leTocaA, al principio le dara el valor 0,
            // luego cuando 1, luego 2 y entonces otra vez 0... esta variable es para simplemente saber a que ladron le toca ahora, el orden

            if (botin == null){ //Si el ladrón aún no tiene billetes...
                repartir.put(leTocaA, billeteARepartir);
                //Se inicializa su entrada en el Map con el billete actual(EJ: {0=10}) o (EJ2 {1=20})
            } else{ //Si el ladrón YA tiene billetes
                repartir.put(leTocaA, botin + " " + billeteARepartir);
                //concatenamos el nuevo billete al botín ya existente (Antes en el if {0=10} ahora en else {0=10 100})
                // (Antes en el if {1=20} ahora en else {1=20 50})
            }

            //Segunda forma de hacerlo
            // repartir.put(leTocaA, repartir.getOrDefault(leTocaA, billeteARepartir) + " " + billeteARepartir);
        }

        return repartir;

            /*Ejemplo de ejecución
               Con ladronesCant = 2 y billetes = {"10", "20", "100", "50", "200"}:

                 Iteración 0: ladrón 0 recibe 10 → {0="10"}
                 Iteración 1: ladrón 1 recibe 20 → {0="10", 1="20"}
                 Iteración 2: ladrón 0 recibe 100 → {0="10 100", 1="20"}
                 Iteración 3: ladrón 1 recibe 50 → {0="10 100", 1="20 50"}
                 Iteración 4: ladrón 0 recibe 200 → {0="10 100 200", 1="20 50"}*/
    }
}


