package oop.poly2;

public class Magician extends Class {
			
		Magician(String id){
			super(id);
			this.setLv(1);
		}
		
		@Override
		public void atk() {
			// TODO Auto-generated method stub
			System.out.println("마법사가 마법으로 공격합니다!");
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			System.out.println("마법사가 텔레포트로 이동합니다!");
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
			System.out.print("마법사가 ");
			super.store();
		}
		
	

}
