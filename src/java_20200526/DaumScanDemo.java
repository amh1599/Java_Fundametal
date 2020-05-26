package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class DaumScanDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.daum.net/");		// URL을 저장
		InputStream in = url.openStream();				// 1byte로 저장
		InputStreamReader isr = new InputStreamReader(in);	// 2byte로 변환
		BufferedReader br = new BufferedReader(isr);	// readLine()을 사용하기 위해 chain
		String readLine = null;
		
		FileWriter fw = new FileWriter("c:\\dev\\daum.html");	// File로 저장할 경로, bw.flush() 해줘야 함
		BufferedWriter bw = new BufferedWriter(fw);				// newLine()을 사용하기 위해 chain, bw.flush() 해줘야 함
		PrintWriter pw = new PrintWriter(bw, true);				// bw.flush()를 자동으로 해주기 위해 chain
		//PrintWriter pw = new PrintWriter(fw, true);		// 둘중 아무거나 해도 된다.
		// PrintWriter는 FileWriter와 BufferWriter 둘 다 chain이 가능하다.
		
		while((readLine = br.readLine()) != null) {
			pw.println(readLine);
		}
	}
}
