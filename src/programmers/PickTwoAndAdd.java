package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class PickTwoAndAdd {

	public static void main(String[] args) {

	}
	
	public int[] solution(int[] numbers) {
		
		HashSet<Integer> set = new HashSet<>();		
		
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		
		int[] answer = new int[set.size()];
		
		Iterator<Integer> iter = set.iterator();
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = iter.next();
		}		
		
		Arrays.sort(answer);		
		
        return answer;
    }

}
