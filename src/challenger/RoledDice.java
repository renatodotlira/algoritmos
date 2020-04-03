package challenger;


//There are 1111 ways in which five 6-sided dice (sides numbered 1 to 6) can be rolled so that the top three sum to 15. Some examples are:
//
//        D1,D2,D3,D4,D5 = 4,3,6,3,5
//        D1,D2,D3,D4,D5 = 4,3,3,5,6
//        D1,D2,D3,D4,D5 = 3,3,3,6,6
//        D1,D2,D3,D4,D5 = 6,6,3,3,3
//
//In how many ways can twenty 12-sided dice (sides numbered 1 to 12) be rolled so that the top ten sum to 70?

import java.util.Arrays;

public class RoledDice {

    private static int count = 0;

    private static int dadoTipo = 6;

    private static int parametro = 15;

    private static int numJogadas = 5;

    private static int total = 0;

    private static int countTotal = 0;

    public static void main(String[] args) {
        int[] nums = new int[numJogadas];
        run(nums, numJogadas);
        System.out.println(count);
        System.out.println(countTotal);

    }

    private static int run(int[] nums, int turn){
        if((total + (turn * dadoTipo) > parametro )) {
            if (turn > 0)
                for (int i = 1; i <= dadoTipo; i++) {
                    int index = numJogadas - turn;
                    nums[index] = i;

                    total = total + i;
                    turn = run(nums, --turn);
                    total = total - i;
                }
            else {
                if (getTotal(nums) == parametro) {
                    count++;
//                    System.out.println(printArray(nums));
                }
                countTotal++;
            }
        }
        return ++turn;
    }

    private static int getTotal(int[] nums){
        int[] numsCopy = new int[nums.length];
        for (int x = 0; x < nums.length; x++){
            numsCopy[x] = nums[x];
        }
        int total = 0;
        int aux;
        for(int x = 0; x < numsCopy.length; x++){
            for (int y = x + 1; y < numsCopy.length; y++){
                if(numsCopy[x] < numsCopy[y]){
                    aux = numsCopy[x];
                    numsCopy[x] = numsCopy[y];
                    numsCopy[y] = aux;
                }
            }
        }
        for(int x = 0; x < 3; x++)
            total += numsCopy[x];
        return total;
    }

    private static String printArray(int[] nums){
        String ret = "";
        for(int x = 0; x < nums.length; x++){
            ret = ret+nums[x];
        }
        return ret;
    }

}
