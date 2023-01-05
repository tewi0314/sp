package array;

import java.util.Arrays;

public class Test09 {
	public static void main(String[] args) {
		int[] arr = new int[] {30,50,20,10,40};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionSort(int[] arr) {
		int min;
		int temp;
		int n = 0;
		for(int i=0;i<arr.length;i++) {
			min = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) { 		
					min = arr[j];
					n = j;
				}
			}
			if(arr[i]!=min) {
				temp = arr[i];
				arr[i] = arr[n];
				arr[n] = temp;
			}
		}
		
	}
}
