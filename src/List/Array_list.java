package List;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");

		System.out.println("First fruit: " + fruits.get(0));

		fruits.set(1, "Orange");

		fruits.remove("Mango");

		System.out.println("Fruits list:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("Total fruits: " + fruits.size());
	}
}
