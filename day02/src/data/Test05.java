package data;
import java.lang.*;
import java.util.Arrays;
public class Test05 {
	public static void main(String[] args) {
		int jajangPrice = 6000;
		int jamPrice = 7500;
		
		int jajangCount = 5;
		int jamCount = 3;
		
		int total = jajangPrice*jajangCount + jamPrice*jamCount;
		int[] arr = {1,2,3};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(total);
	}
}
