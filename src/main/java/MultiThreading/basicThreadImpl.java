package main.java.MultiThreading;

public class basicThreadImpl extends Thread {
    @Override
    public void run() {
        long n = Thread.currentThread().getId();
        if (n % 2 == 0)
            System.out.println("Current thread: " + Thread.currentThread().getId()
                    + " name: " + Thread.currentThread().getName());
        else
            System.out.println("odd: "+Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        basicThreadImpl obj = null;
        for (int i = 0; i < 10; i++) {

            obj = new basicThreadImpl();
            obj.start();

        }
    }

}
