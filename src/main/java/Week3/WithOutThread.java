package Week3;

public class WithOutThread {

	public static void main(String[] args) {

		// Measure time without threads
		long start1 = System.nanoTime();
		int singleThreadSum = 0;
		for (int i = 1; i <= 1000000; i++) {
			singleThreadSum += i;
		}
		long end1 = System.nanoTime();
		System.out.println("Total sum without threads: " + singleThreadSum);
		System.out.println("Time taken without threads (ms): " + (end1 - start1));

	}

}
