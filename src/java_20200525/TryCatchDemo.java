package java_20200525;

public class TryCatchDemo {
	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;	// 예외 발생 코드
		return avg;
	}

	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);

			double average = getAvg(korean, english);	// 예외 발생 코드
			System.out.printf("평균 : %f", average);
		} catch (ArrayIndexOutOfBoundsException e) {
			/*
			 * 일반 출력 : System.out 에러 출력 : System.err
			 */
			// System.out.println("예외 메세지 : " + e.getMessage());
			// System.err.println("2개 너!");

			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("예외 메세지" + e.getMessage());
			System.err.println("문자 말고 숫자 넣어!");
		} finally {
			System.out.println("finally");
		}
		
		// catch 블럭이 여러 있을 경우 위에서 부터 하위 클래스 => 상위 클래스 순으로 정한다.
	}
}
