package java_20200521;

public class ImplementClass implements InterA{
	// 오버라이딩 해야 에러가 없다.
	// 접근 한정자는 상속받는 메서드의 접근 한정자 보다 크거나 같아야 한다.
	// 인터페이스 메서드의 접근 한정자는 public(생략 가능)
	public void mA() {
		System.out.println("mA()");
	}
	
	public void mB() {
		System.out.println("mB()");
	}
	
	public void mC() {
		System.out.println("mC()");
	}
}
