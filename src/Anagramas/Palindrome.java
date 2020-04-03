package Anagramas;
import java.util.*;
class Palindrome{
public static void main(String[]p){
    int n,j=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    String r="";
    while(++j<n){
        StringBuilder g = new StringBuilder(s.next());
        r+=(g.toString().equals(g.reverse().toString()))?j+" \"YES\"\n":j+" \"NO\"\n";
    }
    System.out.println(r);}
}