package sort;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {

		int [] data = {3,5,4,2,1};
		System.out.println("¼ÐÁ¤·Ä ÀÌÀü "+Arrays.toString(data));
		
		insertion(data, data.length);
		System.out.println("¼ÐÁ¤·Ä ÀÌÈÄ "+Arrays.toString(data));
	}
	
	static void insertion(int [] a, int n) {
		
		for(int h = n/2; h > 0; h=h/2) {		
		
			for(int i = h; i < n; i++) {
				
				int j;
				int tmp = a[i];
				for(j = i-h; j >= 0 && a[j] > tmp ; j = j - h) {
					a[j+h] = a[j];
				}
				a[j+h] = tmp;
			}
		}
	}

}
