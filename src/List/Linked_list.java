package List;
import java.util.LinkedList;

public class Linked_list {
	    public static void main(String[] args) {
	        LinkedList<String> cities = new LinkedList<>();

	        cities.add("Mumbai");
	        cities.add("Nashik");
	        cities.add("Pune");

	        System.out.println("Second city: " + cities.get(1));

	        cities.set(1, "Bangalore");

	        cities.remove("Mumbai");

	        System.out.println("Cities list:");
	        for (String city : cities) {
	            System.out.println(city);
	        }

	        System.out.println("Total cities: " + cities.size());
	    }
	}

