package homework_6_reload.lesson_7;

import homework_6_reload.Person;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionAdultsAndKids {
    public Map<Boolean, List<Person>> partitionAdultsAndKids(List<Person> personList) {
        Map<Boolean, List<Person>> peopleByPartition = new LinkedHashMap<>();

        List<Person> partition = personList.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());

        List<Person> notPartition = personList.stream()
                .filter(person -> person.getAge() <= 18)
                .collect(Collectors.toList());

        peopleByPartition.put(true, partition);
        peopleByPartition.put(false, notPartition);

        return peopleByPartition;
    }
}
