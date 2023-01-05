package array;
import java.util.Arrays;
public class Test02 {
	public static void main(String[] args) {
		int[] arr = new int[] {30,50,20,10,40,1,2,3};
		int temp;
		for(int i=0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
