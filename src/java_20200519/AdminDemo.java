package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("amh1599", "1234", "amh1599@naver.com", 1);
		//a.setId("amh1599");
		//a.setPwd("1234");
		//a.setEmail("amh1599@naver.com");
		//a.setLevel(1);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		Admin a1 = new Admin("amh1599", "0000", "test@test.com");

		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());
	}
}
