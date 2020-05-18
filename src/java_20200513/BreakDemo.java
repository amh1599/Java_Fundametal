package java_20200513;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i==6) break;
			sum += i;
		}
		System.out.printf("1부터 5까지 합은 %d 입니다.%n", sum);
		
		outter:for (int i = 2; i <= 9 ; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d%n", i, j, i*j);
				if (i==5 && j==5) {
					break outter;
				}
			}
		}
	}
}
