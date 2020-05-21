package java_20200521;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		/*
		 * 자바 1.4 이전 버전에서는 primitive data type을 collection에 
		 * 저장 할 수 없기 때문에 primitive data type을 객체화 할 수 있는는
		 * wrapper class가 필요함 
		 * 아래와 같이 1을 추가할 수 없음
		 * collection에 1을 저장하기 위해서는 primitive data type을
		 * 객체화 하는 Integer 클래스로 변환해야함
		 */
		ArrayList list = new ArrayList();
		// list.add(1); => 불가능
		list.add(new Integer(1));	// 생성자를 이용하여 wrapper class로 변환
		
		
		/* 변환 하는 방법 */
		// 1. primitive data type => wrapper class(  new Integer()  )
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		// 2. wrapper class => primitive data type(  ___Value()  ) 
		int i3 = i1.intValue() + i2.intValue();
		
		// 3. String => primitive data type
		String s1 = "10";
		String s2 = "20";
		int i4 = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println(i4);
		
		// 4. primitive data type => string
		String s3 = String.valueOf(10);
		
		
		// primitive data type이 자동으로 wrapper class로 변환하는 것을 auto boxing
		Integer i5 = 10;
		Integer i6 = 20;
		
		// wrapper class가 primitive data type으로 자동으로 변환하는 것을 auto un-boxing
		int i7 = i5 + i6;
		System.out.println(i7);
	}
}
