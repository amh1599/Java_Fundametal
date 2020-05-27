package java_20200527;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketcapCrawlingDemo {
	public static void main(String[] args) {
		/* // 문자열의 형변황 예시
		String test = "6,909.45".replaceAll(",","");	// replaceAll(a,b) : 문자열에서 a를 b로 변환
		double d = Double.parseDouble(test);	// 문자열을 double형으로 변환
		System.out.println(d);
		
		String test1 = String.format("%,.2f", d);	// String.format()는 System.out.printf()와 같은 형식으로 채운다.
		System.out.println(test1);
		*/
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20200501&end=20200527";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
			fw = new FileWriter("c:\\dev\\coin.txt");
			pw = new PrintWriter(fw, true);
			
			Elements trElements = doc.select(".cmc-table__table-wrapper-outer tbody tr");
			
			System.out.println("날짜\t시가\t고가\t저가\t종가\t거래량\t총량");
			//fw.write("날짜\t\t시가\t고가\t저가\t종가\t거래량\t\t총량\n");
			pw.println("날짜"+"\t\t"+"시간"+"\t"+"고가"+"\t"+"저가"+"\t"+"종가"+"\t"+"거래량"+"\t\t"+"총량");
			
			/* // 단순 출력
			for (int i = 0; i < trElements.size(); i++) {
				Element trElement = trElements.get(i);
				Elements tdElements = trElement.select("td");
				
				for (int j = 0; j < tdElements.size(); j++) {
					Element tdElement = tdElements.get(j);
					System.out.print(tdElement.text()+"\t");
				}
				System.out.println();
			}
			*/
			
			for (int i = 0; i < trElements.size(); i++) {
				Element trElement = trElements.get(i);
				String date = trElement.child(0).text();	// tr 안의 0번째 td를 하나의 변수로 저장(택스트를 수정할 수 있다)
				String open = trElement.child(1).text();	// tr 안의 1번째 td를 하나의 변수로 저장
				String high = trElement.child(2).text(); 	// tr 안의 2번째 td를
				String low = trElement.child(3).text(); 
				String close = trElement.child(4).text(); 
				String volume = trElement.child(5).text();
				String marketCap = trElement.child(6).text();
				
				System.out.println(date+"\t"+open+"\t"+high+"\t"+low+"\t"+close+"\t"+volume+"\t"+marketCap);
				
				//fw.write(date+"\t"+open+"\t"+high+"\t"+low+"\t"+close+"\t"+volume+"\t"+marketCap+"\n");
				pw.println(date+"\t"+open+"\t"+high+"\t"+low+"\t"+close+"\t"+volume+"\t"+marketCap);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fw != null) fw.close();
					if(pw != null) pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		
	}
}
