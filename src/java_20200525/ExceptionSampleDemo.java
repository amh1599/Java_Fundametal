package java_20200525;

public class ExceptionSampleDemo {
	public static void main(String[] args) {
		// 아래 예외들은 부모가 RunTimeException 이기 때문에 예외 처리를 하지 않아도 문제 없다.		
		
		/* NullPointerException 예외 발생 */
		// String msg = null;
		// int msgLength = msg.length();
		
		/* ArrayIndexOutOfBoundsException 예외 발생 */
		// int[] array = {1,2,3};
		// int temp = array[3];
		
		/* ArithmeticException 예외 발생 */
		// int result = 3/0;
		// System.out.println(result);
		
		/* NumberFormatException */
		int first = Integer.parseInt("a");
		System.out.println(first);
	}
}
