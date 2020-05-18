package java_20200513;

public class ForDemo1 {
	public static void main(String[] args) {
		int a = 1;
		
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j < 6-i; j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j < a; j++) {
				System.out.printf("*");
			}
			a+=2;
			System.out.printf("\n");
		}
		
		a=9;
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < 6-i; j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j < a; j++) {
				System.out.printf("*");
			}
			a-=2;
			System.out.printf("\n");
		}
		
	}
}
