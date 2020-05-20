package java_20200520.step3;

public class StopNanoWatch {
	// 나노 세컨드를 관리하기 위한 변수
	long startTime;
	long endTime;
	
	// 나노 세컨드의 경과 시간
	public double getElapsedTime() {
		return (double)(endTime - startTime)/1_000_000_000;
	}
	// 나노 세컨드의 시작 시간
	public void start() {
		startTime = System.nanoTime();
	}
	// 나노 세컨드의 종료 시간
	public void stop() {
		endTime = System.nanoTime();
	}
}
