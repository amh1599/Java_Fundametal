package java_20200522;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		System.out.println(s1 == s2);
		// StringBuffer 클래스는 Object의 equals() 메서드를 overriding 하지 않았기 때문에
		// Object의 equals()를 사용한다.(참조하는 객체가 같은지 비교)
		System.out.println(s1.equals(s2));
		
		// StringBuffer => String 로 바꿔주는 메서드는 toString()
		String s3 = s1.toString();
		String s4 = s2.toString();
		System.out.println(s3.equals(s4));
		
		
		StringBuffer sql = new StringBuffer();
		sql.append("select name, age ");
		sql.append("from member ");
		sql.append("where name = '안무현' ");
		sql.append("order by name desc");
		System.out.println(sql);	// sql.toStrinf()가 생략되어 있음(toString()이 오버라이딩 일어나서 문자열로 바꿔줌)
		
		// StringBuffer에 모든 문자열 지우기
		sql.setLength(0); // 길이를 0으로 변환
		
		sql.append("select no, writer from board");
		System.out.println(sql);
	}
}
