package java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");	// 예외 처리 필요
			fos = new FileOutputStream("c:\\dev\\jdk.exe");
			
			int readByte = 0;
			/////// fis.read() 는 1바이트씩 읽는다. 더이상 읽을 바이트가 없으면 -1을 반환한다. 예외 처리 필요
			/////// fos.write(~) 는 1바이트씩 쓴다. 예외 처리 필요
			while((readByte = fis.read()) != -1) {
				fos.write(readByte);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {		/////////////////작업이 완료되면 무조건 닫아야 하므로, finally에서 close() 해준다.////////////////////////////////////
			try {	// 먼저 close() 선언 후 try catch 해준다.
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
