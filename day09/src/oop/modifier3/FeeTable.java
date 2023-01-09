package oop.modifier3;

public class FeeTable {
	private String name;
	private int time;
	private int fee;
	private String sort;
	
	FeeTable(String name, int time, int fee, String sort){
		this.setName(name);
		this.setTime(time);
		this.setFee(fee);
		this.setSort(sort);
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setTime(int time) {
			if(time%30!=0) {
			return;
		}else {
			this.time = time;	
		}
	}
	void setFee(int fee) {
		if(fee<0) {
			return;
		}else {
			this.fee = fee;
		}
	}
	void setSort(String sort) {
		switch(sort) {
		case "온라인", "오프라인", "혼합" : this.sort = sort;
										break;
		default: return;								
		}
		this.sort = sort;
	}
	String getName() {
		return this.name;
	}
	int getTime() {
		return this.time;
	}
	int getFee() {
		return this.fee;
	}
	String getSort() {
		return this.sort;
	}
	
	void output() {
		System.out.println("<학원강의 요금표>");
		System.out.println("강좌명: " + this.getName());
		System.out.println("강의시간: " + this.getTime());
		System.out.println("수강료: " + this.getFee());
		System.out.println("구분: " + this.getSort());
	}
}
