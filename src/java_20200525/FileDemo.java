package java_20200525;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	// File 클래스 ( < >: 주로 사용하는 메서드 ) 
	// 1. <디렉토리 생성>
	// 2. <파일 크기>, 파일 이름, 파일 경로, 수정한 날짜
	// 3. 파일 생성, <삭제>
	// 4. <파일 이름 바꾸기>
	public static void main(String[] args) {
		File f1 = new File("C:\\dev\\2002\\05\\25");
		
		boolean success = f1.mkdirs();	// 디렉토리를 여러개 만드는 메서드
		if(success) {
			System.out.println("디렉토리를 생성했습니다.");
		}else {
			System.out.println("이미 디렉토리가 있습니다.");
		}
		
		File f2 = new File("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		long fileSize = f2.length() / 1024;	// length() 파일의 크기를 구하는 메서드, byte 크기로 반환
		System.out.printf("%,dKB%n",fileSize);
		
		String fileName = f2.getName();		// getName() 파일의 이름은 구하는 메서드
		System.out.println(fileName);
		
		String path = f2.getPath();			// getPath() 파일의 경로를 구하는 메서드
		System.out.println(path);
		
		if(fileName.endsWith("exe")) {
			System.out.println("응용 프로그램");
		}else if(fileName.endsWith("pdf")) {
			System.out.println("pdf 파일");
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축 파일");
		}
		
		// 1970년 1월 1일 부터 마지막 수정한 날짜까지의 시간을 밀리세컨드로 반환
		long lastModified = f2.lastModified();
		System.out.println(lastModified);
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lastModified);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String date = sdf.format(c.getTime());
		System.out.println(date);
		
		File f3 = new File("c:\\dev\\Hello.java");	// 새로운 파일 생성
		try {
			f3.createNewFile();	// 예외처리가 필요하다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//f3.delete();	// 경로의 파일 삭제
		
		File f4 = new File("c:\\dev\\HelloWorld.java");
		f3.renameTo(f4);	// f3 파일의 이름을 f4 파일이름으로 변경
	}
}
