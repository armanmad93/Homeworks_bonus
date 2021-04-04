package homework_6_reload.lesson_8;

import homework_6_reload.Person;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class GropePeopleByNationality {
    public Map<String, List<Person>> gropePeopleByNationality(List<Person> personList) {
        Map<String, List<Person>> collect = personList.stream()
                .collect(groupingBy(Person::getNationality));

        return collect;
    }
}
