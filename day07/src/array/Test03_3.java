package array;
import java.util.Arrays;
import java.util.Scanner;
public class Test03_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[] {30,50,20,10,40};
		
		arr = swap(arr, n);
		System.out.println(Arrays.toString(arr));
	}
		static int[] swap(int[] arr, int n) {
			int[] arr2 = new int[arr.length];
			int a = n%arr.length;
			int b = 0;
			for(int i=a;i<arr.length;i++) {
				arr2[i] = arr[b++];
			}
			for(int i=0;i<a;i++) {
				arr2[i] = arr[b++];
			}
			return arr2;
		}
}
