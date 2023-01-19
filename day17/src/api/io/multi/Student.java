package api.io.multi;

import java.io.Serializable;

//내가 만든 클래스의 객체도 파일 출력이 되는가?
//- 입출력 가능성이 있다면 자격을 부여(마킹)해야 한다
//- java.io.Serializable 인터페이스를 상속
//- 상속받으면 경고가 나옴
//- 클래스의 버전을 관리할 것을 요구(serialVersionUID)
//- 안만들면 클래스의 내용이 바뀔 때마다 무조건 serialVersionUID가 바뀜(통제 안됨)
//- 입출력에서 제외하고싶은 필드가 있다면 transient 키워드를 붙이면 된다.
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private /* transient */ int num;
	private int level;
	
	
	public Student(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = this.name + " " + this.num;
		return s;
	}
	
	
}
