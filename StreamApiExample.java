package java8;


import java.util.Arrays;

public class StreamApiExample {
	public static void main(String[] args) {
		
		int[] a = { 1, 1, 6, 8, 9, 5, 3, 4, 66, 44, 54, 23, 56 };
		
		System.out.println(Arrays.stream(a).sum());

		System.out.println(Arrays.stream(a).filter(x -> x % 2 == 0).sum());

		System.out.println(Arrays.stream(a).filter(x -> x % 2 == 1).sum());
		System.out.println("===============");

		Arrays.stream(a).forEach(x -> System.out.println(x));
		System.out.println("===============");

		System.out.println(Arrays.stream(a).min().getAsInt());
		
		Demo d=()->System.out.println("hello");
		d.hello();
	
//		List<Integer> list = new ArrayList<>();
//		list.add(3);
//		list.add(2);
//		list.add(4);
//		list.add(1);
//
//		int total = 0;
//		for (int x : list) {
//			if (x % 2 == 0) {
//				total += (x * x);
//			}
//		}
//		System.out.println(total);
//
//		int total2 = list.stream().filter(x -> x % 2 == 0).mapToInt(x -> x * x).sum();
//
//		System.out.println(total2);

//	//double - using map()
//	Stream<Integer> stream1=list.stream();
//	 
//	Stream<Integer> stream2=stream1.map(n->2*n);
//	stream2.forEach(n->System.out.println(n));
//	System.out.println("================================");
//	
//	//filter print even
//	Stream<Integer> stream3=list.stream();
//	Stream<Integer> stream4=stream3.filter(n->n%2==0);
//	stream4.forEach(n->System.out.println(n));
//	
//	System.out.println("================================");
//	
//	list.stream().map(n->2*n).forEach(n->System.out.println(n));
//	
//	System.out.println("================================");
//	
//	list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
//	
//	System.out.println("================================");
//	
	}
}

interface Demo
{
	void hello();
}
