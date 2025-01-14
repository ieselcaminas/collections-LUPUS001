package comparable;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear){
        this.firstName  = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    @Override
    public String toString(){
        return this.getFirstName() + ", " + this.getLastName() + " - " + this.getBirthYear();
    }

    @Override
    public int compareTo(Person other){
        return other.getBirthYear() + this.getBirthYear();
    }
}
