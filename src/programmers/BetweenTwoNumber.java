package programmers;

public class BetweenTwoNumber {

	public static void main(String[] args) {

	}
	
    public long solution(int a, int b) {
    	
    	long answer = 0;
    	
    	if (a < b) {
    		for (int i = a; i <= b; i++) {
    			answer += i;
    		}
    		return answer;
    	}
		for (int i = b; i <= a; i++) {
			answer += i;
		}
		return answer;
    }

}
