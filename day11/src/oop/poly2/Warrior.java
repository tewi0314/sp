package oop.poly2;

public class Warrior extends Class implements Name{
	
	public String getName() {
		return "전사";
	}
	
	Warrior(String id){
		super(id);
		this.setLv(1);
	}
	
	@Override
	public void atk() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "가 칼로 공격합니다!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("전사가 뛰어서 이동합니다!");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("id: " + this.getId());
		System.out.println("Lv: " + this.getLv());
	}

	@Override
	public void store() {
		// TODO Auto-generated method stub
		System.out.print("전사가 ");
		super.store();
	}
	
}
