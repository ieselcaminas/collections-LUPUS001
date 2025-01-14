package comparable.Member;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        Member m = new Member("Aaron", 165);
        members.add(m);

        m = new Member("Javier", 188);
        members.add(m);

        m = new Member("Jose", 175);
        members.add(m);

        members.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
