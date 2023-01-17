package java8;

public class MultiThreadingExample {
	public static void main(String[] args) {

		T1 t1 = new T1();
		t1.start();

		T2 t2 = new T2();
		Thread thread = new Thread(t2);
		thread.start();

		for (int i = 1; i <= 20; i++) {
			System.out.println("MAIN : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class T1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("T1 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class T2 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("T2 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
