package study3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EqualWrodTest {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int k = 0; k < t; k++) {
			
			int cnt = 0;
			String str = br.readLine();
			char [] arr = new char[str.length()];
			for(int j = 0; j < str.length(); j++) {
				arr[j] = str.charAt(j);
			}
			for(int i = 0; i < str.length()/2; i++) {
				if(arr[i]!=(arr[str.length()-(i+1)])) {
					cnt++;
				}
			}
			if(cnt == 0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		

		
		
	}

}
