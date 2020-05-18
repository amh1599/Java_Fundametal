package java_20200513;

public class ForDemo {
	public static void main(String[] args) {
		// 1 ~ 10 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);

		// 1 ~ 10 중 짝수 합
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.printf("1부터 10까지 짝수의 합은 %d 입니다.%n", sum);
		
		// 구구단
		for (int i = 2; i <= 9 ; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d%n", i, j, i*j);
			}
		}
		// 구구단 역순
		System.out.printf("%n");
		for (int i = 9; i >=2; i--) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d%n", i, j, i*j);
			}
		}
		
		System.out.printf("%n");			// *
		for (int i = 1; i <= 5; i++) {		// **
			for (int j = 1; j <= i; j++) {	// ***
				System.out.printf("*");		// ****
			}								// *****
			System.out.printf("%n");
		}
		
		System.out.printf("%n");			// *****
		for (int i = 0; i < 5; i++) {		// ****
			for (int j = 0; j < 5-i; j++) {	// ***
				System.out.printf("*");		// **
			}								// *
			System.out.printf("%n");
		}
	}
}
