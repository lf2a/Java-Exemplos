package multithreading;

public class TestandoThread extends Thread {
    // usado para uma ação na thread
    public void run() {
        // retorna uma referência ao objeto em execução no momento (thread que está executando).
        Thread t = Thread.currentThread();
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.printf("[%d] %s %d (isDaemon %b)\n", i, t.getName(), t.getPriority(), t.isDaemon());
        }
    }

    public static void main(String args[]) {
        /*
         * Cada thread tem uma prioridade. As prioridades são representadas por um número entre 1 e 10.
         * Na maioria dos casos, o agendamento de encadeamentos agenda os encadeamentos de acordo com
         * sua prioridade (conhecida como agendamento preemptive). Mas isso não é garantido porque depende
         * da especificação da JVM aquela que o scheduling escolher.
         *
         * Daemon threads são interrompidas quando a thread principal, aquela que executa o método main,
         * termina de executar e o programa termina. Se uma thread não é daemon, o processo Java continua
         * ativo e executando, mesmo quando atinge o final do método main e a thread principal termina.
         * Por padrão, as threads herdam a propriedade de ser daemon da thread que as criou. Como a thread
         * principal não é daemon, comumente as threads criadas no programa também não são.
         * Se for daemon depois de iniciar a thread irá lançar um erro IllegalThreadStateException.
         * */

        TestandoThread t1 = new TestandoThread();
        // nomeando uma thread
        t1.setName("T1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setDaemon(true);
        System.out.printf("Nome: %s ID: %d Prioridade: %d\n", t1.getName(), t1.getId(), t1.getPriority());

        TestandoThread t2 = new TestandoThread();
        // nomeando uma thread
        t2.setName("T2");
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.printf("Nome: %s ID: %d Prioridade: %d\n", t2.getName(), t2.getId(), t2.getPriority());

        // iniciando a execução de uma thread
        t1.start();
        t2.start();
    }
}
