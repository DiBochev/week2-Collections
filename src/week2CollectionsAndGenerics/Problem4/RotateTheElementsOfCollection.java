package week2CollectionsAndGenerics.Problem4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RotateTheElementsOfCollection {

	private RotateTheElementsOfCollection(){
	}
	
	public static <E> void rotate(Collection<E> collection, int rotateStep ){
		int counter = Math.abs(rotateStep);
		if (counter >= collection.size()) {
			counter = Math.abs(rotateStep % collection.size());
		}
		if (rotateStep > 0) {
			List<E> tempArray = new ArrayList<E>(collection.size());
			for (E e : collection) {
				tempArray.add(e);
			}
			for (E e : collection) {
				tempArray.set(counter, e);
				if (counter >= collection.size() - 1) {
					counter = 0;
				}else{
					counter++;
				}
			}
			collection.clear();
			collection.addAll(tempArray);
		}else{
			counter = collection.size() - counter;
			rotate(collection, counter);
		}
	}
}
