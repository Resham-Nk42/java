class Message {
    private String content;
    private boolean isMessageReady = false;

      public synchronized void writeMessage(String message) {
        while (isMessageReady) { // Wait if the message is not yet consumed
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        content = message;
        isMessageReady = true;
        System.out.println("Produced: " + message);
        notify(); // Notify the reader
    }

  
    public synchronized String readMessage() {
        while (!isMessageReady) { // Wait if no new message is available
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        isMessageReady = false;
        System.out.println("Consumed: " + content);
        notify(); // Notify the writer
        return content;
    }
}

public class SimpleInterThreadCommunication {
    public static void main(String[] args) {
        Message message = new Message();

       
        Thread producer = new Thread(() -> {
            String[] messages = {"Hello", "How are you?", "Goodbye"};
            for (String msg : messages) {
                message.writeMessage(msg);
                try {
                    Thread.sleep(500); // Simulate time to produce
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

     
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                message.readMessage();
                try {
                    Thread.sleep(1000); // Simulate time to consume
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}