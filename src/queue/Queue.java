package queue;

import lists.LinkedList;

public class Queue {

    LinkedList list = new LinkedList();

    public void insert(String element){
        list.add(element);
    }

    public String remove(){
        if(!isEmpty()){
            return list.removeTheFirst();
        }
        return "Queue is empty!";
    }

    public boolean isEmpty(){
        return list.size()<=0;
    }

    @Override
    public String toString(){
        return list.toString();
    }
}
