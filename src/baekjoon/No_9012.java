package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_9012 {	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			isPair(br.readLine());
		}
	}
	
	static void isPair(String str) {
		
		if (str.length()%2 != 0) {
			System.out.println("NO");
			return;
		}				
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (cnt < 0) {
				System.out.println("NO");
				return;
			}
			if (str.charAt(i)=='(') {
				cnt++;
				continue;
			}
			cnt--;
		}
		if (cnt == 0) {
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}

}
