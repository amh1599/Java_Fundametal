package java_20200518;

public class Calendar {
	private int year;
	private int month;
	private int day;
	
	// year에 대한 setter 메서드
	// setter 메서드를 이용하여 정보를 변경한다
	public void setYear(int year) {
		this.year = year;	// this를 이용한 변수 구분
	}
	
	// year에 대한 getter 메서드
	// getter 메서드를 이용하여 year를 가져온다
	public int getYear() {
		return year;
	}
	
	// this. : 자기 자신 객체
	// 로컬변수와 멤버변수와 구분할 때 사용한다. 예) this.year = year
	public void set(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	private int getCount() {
		int totalCount = 0;
		int preYear = year - 1;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		totalCount = preYear * 365 + (preYear / 4) - (preYear / 100) + (preYear / 400);
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			monthArray[1] = 29;
		}
		
		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}
		totalCount += day;
		
		return totalCount;
	}
	
	public void print() {
		int rest = getCount() % 7;
		String message = null;
		
		if (rest == 1) {
			message = "월요일";
		} else if (rest == 2) {
			message = "화요일";
		} else if (rest == 3) {
			message = "수요일";
		} else if (rest == 4) {
			message = "목요일";
		} else if (rest == 5) {
			message = "금요일";
		} else if (rest == 6) {
			message = "토요일";
		} else if (rest == 0) {
			message = "일요일";
		}

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + "입니다.");
	}
	// OOP화 시켰으므로 main은 불필요
//	public static void main(String[] args) {
//		Calendar c = new Calendar();
//		c.set(2020,5,18);
//		c.print();
//	}
}
