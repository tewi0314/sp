package oop.keyword7;

import java.time.LocalDate;

public class Calculator {
	
	static final double pi = 3.14;
	
	public static int pow(int n) {
		return n*n;
	}
	
	public static int pow(int n, int value) {
		int a = n;
		for(int i=0;i<value-1;i++) {
			n*=a;
		}
		return n;
	}
	
	public static double bmi(double height, double weight) {
		double b = weight/Math.pow((height/100),2);
		return b;
	}
	
	public static int fee(int age) {
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		int a = year - age + 1;
		if(a>=20) return 1000;
		else return 500;
	}
	
	public static double square(int under, int height) {
		return under*height/2;
	}
	
	public static double round(int r) {
		return pi*r*r;
	}
}
