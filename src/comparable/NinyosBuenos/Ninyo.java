package comparable.NinyosBuenos;

public class Ninyo implements Comparable<Ninyo>{
    private int bondad;
    private int regalos;

    public Ninyo(int bondad, int regalos) {
        this.bondad = bondad;
        this.regalos = regalos;
    }

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public int getRegalos() {
        return regalos;
    }

    public void setRegalos(int regalos) {
        this.regalos = regalos;
    }

    @Override
    public String toString() {
        return this.bondad + " - " + this.regalos;
    }

    @Override
    public int compareTo(Ninyo other){
        if (this.bondad - other.bondad == 0){
            return this.regalos - other.regalos;
        } else {
            return other.bondad - this.bondad;
        }
    }
}
