package problems;

import java.math.BigInteger;

public class Counter {

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {
        BigInteger r = strangeCounter(BigInteger.valueOf(t));
        return r.longValue();
    }

    // Complete the strangeCounter function below.
    static BigInteger strangeCounter(BigInteger t) {
        BigInteger cont = BigInteger.valueOf(3);
        BigInteger soma = BigInteger.valueOf(3);
        while (soma.compareTo(t) == -1){
            cont = cont.multiply(BigInteger.valueOf(2));
            soma = soma.add(cont);
        }
        BigInteger sub = t.subtract(((soma.subtract(cont)).add(BigInteger.ONE)));
        return cont.subtract(sub);
    }

    public static void main(String[] args) {
        System.out.println(strangeCounter(8));
    }

}
