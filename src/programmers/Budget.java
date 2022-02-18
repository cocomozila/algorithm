package programmers;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		
		int a[] = {1,3,2,5,4};

		Budget b = new Budget();
		System.out.println(b.solution(a, 9));
	}
	
    public int solution(int[] d, int budget) {
    	
    	Arrays.sort(d);
    	int cnt = 0;
    	
    	for (int i = 0; i < d.length; i++) {
    		if((budget -= d[i]) >= 0) {
    			cnt++;
    		}
    	}    	
        return cnt;
    }

}
