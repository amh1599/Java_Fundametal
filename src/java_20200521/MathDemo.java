package java_20200521;

public class MathDemo {
	public static void main(String[] args) {
		// 올림 - double반환
		double d1 = Math.ceil(4.2);
		System.out.println(d1);
		
		// 내림 - double 반환
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		// 반올림 - float면 int, double면 long 반환(반환값 주의)
		long l1 = Math.round(42.5);
		System.out.println(l1);
		// 소수점 2자리에서 반올림 하기
		d1 = 45.67;
		d1 = (double)Math.round(d1*10) / 10;
		System.out.println(d1);
		
		// 절대값 - double 반환
		int a1 = Math.abs(-145);
		System.out.println(a1);
		
		// 제곱근 - double 반환
		d1 = Math.sqrt(5);
		System.out.println(d1);
		
		// 승수 - double 반환
		d1 = Math.pow(2, 3);
		System.out.println(d1);
		
		// 무작위 - double 반환
		d1 = Math.random()*45;
		System.out.println(d1);
	}
}
