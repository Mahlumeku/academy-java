package Week3;

public class Main3 {
	public static void main(String[] args) {
		// Measure time without threads
		long startTimeSingle = System.nanoTime();
		int singleThreadSum = 0;
		for (int i = 1; i <= 2000; i++) {
			singleThreadSum += i;
		}
		long endTimeSingle = System.nanoTime();
		System.out.println("Total sum without threads: " + singleThreadSum);
		System.out.println("Time taken without threads (ms): " + (endTimeSingle - startTimeSingle));

		// Measure time with threads
		SumCalculator sum1 = new SumCalculator(1, 1000);
		SumCalculator sum2 = new SumCalculator(1001, 2000);
		// SumCalculator sum3 = new SumCalculator(2001, 3000);
		// SumCalculator sum4 = new SumCalculator(3001, 4000);
		// SumCalculator sum5 = new SumCalculator(4001, 5000);
		// SumCalculator sum6 = new SumCalculator(5001, 6000);
		// SumCalculator sum7 = new SumCalculator(6001, 7000);
		// SumCalculator sum8 = new SumCalculator(7001, 8000);

		long startTimeMulti = System.nanoTime();
		sum1.start();
		sum2.start();
		// sum3.start();
		// sum4.start();
		// sum5.start();
		// sum6.start();
		// sum7.start();
		// sum8.start();

		try {
			sum1.join();
			sum2.join();
			// sum3.join();
			// sum4.join();
			// sum5.join();
			// sum6.join();
			// sum7.join();
			// sum8.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int totalSum = sum1.getSum() + sum2.getSum();
		long endTimeMulti = System.nanoTime();

		System.out.println("Total sum with threads: " + totalSum);
		System.out.println("Time taken with threads (ms): " + (endTimeMulti - startTimeMulti));

		// Experiment: Increase the numbers and ranges to see how threads perform
	}
}
