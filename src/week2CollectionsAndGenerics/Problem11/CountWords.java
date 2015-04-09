package week2CollectionsAndGenerics.Problem11;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static Map<String, Integer> count(String text){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] words = text.split(" ");
		
		for (String word : words) {
			word = word.trim();
			if (map.containsKey(word)) {
				int temp = map.get(word);
				map.put(word, temp + 1);
			}else{
				map.put(word, 1);
			}
		}
		return map;
	}
}
