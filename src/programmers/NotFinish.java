package programmers;

import java.util.Arrays;

public class NotFinish {

	public static void main(String[] args) {
		
		NotFinish n = new NotFinish();
		
		String str1[] = {"leo", "kiki", "eden"};
		String str2[] = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String str3[] = {"mislav", "stanko", "mislav", "ana"};
		
		String arr1[] = {"eden", "kiki"};
		String arr2[] = {"josipa", "filipa", "marina", "nikola"};
		String arr3[] = {"stanko", "ana", "mislav"};
		
		System.out.println(n.solution(str1, arr1));
		System.out.println(n.solution(str2, arr2));
		System.out.println(n.solution(str3, arr3));

	}
	
    public String solution(String[] participant, String[] completion) {
    	
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	    	    	
    	for (int i = 0; i < completion.length; i++) {
    		if (!participant[i].equals(completion[i])) {
    			return participant[i];
    		}
    	}
    	return participant[completion.length];
    }
}




