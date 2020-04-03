package challenger.primes;

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.

import java.math.BigInteger;

public class PrimeNumberSum {

    private static BigInteger total = BigInteger.valueOf(2);

    public static void main(String...args){
        System.out.println(printPrimes(2000000));
    }

    private static BigInteger printPrimes(int quantity){
        int x = 3;
        for (; x <= quantity;){
            if(isPrime(x)) {
                total = total.add(BigInteger.valueOf(x));
            }
            x = x + 2;
        }
        return total;
    }

    private static boolean isPrime(int x){
        int range = (int) Math.sqrt(x);
        for (int i = 3; i <= range ;){
            if(x % i ==0)
                return false;
            i = i + 2;
        }
        return true;
    }

}