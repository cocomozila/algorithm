package programmers;

public class CaesarCipher {

	public static void main(String[] args) {
		
		// A = 65
		// Z = 90
		
		// a = 97
		// z = 122

		
		char a = ' ';
		int b = a;
		CaesarCipher cc = new CaesarCipher();
	}
	
    public String solution(String s, int n) {
    	
    	char arr[] = s.toCharArray();
    	
    	int n2 = n % 26;
    	
    	for (int i = 0; i < arr.length; i++) {
    		
    		if (arr[i] >= 65 && arr[i] <= 90) {
    			arr[i] = (char)(arr[i] + n2);
    			if (arr[i] > 90) {
    				arr[i] = (char)(64+(arr[i]-90));
    			}
    		}
    		else if (arr[i] >= 97 && arr[i] <= 122) {
    			arr[i] = (char)(arr[i] + n2);
    			if (arr[i] > 122) {
    				arr[i] = (char)(96+(arr[i]-122));
    			}
    		}
    	}   	
    	
        return String.valueOf(arr);
    }

}
