package array;

import java.util.Arrays;

public class Test09_3 {
	public static void main(String[] args) {
		int[] arr = new int[] {30,20,50,10,40};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		while(n>0) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] < arr[i]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		n--;
		}
	}
}
