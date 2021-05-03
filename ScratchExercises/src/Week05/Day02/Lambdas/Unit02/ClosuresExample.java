package Week05.Day02.Lambdas.Unit02;

public class ClosuresExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // b is in scope of main, so the compiler will freeze it when executing the lambda
        // the compiler sees b as effectively final
        doProcess(a, i -> System.out.println(i + b));
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }

}

interface Process {
    void process(int i);
}
