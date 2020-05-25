package java_20200525;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();	// Calendar 클래스를 생성자로 선언
		
		cal.setTimeInMillis(1589769612013L);	// 21억을 넘어가기 때문에 long 타입으로 숫자 뒤에 L을 붙여준다
		
//		int year = cal.get(Calendar.YEAR);			// 밑에 세줄로 간단하게 가능
//		int month = cal.get(Calendar.MONTH) + 1;
//		int day = cal.get(Calendar.DATE);
//		int hour = cal.get(Calendar.HOUR);
//		int minute = cal.get(Calendar.MINUTE);
//		int second = cal.get(Calendar.SECOND);
//		System.out.println(year+","+month+","+day);
//		System.out.println(hour+","+minute+","+second);
		
		// SimpleDateFormat 클래스로 간편하게 날짜 설정 가능
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		String date = sdf.format(cal.getTime());
		System.out.println(date);
	}
}
