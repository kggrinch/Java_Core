package Threads;

public class Threads {
    public static void main(String[] args) throws InterruptedException {

        // Thread - A thread of execution in a program (kind of like a virtual cpu)
        //          The JVM (Java Virtual Machine) allows an application to have multiple threads running concurrently
        //          Each thread can execute parts of your code in parallel with the main thread.
        //          Each thread has a priority.
        //          Threads with higher priority are executed in preference compared to threads with a lower priority.
        //          The priority number is on a scale of 1-10 where the higher the number the greater priority

        //          The JVM (Java Virtual Machine) continues to execute threads until either one of the following occurs
        //              1. The exit method of class Runtime has been called
        //              2. All user threads have died.

        //          When a JVM (Java Virtual Machine) starts up, there is a thread which calls the main method.
        //          This thread is called "main"

        //          There are two types of threads: user threads and daemon threads
        //          Daemon thread is a low priority thread that runs in background to perform tasks such as garbage
        //          collection.
        //          JVM (Java Virtual Machine) terminates itself when all user threads (non-daemon threads) finish their
        //          execution.

        // Checks how many threads are active. Two because of the main thread and plus the JVMs garbage collector.
        System.out.println("Thread.activeCount(): " + Thread.activeCount());

        // Checks current thread running.
        System.out.println("Thread.currentThread().getName(): " + Thread.currentThread().getName());

        // Could also change the name of the current thread.
        Thread.currentThread().setName("MAIN");
        System.out.println("Thread.currentThread().setName(\"MAIN\") + Thread.currentThread().getName(): "
                + Thread.currentThread().getName());

        // Could check the priority of a thread.
        System.out.println("Thread.currentThread().getPriority() " + Thread.currentThread().getPriority());

        // Could change the priority of a thread.
        Thread.currentThread().setPriority(6);
        System.out.println("Thread.currentThread().setPriority(1) + Thread.currentThread().getPriority(): "
                + Thread.currentThread().getPriority());

        // Checks if the current thread is alive.
        System.out.println("Thread.currentThread().isAlive(): " + Thread.currentThread().isAlive());

        // This iterates through the loop with half a second intervals using the thread.sleep() method.
        for(int i = 3; i>0; i--)
        {
            System.out.println(i);
            Thread.sleep(500);
        }
        System.out.println("You are done!");

        // Creating another thread.
        MyThread thread2 = new MyThread();

        // Checks if thread2 is alive. Output false since we have not started this thread, we have only created it.
        System.out.println("thread2.isAlive(): " + thread2.isAlive());

        // Starting thread2
        thread2.start(); // Makes the thread alive and executes the run method at the end of the thread.
        System.out.println("thread2.isAlive(): " + thread2.isAlive());

        // If you were to just write:
//      thread2.run(); This would execute the run method but not make the thread alive.

        System.out.println("thread2.getName(): " + thread2.getName());

        thread2.setName("thread2");
        System.out.println("thread2.setName(\"thread2\") + thread2.getName(): " + thread2.getName());

        // Check thread2's priority. Inherits the priority of the thread that made it which was main thread
        System.out.println("thread2.getPriority(): " + thread2.getPriority());

        thread2.setPriority(4);
        System.out.println("thread2.setPriority(4) + thread2.getPriority(): " + thread2.getPriority());

        System.out.println("Thread.activeCount(): " + Thread.activeCount());

        // Checks if thread2 is a daemon thread
        System.out.println("thread2.isDaemon(): " + thread2.isDaemon());

        thread2.setDaemon(true); // Sets thread2 as a daemon thread
        System.out.println("thread2.setDaemon(true) + thread2.isDaemon(): " + thread2.isDaemon());
    }
}

// Creating a new thread
class MyThread extends Thread
{
    @Override
    public void run()
    {
        if(this.isDaemon())
        {
            System.out.println(this.getName() + " is a daemon thread running");
        }
        else
        {
            System.out.println(this.getName() + " is a user thread running");
        }
    }
}