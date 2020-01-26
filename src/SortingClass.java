
public class SortingClass {

	public void printArray(int arr[]) {
		int n = 100;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private HeapSort heapsort;
	private QuickSort quicksort;
	private DualPivotQuickSort dualpivotQuickSort;
	private IntroSort introSort;

	public SortingClass() {
		this.heapsort = new HeapSort();
		this.quicksort = new QuickSort();
		this.dualpivotQuickSort = new DualPivotQuickSort();
		this.introSort = new IntroSort();
	}

	public void heapSort(int[] arrayToSort) {
		heapsort.sort(arrayToSort);
	}

	public void quickSort(int[] arrayToSort, String pivotType) {
		quicksort.sort(arrayToSort, pivotType);
	}

	public void dualpivotQuickSort(int[] arrayToSort) {
		dualpivotQuickSort.sort(arrayToSort);
	}

	public void introSort(int[] arrayToSort) {
		introSort.sort(arrayToSort);
	}

	public int[] equalIntegersArrayGenerater(int size) { 
		int[] unsorted = new int[size];

		for (int i = 0; i < unsorted.length; i++) {
			unsorted[i] = 6;
		}
		return unsorted;
	}

	public int[] IncreasingIntegersArrayGenerater(int size) {
		int[] unsorted = new int[size];

		for (int i = 0; i < unsorted.length; i++) {
			unsorted[i] = i;
		}
		return unsorted;
	}

	public int[] DecreasingIntegersArrayGenerater(int size) {
		int[] unsorted = new int[size];

		for (int i = 0; i < unsorted.length; i++) {
			unsorted[i] = size;
			size--;
		}
		return unsorted;
	}

	public int[] RandomIntegersArrayGenerater(int size) {
		int[] unsorted = new int[size];
		for (int i = 0; i < unsorted.length; i++) {
			unsorted[i] = (int) (Math.random() * size + 1);
		}
		return unsorted;
	}

	public void runningTimeHeapSort() { //Starts running time calculation for HeapSort
		int[] arrayToSort;
		double startTime;
		double estimatedTime;
		
		System.out.println("Running Time Calculations Are Started for HeapSort");
		System.out.println("\n----------------------------------\n");
		
		arrayToSort = equalIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() - startTime)/ 1000000;
		System.out.println("Equal Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = equalIntegersArrayGenerater(10000);

		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() - startTime)/ 1000000;
		System.out.println("Equal Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = equalIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() - startTime)/ 1000000;
		System.out.println("Equal Integers 100.000 Elements: " + estimatedTime);

		System.out.println("\n----------------------------------\n");

		arrayToSort = RandomIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Random Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = RandomIntegersArrayGenerater(10000);
		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Random Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = RandomIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Random Integers 100.000 Elements: " + estimatedTime);

		System.out.println("\n----------------------------------\n");

		arrayToSort = IncreasingIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Increasing Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = IncreasingIntegersArrayGenerater(10000);
		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Increasing Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = IncreasingIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Increasing Integers 100.000 Elements: " + estimatedTime);

		System.out.println("\n----------------------------------\n");

		arrayToSort = DecreasingIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Decreasing Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = DecreasingIntegersArrayGenerater(10000);
		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Decreasing Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = DecreasingIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		heapSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Decreasing Integers 100.000 Elements: " + estimatedTime);

		System.out.println("\n----------------------------------\n");
		System.out.println("Running Time Calculations Are Completed For HeapSort");
	}

	public void runningTimeDualPivotQuickSort() { //Starts running time calculation for DualPivot
		int[] arrayToSort;
		double startTime;
		double estimatedTime;
		
		System.out.println("Running Time Calculations Are Started for DualPivotQuickSort");
		System.out.println("\n----------------------------------\n");
		
		arrayToSort = equalIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Equal Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = equalIntegersArrayGenerater(10000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Equal Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = equalIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Equal Integers 100.000 Elements: " + estimatedTime);

		System.out.println("\n----------------------------------\n");

		arrayToSort = RandomIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Random Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = RandomIntegersArrayGenerater(10000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Random Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = RandomIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Random Integers 100.000 Elements: " + estimatedTime);

		System.out.println("\n----------------------------------\n");

		arrayToSort = IncreasingIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Increasing Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = IncreasingIntegersArrayGenerater(10000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Increasing Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = IncreasingIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Increasing Integers 100.000 Elements: " + estimatedTime);

		System.out.println("\n----------------------------------\n");

		arrayToSort = DecreasingIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Decreasing Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = DecreasingIntegersArrayGenerater(10000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Decreasing Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = DecreasingIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		dualpivotQuickSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Decreasing Integers 100.000 Elements: " + estimatedTime);

		System.out.println("\n----------------------------------\n");
		System.out.println("Running Time Calculations Are Completed For DualPivotQuickSort");
	}

	public void runningTimeIntroSort() { //Starts running time calculation for IntroSort
		int[] arrayToSort;
		double startTime;
		double estimatedTime;
		
		System.out.println("Running Time Calculations Are Started for IntroSort");
		System.out.println("\n----------------------------------\n");
		
		arrayToSort = equalIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Equal Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = equalIntegersArrayGenerater(10000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Equal Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = equalIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Equal Integers 100.000 Elements: " + estimatedTime);

		System.out.println("\n----------------------------------\n");

		arrayToSort = RandomIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Random Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = RandomIntegersArrayGenerater(10000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Random Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = RandomIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Random Integers 100.000 Elements: " + estimatedTime);

		System.out.println("\n----------------------------------\n");

		arrayToSort = IncreasingIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Increasing Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = IncreasingIntegersArrayGenerater(10000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Increasing Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = IncreasingIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Increasing Integers 100.000 Elements: " + estimatedTime);
		System.out.println("\n----------------------------------\n");

		arrayToSort = DecreasingIntegersArrayGenerater(1000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Decreasing Integers 1.000 Elements: " + estimatedTime);

		arrayToSort = DecreasingIntegersArrayGenerater(10000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Decreasing Integers 10.000 Elements: " + estimatedTime);

		arrayToSort = DecreasingIntegersArrayGenerater(100000);
		startTime = System.nanoTime();
		introSort(arrayToSort);
		estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
		System.out.println("Decreasing Integers 100.000 Elements: " + estimatedTime);

		System.out.println("\n----------------------------------\n");
		System.out.println("Running Time Calculations Are Completed For IntroSort");

	}

	public void runningTimeQuickSort(int type) { //Starts running time calculation for QuickSort 3 different type
		int[] arrayToSort;
		double startTime;
		double estimatedTime;
		
		switch (type) {
        case 1 :
        	System.out.println("Running Time Calculations Are Started for QuickSort type FirstElement");
			arrayToSort = equalIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Equal Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = equalIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Equal Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = equalIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Equal Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");

			arrayToSort = RandomIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Random Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = RandomIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Random Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = RandomIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Random Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");

			arrayToSort = IncreasingIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Increasing Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = IncreasingIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Increasing Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = IncreasingIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Increasing Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");

			arrayToSort = DecreasingIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Decreasing Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = DecreasingIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Decreasing Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = DecreasingIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "FirstElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Decreasing Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");
			System.out.println("Running Time Calculations Are Completed For QuickSort type FirstElement");
            break;

        case 2 :
        	System.out.println("Running Time Calculations Are Started for QuickSort type RandomElement");
			arrayToSort = equalIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Equal Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = equalIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Equal Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = equalIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Equal Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");

			arrayToSort = RandomIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Random Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = RandomIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Random Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = RandomIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Random Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");

			arrayToSort = IncreasingIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Increasing Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = IncreasingIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Increasing Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = IncreasingIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Increasing Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");

			arrayToSort = DecreasingIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Decreasing Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = DecreasingIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Decreasing Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = DecreasingIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "RandomElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Decreasing Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");
			System.out.println("Running Time Calculations Are Completed For QuickSort type RandomElement");
            break;

        case 3 :
        	System.out.println("Running Time Calculations Are Started for QuickSort type MidOfFirstMidLastElement");
			arrayToSort = equalIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Equal Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = equalIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Equal Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = equalIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Equal Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");

			arrayToSort = RandomIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Random Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = RandomIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Random Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = RandomIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Random Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");

			arrayToSort = IncreasingIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Increasing Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = IncreasingIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Increasing Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = IncreasingIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Increasing Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");

			arrayToSort = DecreasingIntegersArrayGenerater(1000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Decreasing Integers 1.000 Elements: " + estimatedTime);

			arrayToSort = DecreasingIntegersArrayGenerater(10000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Decreasing Integers 10.000 Elements: " + estimatedTime);

			arrayToSort = DecreasingIntegersArrayGenerater(100000);
			startTime = System.nanoTime();
			quickSort(arrayToSort, "MidOfFirstMidLastElement");
			estimatedTime = (System.nanoTime() -  startTime)/ 1000000;
			System.out.println("Decreasing Integers 100.000 Elements: " + estimatedTime);

			System.out.println("\n----------------------------------\n");
			System.out.println("Running Time Calculations Are Completed For QuickSort type MidOfFirstMidLastElement");
            break;

		
		}
	}
}
