import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;

public class Anagram {

    public static boolean isAnagram(String word1, String word2) {
        word1 = word1.replaceAll("\\s", "");
        word2 = word2.replaceAll("\\s", "");

        if (word1.length() != word2.length()) {
            return false;
        } else {
            char[] sortedArr1 = word1.toLowerCase().toCharArray();
            Arrays.sort(sortedArr1);
            char[] sortedArr2 = word2.toLowerCase().toCharArray();
            Arrays.sort(sortedArr2);

            return Arrays.equals(sortedArr1, sortedArr2);
        }
    }

    public static boolean anagram(String word1, String word2) {
        boolean found = false;
        if (word1.length() != word2.length()) {
            return false;
        } else {
            char[] sortedArr1 = word1.toCharArray();
            char[] sortedArr2 = word2.toLowerCase().toCharArray();

            for (int i = 0; i < sortedArr1.length; i++) {

                for (int j = 0; j < sortedArr2.length; j++) {
                    if (sortedArr1[i] == sortedArr2[j]) ;
                    found = true;
                }
                i++;

            }

        }
        return found;

    }

    public static int reverseNumber(int number) {

//        int reversedNum = 0;
//        while(number!=0){
//
//        int temp = number % 10;
//        reversedNum = reversedNum*10+temp;
//        number=number/10;
//
//        }
//        return reversedNum;
//
        StringBuffer string = new StringBuffer(java.lang.String.valueOf(number));
        Integer integer = Integer.valueOf(string.reverse().toString());
        return integer;

    }

    public static boolean isPalindrome(String word1) {
        StringBuffer newWord = new StringBuffer(word1);
        return (newWord.equals(newWord.reverse()));
    }

    public static void main(String[] args) {
        String firstWord = "act";
        String secondWord = "cat";

        if (anagram(firstWord, secondWord)) {
            System.out.println("this is Anagram");
        } else {

            System.out.println("test failed");
        }

        if (isPalindrome("abba")) {
            System.out.println("This is datastructures.Palindrome String");
        }
        // System.out.prfirstWordintln("testForAnagram = " + testForAnagram);
        //System.out.println("anagram = " + anagram);

        int reversedNumber = reverseNumber(100);
        System.out.println("reversedNumber = " + reversedNumber);
    }

    String[] arr = {"cat", "dog", "act", "fish", "god", "dove"};

    List<String> list = Arrays.asList(arr);


}
