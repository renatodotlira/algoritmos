package projecteuler;

public class Question06 {

    public static void main(String[] args) {
        long x = 3;
        System.out.println(squareSum(x) - square(x));
    }

    static long square(long n){
        long total = 1;
        for(int x = 2; x <= n; x++){
            total += (x * x);
        }
        return total;
    }

    static long squareSum(long n){
        long sum = (n * (n + 1)) / 2;
        return sum * sum;
    }
}
