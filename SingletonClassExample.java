package java8;

public class SingletonClassExample {
	public static void main(String[] args) {
		Sample sample = Sample.getInstance();
		System.out.println(sample);
		Sample sample2 = Sample.getInstance();
		System.out.println(sample2);
		Sample sample3 = Sample.getInstance();
		System.out.println(sample3);
	}
}

class Sample {
	static Sample sample;

	private Sample() {

	}

	static Sample getInstance() {
		if (sample == null) {
			sample = new Sample();
		}
		return sample;
	}
}