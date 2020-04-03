package sorts;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String... args){

        int[] vet = {5,4,8,6,2,1,4,10,9,7,0,3};
        int size = vet.length;
        System.out.println(Arrays.toString(vet));

        for(int x = 0; x < size; x++){

            for(int y = x+1; y < size; y++){

                if(vet[x]>vet[y]){
                    int aux = vet[y];
                    vet[y] = vet[x];
                    vet[x] = aux;
                    System.out.println(Arrays.toString(vet));
                }

            }
            System.out.println(Arrays.toString(vet));
        }
        System.out.println(Arrays.toString(vet));

    }
}
