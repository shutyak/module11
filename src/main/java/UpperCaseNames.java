import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseNames {
    public static List<String> getUpperSorted(List<String> names) {
        return names.stream()
                .map(s -> s.toUpperCase())
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "John", "Peter", "Alice", "Mike");
        List<String> formattedNames = getUpperSorted(names);
        System.out.println(formattedNames);
    }
}
