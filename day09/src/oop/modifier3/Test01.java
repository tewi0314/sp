package oop.modifier3;

public class Test01 {
	public static void main(String[] args) {
		FeeTable a = new FeeTable("자바 마스터과정", 90, 1000000, "온라인");
		FeeTable b = new FeeTable("파이썬기초", 60, 600000, "온라인");
		FeeTable c = new FeeTable("웹개발자 단기완성", 120, 1200000, "오프라인");
		
		c.setTime(30);
		a.setSort("오프라인");
		a.output();
		b.output();
		c.output();
	}
}
