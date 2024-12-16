class MessageThread extends Thread {
    private String message;
    private int interval;

    
    public MessageThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    
    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(interval);            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}

public class Meena {
    public static void main(String[] args) {
        MessageThread thread1 = new MessageThread("BMS College of Engineering", 10000);
        MessageThread thread2 = new MessageThread("CSE", 2000);
       
        
        thread1.start();
        thread2.start();
    }
}