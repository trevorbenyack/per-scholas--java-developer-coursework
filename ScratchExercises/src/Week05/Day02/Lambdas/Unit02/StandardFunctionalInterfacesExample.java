package Week05.Day02.Lambdas.Unit02;

import Week05.Day02.Lambdas.Unit01.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(

                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39));

        // Step 1: Sort list by last name

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        System.out.println("Printing all person:");
        performConditionally(people, p -> true, p -> System.out.println(p));

        // Step 3: Create a method that prints all people that have last name beginning with 'C'
        System.out.println("Printing all persons with last name with C");
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        //
        System.out.println("Printing all persons with last name with D");
        performConditionally(people, p -> p.getLastName().startsWith("D"), p -> System.out.println(p.getFirstName()));
    }

    // doesn't care what the condition is, just prints if the condition is met
    // uses the Functional Interface package instead of creating our own interface (Condition)
    private static void performConditionally(List< Person > people, Predicate<Person> predicate, Consumer<Person> consumer) {

        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }

}

