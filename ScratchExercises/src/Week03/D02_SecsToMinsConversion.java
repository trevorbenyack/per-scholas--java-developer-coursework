package Week03;

import java.util.Scanner;

public class D02_SecsToMinsConversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in seconds: ");
        int seconds = input.nextInt();
        int minutes = 0;


        while (seconds > 60) {
            minutes += 1;
            seconds -= 60;
        }
        System.out.println();
        System.out.println("minutes: " + minutes + " seconds: " + seconds);
    }
}
