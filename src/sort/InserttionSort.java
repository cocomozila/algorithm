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
			// 1. ���ĵ��� ���� ������ �Ѱ��� �����Ѵ�.
			int tmp = a[i];
			// 2. ���ĵ� �����͵� �ڸ� �̵�(tmp ũ��) �ݺ�
			for(j = i; j > 0 && a[j-1] > tmp ; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
			System.out.println(Arrays.toString(a));
		}	// 3. 1�� �����͸� 2�� �� �ڸ��� ����
	}

}
