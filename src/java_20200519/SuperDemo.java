package java_20200519;

// 평소에는 생략 되어 있는 것을 전부 다 적은 상태
import java.lang.*;

public class SuperDemo extends Object {
	public SuperDemo() { // 디폴트 생성자의 접근한정자는 클래스와 같은 접근한정자를 붙인다
		super();
	}
}

class A {
	A(int a) {

	}
	A() {}	// 디폴트 생성자가 없으면 에러 발생, 부모 클래스의 디폴트 생성자는 직접 만들어 두는 편이 좋다
}

class B extends A {
	B() {
		super();	// 부모 클래스의 디폴트 생정자 호출
	}
}




/*
class A extends Object{ 
	A(){ 
		super(); 
	} 
}

class B extends A{ 
	B(){ 
		super(); 
	} 
}
*/
