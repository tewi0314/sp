package oop.modifier7;

public class Grade {
	private String name;
	private int grade;
	private int kor;
	private int eng;
	private int math;
	
	public Grade(String name, int grade, int kor, int eng, int math) {
		this.setName(name);
		this.setGrade(grade);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor<0 || kor>100) return;
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(eng<0 || eng>100) return;
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math<0 || math>100) return;
		this.math = math;
	}
	
	public int getTotal() {
		return this.getKor() + this.getEng() + this.getMath();
	}
	public double getAvg() {
		return this.getTotal()/3.0;
	}
	
	public String getTotalGrade() {
		if(this.getAvg()>=90) return "A";
		else if(this.getAvg()>=80) return "B";
		else if(this.getAvg()>=70) return "C";
		else return "F";
	}
	
	public void output() {
		System.out.println("학생성적정보");
		System.out.println("이름: " + this.getName());
		System.out.println("학년: " + this.getGrade());
		System.out.println("국어점수: " + this.getKor());
		System.out.println("영어점수: " + this.getEng());
		System.out.println("수학점수: " + this.getMath());
		System.out.println("총점: " + this.getTotal());
		System.out.println("평균: " + this.getAvg());
		System.out.println("등급: " + this.getTotalGrade());
	}
}
