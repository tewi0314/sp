package array2d;
import java.util.Random;
public class Test05 {
	public static void main(String[] args) {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		int[][] arr = new int[5][5];
		int k = 1;
		for(int i=0;i<arr.length*arr[0].length;i++) {
			int n = random.nextInt(5);
			int m = random.nextInt(5);
			if(arr[n][m]==0) {
				arr[n][m] = k++;
			}else {
				i--;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
