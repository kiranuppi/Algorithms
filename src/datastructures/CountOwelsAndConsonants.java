package datastructures;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CountOwelsAndConsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {

            String input = sc.nextLine();
            if(input.equalsIgnoreCase("q")){
                break;
            }else {

                printOwelsAndConsonants(input);
            }
        }
    }

    private static void printOwelsAndConsonants(String str) {
        int vowel = 0;
        int consonents = 0;
        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            if (Pattern.matches("[aeiouAEIOU]", Character.toString(c)))
                vowel++;
            else {
                consonents++;
            }
        }
        System.out.println(vowel+" "+consonents);
    }


}
