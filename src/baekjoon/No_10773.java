package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_10773 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack();
		
		for (int i = 0; i < t; i++) {
			int cnt = Integer.parseInt(br.readLine());
			if (cnt != 0) {
				stack.push(cnt);
				continue;
			}
			if (!stack.empty())
				stack.pop();
		}
		int total = 0;
		while (!stack.empty()) {
			total += stack.pop();
		}
		br.close();
		System.out.println(total);
	}
}
