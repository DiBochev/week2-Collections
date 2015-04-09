package week2CollectionsAndGenerics.Problem2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Problem2<T> implements Collection{

	Set<Object> set;
	
	public Problem2(){
		set = new HashSet<Object>();
	}
	
	@Override
	public int size() {
		return set.size();
	}

	@Override
	public boolean isEmpty() {
		return set.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return set.contains(o);
	}

	@Override
	public Iterator iterator() {
		return set.iterator();
	}

	@Override
	public Object[] toArray() {
		return set.toArray();
	}

	@Override
	public Object[] toArray(Object[] a) {
		return set.toArray();
	}

	@Override
	public boolean add(Object e) {
		if (!set.add(e)) {
			set.remove(e);
			return false;
		}
		return true;
	}

	@Override
	public boolean remove(Object o) {
		return set.remove(o);
	}

	@Override
	public boolean containsAll(Collection c) {
		return set.containsAll(c);
	}

	@Override
	public boolean addAll(Collection c) {
		for (Object object : c) {
			if (!set.add(object)) {
				set.remove(object);
				return false;
			}
		}
		
		
		return set.addAll(c);
	}

	@Override
	public boolean removeAll(Collection c) {
		return set.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection c) {
		return set.retainAll(c);
	}

	@Override
	public void clear() {
		set.clear();
	}

	
	
}