package java_20200512;

public class OperatorDEmo1 {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;
		
		c = a+b;
		System.out.println(c);
		
		c = a-b;
		System.out.println(c);
		
		c = a*b;
		System.out.println(c);
		
		d = (double)b/a;
		System.out.println(d);
		
		c = b%a;
		System.out.println(c);
		
		a += b;
		System.out.println(1);
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		a = 10;
		b = 20;
		
		c = a++;
		System.out.println(c);
		c = ++b;
		System.out.println(c);
		
		boolean isSuccess = false;
		a = 10;
		b = 20;
		
		isSuccess = (a==b) && (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		isSuccess = (a!=b) || (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println(1+2+3+"456");
		System.out.println("123"+4+5+6);
		System.out.println("123"+(4+5+6));
	}
}
