package in.ineuron.Question7;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// Binary Search

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int item = sc.nextInt();
		int ans = binarySearch(arr, item);
		if (ans == -1)
			System.out.println("Target Element Not Found...");

		else
			System.out.println("Target Element Present At : "+ans+" index");

	}

	public static int binarySearch(int arr[], int item) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;
			if (arr[mid] > item) {
				hi = mid - 1;
			} else if (arr[mid] < item) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
