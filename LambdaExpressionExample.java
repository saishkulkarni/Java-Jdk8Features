package java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);

		list.forEach(x -> System.out.println(x));

		// 1
		Test2 t2 = new Test3();
		t2.show();

		// 2
		Test2 t3 = new Test2() {

			@Override
			public void show() {
				System.out.println("Hello");
			}
		};
		t3.show();

		// 3
		Test2 t4 = () -> System.out.println("HIII");

		t4.show();
	}
}

interface Test2 {
	void show();
}

class Test3 implements Test2 {

	@Override
	public void show() {
		System.out.println("hello");
	}

}
