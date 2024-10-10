package _14_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void Main(String[] agr) {
		
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.set(2,4);
		numList.add(1,5);
		numList.add(6);
		System.out.println(numList);
		
	}

}
