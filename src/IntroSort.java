
public class IntroSort {

	public void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}


	public int partition(int[] array, int head, int rear) { //chosing pivot for quicksort
		int pivot = array[rear];
		int i = head;
		for (int j = head; j < rear; j++) {
			if (array[j] <= pivot) {
				swap(array, i, j);
				i = i + 1;
			}
		}
		swap(array, i, rear);
		return i;
	}

	public int left(int i) {
		return 2 * i + 1;
	}

	public int right(int i) {
		return 2 * i + 2;
	}

	public void heapify(int array[], int n, int i) { // n:heap size
		int largest;
		int l = left(i);
		int r = right(i);

		if (l < n && array[l] > array[i]) { // If left child is larger than root
			largest = l;
		} else {
			largest = i;
		}
		if (r < n && array[r] > array[largest]) { // If right child is larger than largest so far
			largest = r;
		}
		if (largest != i) { // If largest is not root
			swap(array, i, largest);
			heapify(array, n, largest); // Recursively heapify the affected sub-tree
		}
	}

	public void heapSort(int[] array) { // n:unsorted array size
		int n = array.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(array, n, i);
		}

		for (int i = n - 1; i >= 0; i--) {
			swap(array, 0, i);
			heapify(array, i, 0); //call max heapify on the reduced heap 
		}
	}

	private void buildIntroSort(int[] array, int head, int rear, int maxDepth) {

		int n = array.length;

		if (head < rear) {

			if (maxDepth == 0) { //heapSort
				heapSort(array);
			} else {
				int p = partition(array, head, rear); //quickSort
				buildIntroSort(array, head, p, maxDepth - 1);
				buildIntroSort(array, p + 1, rear, maxDepth - 1);
			}

		}
	}
	
	private int log(int a) {
		return (int) (Math.log(a) / Math.log(10));
	}
	
	public void sort(int[] array) {
		int n= array.length;
		int maxDepth = log(array.length) * 2;
		buildIntroSort(array, 0, n - 1, maxDepth);
	}
}
