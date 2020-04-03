package projecteuler;

public class Question04 {

    public static void main(String[] args) {
        int largestPalindrome = 0;
        int limit = 101110; // adicionado para passar no hackerrank
        int a = 999;
        while (a >= 100) {
            int b = a;
            while (b >= 100) {
                if(a * b <= largestPalindrome)
                    break;
                if(isPalindrome(a * b) && (a * b) < limit)
                    largestPalindrome = a * b;
                b -= 1;
            }
            a -= 1;
        }
        System.out.println(largestPalindrome);
    }

    static boolean isPalindrome(int x){
        return x == reverse(x);
    }

    static int reverse(int n){
        int reversed = 0;
        while (n > 0) {
            reversed = 10 * reversed + n % 10;
            n = n / 10;
        }
        return reversed;
    }
}
