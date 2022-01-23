package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class TextCalculator {
	
	static double total = 0;
	static char cal = '+';
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String str = br.readLine();
		
		char [] arr = str.toCharArray();
				
		int i = 0;
		do {
			if(isOperator(arr[i])) {
				passTotal(sb);
				passCal(arr[i]);
				clearSb();
				continue;
			}
			sb.append(arr[i]);
			
		}while(++i < arr.length);
		passTotal(sb);
		System.out.println(total);
		br.close();
		
	}	
	
	public static boolean isOperator(char c) {
		return (c == '+'|| c == '-' || c == '*' || c == '/') ? true : false;
	}	
	
	public static void passTotal(StringBuilder sb) {
		total = whatOperator(sb);
	}
	
	public static void passCal(char c) {
		cal = c;
	}
	
	public static double whatOperator(StringBuilder sb) {
		switch (cal){
		case '+' :
			return plus(sb);
		case '-' :
			return minus(sb);
		case '*' :
			return time(sb);
		case '/' :
			return dividedBy(sb);
		default :
			return 0;		
		}
	}
	
	public static void clearSb() {
		sb.delete(0, sb.toString().length());
	}
	
	public static double plus(StringBuilder sb) {
		return total + Integer.parseInt(sb.toString());
	}
	
	public static double minus(StringBuilder sb) {
		return total - Integer.parseInt(sb.toString());
	}
	
	public static double time(StringBuilder sb) {
		return total * Integer.parseInt(sb.toString());
	}
	
	public static double dividedBy(StringBuilder sb) {
		return total / Integer.parseInt(sb.toString());
	}

}


