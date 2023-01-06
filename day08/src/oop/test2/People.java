package oop.test2;

interface People {
	String getFood();
	
	default void printFood() {
		System.out.println(getFood() + " 맛있어");
	}
}
