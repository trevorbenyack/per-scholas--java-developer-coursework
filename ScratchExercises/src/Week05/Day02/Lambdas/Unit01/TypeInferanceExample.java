package Week05.Day02.Lambdas.Unit01;

public class TypeInferanceExample {

    public static void main(String[] args) {

        // input type of the arguments not necessary because the compiler can infer it
        StringLengthLamda myLamda = (s) -> s.length();

        // if there is only one argument, then no parens are needed


        myLamda.getLength("Hello Lambda");
        StringLengthLamda myLamdaNoParens = s -> s.length();

        // the lambda expression can be passed into a method directly
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLamda l) {
        System.out.println(l.getLength("Hello Lambda"));
    }

    interface StringLengthLamda {

        int getLength(String s);

    }
}
