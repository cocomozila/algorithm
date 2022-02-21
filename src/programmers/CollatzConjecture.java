package programmers;

public class CollatzConjecture {

	public static void main(String[] args) {

	}
	
	public int solution(int num) {
		
		long a = num;
		
		for (int i = 0; i < 500; i++) {
			if (a == 1) {
				return i;
			}
			a = (a % 2 == 0) ? a/2 : a*3+1;			
		}
		return -1;
    }
}
