package oop.keyword3;

public class Test01 {
	public static void main(String[] args) {
		GalaxyFold4 g1 = new GalaxyFold4("010-1234-1234", "블랙");
		GalaxyFold4 g2 = new GalaxyFold4("010-2323-4343", "실버");
		GalaxyFold4 g3 = new GalaxyFold4("010-2345-2345", "화이트");
		
		g1.setCompany("애플");
		
		g1.output();
		g2.output();
		g3.output();
	}
}
