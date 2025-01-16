package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Anagram {

    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "cat", "act", "bat"};
        //        String s1="taste";
//        String s2 ="state";
        // System.out.println(checkAnagram(s1,s2));
        getAnagram(words);
    }

    public static void getAnagram(String[] n) {
        Map<String, List<String>> h = new HashMap<>();
        for (String c : n) {
            String result = getSorted(c); // first iteration : eilnst
            if (!h.containsKey(result)) {
                h.put(result, new ArrayList<>());
            }
            h.get(result).add(c);
        }
        h.keySet().parallelStream().sorted().forEachOrdered(System.out::println);
   // h.values().stream().spliterator().trySplit().forEachRemaining(System.out::println);





//        for (List<String> c2 : h.values()) {
//            System.out.println(c2);
//        }
    }



    public static String getSorted(String s) {
        char[] c1 = s.toCharArray();
        Arrays.sort(c1);
        return new String(c1);
    }
}
