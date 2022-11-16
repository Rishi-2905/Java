package test;

import java.util.Arrays;

public class BubbleSort {
	static void sorting(int n[], int r) {

		if (r == 1) {
			return;
		}
		for (int i = 0; i < r - 1; i++) {
			if (n[i] > n[i + 1]) {
				int temp = n[i];
				n[i] = n[i + 1];
				n[i + 1] = temp;
			}
			sorting(n, r - 1);
		}

	}

	public static void main(String agrs[]) {
		int arr[] = { 2, 5, 1, 6, 4, 9, 4 };
		int r = arr.length;
		sorting(arr, r);
		System.out.println(Arrays.toString(arr));
	}
}