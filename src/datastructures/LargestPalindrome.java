package datastructures;/*
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * https://projecteuler.net/problem=4
 */

public class LargestPalindrome {

    private static Integer largestPalindromeNumber(int lower_bound, int upper_bound) {
        int largestPalindromeNumber = 0;
        for (int i = upper_bound; i >= lower_bound; i--) {
            for (int j = upper_bound; j >= lower_bound; j--) {
                int multipliedNumber = i * j;
                if (isPalindrome(String.valueOf(multipliedNumber)) && multipliedNumber > largestPalindromeNumber) {
                    largestPalindromeNumber = multipliedNumber;
                }
            }
        }

        return largestPalindromeNumber;
    }

    private static boolean isPalindrome(String palindromeString) {
        String reversedString = new StringBuilder(palindromeString).reverse().toString();
        return reversedString.equals(palindromeString);

    }

    public static void main(String[] args) {

        System.out.println("largest palindrome made from the product of two 3-digit number = " + largestPalindromeNumber(100, 1000));
    }

    private static Integer biggestPalindrome(int lowerBound, int upperBound){
        int largestPalindrome = 0;

        for (int i=upperBound;i>lowerBound;i--){
            for(int j=upperBound;j>lowerBound;j--){
                int multipledNumber = i*j;
                if(isPalindrome(String.valueOf(multipledNumber)) && multipledNumber>largestPalindrome){
                    largestPalindrome = multipledNumber;
                }
            }
        }
        return  largestPalindrome;
    }
}
