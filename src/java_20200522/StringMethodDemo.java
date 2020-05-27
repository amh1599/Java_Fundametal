package java_20200522;

public class StringMethodDemo {
	public static void main(String[] args) {
		
		// char charAt(int index) : 문자열 중에 특정 index에 있는 문자를 반환 
		String ssn = "111111-1111118";
		char c = ssn.charAt(6);
		System.out.println(c);	// -
		
		
		// String concat(String msg) : 문자열 뒤에 msg을 연결하여 반환
		ssn = ssn.concat("abcd");
		System.out.println(ssn);	// 111111-1111118abcd
		
		
		// boolean endsWith(String msg) : 문자열 마지막이 msg과 동일한지를 반환(true, false)
		String fileName = "abcd.doc";
		if(fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}else {
			System.out.println("파일이 아닙니다.");
		}
		
		
		// boolean startWith(String msg) : 문자열 시작이 msg과 동일한지를 반환(true, false)
		String url = "https://www.naver.com";
		String path = "/news/ssss.do?id=123";
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		
		// boolean equalsIgnoreCase(Object obj) : obj와 대소문자 구분 없이 비교(true, false)
		boolean success = fileName.equalsIgnoreCase("abcd.DOC");
		System.out.println(success);	// true
		
		
		// int indexOf(String msg) : msg가 몇번째에 있는지를 반환
		int index = ssn.indexOf("-"); //ssn ="111111-1111118"
		System.out.println(index);	// 6
		
		
		// int lastIndexOf(String msg) : msg 문자열의 위치를 마지막에서 시작하여 찾고, 처음부터 몇번째 위치인지를 반환
		fileName = "abc.abc.abc.abc.doc";
		System.out.println(fileName.indexOf("."));	// 3
		System.out.println(fileName.lastIndexOf("."));	// 15
		
		
		// 배열의 길이 : length
		// 문자열의 길이 : length()
		// String trim() : 앞뒤 문자열의 공백 제거
		String dbId = "amh0000".trim();
		String userId = "amh0000  ".trim();
		System.out.println(dbId.length());	// 7
		System.out.println(userId.length());	// 7
		System.out.println(dbId.equals(userId));	// true
		
		
		// String subString(int first, int last) : 특정 영역의 문자열을 반환
		// first는 포함, last는 포함하지 않음 ex) (0, 3)이면 0번째, 1번째, 2번째 반환
		fileName = "adc.abc.abc.doc";
		String first = fileName.substring(0, fileName.lastIndexOf("."));
		String last = fileName.substring(fileName.lastIndexOf(".")+1);	// 마지막을 지정하지 않으면 전부 다 반환함
		System.out.println(first);	// abd.abc.abc
		System.out.println(last);	// doc
		
		
		// String replace(String first, String second) : first 문자열을 second 문자열로 바꿔서 반환
		String html = "안녕하세요.\n저는 안무현입니다.\n잘 부탁드립니다.";
		html.replace("\n", "<br>");
		System.out.println(html);
		
		// String replaceAll(String first, String second) : first 문자열을 second 문자열로 바꿔서 반환
		String number = "6,900.56".replaceAll(",", "");
		double d = Double.parseDouble(number);
		System.out.println(d);
		
		
		// String toUpperCase() : 대문자로 바꿔서 반환
		String m1 = "hello";
		m1 = m1.toUpperCase();
		System.out.println(m1);	// HELLO
		
		
		// String toLowerCase() : 소문자로 바꿔서 반환
		m1 = m1.toLowerCase();
		System.out.println(m1); // hello
		
		
		// String.valueOf() : primitive data type을 문자열로 변환하여 반화
		char[] c1 = {'a', 'b', 'c'};
		String msg = String.valueOf(c1); // char[]을 문자열로 바꾸는 유일한 방법
		System.out.println(msg);	// abc
		
		
		// String[] split(String regex) : regex 문자열을 기준으로 나누어서 배열순서로 저장
		String[] str = ssn.split("-");	// 111111-1111118abcd
		String ssn1 = str[0];
		String ssn2 = str[1];
		System.out.println(ssn1);	// 111111
		System.out.println(ssn2);	// 1111118abcd
		
		
		// String.format(  ,  ) : printf()와 같다
		String str2 = String.format("%,.2f", 123123.4567);	// String.format()은 ,찍기와 반올림이 자동이다.
		System.out.println(str2);
		
		str2 = String.format("%3$,20.2f %2$,20.2f %1$,20.2f", 1234.4577, 223345.5680, 34234.5690);
		System.out.println(str2);
	}
}













