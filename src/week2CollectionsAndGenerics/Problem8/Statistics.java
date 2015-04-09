package week2CollectionsAndGenerics.Problem8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Statistics implements IStatistics {

	
	private List<Integer> array;
	private int minimumElement;
	private int maximumElement;
	private double sumOfAllElements;
	private Map<Integer, Integer> map;
	private Integer popular;
	private Comparator<Map.Entry<Integer, Integer>> comaprator;
	
	public Statistics(){
		this.array = new ArrayList<Integer>();
		this.minimumElement = Integer.MAX_VALUE;
		this.maximumElement = Integer.MIN_VALUE;
		this.sumOfAllElements = 0;
		this.map = new HashMap<Integer, Integer>();
		this.comaprator = new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1,Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		};
	}
	
	public void add(int number){
		array.add(number);
		saveChanges(number);
	}
	
	private void saveChanges(int number){
		if (number < minimumElement) {
			minimumElement = number;
		}if (number > maximumElement){
			maximumElement = number;
		}
		sumOfAllElements+= number;
		
		Integer count = map.get(number);
		map.put(number, count != null ? count + 1 : 0);
		
		popular = Collections.max(map.entrySet(), this.comaprator).getKey();
	}
	
	@Override
	public double getMean() {
		return sumOfAllElements / array.size();
	}

	@Override
	public double getMedian() {
		if (array.size() % 2 != 0 ) {
			return array.get(array.size() / 2);
		}else{
			int temp1 = array.get(array.size() / 2);
			int temp2 = array.get((array.size() - 1) / 2);
			return  (temp1 + temp2) / 2;
		}
	}

	@Override
	public int getMode() {
		return popular.intValue();
	}

	@Override
	public int getRange() {
		return maximumElement - minimumElement;
	}

}