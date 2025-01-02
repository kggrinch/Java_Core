package Threads;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {

        // Multi-threading - Process of executing multiple threads simultaneously.
        //                   Helps maximum utilization of CPU.
        //                   Threads are independent, they don't affect the execution of other threads.
        //                   An exception in one thread will not interrupt other threads.
        //                   Useful for serving multiple clients, multiplayer games, or other mutually independent tasks.

        // There are two ways to create a thread.
        // 1. Create a subclass that extends the Thread class and instantiate it. MyThread extends Thread
        // 2. Create a subclass that implements the Runnable class and instantiate it, then pass that
        //    instantiate class into the constructor of the Thread class.

        // Second method is slightly better since you can also use inheritance with the Runnable interface.
        // The first method is limited to one parent which already takes the role of creating the thread.

        // Join method - The join method makes the main thread to wait until a certain thread is finished.


        // First way
        ThreadOne thread1 = new ThreadOne();

        // Second way
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start(); // This thread1 starts.
        thread1.join(); // This pauses the current running thread (main thread) until thread1 is done.
//        thread1.join(300); // This will pause the main thread for 300 millie seconds until thread1 is done.
        thread2.start(); // Once thread1 is done the main thread goes to the next line which starts thread2.

//        System.out.println(1/0); Threads will still run despite the exception.

        // This will show an example of how the JVM only waits for user threads to finish before exiting. If
        // all user threads are finished and there are still daemon threads running the JVM will exit regardless.

        // Note: This won't work how it set up since the main thread keeps going after calling thread1 and thread2.
        // To test this set thread1 and thread2 as daemon threads right after creation.
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();
        System.out.println(1/0);










    }
}

// First way
class ThreadOne extends Thread
{
    @Override
    public void run()
    {
        for(int i = 10; i > 0; i--)
        {
            System.out.println("Thread1 " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread1 finished");
    }
}

// Second way to implement a thread.
// 1. Use a subclass that implements runnable
// 2. Create an instance of it: MyRunnable runnable1 = new MyRunnable();
// 3. Pass it as an argument to the thread class: Thread thread2 = new Thread(runnable1);

// Could also use inheritance with another class: class MyRunnable extends SomeOtherClass implements Runnable.
class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Thread2 " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread2 finished");
    }
}