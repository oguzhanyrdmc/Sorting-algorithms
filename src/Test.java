import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SortingClass sorting = new SortingClass();

		int enter;
		System.out.print("   ==Menu==\n " 
				+ "1) RunningTimeHeapSort\n " 
				+ "2) runningTimeQuickSort\n "
				+ "3) runningTimeDualPivotQuickSort\n " 
				+ "4) runningTimeIntroSort\n" 
				+ "Enter: ");
		enter = input.nextInt();

		switch (enter) {
		case 1:
			sorting.runningTimeHeapSort();
			break;

		case 2:
			System.out.print("\t 1) FirstElement QuickSort\n" 
					+ "\t 2) RandomElement QuickSort\n"
					+ "\t 3) MidOfFirstMidLastElement\n" 
					+ "\t Enter: ");
			enter = input.nextInt();
			switch (enter) {
			case 1:
				sorting.runningTimeQuickSort(1);
				break;

			case 2:
				sorting.runningTimeQuickSort(2);
				break;

			case 3:
				sorting.runningTimeQuickSort(3);
				break;

			default:
				System.out.println("Wrong!!!\n Please enter again");
				break;
			}

			break;

		case 3:
			sorting.runningTimeDualPivotQuickSort();
			break;

		case 4:
			sorting.runningTimeIntroSort();
			break;

		default:
			System.out.println("Wrong!!!\n Please enter again");
			break;
		}

	}

}
