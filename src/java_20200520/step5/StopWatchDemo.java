package java_20200520.step5;

// import 단축키  => Ctrl + Shift + o
import java.io.BufferedReader;
import java.io.FileReader;

public class StopWatchDemo {
	
	public static void run(StopWatch s1) {		
		s1.execute();
	}
	
	public static void main(String[] args) throws Exception{
		//StopNanoWatch s1 = new StopNanoWatch();
		//StopMicroWatch s1 = new StopMicroWatch();
		//StopMilliWatch s1 = new StopMilliWatch();
		//run(s1);
		
		// Java IO
		BufferedReader br = new BufferedReader
				(new FileReader("C:\\dev\\eclipse-workspace\\Java_Fundametal\\src\\java_20200520\\step5\\class.txt"));
		
		String readLine = br.readLine();
		
		// Java Reflection
		Class clazz = Class.forName(readLine);
		StopWatch s = (StopWatch)clazz.newInstance();
		
		run(s);
		
	}
}
