package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyListString {
    public static void main(String[] args) {

        // 1st approach


        String[] s = {"end", "start", "making", "of", "ending", "start"};

        // To find frequency of element
        System.out.println(Arrays.stream(s).collect(Collectors.groupingBy(word->word,Collectors.counting())));



        // 2nd approach
        // Create a map
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);

        // Use getOrDefault to fetch values
        int aliceScore = scores.getOrDefault("Alice", 0); // Key exists  so output is 85
        int charlieScore = scores.getOrDefault("Charlie", 0); // Key does not exist so output is 0

        System.out.println("Alice's score: " + aliceScore); // Output: 85
        System.out.println("Charlie's score: " + charlieScore); // Output: 0



        // 3rd approach

        Map<String, String> config = new HashMap<>();
        config.put("theme", "dark");

        String theme = config.getOrDefault("theme", "light"); // Returns "dark"
        String language = config.getOrDefault("language", "English"); // Returns "English"

        System.out.println("Theme: " + theme); // Output: Theme: dark
        System.out.println("Language: " + language);



        // 4th approach

        for (Map.Entry<String, Integer> e : getFre(s).entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }

    public static Map<String, Integer> getFre(String[] s) {
        Map<String, Integer> h1 = new HashMap<>();
        for (String s2 : s) {
            h1.put(s2, h1.getOrDefault(s2, 0) + 1);
        }
        return h1;
    }

}
