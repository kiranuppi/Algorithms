package datastructures;/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 *
 * https://projecteuler.net/problem=7
 */

public class PrimeNumber {
    public static boolean isPrime(int number){
        boolean isPrime = false;
        if(number == 2){
            isPrime = true;
        }
        for(int i = 2; i < number; i++){
            if(number % i != 0){
                isPrime = true;
            } else {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int nthPrime(long n) {
        int numberOfPrimes = 0;
        int prime = 1;

        while (numberOfPrimes < n) {
            prime++;
            if (isPrime(prime)) {
                numberOfPrimes++;
            }
        }
        return prime;
    }

    public static void main(String[] args) {

        System.out.println("The 10 001st prime is: " + nthPrime(10001));

    }
}
