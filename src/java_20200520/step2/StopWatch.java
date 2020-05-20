package java_20200520.step2;

public class StopWatch {
	// 밀리 세컨드를 관리하기 위한 변수
	long startTime;
	long endTime;
	
	// 밀리 세컨드의 경과 시간
	public double getElapsedTime() {
		return (double)(endTime - startTime)/1000;
	}
	// 밀리 세컨드의 시작 시간
	public void start() {
		startTime = System.currentTimeMillis();
	}
	// 밀리 세컨드의 종료 시간
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	// 나노 세컨드를 관리하기 위한 변수
	long startNanoTime;
	long endNanoTime;
	
	// 나노 세컨드의 경과 시간
	public double getElapsedNanoTime() {
		return (double)(endNanoTime - startNanoTime)/1_000_000_000;
	}
	// 나노 세컨드의 시작 시간
	public void startNano() {
		startNanoTime = System.nanoTime();
	}
	// 나노 세컨드의 종료 시간
	public void stopNano() {
		endNanoTime = System.nanoTime();
	}
}
