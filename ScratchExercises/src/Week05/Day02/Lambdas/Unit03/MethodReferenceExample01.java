package Week05.Day02.Lambdas.Unit03;

public class MethodReferenceExample01 {
    public static void main(String[] args) {

        // Use lambda to execute a runnable in a thread
        Thread t = new Thread(() -> printMessage());
        t.start();

        // Using a method reference
        // can be used when when you have a lambda expression that takes in no arguments
        // that calls a method with no arguments
        // Structure (ClassName::MethodName)
        Thread t2 = new Thread(MethodReferenceExample01::printMessage);
        // exactly the same as doing:
        // MethodReferenceExample01::printMessage == () ->printMessage();

    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
