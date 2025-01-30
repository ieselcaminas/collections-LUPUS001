package comparable.tutankamon;

public class Tesoro implements Comparable<Tesoro>{
    private int orden;
    private String nombre;
    private int valor;
    private int peso;

    public Tesoro(int orden, String nombre, int valor, int peso) {
        this.orden = orden;
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString(){
        return this.nombre;
    }

    @Override
    public int compareTo(Tesoro other){
        if (this.valor != other.valor){
            return other.valor - this.valor;
        } else{
            if (this.peso != other.peso){
                return this.peso - other.peso;
            } else {
                return this.orden - other.orden;
            }
        }
    }
}
