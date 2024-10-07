package Map;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class sorted {
	
public static void main(String[] args) {
		
		SortedMap<Integer, String> m = new TreeMap<Integer,String>(new ComparatorImpl());
		
		m.put(100, "sakshi");
		m.put(200, "abc");
		m.put(300, "chandni");
		m.put(400, "sumeet");
		m.put(500, "xyz");
		m.put(600, "aaa");
		
		for(Map.Entry<Integer,String> me: m.entrySet())
		{
			System.out.println(me.getKey() + " " +me.getValue());
		}

	}

}
