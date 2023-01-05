package array;

import java.util.Arrays;

public class Test9_4 {

	static int[] temp = new int[5];

	public static void main(String[] args) {
		int[] arr = new int[] {30,20,50,10,40};
		
		sort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void sort(int[] arr, int low, int high) {
		
		if(high>low) {
		int mid = (high+low)/2;
		
		sort(arr, low, mid);
		sort(arr, mid+1, high);
		mergeSort(arr, low, mid, high);
		}
	}
	
	static void mergeSort(int[] arr, int low, int middle, int high) {
		int l = low;
		int m = middle+1;
		int h = high;
		int k = low;
		while(l<=middle && m<=h) {
			if(arr[l]<=arr[m]) {
				temp[k] = arr[l];
				l++;
			}else {
				temp[k] = arr[m];
				m++;
			}
			k++;
		}
		
		if(l<=middle) {
			for(int i=l;i<=middle;i++) {
				temp[k++] = arr[i];
			}
		}else {
			for(int j=m;j<=h;j++) {
				temp[k++] = arr[j]; 
			}
		}
		
		for(int i=low;i<=high;i++) {
			arr[i] = temp[i];
		}
	}
	
}
