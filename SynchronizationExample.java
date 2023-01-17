package java8;

public class SynchronizationExample {

	int count = 0;

	synchronized void increasecount() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {
		SynchronizationExample example = new SynchronizationExample();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					example.increasecount();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					example.increasecount();
				}
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(example.count);
	}
}
