package sorts;

import lists.LinkedList;

public class SelectSort {

    public static void main(String... args){
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(1);
        list.add(10);
        list.add(9);
        list.add(4);
        list.add(3);
        list.add(0);
        for (int x = 0; x < list.size()-1; x++){
            int smallIndex = findSmaller(list, x);
            list.swap(x,smallIndex);
        }
        System.out.println(list);
    }

    public static int findSmaller(LinkedList list, int index){
        int smallerIndex = index;
        for(int x = index+1; x < list.size(); x++){
            int small = (int)list.get(smallerIndex);
            int valueX = (int)list.get(x);
            if(small>valueX){
                smallerIndex = x;
            }
        }
        return smallerIndex;
    }
}
