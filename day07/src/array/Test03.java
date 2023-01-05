package array;
import java.util.Arrays;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[] {30,50,20,10,40};
		int n = in.nextInt();
		int temp;
		
		while(n>0) {
		for(int i=1;i<arr.length;i++) {
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		n--;
		}
	}
}
