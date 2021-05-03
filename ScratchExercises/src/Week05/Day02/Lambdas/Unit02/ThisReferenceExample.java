package Week05.Day02.Lambdas.Unit02;

// This is an example showing that lambda's are not syntactical sugar around anonymous inner classes
public class ThisReferenceExample {

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this);
            // This works b/c (this) is pointing to
            // the instance of the object upon which the execute method is being called
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i is " + i);

                // (this) refers to the new inner anonymous Process() method
                // *not* the thisReferenceExample instance
                System.out.println(this);
            }

            // to show that we're actually referencing the inner anonymous class
            @Override
            public String toString() {
                return "This is the anonymous inner class";
            }
        });

        // example to show that the "this" reference remains unmodified inside a lambda expression
        // versus how it is modified when using an anonymous inner class
        // the (this) reference in a lambda expression does not override that of the class it is contained in
        // moral of the story is lambdas are different than anonymous inner classes
        thisReferenceExample.doProcess(10, i -> {
            System.out.println("Value of i is " + i);

//            // Can't compile because (this) is treated differently in a lambda expression than in
//            // an anonymous inner class
//            System.out.println(this);


        });

        System.out.println("Using the class instance:");
        thisReferenceExample.execute();

    }

    public String toString() {
        return "This is the main ThisReferenceExample class instance";
    }
}
