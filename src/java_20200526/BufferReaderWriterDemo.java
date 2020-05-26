package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("c:\\dev\\FileDemo.java");
			fw = new FileWriter("c:\\dev\\FileDemo4.java");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			pw = new PrintWriter(bw,true);	// true : auto flush
			
			String readLine = null;
			// readLine() : 개행을 뺀 한 줄을 읽는다.
			while((readLine = br.readLine()) != null) {
				/*	// PrintWriter로 출력하면 필요없다.
				bw.write(readLine);
				bw.newLine();	// 개행을 해준다.
				*/
				pw.println(readLine);
			}
			//bw.flush();	// 꼭 써주기, 다만 PrintWriter로 출력하면 필요없음
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fr != null) fr.close();
					if(fw != null) fw.close();
					if(br != null) br.close();
					if(bw != null) bw.close();
					if(pw != null) pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
