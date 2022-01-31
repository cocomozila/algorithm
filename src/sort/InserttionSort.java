package sort;

import java.util.Arrays;

public class InserttionSort {

	public static void main(String[] args) {

		int [] data = {3,5,4,2,1};
		
		insertion(data, data.length);
	}
	
	static void insertion(int [] a, int n) {
		
		for(int i = 1; i < n; i++) {
			
			int j;
			// 1. 정렬되지 않은 데이터 한개를 선택한다.
			int tmp = a[i];
			// 2. 정렬된 데이터들 자리 이동(tmp 크면) 반복
			for(j = i; j > 0 && a[j-1] > tmp ; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
			System.out.println(Arrays.toString(a));
		}	// 3. 1번 데이터를 2번 빈 자리에 삽입
	}

}
