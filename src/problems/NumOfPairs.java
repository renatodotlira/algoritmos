package problems;

import java.util.ArrayList;
import java.util.List;

public class NumOfPairs {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        List<Integer> numeros = new ArrayList<>();
        int pares = 0;
        for(int x = 0; x < ar.length; x++){
            if(!numeros.contains(ar[x])){
                numeros.add(ar[x]);
            }else{
                pares++;
                numeros.remove(numeros.indexOf(ar[x]));
            }
        }
        return pares;
    }

    public static void main(String[] args) {
        int[] ar = {3, 5, 2, 5, 3, 2, 2, 2};
        System.out.println(sockMerchant(7, ar));
    }

}
