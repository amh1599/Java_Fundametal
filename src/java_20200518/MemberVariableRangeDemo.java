package java_20200518;

public class MemberVariableRangeDemo {
	String name;
	int age;
	double weight;
	boolean isReleased;

	public void methodA(String id) {
		// 지역변수에는 접근한정자를 붙일 수 없다.
		// public int a; => 에러 발생

		// 맴버변수와 달리 초기화를 하지 않아도 상관없지만, 다른곳에서 연산하면 에러 발생
		// int a;
		// int b = a + 10; => 에러 발생

		// id, a, b의 우효범위는 methodA에서만 사용 가능
	}

	public static void main(String[] args) {
		MemberVariableRangeDemo m = new MemberVariableRangeDemo();

		// 맴버변수는 객체를 생서하면 기본값을 갖는다
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.weight);
		System.out.println(m.isReleased);
	}
}
