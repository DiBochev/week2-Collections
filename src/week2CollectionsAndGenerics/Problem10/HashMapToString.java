package week2CollectionsAndGenerics.Problem10;

import java.util.Map;

public class HashMapToString {

	public static <V, K> String convert(Map<? extends Object, ? extends Object> map){
		return map.toString();
	}
}
