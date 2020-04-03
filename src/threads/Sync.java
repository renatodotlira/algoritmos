package threads;

class Sender{
    public void send(String msg){
        System.out.println("Sending\t" + msg);
        try {
            Thread.sleep(1000);
        }catch (Exception ex){
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n"+msg+" Sent");
    }
}
class ThreadedSend extends Thread{
    private String msg;
    private Thread t;
    Sender sender;

    //Recieves a message object and a string
    //message to be sent
    ThreadedSend(String m, Sender obj){
        msg = m;
        sender = obj;
    }
    public void run(){
        //Only one thread can send a message
        //at a time.
        synchronized (sender){
//            synchronized the snd object
            sender.send(msg);
        }
    }
}

public class Sync {
    public static void main(String... args){
        Sender snd = new Sender();
        ThreadedSend S1 = new ThreadedSend("Hi", snd);
        ThreadedSend S2 = new ThreadedSend("Bye", snd);

        //Start two threads of ThreadedSend type
        S1.start();
        S2.start();

        //wait for threads to end
        try {
            S1.join();
            S2.join();
        }catch (Exception ex){
            System.out.println("Interrupted");
        }
    }
}
