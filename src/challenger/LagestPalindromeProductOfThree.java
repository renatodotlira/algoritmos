package challenger;

//A palindromic number reads the same both ways. The largest palindrome made from the product of
//  two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

public class LagestPalindromeProductOfThree {

    public static void main(String[] args) {
        long product;
        long biggestPalindrome = 0;
        long currentPalindrome;
        for(int x = 900; x < 1000; x++){
            for(int y = 100; y < 1000; y++){
                product = x*y;
                if(isPalindrome(product)) {
                    currentPalindrome = product;
                    if(currentPalindrome > biggestPalindrome){
                        biggestPalindrome = currentPalindrome;
                    }
                }
            }
        }
        System.out.println(biggestPalindrome);

    }

    public static boolean isPalindrome(long n){
        char[] number = (n+"").toCharArray();
        for(int x = 0; x < number.length / 2; x++) {
            if(number[x] != number[number.length - 1 - x]){
                return false;
            }
        }
        return true;
    }

}
