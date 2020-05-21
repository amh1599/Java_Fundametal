package java_20200521;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1==s2);	// false
		// == 연산은 참조하는 object가 같은지를 연산
		
		System.out.println(s1.equals(s2));	// true
		// String 클래스에서 equals()는 참조하는 object의 내용이 같은지를 연산
		// object 에서는  == 연산이지만, String 에서는 오버라이딩이 일어남
		
		
		Customer c1 = new Customer("안무현","충청남도");
		Customer c2 = new Customer("안무현","충청남도");
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));	// 오버라이딩을 하지 않으면 false 나옴
		System.out.println(c1.hashCode());	// equals()와 hashCode()의 결과가 같아야 한다
		System.out.println(c2.hashCode());	// equals()을 오버라이딩 하면 hashCode()도 오버라이딩을 해야 한다
		
		// 오버라이딩을 이용한 문자 출력
		// .toString()은 평소에 생략
		System.out.println(c1.toString());	// 오버라이딩 없으면 패키지를포함한클래스명@해시코드 가 나온다
		System.out.println(s1.toString());
	}
}
