package homework_6_reload.lesson_2;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public List<String> filterFourCharacter(List<String> collection) {
        List<String> collect = collection
                .stream()
                .filter(element -> element.length() < 4)
                .collect(Collectors.toList());

        return collect;
    }
}
