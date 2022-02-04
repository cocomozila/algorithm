package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class No_17298 {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack();
		StringBuilder sb = new StringBuilder();
						
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[t];
				
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		// 
		
		for (int i = 0; i < t; i++) {			
			
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}				
			stack.push(i);			
		}
		
		while(!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}
		
		for(int i = 0; i < t; i++) {
			sb.append(arr[i]).append(' ');
		}		
		System.out.println(sb);
		
	}
}
