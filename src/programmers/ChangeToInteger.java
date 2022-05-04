package programmers;

public class ChangeToInteger {

	public static void main(String[] args) {

	}
    public int solution(String s) {    	
    	
    	if (s.charAt(0)=='+' || s.charAt(0)=='-') {
    		int answer = Integer.parseInt(s.substring(1, s.length()));
    		return (s.charAt(0)=='+')? answer : answer*-1;
    	}
        int answer = Integer.parseInt(s.substring(0, s.length()));
        return answer;
    }

}
