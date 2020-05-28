package java_20200527;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {
		// protocol://host:port/path?query#reference
		URL url = new URL("http://corners.gmarket.co.kr/Bestsellers?ItemId=1400979074#1400979074");	// text를 가진 html
		URL url2 = new URL("http://gdimg.gmarket.co.kr/1400979074/still/300");						// binary인 이미지
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();	// 없으면 -1 반환
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();
		
		System.out.println("protocol : " + protocol);
		System.out.println("host : " + host);
		System.out.println("port : " + port);
		System.out.println("path : " + path);
		System.out.println("query : " + query);
		System.out.println("reference : " + reference);
		
		/* // url의 html이 텍스트 일때
		InputStream in = url.openStream();	// html 정보를 저장(1byte)
		InputStreamReader isr = new InputStreamReader(in);	// 1byte를 2byte로 변환
		BufferedReader br = new BufferedReader(isr);
		
		String readLine = null;
		while((readLine = br.readLine()) != null) {		// 읽은 html 정보를 출력
			System.out.println(readLine);
		}
		
		in.close();
		isr.close();
		br.close();
		*/
		
		// url이 이미지일때 파일 저장
		InputStream in2 = url2.openStream();
		FileOutputStream fos2 = new FileOutputStream("c:\\dev\\300.jpg");
		int readByteCount = 0;
		byte[] readByte = new byte[1024*8];
		while((readByteCount = in2.read(readByte)) != -1) {
			fos2.write(readByte, 0, readByteCount);
		}
		in2.close();
		fos2.close();
	}
}
