package Week05.Day02.Lambdas.Unit01;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

//         // the closed parens means no arguments are passed in
//         greetingFunction = () -> System.out.print("Hello World");

//         // If you have a one line lambda expression, you must omit the return
//         // the parameter goes in the ()
//         doubleNumberFunction = (int a) -> a * 2;

//         multiple parameters
//         addFunction = (int a, int b) -> a + b;

//        // When the function has more than one line, curly braces are necessary, as is the return
//        safeDivideFunction = (int a, int b) -> {
//
//            if (b == 0) return 0;
//            return a / b;
//
//        };

//        stringLengthCountFunction = (String S) -> args.length();

        // use the Interface type for holding function variables
        MyLambda myLambdaFunction = () -> System.out.println("Hello World");

        MyAdd addFunction = (int a, int b) -> a + b;

        // if you have an interface that already matches your method signature, then you can use that instead of creating a new interface
        Greeting myLambdaFunction2 = () -> System.out.println("Hello World");

        // Using this vs creating a new class instance is that we're kind of creating an implementation on the fly
        Greeting lambdaGreeting = () -> System.out.println("Hello World 2");

    }

    interface MyLambda {
        void foo();
    }

    interface MyAdd {
        int add(int x, int y);
    }

}
