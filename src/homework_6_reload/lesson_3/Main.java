package homework_6_reload.lesson_3;

import homework_6_reload.Person;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        //3 - Flatten multidimensional collection (read about .flatMap non-terminal operation and use it)

        List<Person> people = asList(new Person("Arman", 28), new Person("Mher", 30)
                , new Person("Hexine", 15));

        people.stream().map(Person::getName).flatMap(Stream::of).forEach(System.out::println);
        people.stream().map(Person::getAge).flatMap(Stream::of).forEach(System.out::println);

        people.stream().map(Person::getName).flatMap(name -> Stream.of(name.charAt(2))).forEach(System.out::println);

        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> all =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        List<Integer> collect = all.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(collect);


    }
}
