import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> wordsMap = new HashMap<>();

        FileInputStream inputStream = null;

        try {

            inputStream = new FileInputStream("src/main/resources/book.txt");
            int c;

            String word = "";

            while ((c = inputStream.read()) != -1 ) {

                if(Character.isLetter((char)c)) {
                    word += Character.toLowerCase((char)c);
                } else if((char)c == '\'') {
                    // do nothing
                } else {
                    if(word.length() > 0) {

                        if (wordsMap.containsKey(word)) {
                            wordsMap.put(word, wordsMap.get(word) + 1);
                        } else {
                            wordsMap.put(word, 1);
                        }
                    }
                    word = "";
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // wordsMap.forEach((k,v) -> System.out.printf("%-15s%-4d%n", k, v));

        wordsMap.entrySet()
                .stream()
                .sorted(comparingByKey())
                .forEach(k -> {
                    System.out.printf("%-15s%-4d%n", k.getKey(), k.getValue());
                });
    } // end main

}
