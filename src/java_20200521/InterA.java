package java_20200521;

// 인터페이스는 인터페이스를 다중 상속 가능하다.
public interface InterA extends InterB, InterC{
	// 인처페이스의 변수 public static final이 생략돼 있음
	// static으로 선언되야 접근 가능
	double PI = 3.14;
	
	// 인터페이스 메서드의 접근 한정자를 붙이지 않으면 public이 생략돼 있음
	// abstract 생략 가능
	void mA();
}
