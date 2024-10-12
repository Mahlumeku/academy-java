package Week3;

import java.util.ArrayList;

public class CodeTestFriday {

	public class Main {
		public static void main(String[] args) {
			ArrayList<Integer> nums = new ArrayList<>();
			nums.add(2);
			nums.add(4);
			nums.add(6);
			nums.add(8);
			nums.add(10);
			nums.add(2);

			int val1 = 0;
			int val2 = 5;
			boolean isEqual = (!nums.get(val1).equals(nums.get(val2)));
		}
	}

}
