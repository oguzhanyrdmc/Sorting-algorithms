
public class QuickSort {
	
	public void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public int randomizedPartition(int[] array, int head, int rear) {
        int randomEndIndex = randomNumberBetween(head,rear);
        swap(array,head,randomEndIndex); //random seçilen pivot array en başına götürülüyor
        return partition(array,head,rear);
    }

    public int randomNumberBetween(int startNumber, int endNumber) { //find random
        return (int)Math.floor(Math.random() * (endNumber - startNumber + 1) + startNumber);
    }
    
    public int midOfFirstMidLastElementPartition(int[] array, int head, int rear) {
		int middlePivotIndex = compareThreeElement(array, head, rear);
		swap(array, head, middlePivotIndex);
		return partition(array, head, rear);
	}

	public int compareThreeElement(int[] array, int head, int rear) { //find median from 3 elements
		int first = array[head];
		int middle = array[(rear + head) / 2];
		int last = array[rear];

		if ((first >= middle && middle >= last) || (last >= middle && middle >= first))
			return (rear + head) / 2;
		else if ((middle >= first && first >= last) || (last >= first && first >= middle))
			return head;
		else
			return rear;
	}
	
	public int partition(int[] array, int head, int rear) {
		int pivot = array[head];//pivot
		int i = head;
		for (int j = head+1; j <= rear; j++) {
			if (array[j] <= pivot) { //pivottan küçükler için swap
				i++;				
				swap(array, i, j);
			}
		}	
		swap(array, i, head);//pivot swap
		return i;
	}
	
	public void buildQuickSort(int[] array, int head, int rear,String pivotType ) {
		int p=1;
		if (head < rear) {
			if(pivotType.equalsIgnoreCase("FirstElement")) {
				p = partition(array, head, rear);
			}
			else if(pivotType.equalsIgnoreCase("RandomElement")) {
				p= randomizedPartition(array, head, rear);
			}
			else if(pivotType.equalsIgnoreCase("MidOfFirstMidLastElement")) {
				p= midOfFirstMidLastElementPartition(array, head, rear);
			}
			
			buildQuickSort(array, head, p - 1, pivotType);
			buildQuickSort(array, p + 1, rear,pivotType);
		}
	}
	
	public void sort(int[]array,String pivotType) {
		int n= array.length;
		buildQuickSort(array, 0, n-1,pivotType);
	}
}
