package programmers;

public class NonAddNumber {

	public static void main(String[] args) {
		
		// https://programmers.co.kr/learn/courses/30/lessons/86051
		
	}	
	    public int solution(int[] numbers) {
	    	
	    	int answer = 0;	    	
	    	int arr[] = new int[10];
	    	
	    	for (int i = 0; i < numbers.length; i++) {
	    		arr[numbers[i]]++;
	    	}
	    	
	    	for (int i = 0; i < arr.length; i++) {
	    		if (arr[i] == 0) {
	    			answer += i;
	    		}
	    	}  	
	    	
	        return answer;
	    }
	

}
