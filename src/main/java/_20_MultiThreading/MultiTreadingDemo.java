package _20_MultiThreading;

public class MultiTreadingDemo {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());
		t1.start();
		t2.start();
	}

}
