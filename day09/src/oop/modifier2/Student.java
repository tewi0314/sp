package oop.modifier2;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	Student(String name, int kor, int eng, int math){
		this.setName(name);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	
	
	void setName(String name) {
		this.name = name;
	}
	void setKor(int kor) {
		if(kor<0 || kor>100) {
			return;
		}
		this.kor = kor;
	}
	void setEng(int eng) {
		if(eng<0 || eng>100) {
			return;
		}
		this.eng = eng;
	}
	void setMath(int math) {
		if(math<0 || math>100) {
			return;
		}
		this.math = math;
	}
	
	String getName() {
		return this.name;
	}
	int getKor() {
		return this.kor;
	}
	int getEng() {
		return this.eng;
	}
	int getMath() {
		return this.math;
	}
	
	int getTotal() {
		return this.kor + this.eng + this.math;
	}
	double getAvg() {
		return this.getTotal()/3.0;
	}
	
	void output() {
		System.out.print(this.name+ "\t");
		System.out.print(this.kor+ "\t");
		System.out.print(this.eng+ "\t");
		System.out.print(this.math+ "\t");
		System.out.print(this.getTotal() + "\t");
		System.out.print(this.getAvg() + "\t");
		System.out.println();
	}
	
}
