package loop;
public class Test04 {
	public static void main(String[] args) {
		
		for(int i=10;i<100;i++) {
			int n = 0;
			if((i/10)%3==0) n++;
			if((i%10)%3==0 && i%10!=0) n++;
			
			System.out.print(i + " : ");
			
			for(int j=0;j<n;j++) {
				System.out.print("X");
			}
			System.out.println();
		}
		
	}
}
