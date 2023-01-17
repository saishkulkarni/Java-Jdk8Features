package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Laptop1> list = new ArrayList<>();
		list.add(new Laptop1(1, "Acer", 75000));
		list.add(new Laptop1(2, "Dell", 38000));
		list.add(new Laptop1(3, "Lenovo", 55000));
		list.add(new Laptop1(4, "Apple", 175000));
		System.out.println("Before Sorting...");
		System.out.println("====================");
		for (Laptop1 laptop : list) {
			System.out.println(laptop.getId());
			System.out.println(laptop.getName());
			System.out.println(laptop.getPrice());
			System.out.println("====================");
		}

		Comparator<Laptop1> com = new Comparator<Laptop1>() {

			@Override
			public int compare(Laptop1 o1, Laptop1 o2) {
				if (o1.getPrice() > o2.getPrice())
					return 1;
				else
					return -1;
			}
		};

		Collections.sort(list, com);
		System.out.println("After Sorting...");
		System.out.println("====================");
		for (Laptop1 laptop : list) {
			System.out.println(laptop.getId());
			System.out.println(laptop.getName());
			System.out.println(laptop.getPrice());
			System.out.println("====================");
		}
	}
}

class Laptop1 {
	private int id;
	private String name;
	private double price;

	public Laptop1(int id, String name, double price) {
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
}
