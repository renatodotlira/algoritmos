package problems.hackerrank;

import java.util.*;

public class BirthdayChocolate {

    static int birthday(List<Integer> arr) {
        List<Integer> chaves = new ArrayList<>();
        List<Integer> valores = new ArrayList<>();
        chaves.add(arr.get(0));
        valores.add(1);
        if(arr.size() == 1){
            return arr.get(0);
        }
        for (int x = 1; x < arr.size(); x++){
            if(!chaves.contains(arr.get(x))){

                chaves.add(arr.get(x));
                valores.add(1);

            }else{
                int indexChave = chaves.indexOf(arr.get(x));
                int valor = valores.get(indexChave);
                valor++;
                valores.set(indexChave, valor);
            }
        }

        int total = chaves.size();

        for (int x = 0; x < total; x++) {
            for (int y = x; y < total; y++) {
                if (valores.get(y) > valores.get(x)) {

                    int auxChave = chaves.get(y);
                    int auxValor = valores.get(y);

                    chaves.set(y, chaves.get((x)));
                    valores.set(y, valores.get((x)));

                    chaves.set((x), auxChave);
                    valores.set((x), auxValor);

                }
            }
        }
        int x = valores.get(0);
        int i = 0;
        List<Integer> iguais = new ArrayList<>();
        while(x == valores.get(i)){
            iguais.add(chaves.get(i));
            i++;
        }
        int menor = Integer.MAX_VALUE;
        for (Integer v : iguais ) {
            if(v < menor){
                menor = v;
            }
        }

        return menor;
    }

    static int migratoryBirds(int[] ar) {

        for(int i=0;i<ar.length;i++) {
            ar[(ar[i] % 10) - 1] = ar[(ar[i] % 10) - 1] + 10;
        }
        int max = -1,q=0;
        for(int i=0;i<ar.length;i++){
            if(max<ar[i]/10){
                max = ar[i]/10;
                q=i+1;
            }
        }
        return q;
    }




    public static void main(String...args){
        int[] ar = {3, 3, 3, 4, 4, 4};
//        List<Integer> s = convertArrayToList(ar);
        int d = 18;
        int m = 7;
        System.out.println(migratoryBirds(ar));
    }

    static <T> List<T> convertArrayToList(T array[])
    {

        // Create an empty List
        List<T> list = new ArrayList<>();

        // Iterate through the array
        for (T t : array) {
            // Add each element into the list
            list.add(t);
        }

        // Return the converted List
        return list;
    }


}
