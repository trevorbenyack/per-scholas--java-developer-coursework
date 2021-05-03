package Week05.Day04.Exc06_BitSetExercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Compare {

    public static void main(String[] args) throws FileNotFoundException {

        File outputFile = new File("src/Week05/Day04/Exc06_BitSetExercise/output.dat");
        File expectedFile = new File("src/Week05/Day04/Exc06_BitSetExercise/expectedOutput.dat");

        Scanner output = new Scanner(outputFile);
        Scanner expected = new Scanner(expectedFile);

        int i = 2;
        while(output.hasNextLine()) {
            String o = output.nextLine();
            String e = expected.nextLine();

            if (!o.equalsIgnoreCase(e)) {
                System.out.printf("Difference on line: %5d o: %8s e: %8s %n", i, o, e);
            }

            i++;

        }


    }

}
