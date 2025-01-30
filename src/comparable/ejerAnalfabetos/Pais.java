package comparable.ejerAnalfabetos;

public class Pais implements Comparable<Pais> {
    private String nombre;
    private int analfabetos;

    public Pais(String nombre, int analfabetos){
        this.nombre = nombre;
        this.analfabetos = analfabetos;
    }

    public String getNombre() {
        return nombre;
    }
    public int getAnalfabetos(){
        return analfabetos;
    }

    public void setAnalfabetos(int analfabetos) {
        this.analfabetos = analfabetos;
    }

    @Override
    public String toString(){
        return this.nombre + " - " + this.analfabetos;
    }

    @Override
    public int compareTo(Pais other){
        return other.analfabetos - this.getAnalfabetos();
    }
}
