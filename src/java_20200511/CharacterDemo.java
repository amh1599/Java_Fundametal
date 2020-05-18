package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		// 1.유니코드 표현 => '\u0000'
		char c1 = '\uC548';
		char c2 = '\uBB34';
		char c3 = '\uD604';
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);	// 줄바꿈(println)없어서 안무현 출력
		
		// 2.아스키코드 포현
		// 48 ~ 57 => 0 ~ 9
		// 65 ~ 90 => A ~ Z
		// 97 ~ 122 => a ~ z
		char c4 = 97;
		System.out.println(c4); // a
		
		// 3.문자 표현번
		char c5 = '안';
		System.out.println(c5); // 안
		
		char c6 = '\'';
		char c7 = '\"';
		char c8 = '\\';	// char 형에서 ' " \ 표기 방법 => 앞에 \ 붙이면 된다
		
		String s1 = "\'";
		String s2 = "\"";
		String s3 = "\\"; // Sting 형에서 ' " \ 표기 방법 => 앞에 \ 붙이면 된다
		
		System.out.println("aa" + '\t' + "bb");	// tab
		System.out.println("aa" + '\n' + "bb");	// 윈도우 계열 Enter
		System.out.println("aa" + '\r' + "bb");	// 리눅스 계열 Enter
	}
}
