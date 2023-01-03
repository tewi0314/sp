package loop;

public class Test03 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=1;i<=100;i++) {
			if(i%2!=0) System.out.print(i + " ");
		}
		System.out.println();
		for(int i=1; i<=100;i++) {
			if(i%5==0) System.out.print(i+ " ");
		}
		
		System.out.println();
		for(int i=10;i>0;i--) {
			System.out.print(i+" ");
		}
	}
}
