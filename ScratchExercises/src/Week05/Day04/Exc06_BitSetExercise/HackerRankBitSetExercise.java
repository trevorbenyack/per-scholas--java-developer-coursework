package Week05.Day04.Exc06_BitSetExercise;

import java.io.*;
import java.util.*;

public class HackerRankBitSetExercise {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        File file = new File("src/Week05/Day04/Exc06_BitSetExercise/input.dat");
        File outputFile = new File("src/Week05/Day04/Exc06_BitSetExercise/output.dat");
        FileWriter output = new FileWriter(outputFile);

        Scanner input = new Scanner(file);
        int length = input.nextInt();
        int numOperations = input.nextInt();

        BitSet b1 = new BitSet(length);
        BitSet b2 = new BitSet(length);

        for (int i = 0; i < numOperations; i++ ) {
            String operation = input.next();
            int first = input.nextInt();
            int second = input.nextInt();

            BitSet left;
            left = (first == 1) ? b1 : b2;

            switch (operation) {
                case "AND":
                    for(int j = 0; j <= length; j++) {
                        if(b1.get(j) & b2.get(j)) {
                            left.set(j);
                        } else {
                            left.set(j, false);
                        }
                    } break;
                case "OR":
                    for(int j = 0; j <= length; j++) {
                        if(b1.get(j) | b2.get(j)) {
                            if (first == 1) b1.set(j);
                            left.set(j);
                        } else {
                            left.set(j, false);
                        }
                    } break;
                case "XOR":
                    for(int j = 0; j <= length; j++) {
                        if(b1.get(j) ^ b2.get(j)) {
                            left.set(j);
                        } else {
                            left.set(j, false);
                        }
                    } break;
                case "FLIP":
                    if (first == 1) b1.flip(second);
                        else b2.flip(second); break;
                case "SET":
                    if (first == 1) b1.set(second);
                        else b2.set(second); break;
            }

            if (i < numOperations - 1) {
                input.nextLine();
            }

            int b1count = 0;
            int b2count = 0;
            for (int j = 0; j <= length; j++) {
                if(b1.get(j)) b1count++;
                if(b2.get(j)) b2count++;
            }

            System.out.println(b1count + " " + b2count);
            output.write(b1count + " " + b2count + "\n");

        }

        input.close();
        output.close();

        System.out.println("length is " + length);
        System.out.println("B1's length is " + b1.size());
    }
}