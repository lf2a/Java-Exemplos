package multithreading;

public class EsperandoThreadTerminar extends Thread {
    // usado para uma ação na thread
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        EsperandoThreadTerminar t1 = new EsperandoThreadTerminar();
        EsperandoThreadTerminar t2 = new EsperandoThreadTerminar();
        EsperandoThreadTerminar t3 = new EsperandoThreadTerminar();

        // iniciando a execução de uma thread
        t1.start();

        try {
            // esperando pela thread t1 morrer
            // só vai para a próxima instrução quando ela morrer
            t1.join();
            System.out.println("Terminou :) Próximo!!!");
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}
