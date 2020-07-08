package multithreading;

public class ThreadGroupExemplo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        /*
         * Um ThreadGroup representa um conjunto de threads. Um grupo de threads também pode incluir o
         * outro grupo de threads. O grupo de threads cria uma árvore na qual todos os grupos de threads,
         * exceto o grupo de threads inicial, têm um pai.
         * */
        ThreadGroupExemplo runnable = new ThreadGroupExemplo();
        ThreadGroup tg1 = new ThreadGroup("ThreadGroup pai");

        Thread t1 = new Thread(tg1, runnable, "1");
        t1.start();

        Thread t2 = new Thread(tg1, runnable, "2");
        t2.start();

        Thread t3 = new Thread(tg1, runnable, "3");
        t3.start();

        System.out.println("Thread GroupName: " + tg1.getName());
        tg1.list();


    }
}
