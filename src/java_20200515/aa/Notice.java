package java_20200515.aa;

public class Notice {
	public int number;		// public	=> 어디서든 접근 가능
	protected String title;	// protected=> 같은 클래스 내와 같은 package,상속받은 다른 package에서 접근 가능
	int hit;				// default	=> 같은 클래스 내와 같은 package에서 접근 가능
	private String regdate;	// private	=> 같은 클래스 내에서만 접근 가능
	// private 멤버 변수는 공개하지 않는걸로 한다. 접근하는 방법은 method에서 다룬다. 
}
