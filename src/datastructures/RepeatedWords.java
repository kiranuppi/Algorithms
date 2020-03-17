package datastructures;

import java.util.HashMap;

public class RepeatedWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            while(sc.hasNextLine()){
                String sentence = sc.nextLine();
                if(sentence.equalsIgnoreCase("q")){
                    break;
                }
                //sentence.toLowerCase()
                String[] words = sentence.toLowerCase().split(" ");
                HashMap<String, Integer> stringMap = new HashMap<>();
                int count;
                for (String word:words) {
                    if(stringMap.containsKey(word)){
                        count = stringMap.get(word);
                        stringMap.put(word,count+1);
                    }else{
                        stringMap.put(word,1);
                    }
                }
                stringMap.forEach((k,v)-> System.out.println("Word " +k+ " has appeared :"+v+" times"));

            }
            sc.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
