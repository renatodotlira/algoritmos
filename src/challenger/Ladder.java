package challenger;

import lists.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class Ladder {


    public static String isOk(int a, int b, int c, int d) {
        if(a == c) {
            return "YES";
        }
        if(b == d){
            return "YES";
        }
        if(a > c){
            return "NO";
        }

        if(b > d){
            return "NO";
        }
        a = a + b;
        if(isOk(a, b, c, d).equals("YES")){
            return "YES";
        }
        b = a + b;
        if(isOk(a, b, c, d).equals("YES")){
            return "YES";
        }
        return "NO";
    }



    public static void main(String[] args) {
        System.out.println(isOk(1, 2, 3, 6));
    }


}