package week2CollectionsAndGenerics.Problem1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReverseCollection<T> {

	static <T> void reverse (Collection<T> collection){
		
		List<T> temp = new ArrayList<T>(collection.size());
		int index = collection.size() - 1;
		
		for (T t : collection) {
			temp.set(index, t);
			index--;
		}
		collection.clear();
		collection.addAll(temp);
	}
}
