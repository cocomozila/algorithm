package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackExam1 {
	
	static Stack<Integer> stack = new Stack();

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int cnt = Integer.parseInt(br.readLine());
		
		StringTokenizer st = null;
		String str;
		
		while ((str = br.readLine()) != null) {			
			st = new StringTokenizer(str);
			whatOrder(st);
		}		
		
	}
	
	static void whatOrder (StringTokenizer st) throws Exception {
		
		String a = st.nextToken();
		
		if(a.equals("push")) {
			stack.push(Integer.parseInt(st.nextToken()));
		}
		else if (a.equals("top")) {
			if(stack.empty()) {
				System.out.println(-1);
			}
			else {
				System.out.println(stack.peek());
			}
		}
		else if (a.equals("size")) {
			System.out.println(stack.size());
		}
		else if (a.equals("empty")) {
			if(stack.empty()) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		else if (a.equals("pop")) {
			if(stack.empty()) {
				System.out.println(-1);
			}
			else {
				System.out.println(stack.pop());
			}
		}
	}

}
