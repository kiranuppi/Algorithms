/*
 *A palindromic number reads the same both ways.
 *If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * *The sum of these multiples is 23.
 *Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * https://projecteuler.net/problem=1
 */

public class MultiplesOfThreeAndFive {

    public static int countMultiplesOfThreeAndFive(int range) {

        int total = 0;
        for (int i = 0; i < range; i++) {
            int MULTIPLES_OF_THREE = 3;
            int MULTIPLES_OF_FIVE = 5;

            if (i % MULTIPLES_OF_THREE == 0 || i % MULTIPLES_OF_FIVE == 0) {
                total = total + i;
            }
        }
        return total;
    }

    public static void main(String[] args) {

        System.out.println("Sum of all the multiples of 3 or 5 below 1000 = " + countMultiplesOfThreeAndFive(1000));
    }
}
