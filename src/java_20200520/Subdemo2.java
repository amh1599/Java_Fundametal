package java_20200520;

//객체 형변환 하는 이유 : 부모 클래스가 추상 클래스 일때 사용한다. 
//(추상 클래스는 자식 클래스가 있어야 객체 생성이 가능하다.)

public class Subdemo2 {
	public static void change(Super sup) {	// Super sup = new sub();
		sup.age = 20;	// 객체의 형변환이 일어나서 부모클래스의 멤버변수에 접근 가능
		sup.playBadook();
		sup.work();		// 오버라이딩 발생 => Sub.Work() 호출
	}
	
	public static void main(String[] args) {
		Sub s1 = new Sub();
		System.out.println(s1.age);
		
		change(s1);
		System.out.println(s1.age);
	}

}
