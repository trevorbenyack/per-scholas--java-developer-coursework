package Week05.Day04.Exc02_MapExercise;

import java.util.*;
import java.io.*;

class HackerRankMapExercise{
    public static void main(String []argh)
    {
        HashMap<String, Integer> contactMap = new HashMap<String, Integer>();

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();

            contactMap.put(name, phone);

        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (contactMap.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + contactMap.get(s));
            }
        }


    }
}
