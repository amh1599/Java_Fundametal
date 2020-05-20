package java_20200520;

public class SubDemo {

	public static void main(String[] args) {
		System.out.println("부모 클래스");
		Super s1 = new Super();		// s1의 타입이 가르키는 클래스를 의미 : Super클래스
		System.out.println(s1.age);
		s1.playBadook();
		s1.work();
		System.out.println();
		
		System.out.println("자식 클래스");
		Sub s2 = new Sub();			// s2의 타입이 가르키는 클래스를 의미 : Sub클래스
		System.out.println(s2.height);
		s2.playGame();
		s2.work();	// 오버라이딩
		// 부모의 멤버변수, 메서드 접근
		s2.age = 20;
		System.out.println(s2.age);
		s2.playBadook();
		System.out.println();
		
		// 객체의 형변환
		System.out.println("객체의 형변환");
		Super s3 = new Sub();		// s3의 타입이 가르키는 클래스를 의미 : super클래스
		System.out.println(s3.age);	// 부모의 멤버변수
		s3.playBadook();			// 부모의 메서드
		s3.work();					// 자식의 메서드(오버라이딩)
		//s3.height = 20;			// 자식의 멤버변수  => 접근 불가
		//s3.platGame();			// 자식의 메서드 => 접근 불가
		
		System.out.println("");
		Super s4 = s2;				// s2에서 만든 객체를 s4도 같이 참조
		System.out.println(s4.age);	// 부모의 멤버변수이지만 s2에서 이미 실행된 age이다.
		s4.playBadook();			// 부모의 메서드
		s4.work();					// 자식의 메서드(오버라이딩)
	}

}
