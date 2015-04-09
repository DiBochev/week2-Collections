package week2CollectionsAndGenerics.Problem3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BoundedQueue<E> implements Queue<E>{

	private int size;
	private Queue<E> array;
	private int addedElements;
	
	public BoundedQueue(int size){
		this.addedElements = 0;
		this.size = size;
		array = new LinkedList<E>();
	}
	
	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return array.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		return array.iterator();
	}

	@Override
	public Object[] toArray() {
		return array.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return array.toArray(a);
	}

	@Override
	public boolean remove(Object o) {
		return array.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return array.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return array.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return array.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return array.retainAll(c);
	}

	@Override
	public void clear() {
		array.clear();
	}

	@Override
	public boolean add(E e) {
		if (array.size() >= size) {
			E [] temp = (E[]) array.toArray();
			array.clear();
			for (int i = 1; i < temp.length; i++) {
				array.add(temp[i]);
			}
			array.add(e);
			if (array.size() == size) {
				this.addedElements = 0;
			}else{
				addedElements++;
			}
			return true;
		}else{
			array.add(e);
			return true;
		}
	}

	@Override
	public boolean offer(E e) {
		return add(e);
	}

	@Override
	public E remove() {
		return array.remove();
	}

	@Override
	public E poll() {
		return array.poll();
	}

	@Override
	public E element() {
		return array.element();
	}

	@Override
	public E peek() {
		return array.peek();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(array.size());
		for (E e : array) {
			sb.append(e + ",");
		}
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}
}
