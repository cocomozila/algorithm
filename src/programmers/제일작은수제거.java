package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 제일작은수제거 {

	public static void main(String[] args) {
		
		제일작은수제거 w = new 제일작은수제거();
		
		int [] arr2 = {4,2,3,1};
		w.solution(arr2);


	}
	
    public int[] solution(int[] arr) {
    	
    	int[] answer;
    	
    	if (arr.length <= 1) {
    		answer = new int[1];
    		answer[0] = -1;
    		return answer;
    	}
    	
    	int [] sample = arr.clone();
    	Arrays.sort(sample);
    	int min = sample[0];
    	
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] == min) {
        		continue;
        	}
        	list.add(arr[i]);
        }

        
        int answer2 [] = new int[list.size()];
        for (int i = 0; i < answer2.length; i++) {
        	answer2[i] = list.get(i);
        }        
        
        return answer2;
    }

}
