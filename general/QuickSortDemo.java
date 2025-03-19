package general;

import java.util.Arrays;

public class QuickSortDemo {
	public static void main(String args[]) {
		int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
		System.out.println("Unsorted array: " + Arrays.toString(unsorted));

		QuickSort algorithm = new QuickSort();
		algorithm.sort(unsorted); // Sort in place

		System.out.println("Sorted array: " + Arrays.toString(unsorted)); // ✅ Print sorted array
	}
}

class QuickSort {
	public void sort(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return;
		}
		quickSort(numbers, 0, numbers.length - 1);
	}

	private void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // Choosing last element as pivot
		int i = low - 1; // Pointer for smaller element

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
