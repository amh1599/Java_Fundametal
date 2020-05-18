package java_20200515.bb;

// 다른 package에 있는 클래스에 접근하는 방법
import java_20200515.aa.Notice;

// 클래스의 접근 지정자는 public, default 두개만 있다
public class NoticeDemo extends Notice{		// extends => 상속받는 방법
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number = 2;	// public
		
		// protected는 서로 다른 패키지 일경우에는 상속받은 경우에만 접근 가능
		//n1.title = "제목";
		
		// default는 같은 패키지 내에서만 접근 가능
		//n1.hit = 100;
		
		// private은 같은 클래스 내에서만 접근 가능
		//n1.regdate = "2002-05-15";
		
		
		// 부모 클래스인 Notice에서 접근할 수 있는 접근 한정자는 public,protected
		NoticeDemo n2 = new NoticeDemo();
		n2.number = 3;
		n2.title = "제목";
		// 접근 불가
		//n2.hit = 100;
		//n2.regdate = "2020-05-15";
	}
}
