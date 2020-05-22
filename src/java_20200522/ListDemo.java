package java_20200522;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		// ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for(int value: list) {	// Generic으로 선언된 List는 enhanced for loop로 출력 가능
			System.out.println(value);
		}
		
		// list 모두 삭제 => remove(int index)
//		while(list.size()!=0) {
//			list.remove(0);			
//		}
		for(int i = 0; i < list.size();) {
			list.remove(0);
		}
		for(int value: list) {
			System.out.println(value);
		}
	}
}
