/*
 * BUsing names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order.
 * Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 * What is the total of all the name scores in the file?
 *
 * https://projecteuler.net/problem=22
 */


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameScore {

    private static final String filePath = "src/names.txt";

    public static void main(String[] args) {

        Scanner sc = null;
        try {
            sc = new Scanner(new File(filePath)).useDelimiter(",");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> names = new ArrayList<>();
        if (sc != null) {
            while (sc.hasNext()) {
                names.add(sc.next());
            }
        }
        Collections.sort(names);

        int total = 0;
        for (String name : names) {
            total = total + letterSum(name);
        }

        System.out.println("The total of all the name scores in the file = " + total);
    }

    /* Take each word to covert them into char array and calculate sum treating 'A' as 1, 'Z' as 26
    */
    private static int letterSum(String word) {
        int sum = 0;
        for (char character : word.toCharArray()) {
            if (Character.isUpperCase(character)) {
                sum = sum + character - ('A' - 1);
            }
        }
        return sum;
    }

}
