package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedmap {

		public static void main(String[] args) {

			Map<Integer,String> m = new LinkedHashMap();
			m.put(100, "sakshi");
			m.put(200, "abc");
			m.put(300, "chandni");
			m.put(400, "sumeet");
			m.put(500, "xyz");
			m.put(600, "rese");

			for (Map.Entry<Integer,String> me : m.entrySet()) {
				
				System.out.println(me.getKey() + "  " + me.getValue());

			}
		}

	}
