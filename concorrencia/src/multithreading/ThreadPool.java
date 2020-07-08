package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String s) {
        this.message = s;
    }

    public void run() {
        System.out.printf("%s (Start) message = %s\n", Thread.currentThread().getName(), message);
        // chama processmessage faz com que a thread durma por 2 segundos
        processmessage();
        System.out.printf("%s (End)\n", Thread.currentThread().getName());
    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        /*
         * No caso de conjunto de threads, um grupo de threads de tamanho fixo é criado.
         * Um thread do conjunto de threads é retirado e atribuído um trabalho pelo provedor de serviços.
         * Após a conclusão do trabalho, a thread é contida no conjunto de threads novamente.
         * */

        // criando um pool de 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        System.out.println("Todas as threads terminaram");
    }
}
