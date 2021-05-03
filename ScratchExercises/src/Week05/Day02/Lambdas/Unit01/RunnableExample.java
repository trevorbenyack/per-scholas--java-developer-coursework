package Week05.Day02.Lambdas.Unit01;

public class RunnableExample {

    public static void main(String[] args) {

        // Using an anonymous inner class
        Thread myThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Printed inside Runnable!");
            }

        });

        myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
        myLambdaThread.run();

    }

}
