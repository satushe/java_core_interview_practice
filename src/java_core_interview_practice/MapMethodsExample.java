package java_core_interview_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodsExample {
	public static void main(String[] args) {
		// Create a new HashMap
		Map<String, Integer> map = new HashMap<>();

		// put(K key, V value) - Inserts key-value pairs into the map
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Orange", 3);

		// get(Object key) - Returns the value associated with the key
		Integer value = map.get("Banana");
		System.out.println("Value for 'Banana': " + value);

		// remove(Object key) - Removes the key-value pair for the specified key
		map.remove("Orange");

		// containsKey(Object key) - Checks if the map contains the specified key
		boolean hasApple = map.containsKey("Apple");
		System.out.println("Contains 'Apple': " + hasApple);

		// keySet() - Returns a set view of the keys contained in the map
		Set<String> keys = map.keySet();
		System.out.println("Keys in map: " + keys);
	}
}