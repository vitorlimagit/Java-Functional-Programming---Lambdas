package programming;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FP03FunctionalInterfaces2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        Function<Integer, Integer> squareFunction = x -> x * x;

        Function<Integer, String> stringOutputFunctional = x -> x + " ";

        BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;

        // No Input > Return Something
        // Supplier

        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);

        };

       // System.out.println(randomIntegerSupplier.get());

        UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
      //  System.out.println(unaryOperator.apply(10));

        BiPredicate<Integer, String> biPredicate = (number,str) -> {
            return number <10 && str.length() >5;
        };
       // System.out.println(biPredicate.test(15, "in28minutes"));

        BiFunction<Integer, String, String> biFunction = (number,str) -> {
            return number + " " + str;
        };
       // System.out.println(biFunction.apply(15, "in28minutes"));

        BiConsumer<Integer, String> biConsumer = (s1,s2) ->{
            System.out.println(s1);
            System.out.println(s2);
        };

        biConsumer.accept(15,"in28minutes");










    }
}
