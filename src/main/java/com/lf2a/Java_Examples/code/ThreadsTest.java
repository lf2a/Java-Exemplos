package com.lf2a.Java_Examples.code;

class T1 implements Runnable {
	public void run() {
		System.out.println("Olá T1");

	}
}

class T2 implements Runnable {
	public void run() {
		System.out.println("Olá T2");

	}
}

class T3 extends Thread {
	public void run() {
		System.out.println("Olá T3");
	}
}

public class ThreadsTest {
	public static void main(String[] args) throws InterruptedException {
		T1 t1 = new T1();
		Thread th1 = new Thread(t1);
		System.out.println(th1.getId());
		th1.setName("Thread 1"); // seta o nome da thread
		System.out.println(th1 /* ou th1.getName() */);
		System.out.println(th1.getPriority()); // retorna a prioridade
		th1.start();
		System.out.println(th1.isAlive()); // checa se está vivo

		System.out.println();

		T2 t2 = new T2();
		Thread th2 = new Thread(t2);
		System.out.println(th2.getId());
		th2.setName("Thread 2");
		System.out.println(th2);
		System.out.println(th2.getPriority());
		th2.start();
		System.out.println(th2.isAlive());

		T3 t3 = new T3();
//		t3.start();

		try {
			t3.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		Thread.sleep(5000); // throws InterruptedException (5000 milisegundos)
		System.out.println("Bye!");
	}
}
