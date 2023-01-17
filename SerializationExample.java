package java8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Student implements Serializable {
	int id;
	String name;

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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

public class SerializationExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student = new Student();
		student.setId(1);
		student.setName("Aakash");

		System.out.println(student);

		// Serialization - Converting object to Byte Stream

		FileOutputStream outputStream = new FileOutputStream("output.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(student);
		objectOutputStream.close();
		outputStream.close();

		// Deserialization - Converting byte Stream to Object

		FileInputStream fileInputStream = new FileInputStream(new File("output.txt"));
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		Student student2 = (Student) inputStream.readObject();
		System.out.println(student2);
	}
}
