package oop.poly2;

public class Archer extends Class {

		Archer(String id){
			super(id);
			this.setLv(1);
		}
		
		@Override
		public void atk() {
			// TODO Auto-generated method stub
			System.out.println("궁수가 활로 공격합니다!");
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			System.out.println("궁수가 숨어서 이동합니다!");
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
			System.out.print("궁수가 ");
			super.store();
		}
		
	
}
