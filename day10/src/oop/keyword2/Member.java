package oop.keyword2;

public class Member {
	private final String id;
	private int point;
	private String password;
	
	public Member(String id, String password) {
		this.id = id;
		this.setPoint(100);
		this.setPassword(password);
	}
	
	public void setPoint(int point) {

		if(point<0) return;
		else {
			this.point = point;
		}
	}
	public int getPoint() {
		return point;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	public String getId() {
		return id;
	}
	
	public void output() {
		System.out.println(this.id);
		System.out.println(this.point);
		System.out.println(this.password);
	}
}
