package programmers;


public class NumberK {

	public static void main(String[] args) {
		
	}
	
	public int[] solution(int[] array, int[][] commands) {
		
		int[] answer = new int[commands.length];
		
		for (int i = 0; i < commands.length; i++) {
			
			int a = commands[i][0];
			int b = commands[i][1];
			int c = commands[i][2];
			int arr[] = new int[b-a+1];
			int cnt = 0;
			
			for (int j = 0; j < array.length+1; j++) {
				if (j >= a && j <= b) {
					arr[cnt++] = array[j-1];
				}
			}
			
			for(int k = 0; k < arr.length; k++) {
				for(int m = 0; m < arr.length-1; m++) {
					if(arr[m] > arr[m+1]) {
						int temp = arr[m+1];
						arr[m+1] = arr[m];
						arr[m] = temp;
					}
				}
			}
			
			answer[i] = arr[c-1];				
		}		
        return answer;
    }

}
