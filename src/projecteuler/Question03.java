package projecteuler;

public class Question03 {

    public static void main(String[] args) {

        double valor = 600851475143d;
        int prime = 2;

        while (valor > 1) {
            if(valor % prime == 0){
                valor = valor / prime;
            }else{
                prime = nextPrime(prime);
            }
        }
        System.out.println(prime);
    }

    static int nextPrime(int p){
        if(p == 2)
            return 3;
       else
            do {
                p += 2;
            }while (!isPrime(p));
       return p;
    }

    static boolean isPrime(int p){
        if(p > 2 && p % 2 == 0 || p % 3 == 0)
            return false;
        for(int x = 5; (x * x) <= p; x += 2){
            if(p % x == 0)
                return false;
        }
        return true;
    }

}
