package java_20200520.step5;

public class StopMicroWatch extends StopWatch{
	// 마이크로 세컨드를 관리하기 위한 변수
	private long startTime;
	private long endTime;
	
	// 마이크로 세컨드의 경과 시간
	private double getElapsedTime() {
		return (double)(endTime - startTime)/1_000_000_000;
	}
	// 마이크로 세컨드의 시작 시간
	private void start() {
		startTime = System.nanoTime();
	}
	// 마이크로 세컨드의 종료 시간
	private void stop() {
		endTime = System.nanoTime();
	}
	
	public void execute() {
		start();
		for (long i = 0; i < 20_000_000_000L; i++) {}
		stop();
		double elapsedTime = getElapsedTime();
		
		System.out.printf("경과시간 : %.6f",elapsedTime);
	}
}
