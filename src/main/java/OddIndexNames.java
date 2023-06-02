import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIndexNames {
    public static String getFormattedNames(List<String> names) {
        String[] a = names.toArray(new String[0]);
        return IntStream.range(1, names.size() + 1)
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> i + ". " + a[i - 1])
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "John", "Peter", "Alice", "Mike");
        String formattedNames = getFormattedNames(names);
        System.out.println(formattedNames);
    }
}
