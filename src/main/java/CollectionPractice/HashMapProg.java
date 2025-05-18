package CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapProg {
	public static void main(String[] args) {
		Map<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("Name", "pramodh");
		hm.put("Experience", 3);
		for (Object k : hm.keySet()) {
			System.out.println(k + ":" + hm.get(k)); // random order
		}
	}
}
