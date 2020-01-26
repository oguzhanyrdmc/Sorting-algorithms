//https://www.geeksforgeeks.org/heap-sort/
//Slatylar
public class HeapSort {

	public int left(int i) {
		return 2 * i + 1;
	}

	public int right(int i) {
		return 2 * i + 2;
	}

	public void swap(int[] array, int a, int b) { //elements are displaced among themselves
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
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

	public void buildHeap(int[] array) { // n:unsorted array size
		int n = array.length;
		for (int i = n / 2 - 1; i >= 0; i--) {  // Build heap (rearrange array) 
			heapify(array, n, i);
		}
		for (int i = n - 1; i >= 0; i--) {
			swap(array, 0, i); // Move current root to end
			heapify(array, i, 0); //call max heapify on the reduced heap 
		}
	}
	
	public void sort(int[] array) {
		buildHeap(array);
	}

}
