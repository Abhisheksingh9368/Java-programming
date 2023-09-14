public class ThreadExample {
    public static void main(String[] args) {
        Thread factorialThread = new FactorialThread();
        Thread tableThread = new TableThread();

        // Check default priorities
        System.out.println("Default Priority of Factorial Thread: " + factorialThread.getPriority());
        System.out.println("Default Priority of Table Thread: " + tableThread.getPriority());

        // Set the second thread to maximum priority
        tableThread.setPriority(Thread.MAX_PRIORITY);

        // Start both threads
        factorialThread.start();
        tableThread.start();
    }
}

class FactorialThread extends Thread {
    @Override
    public void run() {
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}

class TableThread extends Thread {
    @Override
    public void run() {
        System.out.println("Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}