package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:\\dev\\FileDemo.java");
			fos = new FileOutputStream("c:\\dev\\FileDemo3.java");
			
			int readByteCount = 0;		// 읽은 바이트 수 카운트
			byte[] readBytes = new byte[1024*8];	// 읽은 바이트
			
			// fis.read(readBytes) : FileInputStream에 8192 바이트를 읽어서
			// readBytes에 저장하고 읽은 바이트수를 반환한다.
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);	// 마지막을 위해 처음부터 읽은 부분 까지만 쓰라는 의미
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fis != null) fis.close();
					if(fos != null) fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
