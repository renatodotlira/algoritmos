package challenger;

import java.util.Scanner;

public class ReadString {
    public static void main(String...args){
        int t;
        Scanner scanner = new Scanner(System.in);
        t = Integer.parseInt(scanner.nextLine());
        for(int x = 0; x < t; x++){
            String[] in = scanner.nextLine().split(" ");
            System.out.println(in[0]+" "+in[1]+" "+in[2]);
        }
    }
}