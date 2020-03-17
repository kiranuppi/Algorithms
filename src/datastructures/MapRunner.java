package datastructures;

import java.util.HashMap;

public class MapRunner {
    public static void main(String[] args) {
        String str = "This is a wonderful day and i am loving it. wonderful event and wonderful";
        HashMap<Character,Integer> map = new HashMap<>();

        char[] characters = str.toCharArray();

        for(char character:characters){
            Integer integer = map.get(character);
            if(integer == null){
                map.put(character,1);
            }else{
                map.put(character, integer+1);
            }

        }
        System.out.println("map = " + map);

        String[] strArr = str.split(" ");

        HashMap<String, Integer> strMap = new HashMap<>();

        for(String string :strArr){
            Integer integer1 = strMap.get(string);

            if(integer1==null){
                strMap.put(string,1);
            }else{
                strMap.put(string,integer1+1);
            }

        }

        System.out.println("strMap = " + strMap);
    }
}
