package Anagramas;

public class Permutacao {

    public static void main(String[] args) {
        String palavra = "abc";
        permutation(palavra);
    }

    static void permutation(String str){
        permutation("", str);
    }

    static void permutation(String prefix, String str){
        System.out.println(prefix+" -- "+str);
        if(str.length() == 0){
            System.out.println("'"+prefix+"'");
        }else{
            for (int i = 0; i < str.length(); i++){
                String rem = str.substring(0, i) + str.substring(i + 1);
                System.out.println(i);
                permutation(prefix + str.charAt(i), rem);
            }
            System.out.println(" ");
        }
    }
}
