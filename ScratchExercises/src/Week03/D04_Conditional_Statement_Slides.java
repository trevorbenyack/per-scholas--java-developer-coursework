package Week03;



public class D04_Conditional_Statement_Slides {

    public static void main (String[] args) {

        // Operators example
        int number = (int) (Math.random() * 100);
        System.out.println("The number is " + number);
        System.out.println("Divisible by 2 AND 3: " + (number % 2 == 0 && number % 3 == 0));
        System.out.println("Divisible by 2 OR 3: " + (number % 2 == 0 || number % 3 == 0));
        System.out.println("Divisible by 2 OR 3, but not both: " + (number % 2 == 0 ^ number % 3 == 0));

        // lottery number example
        int lotteryNum = (int)(Math.random() * 90 + 10);
        System.out.println("The lottery number is " + lotteryNum);

        // Prime numbers
        // print first 20 prime numbers
        String primes = "";
        Boolean isPrime = true;
        for (int i = 2 ; i <= 20 ; i++) {
            for(int j = 2 ; j < i ; j++) {
                if( i % j == 0 && i !=j) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                primes += i + " ";
            }
            isPrime = true;
        }

        for (int i = 0; i < primes.length(); i++) {

        }

        // Need to count instances of numbers in string
        System.out.println("Total number of primes is " );
        System.out.println("primes are " + primes);



    } // end main method

} // end D04_Conditional_Statement_Slides class
