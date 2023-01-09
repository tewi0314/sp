package oop.modifier6;

public class Ncs {
	private String name;
	private String subject;
	private int seoScore;
	private int checkScore;
	private boolean event;
	
	public Ncs(String name, String subject, int seoScore, int checkScore) {
		this.setName(name);
		this.setSubject(subject);
		this.setSeoScore(seoScore);
		this.setCheckScore(checkScore);
	}
	
	public boolean getEvent() {
		return event;
	}
	public void setEvent(boolean event) {
		if(this.getSeoScore()>=40 && this.getCheckScore()>=40 && this.getAvg()>60) {
			this.event = true;
		}else this.event = false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSeoScore() {
		return seoScore;
	}
	public void setSeoScore(int seoScore) {
		if(seoScore<0 || seoScore>100) return;
		this.seoScore = seoScore;
	}
	public int getCheckScore() {
		return checkScore;
	}
	public void setCheckScore(int checkScore) {
		if(checkScore<0 || checkScore>100) return;
		this.checkScore = checkScore;
	}
	
	public int getTotal() {
		return this.getSeoScore()+this.getCheckScore();
	}
	
	public double getAvg() {
		return this.getTotal()/2.0;
	}
	
	public void output() {
		System.out.println("NCS 평가정보");
		System.out.println("이름: " + this.getName() );
		System.out.println("과목: " + this.getSubject() );
		System.out.println("서술형점수: " + this.getSeoScore() );
		System.out.println("체크리스트점수: " + this.getCheckScore() );
		System.out.println("총점: " + this.getTotal() );
		System.out.println("평균: " + this.getAvg() );
		this.setEvent(event);
		if(this.getEvent() == true) {
			System.out.println("평가결과: 통과");
		}else {
			System.out.println("평가결과: 재평가");
		}
		
	}
}
