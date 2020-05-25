package java_20200525;
//사용자 정의 예외 클래스
//자바에서 제공하는 예외 클래스가 없기때문에 새로 만들어서 사용해야 한다.
public class IncorrectAccountException extends Exception {
	public IncorrectAccountException(String msg) {
		super(msg);
	}
}
