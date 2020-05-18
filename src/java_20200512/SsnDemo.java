package java_20200512;

public class SsnDemo {
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 1;
		int a3 = 1;
		int a4 = 1;
		int a5 = 1;
		int a6 = 1;
		
		int b1 = 1;
		int b2 = 1;
		int b3 = 1;
		int b4 = 1;
		int b5 = 1;
		int b6 = 1;
		int b7 = 8;
		
		int sum = a1*2 + a2*3 + a3*4 + a4*5 + a5*6 + a6*7 + b1*8 + b2*9 + b3*2 + b4*3 + b5*4 + b6*5;
		int rest = sum % 11;
		
		rest = 11 - rest;
		
		rest %= 10;
		if(b7 == rest) {
			System.out.println("정상적인 주민번호");
		}else {
			System.out.println("비 정상적인 주민번호");
		}
		
	}
}
