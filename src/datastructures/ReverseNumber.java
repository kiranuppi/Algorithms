package datastructures;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println("Please enter a number to reverse");
        Scanner sc = new Scanner(System.in);
        try{
            while(sc.hasNextLine()){

                int number = sc.nextInt();

                System.out.println("Reversed number = " + reversedNumber(number));
                System.out.println("Reversed number Using String = " + reversedNumberUsingString(number));
            }
sc.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static String reversedNumberUsingString(int number) {

        return (new StringBuffer(String.valueOf(number)).reverse()).toString();

    }

    private static int reversedNumber(int number) {

        int reversedNumber=0;
        int reminder;

        while(number !=0){
            reminder = number%10;
            reversedNumber = reversedNumber*10 + reminder;
            number = number/10;
        }
        return reversedNumber;
    }
}
