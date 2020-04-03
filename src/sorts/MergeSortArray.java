package sorts;

import java.util.Scanner;

public class MergeSortArray {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoArray = scanner.nextInt();

        int[] array = new int[tamanhoArray];

        for (int i = 0;i<tamanhoArray;i++)
            array[i] = scanner.nextInt();

        sort(array,0, tamanhoArray);sort(array,0, tamanhoArray);
        System.out.print("[");
        for (int x = 0;x < array.length; x++) {
            if(x == 0)
                System.out.print(array[x]);
            else
                System.out.print(","+array[x]);
        }
        System.out.print("]");
        scanner.close();
    }

    private static int[] sort(int[] list, int from, int to) {
        int half, total;
        if (((to - from) % 2) == 0)
            half = ((to - from) / 2) + from;
        else
            half = ((to - from) / 2) + from + 1;
        if (to - from > 2) {
            list = sort(list, from, half);
            list = sort(list, half, to);
        }
        total = to;
        for (int x = from; x < total; x++) {
            int current = list[x];
            int toChange = x;
            for (int y = half; y < total; y++) {
                if (x > y) {

                } else {
                    int actual = list[y];
                    if (current > actual) {
                        swap(list, y, toChange++);
                    }
                }
            }
        }
        return list;
    }

    private static void swap(int[] array, int x, int y){
        int aux = array[x];
        array[x] = array[y];
        array[y] = aux;
    }
}
