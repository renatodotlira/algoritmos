package sorts;

import lists.LinkedList;

import java.util.Scanner;

public class MergeSortLinketList {
    public static void main(String... args){
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int tamanhoArray = scanner.nextInt();

        for (int i = 0;i<tamanhoArray;i++)
            list.add(scanner.nextInt());

        sort(list,0, tamanhoArray);
        System.out.print("[");
        for (int x = 0;x < list.size(); x++) {
            if(x == 0)
                System.out.print(list.get(x));
            else
                System.out.print(","+list.get(x));
        }
        System.out.print("]");
        scanner.close();
    }

    private static LinkedList sort(final LinkedList list, int from, int to){
        int half, total;

        if(((to-from)%2)==0)
            half = ((to-from)/2)+from;
        else
            half = ((to-from)/2)+from+1;
        if(to-from>2){
//            list =
                    sort(list, from, half);
//            list =
                    sort(list, half, to);
        }
        total = to;
        for (int x = from; x < total; x++){
            int current = (int)list.get(x);
            int toChange = x;
            for (int y = half; y < total; y++){
                if(x>y){

                }else{
                    int actual = (int)list.get(y);
                    if (current>actual){
                        list.swap(y,toChange++);
                    }
                }
            }
        }
        return list;
    }
}
