package challenger;


//There are 1111 ways in which five 6-sided dice (sides numbered 1 to 6) can be rolled so that the top three sum to 15. Some examples are:
//
//        D1,D2,D3,D4,D5 = 4,3,6,3,5
//        D1,D2,D3,D4,D5 = 4,3,3,5,6
//        D1,D2,D3,D4,D5 = 3,3,3,6,6
//        D1,D2,D3,D4,D5 = 6,6,3,3,3
//
//In how many ways can twenty 12-sided dice (sides numbered 1 to 12) be rolled so that the top ten sum to 70?

import java.util.*;

public class RoleDicetryTwo {

    private static int dadoTipo = 6;

    private static int parametro = 15;

    private static int numJogadas = 5;

    private static int total = 0;

    private static int numToppers = 3;

    private static int tot = 0;

    private static int jogadasMenores = 0;

    private static Set indices = new HashSet();

    private static List<Double> maiores = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = new int[numToppers];

        int x = 0, y = 0;

        jogadasMenores = numJogadas-numToppers;

//
//        anagram2(anagram, jogadasMenores, 5, 0);
//        System.out.println(tot*(jogadasMenores+1));
//
//        tot = 0;
//
//        anagram2(anagram, jogadasMenores, menorDosToppers, 0);
//        System.out.println(tot*(jogadasMenores+1));

//        Set indices = new HashSet();
//        anagrams(nums, anagram, indices, 0, 0);
        run(nums, numToppers);
        System.out.println(tot);

    }

    private static int run(int[] nums, int turn){
        if (turn > 0)
            for (int i = dadoTipo; i >= 1 ; i--) {

                int index = numToppers - turn;
                nums[index] = i;

                total = total + i;
                turn = run(nums, --turn);
                total = total - i;
            }
        else {
            if(total == parametro){
                double n = toLong(nums);
                if(!maiores.contains(n)){
                    maiores.add(n);
//                    System.out.println("-"+printArray(nums));
                    int[] menores = new int[numJogadas - numToppers];

                    anagram2(nums, menores, jogadasMenores, getMenor(nums), 0);
//
                    menores = new int[numToppers];
//
                    anagrams(nums, menores, indices, 0, 0);

                }
            }
        }
        return ++turn;
    }

    private static double toLong(int[] nums){
        return Double.valueOf(printArray(nums));
    }

    private static void anagrams(int[] nums, int[] anagran, Set indices, int index, int turns){
        for (int i = 0; i < nums.length ; i++) {
            if(!indices.contains(i)){
                turns++;
                anagran[index] = nums[i];
                indices.add(i);
                if(turns < nums.length){
                    index++;
                    anagrams(nums, anagran, indices, index, turns);
                }else{
                    turns--;
                    double n = toLong(anagran);
                    if(!maiores.contains(n)){
                        maiores.add(n);
//                        System.out.println("-"+printArray(anagran));
                        int[] menores = new int[numJogadas - numToppers];
//
                        anagram2(anagran, menores, jogadasMenores, getMenor(nums), 0);

                    }
                    indices.remove(i);
                    anagran[index] = 0;
                    return;
                }
                index--;
                turns--;
                anagran[index] = 0;
                indices.remove(i);
            }
        }
    }

    private static int[] mergeArray(int[] array1, int[] array2){
        int[] merged = new int[array1.length + array2.length];
        for (int x = 0; x < array1.length; x++){
            merged[x] = array1[x];
        }
        for (int x = array1.length; x < merged.length; x++){
            merged[x] = array2[x - array1.length];
        }
        return merged;
    }

    private static int anagram2(int[] major,int[] nums, int turn, int min, int index){
        if (turn > 0)
            for (int i = 1; i <= min; i++) {
                nums[index] = i;
                index++;
                turn = anagram2(major, nums, --turn, min, index);
                index--;
            }
        else {
            int[] merged = mergeArray(major, nums);
            double numero = toLong(merged);

            if(!maiores.contains(numero)){
                tot++;
//                System.out.println(" "+numero+" "+tot);
                maiores.add(numero);
            }else {
//                System.out.println(" "+numero+" "+tot+" já existe!");
            }
            printArrange(merged, 2);
        }
        return ++turn;
    }

    private static String printArray(int[] nums){
        String ret = "";
        for(int x = 0; x < nums.length; x++){
            ret = ret+nums[x];
        }
        return ret;
    }

    private static int getMenor(int[] nums){
        int menor = nums[0];
        for(int x = 1; x < nums.length; x++){
            if(menor > nums[x])
                menor = nums[x];
        }
        return menor;
    }

    private static void printArrange(int[] v, int pivot){
        int z = 0;
        for (int x = pivot; x >= 0; x--){
            for (int y = x; y < v.length - 1 - z; y++){
                int aux = v[y];
                v[y] = v[y + 1];
                v[y + 1] = aux;
                double numero = toLong(v);
                if(!maiores.contains(numero)){
                    tot++;
//                    System.out.println(" "+numero+" "+tot);
                    maiores.add(numero);
                }else {
//                    System.out.println(" "+numero+" "+tot+" já existe!");
                }
                int[] clone = clone(v);
                for (int i = y; i > 0; i--){
                    int aux2 = clone[i];
                    clone[i] = clone[i-1];
                    clone[i-1] = aux2;
                    double numero2 = toLong(clone);
                    if(!maiores.contains(numero2)){
                        tot++;
                        maiores.add(numero2);
//                        System.out.println("    "+numero2+" "+tot);

                    }
                }
            }
            z++;
        }
//        System.out.println("");
    }

    private static int[] clone(int[] array){
        int[] copy = new int[array.length];
        for(int x = 0; x < copy.length; x++)
            copy[x] = array[x];
        return copy;
    }
}
