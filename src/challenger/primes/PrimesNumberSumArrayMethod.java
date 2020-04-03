package challenger.primes;

import java.math.BigInteger;
import java.util.Arrays;

public class PrimesNumberSumArrayMethod {

    public static void main(String[] args) {

        boolean[] primes = new boolean[2000000];

        BigInteger total = BigInteger.valueOf(0);

        Arrays.fill(primes, true);

        primes[0] = primes[1] = false;

        for(int x = 2; x < primes.length/10; x++)
            if(primes[x])
                for (int y = x * 2; y < primes.length; y += x) primes[y] = false;

        for(int x = 0; x < primes.length; x++)
            if(primes[x])
                total = total.add(BigInteger.valueOf(x));

        System.out.println(total);

    }

}