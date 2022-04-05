package programmers;

public class 문자열다루기기본 {

	public static void main(String[] args) {

		char a = '0';
		System.out.println(a+0);
//		48 <=  57 >=
	}
	
	public boolean solution(String s) {
		
		char [] a = s.toCharArray();
		if (s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < a.length; i++) {
				if ( (a[i]) >= 48 && (a[i]) <= 57) {
				}
				else {
					return false;
				}				
			}
			return true;
		}
		return false;
    }

}
