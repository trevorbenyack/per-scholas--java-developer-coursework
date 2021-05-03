package Week05.Day02.Lambdas.Unit03;

import Week05.Day02.Lambdas.Unit01.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample01 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(

                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39));

        // Parts of a stream
        // 1. a source (people)
        // 2. actions (.filter())
        // 3. terminal operation (.forEach())
        people.stream() // can think of stream as a new view of the collection
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(System.out::println);

        // .parallelStream() can let the runtime split the stream and run the split streams in parallel
        long count = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("D"))
                .count();
        System.out.println("The number of people with the last name starting with D: " + count);

    }



}
