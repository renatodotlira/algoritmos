package consult;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 1234;
        System.out.println(reverse(number));
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
