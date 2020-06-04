package java_20200604;

import java.util.ArrayList;

public class MarathonDemo {
	public static String solution(String[] participant, String[] completion) {
		String result = null;
		ArrayList<String> patList = new ArrayList<String>();
		ArrayList<String> comList = new ArrayList<String>();
		
		for(int i = 0; i < participant.length; i++) {
			patList.add(participant[i]);
		}
		for(int i = 0; i < completion.length; i++) {
			comList.add(completion[i]);
		}
		
		while(comList.size() != 0) {
			for(int i = 0; i < patList.size(); i++) {
				if(comList.get(0).equals(patList.get(i))) {
					comList.remove(0);
					patList.remove(i);
					break;
				}
			}
		}
		
		result = patList.get(0);
		return result;
	}
	
	public static void main(String[] args) {
		String[] participant = new String[] {"kiki","eden","kiki","mrina","vinko"};
		String[] completion = new String[] {"kiki","eden","mrina","vinko"};
		
		String result = solution(participant, completion);
		System.out.println(result);
	}
}
