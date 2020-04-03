package challenger.primes;

import java.math.BigInteger;

public class p35 {

    public static void main(String[] args) {
        boolean[] sieve = new boolean[1000];
        java.util.Arrays.fill(sieve,true);

        sieve[0] = sieve[1] = false;

        for (int i = 2; i <= sieve.length / 10; i++) {
            System.out.println("i: "+i);
            if (sieve[i]) {
                System.out.println(sieve[i]);
                for (int j = i+i; j < sieve.length; j+=i) {
                    sieve[j] = false;
                    System.out.println("j: "+j+" "+sieve[j]);
                }
            }else{
                System.out.println(sieve[i]);
            }
        }

//        int res = 0;
//        for (int i = 2; i < 100; i++) {
//            if (sieve[i]) {
//                String p = i + "";
//
//                boolean ok = true;
//                for (int j = 0; j < p.length(); j++) {
//                    p = p.substring(1) + p.substring(0, 1); // rotate left by 1
//                    if (!sieve[Integer.parseInt(p)]) {
//                        ok = false;
//                        break;
//                    }
//                }
//                if (ok) {
////                    System.out.println(i);
//                    res++;
//                }
//            }
//        }
//        System.out.println(res);
    }
}
