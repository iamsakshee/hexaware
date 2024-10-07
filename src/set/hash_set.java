package set;
import java.util.HashSet;

public class hash_set {
	    public static void main(String[] args) {
	        HashSet<String> cars = new HashSet<>();

	        cars.add("Toyota");
	        cars.add("Honda");
	        cars.add("Ford");
	        cars.add("Toyota");
	        cars.add("bmw");

	        System.out.println("Cars set:");
	        for (String car : cars) {
	            System.out.println(car);
	        }

	        cars.remove("Ford");

	        System.out.println("Total cars: " + cars.size());
	    }
	}


