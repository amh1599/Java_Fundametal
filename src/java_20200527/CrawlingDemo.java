package java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String url = "http://www.imbc.com";
		
		// HTML 문서 전체를 관리하기 위한 객체
		Document doc = null;
		
		try {
			// url로 연결하여 html정보를 get 방식으로 가져와 doc에 저장
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("성공");
		
		// html 정보에서 class정보를 가져올때는 .을, id정보를 가져올때는 #을 붙인다.
		Elements elements = doc.select(".notice-list li");	// li가 여러가 저장되기 때문에 Elements 클래스를 사용
		
		for(int i = 0; i < elements.size(); i++) {	// 여러개 저장된 li를 순서대로 Element 클래스에 저장
			Element liElement = elements.get(i);
			System.out.println(liElement.text());
		}
		*/
		
		String url = "https://sports.news.naver.com/kfootball/index.nhn";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("성공");
		
		Elements elements = doc.select(".home_news");
		Elements liElements = elements.select(".home_news_list li");	
		// 먼저 hmoe_news 클래스를 찾고, 그 안의 home_news_list 클래스를 찾아서 li 항목들을 liElements에 저장
		
		for (int i = 0; i < liElements.size(); i++) {
			Element liElement = liElements.get(i);
			System.out.println(liElement.text());
		}
	}

}
