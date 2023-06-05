import java.util.Arrays;
import java.util.stream.Collectors;

public class GetAllNumbers {
    static String getAllNumbers(String[] arr){
        return Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

    }
    public static void main(String[] args) {
        String[] arr= {"1, 2, 0", "4, 5"};
        System.out.println(getAllNumbers(arr));

    }
}
