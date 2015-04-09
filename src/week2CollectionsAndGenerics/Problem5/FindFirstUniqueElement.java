package week2CollectionsAndGenerics.Problem5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FindFirstUniqueElement {

	private FindFirstUniqueElement(){
	}
	
	public static <E> E findFirstUniqueElement(Collection<E> array){
		List<E> temp = new ArrayList<E>(array.size());
		for (E e : array) {
			temp.add(e);
		}
		int counter = 1;
		boolean equals;
		
		for (E e : array) {
			equals = false;
			for (int i = counter; i < array.size(); i++) {
				if (e.equals(temp.get(i))) {
					equals = true;
					break;
				}
			}
			if (!equals) {
				return e;
			}
			counter++;
		}
		return null;
	}
}
