//Q) 3 Create a thread using lambda function?
public class Question3 {
    public static void main(String[] args) {
        // Creating a thread using a lambda function
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread is running: " + i);
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}
