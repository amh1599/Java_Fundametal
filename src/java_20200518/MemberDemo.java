package java_20200518;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member();
		// 캡슐화를 통한 get, set 설정
		m.setName("안무현");
		m.setZipCode("3689");
		m.setAddr1("충청남도");
		m.setAddr2("아산시");
		m.setSnn1("941231");
		m.setSnn2("1111118");
		m.setAge(27);
		m.setRegdate("2020-05-18");
		
		System.out.println(m.getName());
		System.out.println(m.getZipCode());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getSnn1());
		System.out.println(m.getSnn2());
		System.out.println(m.getAge());
		System.out.println(m.getRegdate());
	}
}
