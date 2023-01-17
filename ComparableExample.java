package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<Laptop> list = new ArrayList<>();
		list.add(new Laptop(1, "Acer", 75000));
		list.add(new Laptop(2, "Dell", 38000));
		list.add(new Laptop(3, "Lenovo", 55000));
		list.add(new Laptop(4, "Apple", 175000));
		System.out.println("Before Sorting...");
		System.out.println("====================");
		for (Laptop laptop : list) {
			System.out.println(laptop.getId());
			System.out.println(laptop.getName());
			System.out.println(laptop.getPrice());
			System.out.println("====================");
		}

		Collections.sort(list);
		System.out.println("After Sorting...");
		System.out.println("====================");
		for (Laptop laptop : list) {
			System.out.println(laptop.getId());
			System.out.println(laptop.getName());
			System.out.println(laptop.getPrice());
			System.out.println("====================");
		}
	}
}

class Laptop implements Comparable<Laptop> {
	private int id;
	private String name;
	private double price;

	public Laptop(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Laptop o) {
		if (this.name.charAt(0) < o.name.charAt(0))
			return -1;
		else {
			return 0;
		}
	}

}