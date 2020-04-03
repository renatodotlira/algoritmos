package sorts;
import java.util.Scanner;

public class MergeSortArrayNew {
//    public static void main(String... args) {
//        Scanner scanner = new Scanner(System.in);
//        int tamanhoArray = scanner.nextInt();
//        Integer[] array = new Integer[tamanhoArray];
//        for (int i = 0;i<tamanhoArray;i++)
//            array[i] = scanner.nextInt();
//
//        Integer[] newArray = sort(array);
//        System.out.print("[");
//        for (int x = 0;x < newArray.length; x++) {
//            if(x == 0)
//                System.out.print(newArray[x]);
//            else
//                System.out.print(","+newArray[x]);
//        }
//        System.out.print("]");
//        scanner.close();
//    }
//
//    private static Integer[] sort(Integer[] list, int begin, int end) {
//        int size = list.length;
//        int half = size/2;
//        sort(list,0,half));
//        sort(getArray(list,half,size));
//        return merge(list);
//    }
//    private static Integer[] merge(Integer[] list, int begin, int middle, int end){
//        Integer[] arrayNew = new Integer[list.length];
//        int indexNewArray = 0;
//        int x = 0, y = 0;
//        while (x < list1.length && y < list2.length) {
//            if (list1[x] >= list2[y]) {
//                arrayNew[indexNewArray] = list2[y];
//                y++;
//            }else{
//                arrayNew[indexNewArray] = list1[x];
//                x++;
//            }
//            indexNewArray++;
//        }
//        while (x < list1.length)
//            arrayNew[indexNewArray++] = list1[x++];
//        while (y < list2.length)
//            arrayNew[indexNewArray++] = list2[y++];
//        return arrayNew;
//    }
//    private static Integer[] getArray(Integer[] array, int from, int to){
//        Integer[] newArray = new Integer[to - from];
//        int index = 0;
//        for(int x = from; x < to; x++){
//            newArray[index] = array[x];
//            index++;
//        }
//        return newArray;
//    }
}
