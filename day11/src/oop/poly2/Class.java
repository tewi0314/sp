package oop.poly2;

public abstract class Class  {
	private String id;
	protected int lv;
	
	Class(String id){
		this.setId(id);
	}
	
	public void atk() {	}
	public void move() {}
	public void info() {}
	public void store() {
		System.out.println("상점을 개설합니다!");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	
	
}
