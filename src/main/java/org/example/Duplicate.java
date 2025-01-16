package org.example;
import java.util.*;
import java.util.stream.*;
public class Duplicate {

        public static void main(String[] args) {
            List<String> words = Arrays.asList("one", "two", "three", "two", "four", "five", "three", "one");

            // Use a Set to find duplicates
            Set<String> seen = new HashSet<>();
            List<String> duplicates = words.stream()
                    .filter(word -> !seen.add(word)) // Add returns false if the element is already in the set
                    .toList();

            System.out.println("Duplicate Elements: " + duplicates);

            // Print original and duplicate elements
            System.out.println("Original List: " + words);
            System.out.println("Distinct Elements: " + words.stream().distinct().toList());


            List<String> words2 = Arrays.asList("one", "two", "three", "two", "four", "five", "three", "one");

            // Count occurrences of each element
            Map<String, Long> wordCounts = words2.stream()
                    .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

            // Filter elements with count > 1
            List<String> duplicates2 = wordCounts.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .toList();

            System.out.println("Duplicate Elements: " + duplicates2);
            System.out.println("Element Counts: " + wordCounts);
        }
    }
