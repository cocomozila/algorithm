package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_4949 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
				
		while (true) {
			str = br.readLine();
			if(str.equals(".")) {
				break;
			}
			isPair(str);
		}
		br.close();
	}
	
	static void isPair(String str) {
		
		Stack<Character> stack = new Stack();
		
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			
			if (c == '(') {
				stack.push('(');
			} else if (c == '[') {
				stack.push('[');
			}
			
			else if (c == ')') {
				if (!stack.isEmpty()) {
					if (stack.peek() == '(') {
							stack.pop();
					}
					else {
						System.out.println("no");
						return;
					}
				}
				else {
					System.out.println("no");
					return;
				}
			}
			
			else if (c == ']') {
				if (!stack.isEmpty()) {
					if (stack.peek() == '[') {
							stack.pop();
					}
					else {
						System.out.println("no");
						return;
					}
				}
				else {
					System.out.println("no");
					return;
				}
			}		
		} // for end
		
		if (stack.isEmpty()) {
			System.out.println("yes");
			return;
		}
		else {
			System.out.println("no");
			return;
		}
	} // isPair end
}
