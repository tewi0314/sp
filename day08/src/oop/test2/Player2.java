package oop.test2;

public class Player2 implements People {
	int rank;
	String name;
	String nation;
	int goal;
	
	public String getFood() {
		return "banana";
	}
	
	Player2(int rank, String name, String nation, int goal){
		this.rank = rank;
		this.nation = nation;
		this.name = name;
		this.goal = goal;
	}
}
