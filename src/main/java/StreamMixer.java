import java.util.Iterator;
import java.util.stream.Stream;

public class StreamMixer {
    static <T> Stream<T> mixSteam(Stream<T> a,Stream<T> b){
        Iterator<T> iteratorA= a.iterator();
        Iterator<T> iteratorB= b.iterator();
        Stream.Builder<T> builder = Stream.builder();
        while (iteratorA.hasNext() && iteratorB.hasNext()){
            builder.accept(iteratorA.next());
            builder.accept(iteratorB.next());
        }
        return builder.build();

    }
    public static void main(String[] args) {
        Stream<Integer> a=Stream.of(1,2,3,4,5);
        Stream<Integer> b=Stream.of(12,22,32,42,52);
        Stream<Integer> c=mixSteam(a,b);
        c.forEach(System.out::println);

    }
}
