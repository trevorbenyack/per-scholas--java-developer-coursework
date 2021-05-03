package Week05.Day02.Lambdas.Unit02;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {

        int[] someNumbers = { 1, 2, 3, 4 };
        int key = 0;

//        // messy way to handle exceptions
//        process(someNumbers, key, (v, k) -> {
//
//            try {
//                System.out.println(v / k);
//            } catch (ArithmeticException e) {
//                System.out.println("An Arithmetic Exception occurred");
//            }
//
//        } );

        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for(int i : someNumbers) {
            consumer.accept(i, key);
        }
    }

    // creates a pass through function that creates a new lambda expression
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in the wrapper lambda");
            }
        };
    }

}
