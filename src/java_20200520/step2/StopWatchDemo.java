package java_20200520.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s1 = new StopWatch();
		s1.start();
		for (long i = 0; i < 20_000_000_000L; i++) {
			
		}
		s1.stop();
		
		double elapsedTime = s1.getElapsedTime();
		//System.out.printf("경과시간 : %.9f",elapsedTime);
		System.out.printf("경과시간 : %.3f",elapsedTime);
		
	}
}
