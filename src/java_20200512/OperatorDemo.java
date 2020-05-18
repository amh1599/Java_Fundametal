package java_20200512; // Ctrl + Shiht + F => 자동 줄바꾸기

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		c = a * b;
		System.out.println(c);

		d = b / (double) a; // 한쪽만 double 형으로 casting 하면 나머지도 자동으로 casting 된다
		System.out.println(d);

		c = b % a;
		System.out.println(c);

		a += b; // a = a + b
		System.out.println(a);

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = +i; // 응용
		}
		System.out.println(sum);

		
		a = 10;
		b = 20;

		a++;
		++b;
		System.out.println(a); // 11
		System.out.println(b); // 21

		c = a++; // 대입 후 증가
		System.out.println(c); // c는 21, a는 22
		c = ++b; // 증가 후 대입
		System.out.println(c); // c는 22, b는 22

		
		a = 10;
		b = 20;
		d = 10.0;

		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);

		isSuccess = a < b;
		System.out.println(isSuccess);

		isSuccess = a >= b;
		System.out.println(isSuccess);

		isSuccess = a <= b;
		System.out.println(isSuccess);
		
		// primitive data type의 연산자는 자료형에 상관없이 값만 같으면 true를 반환한다.
		isSuccess = a == d;
		System.out.println(isSuccess);
		isSuccess = a != d;
		System.out.println(isSuccess);
		
		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		
		// a && b => a가 false이면 b를 연산하지 않음(short circuit)
		// a || b => a가 true이면 b를 연산하지 않음
		a = 10;
		b = 20;
		isSuccess = (a==b) && (++a==b++);	// &&의 뒤를 연산하지 않음
		System.out.println(isSuccess);	// false
		System.out.println(a);			// 10
		System.out.println(b);			// 20
		
		
		// + => 산술연산자(두개 모두 숫자일 경우), 연결연산자(두개 중 1개 이상이 문자열인 경우)
		System.out.println(1+2+3+"456");	// 6456
		System.out.println("123"+4+5+6);	// 123456 => 전부 연결 연산연산자로 처리
		System.out.println("123"+(4+5+6));	// 12315
	}
}
