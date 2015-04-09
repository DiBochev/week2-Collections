package week2CollectionsAndGenerics.Problem6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DuplicatingElements {
	
	private DuplicatingElements(){
	}

	public static <E> String intersect(@SuppressWarnings("unchecked") Collection<E>... array){
		
		List<E> intersect = new ArrayList<E>(array[0].size());
		for (E element : array[0]) {
			intersect.add(element);
		}
		for (int i = 1; i < array.length; i++) {
			intersect.retainAll(array[i]);
		}
		StringBuilder sb = new StringBuilder(intersect.size());
		sb.append("{");
		for (E e : intersect) {
			sb.append(e + ",");
		}
		sb.setLength(sb.length() - 1);
		sb.append("}");
		
		return sb.toString();
	}
}
