package stack;

public class TestStack {

    public static void main(String... args){
        Stack stack = new Stack();
        stack.insert("Renato");
        stack.insert("Mauricio");
        stack.insert("Kellen");
        System.out.println(stack);
        System.out.println(stack.remove());
        System.out.println(stack);
        System.out.println(stack.remove());
        System.out.println(stack);
        System.out.println(stack.remove());
        System.out.println(stack);
        System.out.println(stack.remove());
        System.out.println(stack);
        System.out.println(stack.remove());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
    }
}