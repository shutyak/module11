import java.util.stream.Stream;

public class RandomGenerator {
    static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long a=25214903917L;
        long c=11;
        long m=(1L<<48);
        Stream<Long> rndStream= generateRandomStream(System.currentTimeMillis(),a,c,m);
        rndStream.limit(10).forEach(System.out::println);

    }
}
