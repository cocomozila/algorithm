package programmers;

import java.util.Stack;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		
	}
	
    public Object[] solution(int []arr) {
    	
    	Stack<Integer> stack = new Stack();
    	stack.push(arr[0]);
    	
    	for (int i = 1; i < arr.length; i++) {
    		if (stack.peek() != arr[i]) {
    			stack.push(arr[i]);
    		}
    	}
    	
        Object[] answer = stack.toArray();

        return answer;
    }

}
