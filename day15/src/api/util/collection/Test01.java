package api.util.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Test01 {
	public static void main(String[] args) {
		//ex: 전화번호부 vs 방명록
		//-전화번호부는 데이터 저장시 오름차룬 정렬 처리가 이루어진다(순서 무시)
		//-방명록은 작성 순서대로 저장된다(순서 보장)
		//-순서가 보장되는 저장소를 List라 부르며 무시되는 저장소를 set이라 부름
		
		
		//TreeSet a = new TreeSet();
		//ArrayList b = new ArrayList();
		
		//Set a = new TreeSet();
		//List b = new ArrayList();
		
		Set<String> a = new TreeSet<>();
		List<String> b = new ArrayList<>();
		
		a.add("피카츄"); b.add("피카츄");
		a.add("라이츄"); b.add("라이츄");
		a.add("파이리"); b.add("파이츄");
		a.add("꼬부기"); b.add("꼬부기");
		a.add("피카츄"); b.add("피카츄");
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
