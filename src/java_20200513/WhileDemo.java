package java_20200513;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i<=10) {
			sum += i ;
			i++;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n",sum);
		
		i = 2;
		while(i<10) {
			int j = 1;
			while(j<10) {
				System.out.printf("%d X %d = %d%n",i,j,i*j);
				j++;
			}
			i++;
		}
	}
}
