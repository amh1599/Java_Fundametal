package java_20200519;

public class Child extends Parent {
	String chicken;
	int money;
	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}
	
	// 단축키 Ctrl + space Bar => override 선택
	public void play(String starcraft) {
		//super.play(starcraft); => 가능하나 오버라이딩은 메서드를 재정의 하는 경우가 많아서 super. 은 생략하는 경우가 많다
		System.out.println("Child play()");
	}
	// 오버라이딩 사용 규칙
	// 1. 상속관계여야 한다
	// 2. 메서드 이름, 변수 타입, 개수, 반환형이 같아야 한다
	// 3. 접근한정자는 자식이 더 크거나 같아야 한다
	
	public void setParentMoney(int money) {
		//this.money = money;	// 자신의 money를 호출 this.~
		super.money = money;	// 부모의 money를 호출 super.~
	}
	
	public long getParentMoney() {
		//return this.money;	// 자신의 money를 호출 this.~
		return super.money;		// 부모의 money를 호출 super.~
	}
}
