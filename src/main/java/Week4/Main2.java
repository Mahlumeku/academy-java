package Week4;

public class Main2 {

	public static void selectionSort(int[] elements) {
		for (int j = 0; j < elements.length - 1; j++) { // line 1
			int minIndex = j; // line 2
			for (int k = 0; k < elements.length; k++) { // line 3
				if (elements[k] < elements[minIndex]) { // line 4
					minIndex = k; // line 5
				}
			}
			int temp = elements[j];
			elements[j] = elements[minIndex];
			elements[minIndex] = temp;
		}
	}
}
