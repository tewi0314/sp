package array;

public class Test08 {
	public static void main(String[] args) {
		double[] arr = new double[] {150.8, 180.2, 175.9, 162.7, 170.3};
		double max = 0;
		int num= -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				num = i;
			}
		}
		
		System.out.println(max + " " + num);
	}
}
