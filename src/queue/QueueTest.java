package queue;

public class QueueTest {
    public static void main(String... args){
        Queue queue = new Queue();
        queue.insert("renato");
        queue.insert("mauricio");
        queue.insert("kellen");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
    }




}
