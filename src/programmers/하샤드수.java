package programmers;

import java.io.IOException;

public class ÇÏ»şµå¼ö {

	public static void main(String[] args) {

	}
	
	public boolean solution (int x) throws IOException {
		int sum = 0;
		int a = x;
      
		while (a >= 1) {
			sum += a % 10;
			a /= 10;
		}
 
		if (x % sum == 0) {
			return true;
		}
		return false;
  }
}
