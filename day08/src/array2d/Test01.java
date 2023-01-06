package array2d;
import java.util.Random;
public class Test01 {
	public static void main(String[] args) {
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		int[][] arr = new int[][] {
			{90,80,85,77}, {60,85, 73, 92}, {50,70,70,80}
		};
		
		int n = random.nextInt(arr.length);
		int m = random.nextInt(arr[0].length);
		
		
		double total = 0;
		double avg;
		int min=arr[0][0];
		int[] minCoor = new int[2];
		int max=arr[0][0];
		int[] maxCoor = new int[2];
		
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[0].length;k++) {
				System.out.print(arr[i][k] + " ");
				total += arr[i][k];
				if(arr[i][k]<min) {
					min = arr[i][k];
					minCoor[0] = i;
					minCoor[1] = k;
				}
				if(arr[i][k]>max) {
					max = arr[i][k];
					maxCoor[0] = i;
					maxCoor[1] = k;
				}
			}
			System.out.println();
		}
		avg = total/(arr.length*arr[0].length);
		System.out.println(avg);
		
		System.out.println(max + " " + maxCoor[0] + " " + maxCoor[1]);
		System.out.println(min + " " + minCoor[0] + " " + minCoor[1]);
		
		System.out.println(arr[n][m]);
	}
}
