package homework_6_reload.lesson_7;

import homework_6_reload.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        // 7 Partition adults and kids
        PartitionAdultsAndKids partitionAdultsAndKids = new PartitionAdultsAndKids();

        List<Person> people = asList(new Person("Arman", 28), new Person("Mher", 30)
                , new Person("Hexine", 15), new Person("Armine", 10));

        Map<Boolean, List<Person>> adultsAndKids = partitionAdultsAndKids.partitionAdultsAndKids(people);

        adultsAndKids.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + ": "
                        + entry.getValue().stream().map(person -> new Person(person.getName(), person.getAge())).collect(Collectors.toList())));

    }
}
