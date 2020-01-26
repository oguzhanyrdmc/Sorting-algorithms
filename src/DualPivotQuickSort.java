//https://www.researchgate.net/publication/258454268_Java_7's_Dual_Pivot_Quicksort#pf34
//sayfa 53.
public class DualPivotQuickSort {

	public void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public void buildQuickSort(int[] array, int head, int rear) {
		if (head < rear) {
			int p = array[head]; // head pivot value
			int q = array[rear]; // rear pivot value
			if (p > q) {
				swap(array, head, rear);
			}
			
			int l = head + 1; // head pivot index
			int g = rear - 1; // rear pivot index
			int k = l;
			
			while (k <= g) { // if elements are less than the left pivot
				if (array[k] < p) {
					swap(array, k, l);
					l++;
				} else if (array[k] >= q) {
					while (array[g] > q && k < g) {
						g--;
					}
					swap(array, k, g);
					g--;
					if (array[k] < p) {
						swap(array, k, l);
						l++;
					}
				}
				k++;
			}
			l--;
			g++;

			swap(array, head, l); //bring pivots to final position
			swap(array, rear, g);
			
			buildQuickSort(array, head, k - 1);
			buildQuickSort(array, k + 1, g - 1);
			buildQuickSort(array, g + 1, rear);
		}
	}
	
	public void sort(int[]array) {
		int n= array.length;
		buildQuickSort(array, 0, n-1);
	}
}
