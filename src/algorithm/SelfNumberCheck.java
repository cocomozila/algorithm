package algorithm;

public class SelfNumberCheck {

	public static void main(String[] args) {
		 
		int [] check = new int[10001];
 
		for (int i = 1; i < 10001; i++){
			int n = selfNumCheck(i);
		
			if(n < 10001){
				check[n]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
        
		for (int i = 1; i < 10001; i++) {
			if (check[i]==0) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	} 
 
	public static int selfNumCheck(int a){
		int total = a;    
		
		while(a != 0){
			total = total + (a % 10);
			a = a/10;
		}    
		return total;
	}
}   