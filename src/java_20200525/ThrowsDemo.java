package java_20200525;

public class ThrowsDemo {
	public static int getDivide(int first, int second) throws ArithmeticException {
		int result = first / second; // 예외 발생 코드, 해당 코드는 예외처리 하기가 애매해서 throws 처리하여 던져줌
		return result;
	}

	// 보통 try catch는 메인에서 처리하고, 클래스와 메서드에서는 throws로 던져준다.

	public static void main(String[] args) {
		try {
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);

			int result = getDivide(first, second);	// 예외 발생 코드
			System.out.printf("결과 : %.2d%n", result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("인자를 2개 입력하셔야 합니다.");
		} catch (NumberFormatException e) {
			System.err.println("인자에는 숫자를 넣어야 합니다.");
		} catch (ArithmeticException e) { 			// throws로 받은 예외를 처리해야 한다.
			System.err.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("finally");
		}

		System.out.println("끝");
	}
}
