package array;

import java.util.Arrays;

public class Test09_2 {
	public static void main(String[] args) {
		int[] arr = new int[] {30,20,50,10,40};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void insertionSort(int[] arr) {
		int temp;
		int n;
		for(int i=1;i<arr.length;i++) {
			n = i;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]<=arr[n]) break;
				else {
					temp = arr[n];
					arr[n] = arr[j];
					arr[j] = temp;
					n--;
				}
			}
		}
	}
}
