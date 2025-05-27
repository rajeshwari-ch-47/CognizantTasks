
import java.util.List;
import java.util.stream.Collectors;

public class t29_records {

    record Person(String name, int age) {

    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 30),
                new Person("Bob", 15),
                new Person("Carol", 25)
        );

        System.out.println("All people:");
        people.forEach(System.out::println);

        List<Person> adults = people.stream()
                .filter(p -> p.age() >= 18)
                .collect(Collectors.toList());

        System.out.println("Adults:");
        adults.forEach(System.out::println);
    }
}
