package array;

import java.util.Arrays;

public class Test08_2 {
	public static void main(String[] args) {
		double[] arr = new double[] {150.8, 180.2, 175.9, 162.7, 170.3};
		double[] result = max(arr);
		System.out.println(result[0] + " " + (int)result[1]);
	}
	static double[] max(double[] arr) {
		double max = 0;
		int num = -1;
		double result[] = new double[2];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				num = i;
			}
		}
		result[0] = max;
		result[1] = num;
		return  result;
	}
}
