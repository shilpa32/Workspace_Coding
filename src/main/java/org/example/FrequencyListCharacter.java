package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyListCharacter {
    public static void main(String[] args) {

        String text = "apple banana";
        Map<Character, Integer> charFrequencies = new HashMap<>();

        for(char ch : text.toCharArray())

        {
            if(ch!=' ')
            {
                charFrequencies.put(ch,charFrequencies.getOrDefault(ch,0)+1);
            }
        }
        System.out.println(charFrequencies);  // this will print in hash Map


        for (Map.Entry<Character, Integer> character:charFrequencies.entrySet())
        {
            System.out.println(character.getKey() + ":"+ character.getValue());
        }


        // 2nd Approach
        String input = "apple banana";

        Map<Character, Long> result = input.chars().filter(characters -> characters != ' ').mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(result);


        //3rd approach

        String s = "chaitrak";

        for (Map.Entry<Character, Integer> entry : getFrequen(s).entrySet()) {
            //to get duplicated words
            if(entry.getValue()>1){
                System.out.println(" only duplicate values" + entry.getKey() + " " + entry.getValue());
            }
            if(entry.getValue() ==1 ){
                System.out.println(" only unique values " + entry.getKey() + " " + entry.getValue());
            }
        }
        List<Map.Entry<Character, Integer>> li = new ArrayList<>(getFrequen(s).entrySet());
//        asscending order
//        li.sort((entry1,entry2) -> entry1.getValue().compareTo(entry2.getValue()) );


//        descending order
        li.sort((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()) );
        for(Map.Entry<Character,Integer> ent: li){
            System.out.println(ent);
        }

    }

    public static Map<Character, Integer> getFrequen(String s) {
        Map<Character, Integer> h = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (h.containsKey(c)) {
                h.put(c, h.get(c) + 1);
            } else {
                h.put(c, 1);
            }
        }
        return h;
    }

    }


