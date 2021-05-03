package Week05.Day02.Lambdas.Unit03;

import Week05.Day02.Lambdas.Unit01.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(

                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39));

        // These are _external_ iterators -- you are managing the iteration process
        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("Using for-in loop");
        for(Person p : people) {
            System.out.println(p);
        }

        // Internal iterator
        // Since we're not controlling the order, and just need an action performed on each element
        // the runtime can parallelize the execution of the forEach method

        // takes in a Consumer<T> interface...
        // p represents one element in people... similar to how its used in the for-in loop
        System.out.println("Using lambda for each loop");
        people.forEach(p -> System.out.println(p));
        // for each element in people, take Person p and print it

        // this is an equivalent expression... each person element is passed in to the println()
        people.forEach(System.out::println);


    }

}
