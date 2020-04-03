package problems;

import java.util.Scanner;

public class ReverseInt {

    public static void main(String...args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        System.out.println("The reversed number is: "+reverse(x));
    }

    private static String reverse(int n){
        String reversed = "";
        String signal = "";
        String stringOfNumber = ""+n;
        if (n<0) {
            stringOfNumber = stringOfNumber.substring(1);
            signal = "-";
        }
        for (char c:stringOfNumber.toCharArray()) {
            reversed = c + reversed;
        }
        return signal+reversed;
    }
}
