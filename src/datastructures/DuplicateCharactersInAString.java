package datastructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCharactersInAString {
    private static void printDuplicateChars(String input){
        HashMap<Character,Integer> map = new HashMap<>();

        char[] chararecters = input.toCharArray();

        for(Character c : chararecters){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

    }


    private static void printDuplicateWords(List<String> input){
        HashMap<String,Integer> map = new HashMap<>();

        //char[] chararecters = input.toCharArray();

        for(String word : input){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word,1);
            }

        }

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

    }


    public static void main(String[] args) {
        printDuplicateChars("Kiran Uppinkudru");

        String string = "This day that day another day";

        String[] array = string.split(" ");
        printDuplicateWords(Arrays.asList(array));
    }
}
