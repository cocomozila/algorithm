package algorithm;

import java.io.*;

public class study {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(bf.readLine());
		String str;
		int score = 0;
		int total = 0;
	
		for(int i = 0; i < t; i++) {
			str = bf.readLine();
			for(int j = 0; j < str.length(); j++) {
				score++;
				if(str.charAt(j) == 'X') {
					score = 0;
				}
				total += score;				
			}
			sb.append(total+"\n");
			score = 0;
			total = 0;
		}
		System.out.println(sb);
		bf.close();
				
	}
}
