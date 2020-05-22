package java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// Ctrl + Shift + o : import 단축키
		// HashSet - 객체의 중복을 허용하지 않고, 순서 없음
		
		// 1. 선언 및 생성
		HashSet<Integer> set = new HashSet<Integer>();	
		// <Integer> : Generic이라 하며 set에 Integer 타입만 들어가게 해준다. 출력 시 casting 불필요
		
		// 2. 할당
		set.add(1);	// collection 에는 primitive data type을 절대 넣을 수 없다. auto boxing 일어남
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);	// 중복은 추가되지 않음
		
		// 3. 출력
		Iterator<Integer> i = set.iterator();	// set을 enumeration화 시키기
		while(i.hasNext()) {
			Integer number = i.next();	// Object 반환이여서 int가 아닌 Wrapper class의 Integer로 받는다.
			System.out.println(number);
		}
		
		HashSet<Customer> set1 = new HashSet<Customer>();
		set1.add(new Customer("안무현1"));
		set1.add(new Customer("안무현2"));
		set1.add(new Customer("안무현3"));
		set1.add(new Customer("안무현1"));	// Customer 클래스에서 equals()와 hashCode()를 오버라이딩 하지 않으면 서로 다른 객체로 인식한다.
		
		System.out.println(set1.size());
		
		
		// 로또 복권 - HashSet
		// TreeSet - 객체의 중복을 허용하지 않음, 오름차순 정렬
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(true) {
			int random = (int)(Math.random() * 45) + 1;
			lotto.add(random);
			if(lotto.size()==6) break;
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+"\t");
		}
	}
}








