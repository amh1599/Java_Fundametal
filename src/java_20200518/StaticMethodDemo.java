package java_20200518;

public class StaticMethodDemo {
	String name;
	static double interestRate;
	
	public void m1() {
		// instance 메서드에서는 instance 변수, static 변수 모두 사용 사능
		// instance 메서드에서는 instance 메서드, static 메서드 모두 호출 가능
		this.name = "안무현";	// this 같은 메서드 내에 있는 자기자신 객체, 생략 가능
		StaticMethodDemo.interestRate = 4.2;	// 다른 메서드에 있으므로 클래스 이름으로 호출, 생략가능
		this.m2();
		m4();
	}
	
	public void m2() {
		System.out.println("m2() instance 메서드 호출");
	}
	
	public static void m3() {
		// static 메서드에서는 static 변수만 사용 가능, instance 변수 사용 불가
		// static 메서드에서는 static 메서드만 호출 가능, instance 메서드 호출 불가
		// static 메서드에서는 this를 사용할 수 없음
		//name = "홍길동"; => 에러
		StaticMethodDemo.interestRate = 3.9;
		//m2(); => 에러
		StaticMethodDemo.m4();
		
		// static 메서드에서 instance 변수와 instance 메서드를 호출하려면 객체를 생성해서 사용해야 한다
		StaticMethodDemo m1 = new StaticMethodDemo();
		m1.name = "홍길동";
		m1.m2();
	}
	public static void m4() {
		System.out.println("m4() static 메서드 호출");
	}
	
	public static void main(String[] args) {
		m3();
		m4();
		interestRate = 2.3;	// 전부 static 이여서 바로 호출 가능
		
		StaticMethodDemo m = new StaticMethodDemo();
		m.m1();
		m.m2();
		m.name = "손정의";	// instance는 객체를 사용하여 호출
	}
}
