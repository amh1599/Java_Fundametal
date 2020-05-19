package java_20200519;

public class Admin {
	// 멤버변수는 private로 선언
	private String id;
	private String pwd;
	private String email;
	private int level;

	// 디폴트 생성자(Default Constructor)
	// 클래스 내에 생성자가 없으면 자동으로 만들어 진다
	// 생성자가 있으면 직접 만들어야 한다
	// 디폴트 생성자에는 첫줄에 super()가 생략되어있다
	// 단축키 : Alt + Shift + s => c
	public Admin() {
		super(); // 부모 클래스의 디폴트 생성자를 호출
	}

	// 생성자(Constructor)
	// 생성자는 반환값이 없다
	// 이름은 클래스 이름과 동일
	// 생성자의 역할은 인스턴스 변수 초기화
	// 생성자에는 첫줄에 super()가 생략되어있다
	// 단축키 : Alt + Shift + s => o
	public Admin(String id, String pwd, String email, int level) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}

	// 생성자의 오버로딩
	// 단축키 : Alt + Shift + s => o => 멤버변수 선택
	public Admin(String id, String pwd, String email) {
		//super();
		this(id, pwd, email, 0);	// this => 다른 생성자를 호출, 반드시 생성자에서만 호출 가능
			// this의 2가지 사용법
			// 1. 자기자신 객체 => this.
			// 2. 다른 생성자를 호출 => this(~,~,,,)
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPwd() {
		return pwd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}
}
