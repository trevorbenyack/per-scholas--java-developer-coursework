package Week05.Day04.Exc01_ListExercise;

import java.io.*;
import java.util.*;

public class HackerRankListExercise {

    public static void main(String[] args) {
        /* Enter your code here. Read input
        from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        ArrayList<Integer> intList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            intList.add(input.nextInt());
        }

        int m = input.nextInt();
        input.nextLine();

        for(int i = 0; i < m; i++) {
            String query = input.nextLine();
            if (query.equalsIgnoreCase("insert")) {
                int index = input.nextInt();
                int value = input.nextInt();

                intList.add(index, value);
            } else if (query.equalsIgnoreCase("delete")) {
                int index = input.nextInt();

                intList.remove(index);
            }

            if (i != m - 1) {
                input.nextLine();
            }

        }

        for(Integer myInt : intList) {
            System.out.print(myInt + " ");
        }


    }
}
