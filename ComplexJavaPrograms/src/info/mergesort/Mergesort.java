package info.mergesort;

public class Mergesort {

	public static void main(String[] args) {
		System.out.println("hii");

		int[] input = { 15, 10, 5, 25, 89, 6, 4, 99 };
		printArray(input);
		// System.out.println(input.length-1);
		System.out.println("hhh");
		mergeSort(input, 0, input.length - 1);
		printArray(input);
		System.out.println("hello");

	}

	private static void mergeSort(int[] inp, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(inp, low, mid);
			mergeSort(inp, mid + 1, high);
			merge(inp, low, mid, high);

		}

	}

	private static void merge(int[] inp, int low, int mid, int high) {
		int left = low;
		int right = mid;
		int k = 0;
		int temp[] = new int[low + high];

		while (left <= right && right <= high) {
			if (inp[left] < inp[right]) {
				temp[k] = inp[left];
				left += 1;
			} else if (inp[right] < inp[high]) {
				temp[k] = inp[right];
				right += 1;
			}
			k += 1;
		}

		if (left <= right) {
			while (left <= right) {
				temp[k] = inp[left];
				left += 1;
				k += 1;
			}
		}
		if (right <= high) {
			while (right <= high) {
				temp[k] = inp[right];
				right += 1;
				k += 1;
			}
		}
		for (int m = 0; m < temp.length; m++) {
			inp[low + m] = temp[m];
		}

	}

	private static void printArray(int[] out) {
		for (int i = 0; i < out.length; i++) {
			System.out.print(out[i] + " ,");
		}
		System.out.println();

	}

}
