package set;
import java.util.TreeSet;

public class tree_set {

    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();

        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Australia");

        System.out.println("Countries set in sorted order:");
        for (String country : countries) {
            System.out.println(country);
        }

        countries.remove("Germany");

        System.out.println("Total countries: " + countries.size());
    }
}

