package java_20200515;

// Customer 클래스
public class Customer {
	// 클래스의 멤버변수 - instance 변수, static 변수, final 변수
	// instance 변수(아무것도 안붙을 경우) - name, email, phone, balance, isReleased
	// 객체가 생성될 때만 만들어지는 변수
	public String name;
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;
	// static은 객체들의 공용 변수
	public static double interestRate;
	// final은 한번 선언하면 수정이 불가능한 상수, 이와 같이 선언하면 메모리 낭비가 심함!!!!!! 하지 말것
	// 일반적으로  static final로 사용
	public static final String BANKNAME = "사랑은행";	
}
