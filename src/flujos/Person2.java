package flujos;

public class Person2 {
    private String name;
    private String lastName;
    private int birthYear;

    public Person2(String name, String lastName, int birthYear) {
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String toString() {
        return this.name + " (" + this.birthYear + ")";
    }
}
