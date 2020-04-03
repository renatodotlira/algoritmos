package Anagramas;

import java.util.HashSet;
import java.util.Set;

public class Anagram {
    public static void main(String... args){
        char[] letras = {'a','b', 'c'};
        Set indices = new HashSet();
        doit(letras,indices,"");
    }
    public static void doit(char[] letras, Set indices, String palavra){
        System.out.println(palavra+"------"+indices);
        for (int x = 0; x < letras.length; x++){
            if(!indices.contains(x)){
                indices.add(x);
                if(indices.size()==letras.length)
                    System.out.println(palavra+""+letras[x]);
                else
                    doit(letras,indices,palavra+""+letras[x]);
                indices.remove(x);
            }
        }
    }
}
