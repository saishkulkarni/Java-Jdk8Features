package java8;

interface Tester {
	public static void disp() {
		System.out.println("Hello");
	}

	public default void print() {
		System.out.println("Byee");
	}
}

public class InterfaceBodyExample {
	public static void main(String[] args) {
		Tester tester = new Tester() {
		};
		tester.print();
		Tester.disp();
	}
}
