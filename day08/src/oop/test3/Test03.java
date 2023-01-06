package oop.test3;

public class Test03 {
	public static void main(String[] args) {
		Pocket p1 = new Pocket(1,"이상해씨","풀,독");
		Pocket p2 = new Pocket(4,"파이리","불꽃");
		Pocket p3 = new Pocket(7,"꼬부기","물");
		Pocket p4 = new Pocket(25,"피카츄","전기");
		
		Pocket[] po = new Pocket[4];
		po[0] = p1;
		po[1] = p2;
		po[2] = p3;
		po[3] = p4;
		
		for(int i=0;i<4;i++) {
			System.out.println(po[i].num + " " + po[i].name + " " + po[i].prop);
		}
	}
}
