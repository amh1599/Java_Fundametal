package java_20200526;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("c:\\dev\\FileDemo.java");
			fw = new FileWriter("c:\\dev\\FileDemo2.java");
			
			/*// 한 문자(2byte)를 읽고 출력
			int readChar = 0;
			while((readChar = fr.read()) != -1) {
				System.out.print((char)readChar);	// 표준 출력장치(모니터)로 출력, readChar은 숫자이므로 캐스팅 필요
				fw.write(readChar);	// 파일로 출력
			}
			*/
			
			// 문자의 배열을 읽고 출력
			int readCharCount = 0;
			char[] readChar = new char[1024];
			while((readCharCount = fr.read(readChar)) != -1) {
				System.out.print(new String(readChar,0,readCharCount));
				//fw.write(readChar, 0, readCharCount);
				fw.write(new String(readChar, 0, readCharCount));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
