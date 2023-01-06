package array2d;
import java.util.Random;
public class Test06 {
	static int[][] arr = new int[9][9];
	static int[] dx = {1,-1,0,0,1,-1,1,-1};
	static int[] dy = {0,0,1,-1,1,-1,-1,1};
	static char[][] map = new char[9][9];
	public static void main(String[] args) {
		arrange(arr);
		print(arr);
		System.out.println();
		quest(arr);
		print(arr);
	}
		static void arrange(int[][] arr){
			Random ran = new Random();
			ran.setSeed(System.currentTimeMillis());
			
			int k = 10;
			while(k>0) {
				int n = ran.nextInt(9);
				int m = ran.nextInt(9);
				
				if(arr[n][m] ==0) {
					arr[n][m] = 9;
					k--;
				}
			}
		}
		
		static void quest(int[][] arr) {
			int count;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					if(arr[i][j] == 9) continue;
					count = 0;
					for(int k=0;k<dx.length;k++) {
						if(i+dx[k]<0 || i+dx[k]>arr.length-1 || j+dy[k]<0 || j+dy[k]>arr.length-1) continue;
						else {
							if(arr[i+dx[k]][j+dy[k]] == 9) count++;
						}
					}
					arr[i][j] = count;
				}
			}
			
		}
		
		
		static void print(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		static void mine() {
			
		}

}
