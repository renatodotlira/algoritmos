package stack;

import lists.LinkedList;

public class Stack {

    LinkedList list = new LinkedList();

    public void insert(String name){
        list.add(name);
    }

    public String remove(){
        if(!isEmpty()){
            return list.removeTheLast();
        }
        return "Stack is empty!";
    }

    public boolean isEmpty(){
        return list.size()<=0;
    }

    @Override
    public String toString(){
        return list.toString();
    }

}
