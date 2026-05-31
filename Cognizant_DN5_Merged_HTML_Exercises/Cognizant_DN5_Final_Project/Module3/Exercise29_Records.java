import java.util.List;

record Person(String name,int age){}

public class Exercise29_Records {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Rahul",21),
                new Person("Priya",25),
                new Person("Akhil",18)
        );

        people.stream()
                .filter(p -> p.age() >= 21)
                .forEach(System.out::println);
    }
}