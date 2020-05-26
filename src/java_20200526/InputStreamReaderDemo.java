package java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		InputStream in = System.in;	// 표준 입력 장치(키보드)와 연결
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		try {
			System.out.print("입력하세요>");
			/* // 1byte 처리
			byte[] b = new byte[100];	// 입력을 받기 위한 배열
			int readByteCount = 0;
			
			// in.read(b) : 입력을 기다림, Enter를 치면 끝, 데이처를 b에 저장
			while((readByteCount = in.read(b)) != -1) {
				String str = new String(b, 0, readByteCount);	// byte[]을 문자열로 변환
				System.out.print(str);
				System.out.print("입력하세요>");
			}
			*/
			
			// 2byte 처리
			isr = new InputStreamReader(in);	// 1byte를 2byte로 바꿔누는 클래스
			br = new BufferedReader(isr);
			String readLine = null;
			
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				System.out.print("입력하세요>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
