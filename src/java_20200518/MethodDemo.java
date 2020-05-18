package java_20200518;

public class MethodDemo {
	// 메서드를 정의
	// boolean 메서드의 반환값
	// instance 메서드
	// int year => 매개변수(parameter)
	public boolean isLeafYear(int year) {
		// 메서드의 반환값이 boolean이기 때문에 return의 value값도 boolean이어야 한다
		boolean isLeaf = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		return isLeaf;

		// return year % 4 == 0 && year%100 != 0 || year%400 == 0; => 위 두 줄을 한 줄 요약 가능
	}

	public long plus(int first, int second) {
		return (long) first + (long) second;
	}

	public double divide(int first, int second) {
		return (double) first / second; // 하나만 캐스팅 해도 문제 없음
	}

	public void println(String message) {
		System.out.println(message);
	}

	public int[] ascending(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		MethodDemo m = new MethodDemo(); // 반드시 객채를 만들어줘야 메서드 사용 가능
		boolean test = m.isLeafYear(2000); // 2000 => 아규먼트(Argument)
		if (test) {
			m.println("윤년입니다.");
		} else {
			m.println("윤년이 아닙니다.");
		}

		long result = m.plus(100000, 123123123);
		System.out.println(result);
		
		double result2 = m.divide(12, 5);
		System.out.println(result2);
		
		int[] temp = { 1, 93, 28, 10, 34, 31 };
		for (int value : temp) {
			System.out.print(value + "\t");
		}
		System.out.println();
		
		int[] result3 = m.ascending(temp);
		for (int value : result3) {
			System.out.print(value + "\t");
		}
	}
}
