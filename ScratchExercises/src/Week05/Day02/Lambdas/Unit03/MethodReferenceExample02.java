package Week05.Day02.Lambdas.Unit03;

import Week05.Day02.Lambdas.Unit01.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample02 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(

                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39));

        System.out.println("Printing all persons");
        performConditionally(people, p -> true, p -> System.out.println(p));

        // this is shorthand for the java compiler saying I'm taking an input argument and passing it in
        // It knows it needs an input argument because it's takeing the place of consumer when being passed in
        performConditionally(people, p -> true, System.out::println);
        // original structure looks like:
        // Class { method(parameter p) }
        // Class::method == p -> method(p)

    }

    private static void performConditionally(List< Person > people, Predicate<Person> predicate, Consumer<Person> consumer) {

        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
