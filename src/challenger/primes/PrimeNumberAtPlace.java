package challenger.primes;

import java.util.Scanner;

public class PrimeNumberAtPlace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int place;
        System.out.println("Enter a number for the  place: ");
        place = in.nextInt();
        System.out.println(getPrimeAtPlace(place));

    }

    static int getPrimeAtPlace(int p){
        int place = 2;
        int n = 5;
        int lastPrime = 5;
        while (place < p){
            if(isPrime(n)) {
                place++;
                lastPrime = n;
            }
            n = n + 2;
        }
        return lastPrime;
    }

    static boolean isPrime(int x){
        int range = (int) Math.sqrt(x);
        for(int i = 2; i <= range; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

}
