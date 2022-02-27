package programmers;

public class MiddleChar {

	public static void main(String[] args) {

	}
    public String solution(String s) {
    	int a = s.length();
    	
    	if (a%2 != 0) {
    		return String.valueOf(s.charAt(a/2));
    	}
    	return String.valueOf(s.charAt(a/2-1))+String.valueOf(s.charAt(a/2));
    }

}
