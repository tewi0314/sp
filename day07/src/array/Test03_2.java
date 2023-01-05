package array;
import java.util.Arrays;
import java.util.Scanner;
public class Test03_2 {
	public static void main(String[] args) {
		int[] arr = new int[] {30,50,20,10,40};
		swap(arr,3);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] swap(int[] arr, int n) {
		int temp;
		while(n>0) {
		for(int i=1;i<arr.length;i++) {
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
		}
		n--;
		}
		return arr;
	}
}
