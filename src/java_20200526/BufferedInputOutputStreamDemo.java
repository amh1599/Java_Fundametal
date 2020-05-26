package java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			/*
			// 1. FileInputStream과 FileOutPutStream을 이용해서 1byte씩 읽어서 1byte 출력하는 예제
			// 경과시간 : 287206 msec
			fis = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
			fos = new FileOutputStream("c:\\dev\\Git.exe");
			
			int readByte = 0;
			long start = System.currentTimeMillis();
			while((readByte = fis.read()) != -1) {
				fos.write(readByte);
			}
			long end = System.currentTimeMillis();
			
			System.out.printf("경과시간 %d%n",end-start);
			*/
			
			
			/*
			// 2. FileInputStream과 FileOtputStream을 이용하여 8192byte를 읽어서 8192byte를 출력하는 예제
			// 경과시간 : 68 msec
			fis = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
			fos = new FileOutputStream("c:\\dev\\Git.exe");
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*8];
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			}
			long end = System.currentTimeMillis();
			
			System.out.printf("경과시간 %d%n",end-start);
			*/
			
			// 3. BufferedInputStream과 BufferedOtputStream을 이용하여 1byte 읽어서 1byte 출력하는 예제
			// 경과시간 : 1000 msec
			// BufferedInputStream의 read() 메서드는 1byte 읽어서 BufferedInputStream의 버퍼(byte[]) 공간에 저장한다.
			// BufferedOutputStream의 write() 메서드는 1byte 출력이 아니라 BufferedOutputStream의 버퍼(byte[]) 공간에 가득 차 있으면 출력한다.
			// 만약 다 채워지지 않으면 출력하지 않음.
			// 이런경우 flush() 메서드를 이용해야 한다.
			fis = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
			bis = new BufferedInputStream(fis);		// stream chain => 기능이 향상됨
			
			fos = new FileOutputStream("c:\\dev\\Git.exe");
			bos = new BufferedOutputStream(fos);	// stream chain => 기능이 향상됨
			
			int readByte = 0;
			long start = System.currentTimeMillis();
			while((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
			// BufferesOutputStream의 버퍼(byte[])가 다 채워지지 않으면 전송되지 않는다.
			// 따라서 다 채워지지 않더라도 버퍼를 비우기 위해서는 flush()메서드를 사용해야 한다.
			bos.flush();
			long end = System.currentTimeMillis();
			
			System.out.printf("경과시간 %d%n",end-start);
			
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
					if(bis != null) bis.close();
					if(bos != null) bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}

















