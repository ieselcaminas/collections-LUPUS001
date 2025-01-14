package comparable;

public class Human implements Comparable<Human>{
    private String name;
    private double salario;

    public Human(String name, double salario){
        this.name  = name;
        this.salario = salario;
    }

    public String getName(){
        return name;
    }
    public double getSalario() {
        return salario;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return this.name + " - " + this.salario;
    }

    //si no ponemos Human implements Comparable<Human> el @Override dará error, para que el método compareTo(Human other) funcione
    //la clase debe implementar la mencionada Comparable<Human>
    @Override
    public int compareTo(Human other) {
        return Double.compare(this.getSalario(), other.getSalario());
    }
}
