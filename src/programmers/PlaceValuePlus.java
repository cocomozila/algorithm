package programmers;

public class PlaceValuePlus {

	public static void main(String[] args) {
		
		System.out.println(solution(123456789));
	}
	
    public static int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        for(int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(str.toCharArray()[i]));
        }

        return answer;
    }

}
