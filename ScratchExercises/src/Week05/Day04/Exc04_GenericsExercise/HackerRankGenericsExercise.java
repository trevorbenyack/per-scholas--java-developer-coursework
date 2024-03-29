package Week05.Day04.Exc04_GenericsExercise;

import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
    //Write your code here
    <T> void printArray(T[] array) {
        for(T t : array){
            System.out.println(t);
        }
    }

}

public class HackerRankGenericsExercise {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
